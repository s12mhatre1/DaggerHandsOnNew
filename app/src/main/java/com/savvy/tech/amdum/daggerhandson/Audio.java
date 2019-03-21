package com.savvy.tech.amdum.daggerhandson;

import android.util.Log;

import javax.inject.Inject;

public class Audio {
    private static final String TAG = "Car";
    
    @Inject
    public Audio(){
        Log.d(TAG, "Audio: ");    
    }
}
