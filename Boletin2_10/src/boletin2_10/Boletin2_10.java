
package boletin2_10;

import javax.swing.JOptionPane;

public class Boletin2_10 {

    public static void main(String[] args) {
        // Cantidade enteira en euros
        long cantidad;
        long billetes_100;
        long billetes_20;
        long billetes_5;
        long total;
        long resto;
        
        cantidad = (int) Float.parseFloat(JOptionPane.showInputDialog("Dinero a introducir (nº entero):"));
      
        billetes_100 = (cantidad/100);
        resto = cantidad - billetes_100*100;
        billetes_20 = (cantidad/20);
        resto = cantidad - billetes_20*20;
        billetes_5 = (cantidad/5);
        resto = cantidad - billetes_5*5;
       
        JOptionPane.showMessageDialog(null,"La cantidad de puede dividir en:\nBilletes de 100: "+billetes_100+"\nBilletes de 20: "+billetes_20+"\nBilletes de 5: "+billetes_5+"\nMonedas de 1:" +resto);
       
        
        
       
    }
    
}
