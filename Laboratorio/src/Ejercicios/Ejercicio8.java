package Ejercicios;
import javax.swing.*;

public class Ejercicio8 {

    public static void main(String[] args){

        double numeroRaiz;
        numeroRaiz = Double.parseDouble(JOptionPane.showInputDialog("ingrese un número para calcular la raiz cuadrada"));
        JOptionPane.showMessageDialog(null,"la raiz de "+numeroRaiz+" es: "+Math.sqrt(numeroRaiz));
    }
}