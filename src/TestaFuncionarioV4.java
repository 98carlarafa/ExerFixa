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
        
        Data d3 = new Data ();
        fv3.dataEntrada = d3;
        
        fv3.nomeFuncionario = "Carla Rafaela";
        fv3.departamento = "Caixa";
        fv3.salario = 1500;
        fv3.dataEntrada.dia = 17;
        fv3.dataEntrada.mes = 04;
        fv3.dataEntrada.ano = 2019;
        fv3.rg = "12.312.007";
        fv3.ativo = true;
        
        fv3.bonifica(10);
        
        fv3.demite();       
        
        fv3.mostrar();
        
        FuncionarioV4 fv4 = new FuncionarioV4 ();
        
        Data d4 = new Data ();
        fv4.dataEntrada = d4;
 
        
        fv4.nomeFuncionario = "Carla Rafaela";
        fv4.departamento = "Caixa";
        fv4.salario = 1500;
        fv4.dataEntrada.dia = 17;
        fv4.dataEntrada.mes = 04;
        fv4.dataEntrada.ano = 2019;
        fv4.rg = "12.312.007";
        fv4.ativo = true;
        
      
        fv4.bonifica(10);
           
        fv4.demite();       
        
        fv4.mostrar();
        
        fv3.equals(fv4);
    }
    
}
