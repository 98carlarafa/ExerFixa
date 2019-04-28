/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafa
 */
public class TestaEsfera {
    public static void main (String [] args){
    
        Esfera e = new Esfera();
        e.raio = 150;
        System.out.println (e.volume);
        
        e.calculaVolume();
        System.out.println(e.volume);
    }
    
}
