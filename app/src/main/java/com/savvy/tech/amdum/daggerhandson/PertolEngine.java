package com.savvy.tech.amdum.daggerhandson;

import android.util.Log;

import javax.inject.Inject;

public class PertolEngine implements Engine {
    private static final String TAG = "Car";
    
    @Inject
    public PertolEngine(){
    }

    @Override
    public void start() {
        Log.d(TAG, "start: ");
    }
}
