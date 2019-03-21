package com.savvy.tech.amdum.daggerhandson;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelsModul {

    @Provides
    static Rims providesRimS(){
        return new Rims();
    }

    @Provides
    static Tiers providesTiers(){
        Tiers tiers = new Tiers();
        tiers.inflate();
        return tiers;
    }

    @Provides
    static Wheels providesWheels(Rims rims, Tiers tiers) {
        return new Wheels(rims, tiers);
    }
}
