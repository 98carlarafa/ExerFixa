/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafa
 */
public class TestaPessoa {
     public static void main(String[] args) {
     
        Pessoa p1 = new Pessoa ();
        p1.nome = "Carla Rafaela";
        p1.idade = 20;
        
        System.out.println("Idade:" + p1.idade);
        
        p1.fazAniversario();
        p1.fazAniversario();
        p1.fazAniversario();
        
        System.out.println ("Nova idade:" + p1.idade);
     }
}
