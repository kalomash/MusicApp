package com.example.admin.music;

/**
 * Created by Admin on 7/7/2017.
 */

public class Song {
    //Defualt translation for the word
    private String mDefaultTranslation;

    //Miwok translation fot the word
    private String mMiwokTranslation;
    //Image Id new  word object
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourceId;


    public Song(String mdefaultTranslation, String miwokTranslation,int audioResourceId) {
        mDefaultTranslation = mdefaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;

    }
    public Song(String mdefaultTranslation, String miwokTranslation,int imageResourceId,int audioResourceId) {
        mDefaultTranslation = mdefaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId= imageResourceId;
        mAudioResourceId = audioResourceId;


    }

    //Get the default translation of the word

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }
    //Get the Miwok translation of the word
    public String getmMiwokTranslation() {
        return mMiwokTranslation;

    }
    public int getImageResourceID(){
        return mImageResourceId;
    }
    public boolean hasImage(){
        return mImageResourceId !=NO_IMAGE_PROVIDED;
    }
    public int getmAudioResourceId(){return mAudioResourceId;
    }

}

