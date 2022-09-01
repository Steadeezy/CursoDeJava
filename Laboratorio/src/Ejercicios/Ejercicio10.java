package Ejercicios;

import javax.swing.*;

public class Ejercicio10 {

    public static void main(String[] args){

        int numeroGenerado = (int) (Math.random()*100);
        int numeroIngresado = -10;
        int contador++;

       while (numeroIngresado != numeroGenerado){
            contador++;
            numeroIngresado = Integer.parseInt(JOptionPane.showInputDialog("ingrese el número para comparar"));
            if(numeroIngresado>numeroGenerado){
                JOptionPane.showMessageDialog(null,"El número que ingresó es mayor al generado");
            } else if(numeroIngresado<numeroGenerado){
                JOptionPane.showMessageDialog(null,"El número que ingresó es menor al generado");
            }   else if(numeroIngresado==numeroGenerado){
                JOptionPane.showMessageDialog(null,"El número ingresado es correcto \nLa cantidad de intentos fue: "+contador+"\nEl número correcto era: "+numeroIngresado);
            }
        }
    }
}
