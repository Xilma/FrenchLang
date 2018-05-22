/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        /*Create a list of words
        This is using the Word class, hence creating initializing using the parametirized
        constructor in the Word class
        */
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "un", R.drawable.number_one));
        words.add(new Word("two", "deux", R.drawable.number_two));
        words.add(new Word("three", "trois", R.drawable.number_three));
        words.add(new Word("four", "quatre", R.drawable.number_four));
        words.add(new Word("five", "cinq", R.drawable.number_five));
        words.add(new Word("six", "six", R.drawable.number_six));
        words.add(new Word("seven", "sept", R.drawable.number_seven));
        words.add(new Word("eight", "huit", R.drawable.number_eight));
        words.add(new Word("nine", "neuf", R.drawable.number_nine));
        words.add(new Word("ten", "dix", R.drawable.number_ten));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the list_item.xml
        // This list item layout contains two {@link TextView}, which the adapter will set to
        // display two texts.
        WordAdapter adapter =  new WordAdapter(this, words, R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);
    }
}
