/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
public class FuncionarioV1 {
    
    String nomeFuncionario;
    String departamento;
    double salario;
    String dataEntrada;
    String rg;
    boolean ativo;
    
    
    void bonifica (double aumento){
        
        salario = salario + (salario * aumento / 100);
        
    }
    void demite (){
    
        ativo = false;
        
    }
}
