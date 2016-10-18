
package bolenti2_12;

import javax.swing.JOptionPane;

public class Bolenti2_12 {

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
        float retencion;
        float ssocial = 36;
        float irpf;
        irpf = (long) 0.18;
        
        soldo_fixo = (long) Float.parseFloat(JOptionPane.showInputDialog("Introduzca sueldo fijo "));
        kmts = (long) Float.parseFloat(JOptionPane.showInputDialog("Introduzca los kmts recorrido  "));
        dietas = (long) Float.parseFloat(JOptionPane.showInputDialog("Introduzca dias trabajados  "));
        importe_total_vendas = (long) Float.parseFloat(JOptionPane.showInputDialog("Introduzca el total de vendas "));
        
        comision = (long) (importe_total_vendas * 0.05);
        quilometraxe = (long) (kmts * 2);
        dietas = (long) (dietas * 30);
        
        
        soldoliquido = (comision + quilometraxe + dietas - ssocial - irpf);
        JOptionPane.showInputDialog(null, "El resultado de la cantidad es " +soldoliquido);
    }
    
}
