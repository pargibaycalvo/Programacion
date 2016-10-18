
package boletin2_2;

import javax.swing.JOptionPane;

public class Boletin2_2 {

    public static void main(String[] args) {
      //area de un cuadrado pedindo os datos
        float lado;
        float area;
        lado = Float.parseFloat(JOptionPane.showInputDialog("lado "));
        area = Float.parseFloat(JOptionPane.showInputDialog("area "));
        //tamen int base= 3, altura=4;
        area= (int)(lado*lado);
        JOptionPane.showMessageDialog(null, "area -"+ area);
        System.out.println("area de un cuadrado "+lado+" e lado "+lado+" su area es = "+area);
    }
    
}
