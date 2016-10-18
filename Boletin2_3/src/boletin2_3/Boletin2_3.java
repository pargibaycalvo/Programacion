
package boletin2_3;

import javax.swing.JOptionPane;

public class Boletin2_3 {

    public static void main(String[] args) {
 //conversor de dolares a euros
        float dolar;
        float euro;
        euro = Float.parseFloat(JOptionPane.showInputDialog("cantidad euro "));
        float cambio= (float) 1.72;
        dolar= (euro * cambio);
        System.out.println("cambio a dolar es "+ dolar);
    }
    
}
