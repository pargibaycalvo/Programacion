
package boletin2_6;

import javax.swing.JOptionPane;

public class Boletin2_6 {

    public static void main(String[] args) {
        // Porcentaje descontada en una compra
        float tarifa;
        float precio;
        
        precio = Float.parseFloat(JOptionPane.showInputDialog("precio "));
        tarifa = Float.parseFloat(JOptionPane.showInputDialog("descuento tarifa "));
        
        tarifa = 100*(precio-tarifa);
        System.out.println("descuento tarifa es "+ tarifa);
        
        
        
        
        
    }
    
}
