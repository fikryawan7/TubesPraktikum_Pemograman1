package TUBES;

import java.util.Scanner;

public class MainAkademik {
	
	
    public static void main(String[] args) {
        QueueLogic antrianAkademik = new QueueLogic();
        Scanner scanner = new Scanner(System.in);
        String pilihan;

        do {
            System.out.println("\nMenu Antrian Akademik");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Panggil Mahasiswa dari Antrian");
            System.out.println("3. Lihat Daftar Antrian");
            System.out.println("4. Lihat Mahasiswa di Depan Antrian");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    System.out.print("Masukkan nama mahasiswa: ");
                    String nama = scanner.nextLine();
                    antrianAkademik.tambahMahasiswa(nama);
                    break;
                case "2":
                    antrianAkademik.panggilMahasiswa();
                    break;
                case "3":
                    antrianAkademik.lihatAntrian();
                    break;
                case "4":
                    antrianAkademik.mahasiswaDepan();
                    break;
                case "5":
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        } while (!pilihan.equals("5"));

        scanner.close();
    }
}
