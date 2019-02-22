package com.example.saba.tourguide;

public class ListItem {
    String mName;
    String mAddress;
    int mRating;
    int mImageRescourceId;

    ListItem(String mName, String mAddress, int mRating, int mImageRescourceId){
        this.mName = mName;
        this.mAddress = mAddress;
        this.mRating = mRating;
        this.mImageRescourceId = mImageRescourceId;
    }

    public String getmName() {
        return mName;
    }

    public String getmAddress() {
        return mAddress;
    }

    public int getmRating() {
        return mRating;
    }

    public int getmImageRescourceId() {
        return mImageRescourceId;
    }

    @Override
    public String toString() {
        return "ListItem{" +
                ", mName" +mName +
                ", mAddress" +mAddress +
                ", mRating" +mRating +
                ", mImageRescourceId" +mImageRescourceId+"}";
    }
}
