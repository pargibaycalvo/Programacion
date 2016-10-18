
package boletin2_5;

import javax.swing.JOptionPane;

public class Boletin2_5 {

    public static void main(String[] args) {
        //conversor de millas marinas a metros
    final int millamarina = 1852;
    float millas;
    float metros;
    millas = Float.parseFloat(JOptionPane.showInputDialog("cantidad en millas "));
    metros = (millas*millamarina);
    
    System.out.println("total metros" + metros);
    
    
    }
    
}
