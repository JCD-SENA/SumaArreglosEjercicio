package juan.sumaarreglosejercicios;

import javax.swing.JOptionPane;

/*
Ejercicio 2

Un programa que le pregunte al usuario por 10 nombres y 10 apellidos y luego junte ambos valores, ya que la suma de arreglos es la combinación de valores por lo que no necesariamente tiene que ser matematico
(Esto fue escrito el 15/05/2024)
*/

public class Ejercicio2 {
    public static void main(String[] args) {
        final int TAM = 10;
        String[] nombres = new String[TAM], apellidos = new String[TAM], completo = new String[TAM];
        for (int i=0; i<TAM; i++) {
            nombres[i] = JOptionPane.showInputDialog("Ingrese el/los nombre(s) de persona "+i+": ");
            apellidos[i] = JOptionPane.showInputDialog("Ingrese el/los apellido(s) de persona "+i+": ");
        }
        for (int i=0; i<TAM; i++)
            completo[i] = nombres[i] + " " + apellidos[i];
        for (int i=1; i<=TAM; i++)
            System.out.println("Persona "+i+": "+completo[i]);
    }
}
