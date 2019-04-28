/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafa
 */
public class TestaFuncionarioV4 {
    
    public static void main(String[] args) {
        
        FuncionarioV4 fv3 = new FuncionarioV4 ();
        
        fv3.nomeFuncionario = "Carla Rafaela";
        fv3.departamento = "Caixa";
        fv3.salario = 1500 ;
        fv3.rg = "12.312.007";
        fv3.ativo = true;
        
        Data d3 = new Data ();
        d3.dia = 17;
        d3.mes = 04;
        d3.ano = 2019;
        
        fv3.dataEntrada = d3;
        
        fv3.bonifica(10);
        
        fv3.demite();       
        
        fv3.mostrar();
        
        /////////////////////////////////////////////
        FuncionarioV4 fv4 = new FuncionarioV4 ();
        
        fv4.nomeFuncionario = "Carla Rafaela";
        fv4.departamento = "Caixa";
        fv4.salario = 1500 ;
        fv4.rg = "12.312.007";
        fv4.ativo = true;
        
        Data d4 = new Data ();
        d4.dia = 17;
        d4.mes = 04;
        d4.ano = 2019;
        
        fv4.dataEntrada = d3;
        
      
        fv4.bonifica(10);
           
        fv4.demite();       
        
        fv4.mostrar();
        
        
        if (fv3.equals(fv4)){
            System.out.println("Iguais");
        }
        else 
            System.out.println("Diferentes");
    }
    
}
