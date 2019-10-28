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
    private float n;
    private String caminho;
    private ArrayList<Ponto> lista = new ArrayList<>();
    private RetaClacificadora rc = new RetaClacificadora();
    
    public ControllerPerceptron(String caminho, float a, float b, float c, float n) {
        this.caminho = caminho;
        this.a       = a;
        this.b       = b;
        this.c       = c;
        this.n       = n;
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
            this.rc.setPontoA(a);//seta ponto x da reta
            this.rc.setPontoB(b);//seta ponto y da reta
            this.rc.setPontoC(c);//seta ponto y da reta
            float m = 0;
            if(b!=0)//trata dvisão por zero
               m = -(a/b);// calcula o coeficiente angular da reta
            this.rc.setCoeficienteAgular(m);//seta o coeficiente angular da reta  
        } catch (IOException e) {//caso o arwuivo não seja encontrado ou tenha erro aparece a mensagem
            JOptionPane.showMessageDialog(null, "Erro na leitura, Verifique se o arquivo está correto", "Perceptron", 0);
        } 
    }//fim construtor 
    
    public void perceptron(){
        float teste;
        float novoW0;
        float novoW1;
        float novoW2;
        boolean chave;
        for(int i=0; i<this.lista.size(); i++){
            teste = (this.rc.getW1()*this.lista.get(i).getX())+(this.rc.getW2()*this.lista.get(i).getY())+this.rc.getW0();
            if(this.lista.get(i).getClasse()== 0 && teste>0){//teste deve ser <= 
                novoW0 = this.rc.getW0() -(this.n)*1;
                novoW1 = this.rc.getW1() -(this.n)*this.lista.get(i).getX();
                novoW2 = this.rc.getW2() -(this.n)*this.lista.get(i).getY();
                this.rc.setW0(novoW0);
                this.rc.setW1(novoW1);
                this.rc.setW2(novoW2);
                chave = false;
            }
            if(this.lista.get(i).getClasse()== 1 && teste<=0){//teste deve ser >  
                novoW0 = this.rc.getW0() +(this.n)*1;
                novoW1 = this.rc.getW1() +(this.n)*this.lista.get(i).getX();
                novoW2 = this.rc.getW2() +(this.n)*this.lista.get(i).getY();
                this.rc.setW0(novoW0);
                this.rc.setW1(novoW1);
                this.rc.setW2(novoW2);
                chave = false;
            }else{
                chave = true;
            }
            if(i+1 == this.lista.size() && chave==false)
                i=0;
        }
            
            
            
            
           
    }
}//fim class leitura
