package com.savvy.tech.amdum.daggerhandson;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    private Engine engine;
    private Wheels wheels;
    private Audio audio;

    @Inject
    public Car(Engine engine, Wheels wheels, Audio audio) {
        this.engine = engine;
        this.wheels = wheels;
        this.audio = audio;
        Log.d(TAG, "Car: ");
    }

    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive(){
        Log.d(TAG, "drive: ");
    }
}
