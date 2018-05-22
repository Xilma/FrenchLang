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

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        /*Create a list of words
        This is using the Word class, hence creating initializing using the parametirized
        constructor in the Word class
        */
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Good Morning", "Bonjour"));
        words.add(new Word("Hi!", "Salut!"));
        words.add(new Word("Goodbye", "Au revoir"));
        words.add(new Word("How are you?", "Comment allez-vous?"));
        words.add(new Word("I'm fine.", "Je vais bien."));
        words.add(new Word("What is your name?", "Comment vous appelez vous?"));
        words.add(new Word("My name is...", "Je m'appelle..."));
        words.add(new Word("I don't understand", "Je ne comprends pas"));
        words.add(new Word("I don't know.", "Je ne sais pas"));
        words.add(new Word("Thank you", "Merci"));
        words.add(new Word("You're welcome", "De rien"));
        words.add(new Word("Excuse me", "Excusez-moi"));
        words.add(new Word("I love you", "Je t'aime"));
        words.add(new Word("Safe journey", "Bon voyage"));
        words.add(new Word("Okay", "D'accord"));
        words.add(new Word("Where are the washrooms?", "Qu sont les toilettes?"));
        words.add(new Word("Where is...?", "Où est-ce que se trouve...?"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the list_item.xml
        // This list item layout contains two {@link TextView}, which the adapter will set to
        // display two texts.
        WordAdapter adapter =  new WordAdapter(this, words, R.color.category_phrases);

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
