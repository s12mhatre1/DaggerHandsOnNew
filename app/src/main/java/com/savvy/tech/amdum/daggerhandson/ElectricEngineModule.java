package com.savvy.tech.amdum.daggerhandson;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class ElectricEngineModule {

    @Binds
    abstract Engine bindElectricEngine(ElectricEngine engine);
}
