/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafa
 */
public class Esfera {
    
    double raio;
    double volume;
    
    void calculaVolume(){
        
        volume = (4.0 / 3) * Math.pow(raio, 3);
    }
    
}
