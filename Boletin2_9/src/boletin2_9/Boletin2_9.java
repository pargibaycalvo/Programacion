
package boletin2_9;

import javax.swing.JOptionPane;

public class Boletin2_9 {

    public static void main(String[] args) {
        // Conversor de una cantidad entera de dinero en monedas
        long dinero_entero;
        long billetes_100;
        long billetes_20;
        long billetes_5;
        long monedas_1;
        long cantidad;
        
        billetes_100 = (long) Float.parseFloat(JOptionPane.showInputDialog("Introduzca la cantidad en billetes de 100 "));
        billetes_20 = (long)Float.parseFloat(JOptionPane.showInputDialog("Introduzca la cantidad en billetes de 20 "));
        billetes_5 = (long) Float.parseFloat(JOptionPane.showInputDialog("Introduzca la cantidad en billetes de 5 "));
        monedas_1 = (long) Float.parseFloat(JOptionPane.showInputDialog("Introduzca la cantidad en monedas de 1 "));
        
        dinero_entero = (long) Float.parseFloat(JOptionPane.showInputDialog("Introduzca la cantidad "));
        
        cantidad = (billetes_100 * 100)+(billetes_20 * 20)+(billetes_5 * 5)+(monedas_1 * 1);
        JOptionPane.showInputDialog(null, "El resultado de la cantidad es" +cantidad);
        System.out.println("resultado final "+ cantidad);
        
        
        
    }
    
}
