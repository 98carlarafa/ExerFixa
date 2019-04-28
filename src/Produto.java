/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafa
 */
public class Produto {
    
    double preco;
    String nome;
    
    void diminuir10(){
    
        preco = preco * 0.9; 
    }
    
    void aumenta25(){
    
        preco = preco * 1.25;
    }

    
}
