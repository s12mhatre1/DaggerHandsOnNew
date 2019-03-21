package com.savvy.tech.amdum.daggerhandson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //For Petrol
//        CarComponent component = DaggerCarComponent.builder()
//                .build();

        //For Disel
//        CarComponent component = DaggerCarComponent.builder()
//                .diselEngineModule(new DiselEngineModule(100))
//                .build();
//        component.inject(this);

        CarComponent component = DaggerCarComponent.builder()
                .horsePower(100)
                .engineCapacity(1400)
                .build();
        component.inject(this);
        car.drive();
    }
}
