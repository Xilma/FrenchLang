package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Rilma Atish on 07-Sep-17.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    /** Resource ID for the background color for this list of words*/
    private int mColorResourceId;

    /**
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param words is the list of {@link Word}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of words.
     */
    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, I use 0.
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        //Find the color that the resource ID maps to.
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        //Set the background color of the text container view
        textContainer.setBackgroundColor(color);

        //Returns the item in the list in the given index position
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID english_text_view
        TextView englishTranslationTextView = (TextView) listItemView.findViewById(R.id.english_text_view);
        // Get the english name from the currentWord object and set this text on the englishTranslationTextView
        englishTranslationTextView.setText(currentWord.getEnglishTranslation());

        //Find the TextView in the list_item.xml layout with the ID french_text_view
        TextView frenchTranslationTextView = (TextView) listItemView.findViewById(R.id.french_text_view);
        //Get the french name from the currentWord object and set this text on the frenchTranslationTextView
        frenchTranslationTextView.setText(currentWord.getFrenchTranslation());

        //Find the ImageView in the list_item.xml layout with the ID french_text_view
        ImageView iconImage = (ImageView) listItemView.findViewById(R.id.image);
        //Check if an image is provided for this word or not
        if (currentWord.hasImage()){
            //If an image is available, display the provided image based on the resource ID
            iconImage.setImageResource(currentWord.getImageResourceID());
            //Make sure the view is visible
            iconImage.setVisibility(View.VISIBLE);
        } else{
            //Otherwise hide the ImageView
            iconImage.setVisibility(View.GONE);
        }

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;

    }
}
