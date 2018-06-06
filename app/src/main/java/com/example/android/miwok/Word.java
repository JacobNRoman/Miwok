package com.example.android.miwok;

public class Word {
    private String miwokTranslation;
    private String defaultTranslation;
    private int imageResourceId;
    private int soundResourceId;
    private boolean hasImage = false;

    public Word(String miwokTranslation, String defaultTranslation, int soundResourceId){
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.soundResourceId = soundResourceId;
    }

    public Word(String miwokTranslation, String defaultTranslation, int soundResourceId, int imageResourceId){
        this(miwokTranslation, defaultTranslation, soundResourceId);
        this.imageResourceId = imageResourceId;
        this.hasImage = true;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public void setMiwokTranslation(String miwokTranslation) {
        this.miwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public void setDefaultTranslation(String defaultTranslation) {
        this.defaultTranslation = defaultTranslation;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
        this.hasImage = true;
    }

    public boolean hasImage() {
        return hasImage;
    }

    public int getSoundResourceId() {
        return soundResourceId;
    }

    public void setSoundResourceId(int soundResourceId) {
        this.soundResourceId = soundResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "miwokTranslation='" + miwokTranslation + '\'' +
                ", defaultTranslation='" + defaultTranslation + '\'' +
                ", imageResourceId=" + imageResourceId +
                ", soundResourceId=" + soundResourceId +
                ", hasImage=" + hasImage +
                '}';
    }
}
