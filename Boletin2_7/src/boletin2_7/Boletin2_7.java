
package boletin2_7;

import javax.swing.JOptionPane;

public class Boletin2_7 {

    public static void main(String[] args) {
        //Obtencion de renda mensual
        float renta;
        float potencia1;
        float potencia2;
        float n;
        n = Float.parseFloat(JOptionPane.showInputDialog("Introduzca nominal "));
        float i;
        i = Float.parseFloat(JOptionPane.showInputDialog("Introduzca interes "));
        float t;
        t = Float.parseFloat(JOptionPane.showInputDialog("Introduzca numero de anos "));
        potencia1 = (float) Math.pow(n*(1+i),t*i);
        potencia2 = (float) Math.pow ((1+i),t-1);
        renta = potencia1 / potencia2;
        JOptionPane.showInputDialog(null, "A renta mensual é de " +renta);
        System.out.println("renda mensual "+ renta);
        
                
        
        
    }
    
}
