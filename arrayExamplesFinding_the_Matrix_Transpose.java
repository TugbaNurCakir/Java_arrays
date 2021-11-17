// Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.
//
//Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının yer
// değiştirmesi demektir. Bu işlem sonucu elde edilen matris, başlangıçtaki matrisin transpozudur
// (devriğidir). Bu aşamada kxn’lik bir matrisin transpozu (devriği) nxk’lik bir matris olur.
// Örneğin bir A matrisimiz olsun. Bu A matrisinin transpozu (devriği), A^T (A üzeri T) ile gösterilir.
//
//Örneğin aşağıdaki 2x3’lik A matrisinin transpozu (devriği), 2x3’lük bir A^T matrisidir.


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] original = {{1, 2, 3}, {4, 5, 6}};

        int[][] transpose = new int[original[0].length][original.length];

            for(int i=0; i< original.length; i++){
                for(int j=0; j<original[i].length; j++){
                    transpose[j][i] = original[i][j];
                }
            }
        System.out.println("original :");
        for(int i = 0; i < original.length; i++) {
            for(int j = 0; j < original[0].length; j++) {
                System.out.print(original[i][j] + "  ");
            }
            System.out.print("\n");
        }

        System.out.println("transpose :");
        for(int i = 0; i < transpose.length; i++) {
            for(int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j] + "  ");
            }
            System.out.print("\n");
        }

    }


}
