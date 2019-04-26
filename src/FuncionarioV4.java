/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafa
 */
public class FuncionarioV4 {
    
    String nomeFuncionario;
    String departamento;
    double salario;
    Data dataEntrada;
    String rg;
    boolean ativo;
    
    
    void bonifica (double aumento){
        
        salario = salario + (salario * aumento / 100);
        
    }
    void demite (){
    
        ativo = false;
        
    }
    
    void mostrar (){
        
        System.out.println(nomeFuncionario);
        System.out.println(departamento);
        System.out.println(salario);
        System.out.println(dataEntrada.dia + "/" + dataEntrada.mes + "/" + dataEntrada.ano);
        System.out.println(rg);
        System.out.println(ativo);
    }
    
    void equals (FuncionarioV4 Funcionario){
        if ((this.nomeFuncionario == Funcionario.nomeFuncionario) &&
                (this.departamento == Funcionario.departamento) &&
                (this.salario == Funcionario.salario) &&
                (this.dataEntrada.dia + this.dataEntrada.mes + this.dataEntrada.ano == 
                    Funcionario.dataEntrada.dia + Funcionario.dataEntrada.mes + Funcionario.dataEntrada.ano) &&
                (this.rg == Funcionario.rg) &&
                (this.ativo == Funcionario.ativo))
                    
                System.out.println ("São Iguais");
                    else
                        System.out.println("Não são iguais");     
        
    }
    
}
