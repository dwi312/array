
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Soal_2 {
    public static Scanner input = new Scanner(System.in);
    public static boolean exit = false;
    public static void main(String[] args) {
        // String[] mahasiwa = new String[5];
        String[] mahasiwa = {
            "budi",
            "Tono",
            "Andi",
            "Ani",
            "Dona"
        };
        

        do {
            System.out.println("___ Daftar Mahasiswa ___");
            System.out.println("1. Lihat data Mahasiswa");
            System.out.println("2. Cari Mahasiswa");
            System.out.println("3. Tambah data Mahasiswa");
            System.out.println("4. Update data Mahasiswa");
            System.out.println("5. Hapus data Mahasiswa");
            System.out.println("6. Keluar");

            System.out.print("Pilih menu : ");
            int menu = input.nextInt();

            switch (menu) {
                case 1:
                    // Lihat data mahasiswa
                    lihatData(mahasiwa);
                    break;
                case 2:
                    // Cari posisi nama tertentu
                    pencarian(mahasiwa, input);
                    break;
                case 3:
                    // Tambah mahasiswa
                    tambahMahasiswa(mahasiwa, input);
                    break;
                case 4:
                    // Update data mahasiswa
                    ubahNama(mahasiwa, input);
                    break;
                case 5:
                    // Hapus data mahasiswa
                    System.out.print("Masukan Nama: ");
                    String nama = input.next();

                    int indexArr = -1;
                    
                    for(int i = 0; i < mahasiwa.length; i++) {
                        if (mahasiwa[i].equalsIgnoreCase(nama)) {
                            indexArr = i;
                            break;
                        }
                    }

                    String[] newArr = new String[mahasiwa.length -1];
                    for(int i = 0, j = 0; i < mahasiwa.length; i++) {
                        if (i != indexArr) {
                            newArr[j++] = mahasiwa[i];
                        }
                    }

                    System.out.println("Hapus nama "+nama+ " ? y/n");
                    String sure = input.next();

                    if(sure.equalsIgnoreCase("n")) {
                        System.out.println("Nama gagal dihapus");
                        return;
                    } else {
                        mahasiwa = newArr;
                        System.out.println("berhasil dihapus nama: "+nama);
                    }

                    
                    break;
                case 6:
                    System.out.println("Terimakasih");
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
            // Kembali ke menu ? y/n
            backToMenu(menu);
        } while (!exit);

        


        
    }

    private static void backToMenu(int num) {
        if (num != 6) {

            System.out.println("Kembali ke menu ? (y/n)");
            String opsi = input.next();

            while (!opsi.equalsIgnoreCase("y") && !opsi.equalsIgnoreCase("n")) {
                System.out.println("Ketik y / n");
                opsi = input.nextLine();
            }

            if (opsi.equalsIgnoreCase("n")) {
                System.out.println("Terima kasih");
                exit = true;
            }

        }
    }

    private static void lihatData(String[] array) {
        boolean kosong = true; 
        for(int i = 0; i < array.length; i++) {
            if(array[i] != null ) {
                // Urutkan nama secara alfabet
                Arrays.sort(array);
                // Tampilkan nama yang diurutkan
                System.out.println((i+1) +". Nama : " + array[i]);
                kosong = false;
            }
        }
        
        if (kosong) {
            System.out.println("Data Mahasiswa masih kosong.");
        }
    }

    private static void pencarian(String[] array, Scanner input) {
        System.out.print("Cari nama: ");
        String cari = input.next();
        
        boolean nihil = false;
        for(int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(cari)) {
                System.out.println("Pencarian nama " +cari+" ditemukan");
                nihil = true;
                break;
            }
        }

        if (!nihil) {
            System.out.println("Pencarian nama: " +cari+" tidak ditemukan");
        }
    }

    private static void tambahMahasiswa(String[] array, Scanner input) {
        System.out.println("Masukan nama anda: ");
        String nama = input.next();

        array = Arrays.copyOf(array, array.length +1);
        array[array.length-1] = nama;
        System.out.println("Nama anda telah berhasil ditambahkan.");
    }

    private static void ubahNama(String[] array, Scanner input) {
        System.out.print("Masukan nama: ");
        String namaBaru;
        String nama = input.next();

        boolean nihil = false;
        for(int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(nama)) {
                System.out.println("Ditemukan ");
                System.out.println("Nama : " +nama);
                System.out.print("Nama baru : ");
                namaBaru = input.next();

                System.out.println("Apakah anda yakin ? y/n");
                String sure = input.next();

                if(sure.equalsIgnoreCase("n")) {
                    System.out.println("Nama gagal dirubah");
                    return;
                }
                array[i] = namaBaru;

                System.out.println("Nama berhasil dirubah");
                
                nihil = true;
                break;
            }
        }

        if (!nihil) {
            System.out.println("Nama yang masukan : " +nama+" tidak ditemukan");
        }
        
        

        

    }

}
