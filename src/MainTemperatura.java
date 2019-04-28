/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafa
 */
public class MainTemperatura {
    public static void main(String[] args) {
        
        Temperatura t = new Temperatura();
           
        double resultado;        
        resultado = t.converterParaFahrenheit(23.5);       
        System.out.println("Fahrenheit: " + resultado);
        
        resultado = t.converterParaCelsius(60);       
        System.out.println("Celsius: " + resultado);
        
        
    }
    
}
