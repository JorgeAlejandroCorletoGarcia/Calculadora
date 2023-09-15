
package com.mycompany.calculadora;
import javax.swing.JOptionPane;
public class Calculadora {
    public static void main(String[] args) {
        double suma=0,resta=0,multiplicacion=0,division=0;
        double Valor1=0, Valor2=0;
        String Operacion="";
        Operacion= JOptionPane.showInputDialog(null, "ELIJA OPERACION A REALIZAR + - * /");
        Valor1 = Double.parseDouble(JOptionPane.showInputDialog(null, "INGRESE PRIMER VALOR"));
        Valor2 = Double.parseDouble(JOptionPane.showInputDialog(null, "INGRESE SEGUNDO VALOR"));  
        //suma
        if(Operacion.equals("+")){
            suma = Valor1 + Valor2;
            JOptionPane.showMessageDialog(null, suma);
        }
        //resta
        if(Operacion.equals("-")){ 
            resta = Valor1 - Valor2;
            JOptionPane.showMessageDialog(null, resta);
        }
        //multiplicacion
        if(Operacion.equals("*")){
            multiplicacion = Valor1 * Valor2;
            JOptionPane.showMessageDialog(null, multiplicacion);
        }
       // division
       if(Operacion.equals("/")){
            division = Valor1 / Valor2;
            JOptionPane.showMessageDialog(null, division);
    
        }
         JOptionPane.showMessageDialog(null, "Gracias por utilizar la calculadora.");       
    }
    
}
