package com.savvy.tech.amdum.daggerhandson;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class ElectricEngine implements Engine {
    private static final String TAG = "Car";

    private int horsePower;
    private int engineCapacity;

    @Inject
    public ElectricEngine(@Named("horse power") int horsePower,
                          @Named("engine capacity") int engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }
    @Override
    public void start() {
        Log.d(TAG, "start: ");
    }
}
