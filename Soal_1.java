import java.util.Scanner;

/**
 * 1. Membuat array integer berukuran 10
 * 2. Input nilai dari keyboard
 * 3. Hitung dan tampilkan:
 *      a. Total seluruh nilai
 *      b. Rata-rata nilai
 *      c. Nilai tertinggi
 *      d. Nilai terendah
 */

public class Soal_1 {
    public static Scanner input = new Scanner(System.in);
    public static boolean pilih = false;
    public static boolean arrMenu = false;
    public static int[] array = new int[10];
    public static void main(String[] args) {  
        // int[] array = {21,9,1,4,11,2,6,23,12,25};
        int total = 0;
        
        do {
            System.out.println("======= Perhitungan sederhana =======");
            System.out.println("1. Lihat array");
            System.out.println("2. Rubah nilai array");
            System.out.println("3. Total nilai array");
            System.out.println("4. Rata-rata nilai array");
            System.out.println("5. Nilai terendah array");
            System.out.println("6. Nilai tertinggi array");
            System.out.println("7. Keluar");
            System.out.println(" ");

            System.out.print("Pilih menu : ");

            int opsi = input.nextInt();

            
            switch (opsi) {
                case 1:
                    System.out.print("Array = ");
                    lihatArray(array);
                    
                    System.out.println("\n");
                    break;
                case 2:
                    ubahArray();
                    break;
                case 3:
                    for(int i =0; i < array.length; i++) {     
                        total += array[i];
                    }
                    System.out.println("Total value array : "+ total);
                    break;
                case 4:
                    for(int i =0; i < array.length; i++) {     
                        total += array[i];
                    }
                    int numRat = total/10;
                    System.out.println("Rata-rata value : "+ numRat);
                    
                    break;
                case 5:
                    int min = array[0];
                    for(int i = 1; i < array.length; i++) {      
                        if(array[i] < min) {
                            min = array[i];
                        }
                    } 

                    lihatArray(array);
                    System.out.println("Nilai terkecil " + min);
                    break;
                case 6:
                    int max = array[0];
                    for(int i = 1; i < array.length; i++) {
                                
                        if(array[i] > max) {
                            max = array[i];
                        }
                    } 

                    lihatArray(array);
                    System.out.println("Nilai tertinggi " + max);
                    break;
                case 7:
                    System.out.println("Terimaksih");
                    pilih = true;
                    break;
            
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
            backToMenu(opsi);
            arrMenu = false;
            total = 0;
        } while (!pilih);
        
    }

    private static void lihatArray(int array[]) {
        System.out.println(java.util.Arrays.toString(array));
    }

    private static void backToMenu(int num) {
        if (num != 7) {
            String opsi;
            // System.out.println("Kembali ke menu ? (y/n)");
            opsi = input.nextLine();
            // input.nextLine();

            while (!opsi.equalsIgnoreCase("y") && !opsi.equalsIgnoreCase("n")) {
                System.out.println("Ketik y / n");
                opsi = input.nextLine();
            }

            if (opsi.equalsIgnoreCase("n")) {
                System.out.println("Terima kasih");
                pilih = true;
            }

        }
    }

    private static void ubahArray() {
        do {
            System.out.println("Pilih index array yg akan diuabah");
            for(int i = 0 ; i <= 9; i++) {
                System.out.println((i+1) + ". index ke "+ i);
            }
            System.out.print("11. keluar");
            System.out.println(" ");
            System.out.print("Pilih no : ");

            int num = input.nextInt();
            int numArr = 0;

            switch (num) {
                case 1:
                    System.out.print("Masukan nilai : ");
                    numArr = input.nextInt();
                    array[num-1] = numArr;
                    break;
                case 2:
                    System.out.print("Masukan nilai : ");
                    numArr = input.nextInt();
                    array[num-1] = numArr;
                    break;
                case 3:
                    System.out.print("Masukan nilai : ");
                    numArr = input.nextInt();
                    array[num-1] = numArr;
                    break;
                case 4:
                    System.out.print("Masukan nilai : ");
                    numArr = input.nextInt();
                    array[num-1] = numArr;
                    break;
                case 5:
                    System.out.print("Masukan nilai : ");
                    numArr = input.nextInt();
                    array[num-1] = numArr;
                    break;
                case 6:
                    System.out.print("Masukan nilai : ");
                    numArr = input.nextInt();
                    array[num-1] = numArr;
                    break;
                case 7:
                    System.out.print("Masukan nilai : ");
                    numArr = input.nextInt();
                    array[num-1] = numArr;
                    break;
                case 8:
                    System.out.print("Masukan nilai : ");
                    numArr = input.nextInt();
                    array[num-1] = numArr;
                    break;
                case 9:
                    System.out.print("Masukan nilai : ");
                    numArr = input.nextInt();
                    array[num-1] = numArr;
                    break;
                case 10:
                    System.out.print("Masukan nilai : ");
                    numArr = input.nextInt();
                    array[num-1] = numArr;
                    break;
                case 11:
                    arrMenu = true;
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
            
        } while (!arrMenu);
        
        
    }

}
