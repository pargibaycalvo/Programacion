
package boletin2_4;

import javax.swing.JOptionPane;

public class Boletin2_4 {

    public static void main(String[] args) {
//suma, resta, producto y cociente de 2 números
    float suma, resta, producto, cociente;
        float numero1 = Float.parseFloat(JOptionPane.showInputDialog("primer numero "));
        float numero2 = Float.parseFloat(JOptionPane.showInputDialog("segundo numero "));
    
    suma= (numero1+numero2);
    resta= (numero1-numero2);
    producto= (numero1*numero2);
    cociente= (numero1/numero2);
    
System.out.println("suma "+ suma + "\t resta "+ resta +"\t producto "+ producto +"\t cociente"+ cociente);
    
    
         
    }
    
}
