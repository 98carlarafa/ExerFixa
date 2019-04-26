/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafa
 */
public class TestaPorta {
    public static void main (String[]args){
    
        Porta po = new Porta ();
        po.cor = "Rosa";
        po.dimensaoX = 4;
        po.dimensaoY = 3;
        po.dimensaoZ = 3;
        po.aberta = true;
        
        po.abre();
        
        po.fecha();
        
        po.abre();
        
        po.pinta("Azul");
        po.pinta("Verde");
        
        System.out.println("Nova cor:" + po.cor);
        
        po.estaAberta();
        
        
        
    }
    
}
