/*
 * CodigoPostalPortugalLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;

public class DistUnico1Builder {
    //the instance to build
    private DistUnico1 distUnico1;

    /**
     * Default constructor to initialize the instance
     */
    public DistUnico1Builder() {
        distUnico1 = new DistUnico1();
    }

    public DistUnico1Builder designacaoDistrito(String designacaoDistrito) {
        distUnico1.setDesignacaoDistrito(designacaoDistrito);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DistUnico1 build() {
        return distUnico1;
    }
}