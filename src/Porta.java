/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafa
 */
public class Porta {
    
    boolean aberta;
    String cor;
    double dimensaoX;
    double dimensaoY;
    double dimensaoZ;
    
    void abre(){
    
        aberta = true;
    }
    void fecha(){
    
        aberta = false;
    }
    void pinta(String s){
        
        cor = s;
    }
    boolean estaAberta(){
        
        if (aberta == true)
            System.out.println ("A porta esta aberta!");
        else 
            System.out.println ("A porta esta fechada!");
            return aberta;
    }
}
