import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Membuat program untuk manajemen nilai siswa
 * 1. Input nama dan nilai untuk 5 siswa
 * 2. Tampilkan:
 *      a. Daftar nama dan nilai
 *      b. Rata-rata kelas
 *      c. Siswa dengan nilai tertinggi
 *      d. Siswa dengan nilai terendah
 */
public class Soal_4 {
    public static void main(String[] args) {
        String[] nama;
        double[] nilai;

        boolean exit = false;
        Scanner input = new Scanner(System.in);

        nama = new String[]{ "budi", "tono", "nani", "yani", "udin"};
        nilai = new double[]{7.5, 8.0, 6.5, 8.2, 9.0};

        do {
            System.out.println("Manajemen nilai siswa");
            System.out.println("1. Daftar nilai Siswa");
            System.out.println("2. Rubah nilai Siswa");
            System.out.println("3. Keluar");

            System.out.print("Pilih no: ");
            int num = input.nextInt();

            switch (num) {
                case 1:
                    lihatDaftar(nama, nilai);
                    break;
                case 2:
                    rataNilai();
                    break;
                case 3:
                    nilaiMax();
                    break;
                case 4:
                    nilaiMin();
                    break;
            
                default:
                    exit = true;
                    break;
            }

            if (!exit) {
                System.out.println("Kembali ke menu ? y/n");
                String lanjutkan = input.next();

                while (!lanjutkan.equalsIgnoreCase("y") && !lanjutkan.equalsIgnoreCase("n")) {
                    System.out.println("ketik y / n");
                    lanjutkan = input.next();
                }

                if (lanjutkan.equalsIgnoreCase("n")) {
                    exit =true;
                }
            }

        } while (!exit);
    }

    private static void lihatDaftar(String[] array, double[] array2) {
        
        System.out.println("\n");
        System.out.println("Nilai siswa : ");
        System.out.println("No\tNama\tnilai");

        Arrays.sort(array2);
        for(int i = array2.length -1; i >= 0; i--){
        
            System.out.print(((4-i)+1)+".\t"+array[i]+"\t"+array2[i]);
            System.out.println("");

        }

        System.out.println("\n");
        float total = 0;
    
        for(int i = 0; i < array2.length; i++) {
            total += array2[i];
        }
        System.out.print("Rata-rata kelas : ");
        System.out.println(total / array2.length);
        System.out.println();



        
    }

    private static void rataNilai() {}
    private static void nilaiMax() {}
    private static void nilaiMin() {}


}
