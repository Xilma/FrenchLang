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

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a French translation for that word.
 */
public class Word {

    /** Default translation for the word */
    private String mEnglishTranslation;
    /**French translation for the word */
    private String mFrenchTranslation;
    /**Image resource ID associated with the translation*/
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    /*Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * Create a new Word object.
     * @param englishTranslation is the word in English
     * @param frenchTranslation is the word in the French language
     */
    public Word(String englishTranslation, String frenchTranslation) {
        mEnglishTranslation = englishTranslation;
        mFrenchTranslation = frenchTranslation;
    }
    /**
     * Create a new Word object to accomodate different layouts
     * @param englishTranslation is the word in English
     * @param frenchTranslation is the word in French
     * @param imageResourceID is the image resource ID for the images
     */
    public Word(String englishTranslation, String frenchTranslation, int imageResourceID){
        this.mEnglishTranslation = englishTranslation;
        this.mFrenchTranslation = frenchTranslation;
        this.mImageResourceID = imageResourceID;
    }
    /**
     * Get the English translation of the word.
     */
    public String getEnglishTranslation() {
        return mEnglishTranslation;
    }
    /**
     * Get the French translation of the word.
     */
    public String getFrenchTranslation() {
        return mFrenchTranslation;
    }
    /**
     * Get the image for the translation
     */
    public int getImageResourceID(){
        return mImageResourceID;
    }
    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage(){
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }
}