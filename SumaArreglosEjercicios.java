package juan.sumaarreglosejercicios;

/*
Ejercicio 1

Un programa que tome un arreglo con 9 numeros, luego genere uno que los complemente para sumar 10 y luego se crea un tercer arreglo con la suma de ambos (un arreglo de puros 10)
*/

public class SumaArreglosEjercicios {
    public static void main(String[] args) {
        int[] listaBase = {3, 2, 3, 5, 5, 7, 8, 9};
        int[] listaComplementaria = new int[listaBase.length], listaCompleta = new int[listaBase.length];
        System.out.print("Lista base:");
        for (int i=0;i<listaBase.length;i++) {
            System.out.print(" "+listaBase[i]+" ");
            listaComplementaria[i] = 10 - listaBase[i];
        }
        System.out.print("\nLista complementaria:");
        for (int i=0;i<listaBase.length;i++) {
            System.out.print(" "+listaComplementaria[i]+" ");
            listaCompleta[i] = listaBase[i] + listaComplementaria[i];
        }
        System.out.print("\nLista completa:");
        for (int i=0;i<listaCompleta.length;i++) {
            System.out.print(" "+listaCompleta[i]+" ");
        }
    }
}
