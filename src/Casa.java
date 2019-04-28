/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafa
 */
public class Casa {
    
    String cor;
    boolean porta1;
    boolean porta2;
    boolean porta3;
    
    void pinta(String s){
    
        cor = s;
    }    
    
    int quantasPortasEstaoAbertas(){
       
       int portasAbertas = 0;
       
       if(porta1){
       
           portasAbertas = portasAbertas + 1;
       }
       
       if(porta2){
       
           portasAbertas = portasAbertas + 1;
       }
       
       if(porta3){
       
           portasAbertas = portasAbertas + 1;
       }
       return portasAbertas;
      
    }   
    
}
