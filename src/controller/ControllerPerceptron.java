/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.RetaClacificadora;
import model.Ponto;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Willian
 */
public class ControllerPerceptron {
    private String[] coordenadas = null;
    private String linha = null;
    private float a;
    private float b;
    private float c;
    private String caminho;
    private ArrayList<Ponto> lista = new ArrayList<>();
    
    public ControllerPerceptron(String caminho, float a, float b, float c) {
        this.caminho = caminho;
        this.a       = a;
        this.b       = b;
        this.c       = c;
        try {
            FileInputStream arquivo = new FileInputStream(caminho);
            InputStreamReader input = new InputStreamReader(arquivo);
            BufferedReader br = new BufferedReader(input);
            do { //le as linhas do txt
                linha = br.readLine();//lê cada linha do txt
                if (linha != null) {//roda enqunto tiver linha para ser lida
                    coordenadas = linha.split(",");//da quebra de palavra na ',' e lê cada palavra do txt
                    for (int i = 0; i < 3; i++) {}//seta os pontos no vet coordenadas[]
                    Ponto pt = new Ponto();//declara um objeto Ponto
                    pt.setX(Float.parseFloat(coordenadas[0]));//seta o ponto X
                    pt.setY(Float.parseFloat(coordenadas[1]));//seta o ponto Y
                    pt.setClasse(Integer.parseInt(coordenadas[2]));//seta a classe do ponto
                    lista.add(pt);//addiciona esses objetos a lista              
                }
            } while (linha != null);
            RetaClacificadora rc = new RetaClacificadora();
            rc.setPontoX(a);//seta ponto x da reta
            rc.setPontoY(b);//seta ponto y da reta
            float m = -(a/b);// calcula o coeficiente angular da reta
            rc.setCoeficienteAgular(m);//seta o coeficiente angular da reta  
        } catch (IOException e) {//caso o arwuivo não seja encontrado ou tenha erro aparece a mensagem
            JOptionPane.showMessageDialog(null, "Erro na leitura, Verifique se o arquivo está correto", "Perceptron", 0);
        } 
    }//fim construtor    
}//fim class leitura
