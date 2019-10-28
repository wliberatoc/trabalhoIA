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
    private float pontoA;
    private float pontoB;
    private float pontoC;
    private float w0 = 1;
    private float w1 = 1;
    private float w2 = -1;
    private float coeficienteAgular;

    public float getPontoC() {
        return pontoC;
    }

    public void setPontoC(float pontoC) {
        this.pontoC = pontoC;
    }
    
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

    public float getPontoA() {
        return pontoA;
    }

    public void setPontoA(float pontoA) {
        this.pontoA = pontoA;
    }

    public float getPontoB() {
        return pontoB;
    }

    public void setPontoB(float pontoB) {
        this.pontoB = pontoB;
    }

    public float getCoeficienteAgular() {
        return coeficienteAgular;
    }

    public void setCoeficienteAgular(float coeficienteAgular) {
        this.coeficienteAgular = coeficienteAgular;
    }
    
}//fim class RetaClacificadora
