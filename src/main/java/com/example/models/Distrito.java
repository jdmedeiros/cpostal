/*
 * CodigoPostalPortugalLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class Distrito 
        implements java.io.Serializable {
    private static final long serialVersionUID = 2408644370950033610L;
    private int id;
    private String designacaoDistrito;
    private String designacaoConcelho;
    private String codLocalidade;
    private String localidade;
    private String artCod;
    private String artTipo;
    private String priPrep;
    private String artTitulo;
    private String segPrep;
    private String artDesig;
    private String artLocal;
    private String troco;
    private String porta;
    private String cliente;
    private String codPostal4;
    private String codPostal3;
    private String cpAlf;
    private String latitude;
    private String longitude;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("id")
    public int getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("id")
    public void setId (int value) { 
        this.id = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("designacaoDistrito")
    public String getDesignacaoDistrito ( ) { 
        return this.designacaoDistrito;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("designacaoDistrito")
    public void setDesignacaoDistrito (String value) { 
        this.designacaoDistrito = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("designacaoConcelho")
    public String getDesignacaoConcelho ( ) { 
        return this.designacaoConcelho;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("designacaoConcelho")
    public void setDesignacaoConcelho (String value) { 
        this.designacaoConcelho = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("codLocalidade")
    public String getCodLocalidade ( ) { 
        return this.codLocalidade;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("codLocalidade")
    public void setCodLocalidade (String value) { 
        this.codLocalidade = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("localidade")
    public String getLocalidade ( ) { 
        return this.localidade;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("localidade")
    public void setLocalidade (String value) { 
        this.localidade = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("artCod")
    public String getArtCod ( ) { 
        return this.artCod;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("artCod")
    public void setArtCod (String value) { 
        this.artCod = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("artTipo")
    public String getArtTipo ( ) { 
        return this.artTipo;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("artTipo")
    public void setArtTipo (String value) { 
        this.artTipo = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("priPrep")
    public String getPriPrep ( ) { 
        return this.priPrep;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("priPrep")
    public void setPriPrep (String value) { 
        this.priPrep = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("artTitulo")
    public String getArtTitulo ( ) { 
        return this.artTitulo;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("artTitulo")
    public void setArtTitulo (String value) { 
        this.artTitulo = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("segPrep")
    public String getSegPrep ( ) { 
        return this.segPrep;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("segPrep")
    public void setSegPrep (String value) { 
        this.segPrep = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("artDesig")
    public String getArtDesig ( ) { 
        return this.artDesig;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("artDesig")
    public void setArtDesig (String value) { 
        this.artDesig = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("artLocal")
    public String getArtLocal ( ) { 
        return this.artLocal;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("artLocal")
    public void setArtLocal (String value) { 
        this.artLocal = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("troco")
    public String getTroco ( ) { 
        return this.troco;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("troco")
    public void setTroco (String value) { 
        this.troco = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("porta")
    public String getPorta ( ) { 
        return this.porta;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("porta")
    public void setPorta (String value) { 
        this.porta = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("cliente")
    public String getCliente ( ) { 
        return this.cliente;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("cliente")
    public void setCliente (String value) { 
        this.cliente = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("codPostal4")
    public String getCodPostal4 ( ) { 
        return this.codPostal4;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("codPostal4")
    public void setCodPostal4 (String value) { 
        this.codPostal4 = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("codPostal3")
    public String getCodPostal3 ( ) { 
        return this.codPostal3;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("codPostal3")
    public void setCodPostal3 (String value) { 
        this.codPostal3 = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("cpAlf")
    public String getCpAlf ( ) { 
        return this.cpAlf;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("cpAlf")
    public void setCpAlf (String value) { 
        this.cpAlf = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("latitude")
    public String getLatitude ( ) { 
        return this.latitude;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("latitude")
    public void setLatitude (String value) { 
        this.latitude = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("longitude")
    public String getLongitude ( ) { 
        return this.longitude;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("longitude")
    public void setLongitude (String value) { 
        this.longitude = value;
    }
 
}
