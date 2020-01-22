package com.enviopost2.Entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post {
    @SerializedName("CLAVE")
    @Expose
    private Integer CLAVE;

    @SerializedName("FECHA")
    @Expose
    private String FECHA;

    @SerializedName("LECTOR")
    @Expose
    private Integer LECTOR;

    @SerializedName("FECHA_LECTURA")
    @Expose
    private String FECHA_LECTURA;

    public Integer getCLAVE() {
        return CLAVE;
    }

    public void setCLAVE(Integer CLAVE) {
        this.CLAVE = CLAVE;
    }

    public String getFECHA() {
        return FECHA;
    }

    public void setFECHA(String FECHA) {
        this.FECHA = FECHA;
    }

    public Integer getLECTOR() {
        return LECTOR;
    }

    public void setLECTOR(Integer LECTOR) {
        this.LECTOR = LECTOR;
    }

    public String getFECHA_LECTURA() {
        return FECHA_LECTURA;
    }

    public void setFECHA_LECTURA(String FECHA_LECTURA) {
        this.FECHA_LECTURA = FECHA_LECTURA;
    }

    @Override
    public String toString() {
        return "Post{" +
                "CLAVE=" + CLAVE +
                ", FECHA='" + FECHA + '\'' +
                ", LECTOR='" + LECTOR + '\'' +
                ", FECHA_LECTURA='" + FECHA_LECTURA + '\'' +
                '}';
    }
}
