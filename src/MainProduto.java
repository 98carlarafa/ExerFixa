/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafa
 */
public class MainProduto {
    public static void main(String[] args){
    
        Produto p = new Produto ();
        p.nome = "Misteira";
        p.preco = 200;
        
        System.out.println("Produto:" + p.nome);
        System.out.println("Produto:" + p.preco);
        
        p.diminuir10();
        System.out.println("Diminuir10:" + p.preco);
        
        p.aumenta25();
        System.out.println("Aumentar25:" + p.preco);
              
    }
    
}
