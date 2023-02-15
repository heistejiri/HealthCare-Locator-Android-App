package com.heistejiri.hospitallocator.models;

import org.parceler.Parcel;



@Parcel
public class DistanceDuration {
    ValuePair distance;
    ValuePair duration;

    String status;

    public DistanceDuration() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ValuePair getDistance() {

        return distance;
    }

    public void setDistance(ValuePair distance) {
        this.distance = distance;
    }

    public ValuePair getDuration() {
        return duration;
    }

    public void setDuration(ValuePair duration) {
        this.duration = duration;
    }
}
