package com.example.mmz.miwok;

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImage;
    private int mAudio;
    private int mPlayIcon;


    public Word(String mTranslation, String mMiwok, int audio){
        mMiwokTranslation = mMiwok;
        mDefaultTranslation = mTranslation ;
        mPlayIcon = R.drawable.baseline_play_arrow_white_24;
        mImage = -1;
        mAudio = audio;
    }

    public Word(String mTranslation, String mMiwok, int image, int audio){
        mMiwokTranslation = mMiwok;
        mDefaultTranslation = mTranslation ;
        mImage = image;
        mPlayIcon = R.drawable.baseline_play_arrow_white_24;
        mAudio = audio;

    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getmImage() {
        return mImage;
    }

    public int getmPlayIcon() {
        return mPlayIcon;
    }

    public int getmAudio() {
        return mAudio;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mAudioResourceId=" + mAudio +
                ", mImageResourceId=" + mImage +
                '}';
    }
}
