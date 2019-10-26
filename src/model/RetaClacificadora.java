/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Willian
 */
public class RetaClacificadora {
    private float taxaDeAprendizado;
    private float pontoX;
    private float pontoY;
    private float w0 = 0;
    private float w1 = 0;
    private float w2 = 0;
    private float coeficienteAgular;
    
    public float getTaxaDeAprendizado() {
        return taxaDeAprendizado;
    }

    public float getW0() {
        return w0;
    }

    public void setW0(float w0) {
        this.w0 = w0;
    }

    public float getW1() {
        return w1;
    }

    public void setW1(float w1) {
        this.w1 = w1;
    }

    public float getW2() {
        return w2;
    }

    public void setW2(float w2) {
        this.w2 = w2;
    }
    
    
    
    public void setTaxaDeAprendizado(float taxaDeAprendizado) {
        this.taxaDeAprendizado = taxaDeAprendizado;
    }

    public float getPontoX() {
        return pontoX;
    }

    public void setPontoX(float pontoX) {
        this.pontoX = pontoX;
    }

    public float getPontoY() {
        return pontoY;
    }

    public void setPontoY(float pontoY) {
        this.pontoY = pontoY;
    }

    public float getCoeficienteAgular() {
        return coeficienteAgular;
    }

    public void setCoeficienteAgular(float coeficienteAgular) {
        this.coeficienteAgular = coeficienteAgular;
    }
    
}//fim class RetaClacificadora
