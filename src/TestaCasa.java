/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafa
 */
public class TestaCasa {
    public static void main (String [] args){
    
        Casa c = new Casa ();
        c.cor = "Rosa";
        c.porta1 = true;
        c.porta2 = false;
        c.porta3 = true;
                
        c.quantasPortasEstaoAbertas();
    }
    
}
