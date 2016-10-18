
package boletin2_11;

import javax.swing.JOptionPane;

public class Boletin2_11 {

    public static void main(String[] args) {
        // Soldo liquido
        float soldo_fixo;
        float comision;
        comision = (long) 0.05;
        float quilometraxe = 2;
        float dietas = 30;
        float importe_total_vendas;
        float soldoliquido = 0;
        float cantidad_vendida;
        float kmts;
        
        soldo_fixo = (long) Float.parseFloat(JOptionPane.showInputDialog("Introduzca sueldo fijo "));
        kmts = (long) Float.parseFloat(JOptionPane.showInputDialog("Introduzca los kmts recorrido  "));
        dietas = (long) Float.parseFloat(JOptionPane.showInputDialog("Introduzca dias trabajados  "));
        importe_total_vendas = (long) Float.parseFloat(JOptionPane.showInputDialog("Introduzca el total de vendas "));
        
        comision = (long) (importe_total_vendas * 0.05);
        quilometraxe = (long) (kmts * 2);
        dietas = (long) (dietas * 30);
          
        soldoliquido = comision + quilometraxe + dietas;
        JOptionPane.showInputDialog(null, "El resultado de la cantidad es " +soldoliquido);
        
        
        
        
        
        
       
        
        
              
    }
    
}
