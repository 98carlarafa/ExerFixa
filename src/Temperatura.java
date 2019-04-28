/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafa
 */
public class Temperatura {
    
    double converterParaCelsius(double fahrenheit){
        
        double resultado;
        resultado = (fahrenheit - 32) * (5.0 / 9);
        
        return resultado;
    }
    
    double converterParaFahrenheit(double celsius){
    
        double resultado;
        resultado = (celsius * 9 / 5) + 32;
        
        return resultado;
    }
    
}
