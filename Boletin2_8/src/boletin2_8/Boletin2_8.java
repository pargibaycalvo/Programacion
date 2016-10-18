
package boletin2_8;

import javax.swing.JOptionPane;

public class Boletin2_8 {

    public static void main(String[] args) {
        // Temperatura expresada en Fahrenheit
        float temperatura_grados;
        float fahrenheit_grados;
        float grados_kelvin;
        temperatura_grados = Float.parseFloat(JOptionPane.showInputDialog("grados centigrados "));
        
        
       fahrenheit_grados = temperatura_grados+273 ;
       grados_kelvin = temperatura_grados*9/5+32;
       
       JOptionPane.showInputDialog("Temperatura de Grados a Fahrenheit es de " +fahrenheit_grados);
       JOptionPane.showInputDialog("Temperatura de Grados a Kelvin es de " +grados_kelvin);
    }
    
}
