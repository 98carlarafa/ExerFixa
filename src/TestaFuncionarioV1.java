/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
public class TestaFuncionarioV1 {
    public static void main(String[] args) {
        
        FuncionarioV1 fv1 = new FuncionarioV1 ();
        fv1.nomeFuncionario = "Carla Rafaela";
        fv1.departamento = "Caixa";
        fv1.salario = 1500 ;
        fv1.dataEntrada = "01/01/2019";
        fv1.rg = "12.312.007";
        fv1.bonifica(10);
        
        System.out.println(fv1.salario);
        
        fv1.demite();
        System.out.println(fv1.ativo);
        

    }
    
}
