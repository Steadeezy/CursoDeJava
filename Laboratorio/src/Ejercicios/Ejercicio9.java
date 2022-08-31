package Ejercicios;
import javax.swing.*;

public class Ejercicio9 {

    public static void main(String[] args){

        int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su altura"));
        String genero="A";
        while (!genero.equals("M") && !genero.equals("m") && !genero.equals("F") && !genero.equals("f")){
            genero = JOptionPane.showInputDialog("Ingrese su género: M o F");
        if (genero.equals("M") || genero.equals("m")){
            altura=altura-110;
        } else if (genero.equals("F") || genero.equals("f")){
            altura=altura-120;
            }
        }
        JOptionPane.showMessageDialog(null,"Su peso ideal es: "+altura);

    }

}
