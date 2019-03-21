package com.savvy.tech.amdum.daggerhandson;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DiselEngineModule {
    int horsePower;

    public DiselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int providesHorsePower(){
        return horsePower;
    }

    @Provides
    Engine provideEngine(){
        return new DiselEngine(horsePower);
    }
}
