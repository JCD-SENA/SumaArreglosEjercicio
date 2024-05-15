package juan.sumaarreglosejercicios;

/*
Ejercicio 3

Un programa que sume los valores de dos arreglos 3x3 bidimencionales
*/

public class ejercicio3 {
    public static void main(String[] args) {
        int[][] arrayA = {
            {2, 2, 2},
            {0, 1, 0},
            {0, 1, 0}
        }, arrayB = {
            {2, 2, 0},
            {2, 2, 0},
            {0, 0, 0}
        }, arrayC = new int[3][3];
        for (int iy = 0; iy < arrayA.length; iy++) {
            for (int ix = 0; ix < arrayA[0].length; ix++) {
                arrayC[iy][ix] = arrayA[iy][ix] + arrayB[iy][ix];
            }
        }
        for (int iy = 0; iy < arrayA.length; iy++) {
            for (int ix = 0; ix < arrayA[0].length; ix++) {
                System.out.print(arrayC[iy][ix]+" ");
            }
            System.out.print("\n");
        }
    }
}
