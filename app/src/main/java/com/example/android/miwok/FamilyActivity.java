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

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        /*Create a list of words - family
        This is using the Word class, hence creating initializing using the parametirized
        constructor in the Word class
        */
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father", "père", R.drawable.family_father));
        words.add(new Word("mother", "mère", R.drawable.family_mother));
        words.add(new Word("brother", "frère", R.drawable.family_older_brother));
        words.add(new Word("sister", "sœur", R.drawable.family_older_sister));
        words.add(new Word("son", "fils", R.drawable.family_son));
        words.add(new Word("husband", "mari", R.drawable.family_father));
        words.add(new Word("wife", "femme", R.drawable.family_mother));
        words.add(new Word("daughter", "fille", R.drawable.family_daughter));
        words.add(new Word("aunt", "tante", R.drawable.family_mother));
        words.add(new Word("uncle", "oncle", R.drawable.family_father));
        words.add(new Word("niece", "nièce", R.drawable.family_younger_sister));
        words.add(new Word("nephew", "neveu", R.drawable.family_younger_brother));
        words.add(new Word("grandfather", "grand-père", R.drawable.family_grandfather));
        words.add(new Word("grandmother", "grand-mère", R.drawable.family_grandmother));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the list_item.xml
        // This list item layout contains two {@link TextView}, which the adapter will set to
        // display two texts.
        WordAdapter adapter =  new WordAdapter(this, words, R.color.category_family);

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

