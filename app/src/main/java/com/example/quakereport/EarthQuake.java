package com.example.quakereport;

public class EarthQuake {
    private String mMagnitude;
    private String mLocation;
    private String mDate;

public EarthQuake(String magnitude,String location, String date ){
    mMagnitude = magnitude;
    mLocation = location;
    mDate = date;
}

    public String getmMagnitude() {
        return mMagnitude;
    }

    public void setmMagnitude(String mMagnitude) {
        this.mMagnitude = mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public void setmLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }
}
