package com.mattmoulds.storm.weather;

/**
 * Created by matt on 31/08/15.
 */
public class Hour {
    private long mTime;
    private String summary;
    private double mTeperature;
    private String mIcon;
    private String mTimezone;

    public String getTimezone() {
        return mTimezone;
    }

    public void setTimezone(String timezone) {
        mTimezone = timezone;
    }

    public long getTime() {
        return mTime;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public double getTeperature() {
        return mTeperature;
    }

    public void setTeperature(double teperature) {
        mTeperature = teperature;
    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }
}
