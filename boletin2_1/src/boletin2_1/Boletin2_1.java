
package boletin2_1;

import javax.swing.JOptionPane;

public class Boletin2_1 {

    public static void main(String[] args) {
 //area triangulo indicando base e altura
        float base;
        float altura, area;
        base = Float.parseFloat(JOptionPane.showInputDialog("base "));
        altura = Float.parseFloat(JOptionPane.showInputDialog("altura "));
        area= (int)(base*altura/2);
        JOptionPane.showMessageDialog(null, "area -"+ area);
        System.out.println("area de triangulo "+base+" e altura "+altura+" su area es = "+area);
    }
    
}
