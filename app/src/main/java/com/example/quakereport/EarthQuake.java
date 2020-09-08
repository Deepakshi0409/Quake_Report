package com.example.quakereport;

public class EarthQuake {
    private String mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;

public EarthQuake(String magnitude,String location, long timeInMilliseconds){
    mMagnitude = magnitude;
    mLocation = location;
    mTimeInMilliseconds = timeInMilliseconds;
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

    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public void setmTimeInMilliseconds(long mTimeInMilliseconds) {
        this.mTimeInMilliseconds = mTimeInMilliseconds;
    }
}
