import java.util.Scanner;

/**
 *  1. Membuat matriks 4x4
 *  2. Input nilai matriks dari keyboard
 *  3. Hitung:
 *      a. Jumlah seluruh elemen
 *      b. Jumlah diagonal utama
 *      c. Jumlah diagonal samping
 */

 
public class Soal_3 {
    public static void main(String[] args) {
        int[][] matrik = new int[4][4];
        Scanner input = new Scanner(System.in);
        int total = 0;
        int diut = 0;
        int disa = 0;

        

        // for(int i = 0; i < matrik.length; i++) {
        //     for(int j = 0; j < matrik[i].length; j++) {
        //         System.out.print("Masukkan elemen [" + i + "][" + j + "]: ");
        //         matrik[i][j] = input.nextInt();
        //     }
        //     System.out.println();
        // }

        for(int i = 0; i < matrik.length; i++) {
            for(int j = 0; j < matrik[i].length; j++) {
                System.out.print(matrik[i][j]+"\t");
              
            }
            System.out.println();
        }
        System.out.println("\n");

        for(int i = 0; i < matrik.length; i++) {
            for(int j = 0; j < matrik[i].length; j++) {
                total += matrik[i][j];
            }
        }
        System.out.println("Jumlah seluruh elemen: "+total);
        System.out.println("\n");

        for(int i = 0; i < matrik.length; i++) {
            diut += matrik[i][i]; 
            System.out.print(matrik[i][i]+ "\t");
        }
        System.out.println();
        System.out.println("Jumlah diagonal utama: "+diut);
        System.out.println("\n");


        for(int i = 0; i < matrik.length; i++) {
            disa += matrik[i][matrik.length - 1 - i];
            System.out.print(matrik[i][matrik.length - 1 - i]+ "\t");
        }
        System.out.println();
        System.out.println("Jumlah diagonal samping: "+disa);
        System.out.println("\n");

    }

}
