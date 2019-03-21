package com.savvy.tech.amdum.daggerhandson;

import javax.inject.Inject;

/**
 * Third Party class where @Inject cannot be set for oonstructor
 * Hence module is required
 */
public class Wheels {

    private Rims rims;
    private Tiers tiers;


    public Wheels(Rims rims, Tiers tiers){
        this.rims = rims;
        this.tiers = tiers;
    }
}
