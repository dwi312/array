/*
 *  1. Membuat array bilangan bulat
 *  2. Lakukan operasi:
 *      a. Cari bilangan genap
 *      b. Cari bilangan prima
 *      c. Urutkan bilangan dari terkecil ke terbesar
 *      d. Hapus duplikat
 */

import java.util.Arrays;
import java.util.Scanner;

public class Soal_5 {
    public static void main(String[] args) {
        int[] array = new int[]{33,22,1,9};
        
        Scanner input = new Scanner(System.in);

        
        System.out.print("Masukan angka: ");
        int angka = input.nextInt();

        System.out.println("\n");

        if (angka % 2 == 0) {
            System.out.println("Angka anda: " + angka + " adalah bilangan genap.");
        } else {
            System.out.println("Angka anda: " + angka + " adalah bilangan ganjil.");
        }

        System.out.println("lihat array ? y / n ");
        String lihatArr = input.next();

        while (!lihatArr.equalsIgnoreCase("y") && !lihatArr.equalsIgnoreCase("n")) {
            System.out.println("pilih y / n");
            lihatArr = input.next();
        }

        if (lihatArr.equalsIgnoreCase("y")) {
            System.out.println(java.util.Arrays.toString(array));
        }
        System.out.println("");

        System.out.println("Urutkan array ? y/n");
        String urut = input.next();

        while (!urut.equalsIgnoreCase("y") && !urut.equalsIgnoreCase("n")) {
            System.out.println("pilih y / n");
            urut = input.next();
        }

        if (urut.equalsIgnoreCase("y")) {
            for(int i = 0; i < array.length; i++) {
                Arrays.sort(array);
            }
            System.out.println(java.util.Arrays.toString(array));
        }
    }

}
