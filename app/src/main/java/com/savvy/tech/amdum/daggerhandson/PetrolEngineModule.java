package com.savvy.tech.amdum.daggerhandson;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PertolEngine engine);
}
