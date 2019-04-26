/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
public class TestaFuncionarioV2 {
    public static void main(String[] args) {
        
        FuncionarioV2 fv2 = new FuncionarioV2 ();
        fv2.nomeFuncionario = "Carla Rafaela";
        fv2.departamento = "Caixa";
        fv2.salario = 1500 ;
        fv2.dataEntrada = "01/01/2019";
        fv2.rg = "12.312.007";
        fv2.ativo = true;
        fv2.bonifica(10);
        
        System.out.println(fv2.salario);
        
        fv2.demite();
        System.out.println(fv2.ativo);
        
        fv2.mostrar();
        
        

    }
    
}
