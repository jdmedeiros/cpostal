/*
 * CodigoPostalPortugalLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;

public class DistritoBuilder {
    //the instance to build
    private Distrito distrito;

    /**
     * Default constructor to initialize the instance
     */
    public DistritoBuilder() {
        distrito = new Distrito();
    }

    public DistritoBuilder id(int id) {
        distrito.setId(id);
        return this;
    }

    public DistritoBuilder designacaoDistrito(String designacaoDistrito) {
        distrito.setDesignacaoDistrito(designacaoDistrito);
        return this;
    }

    public DistritoBuilder designacaoConcelho(String designacaoConcelho) {
        distrito.setDesignacaoConcelho(designacaoConcelho);
        return this;
    }

    public DistritoBuilder codLocalidade(String codLocalidade) {
        distrito.setCodLocalidade(codLocalidade);
        return this;
    }

    public DistritoBuilder localidade(String localidade) {
        distrito.setLocalidade(localidade);
        return this;
    }

    public DistritoBuilder artCod(String artCod) {
        distrito.setArtCod(artCod);
        return this;
    }

    public DistritoBuilder artTipo(String artTipo) {
        distrito.setArtTipo(artTipo);
        return this;
    }

    public DistritoBuilder priPrep(String priPrep) {
        distrito.setPriPrep(priPrep);
        return this;
    }

    public DistritoBuilder artTitulo(String artTitulo) {
        distrito.setArtTitulo(artTitulo);
        return this;
    }

    public DistritoBuilder segPrep(String segPrep) {
        distrito.setSegPrep(segPrep);
        return this;
    }

    public DistritoBuilder artDesig(String artDesig) {
        distrito.setArtDesig(artDesig);
        return this;
    }

    public DistritoBuilder artLocal(String artLocal) {
        distrito.setArtLocal(artLocal);
        return this;
    }

    public DistritoBuilder troco(String troco) {
        distrito.setTroco(troco);
        return this;
    }

    public DistritoBuilder porta(String porta) {
        distrito.setPorta(porta);
        return this;
    }

    public DistritoBuilder cliente(String cliente) {
        distrito.setCliente(cliente);
        return this;
    }

    public DistritoBuilder codPostal4(String codPostal4) {
        distrito.setCodPostal4(codPostal4);
        return this;
    }

    public DistritoBuilder codPostal3(String codPostal3) {
        distrito.setCodPostal3(codPostal3);
        return this;
    }

    public DistritoBuilder cpAlf(String cpAlf) {
        distrito.setCpAlf(cpAlf);
        return this;
    }

    public DistritoBuilder latitude(String latitude) {
        distrito.setLatitude(latitude);
        return this;
    }

    public DistritoBuilder longitude(String longitude) {
        distrito.setLongitude(longitude);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Distrito build() {
        return distrito;
    }
}