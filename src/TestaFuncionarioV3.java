/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
public class TestaFuncionarioV3 {
    public static void main(String[] args) {
        
        FuncionarioV3 fv3 = new FuncionarioV3 ();
        
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
        
    }
    
}
