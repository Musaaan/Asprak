import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedList daftarResep = new SinglyLinkedList();
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Resep di Awal");
            System.out.println("2. Tambah Resep di Akhir");
            System.out.println("3. Hapus Resep di Awal");
            System.out.println("4. Hapus Resep di Akhir");
            System.out.println("5. Cetak Semua Resep");
            System.out.println("6. Cari Resep Berdasarkan Nama");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 
            switch (pilihan) {
                case 1:
                case 2:
                    System.out.print("Masukkan Nama Resep: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Bahan Utama: ");
                    String bahan = scanner.nextLine();
                    System.out.print("Masukkan Waktu Memasak (menit): ");
                    int waktu = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan buffer
                    Resep resepBaru = new Resep(nama, bahan, waktu);
                    if (pilihan == 1) {
                        daftarResep.addResepDiawal(resepBaru);
                    } else {
                        daftarResep.addResepDiakhir(resepBaru);
                    }
                    System.out.println("Resep berhasil ditambahkan!");
                    break;
                case 3:
                    daftarResep.hapusResepDiAwal();
                    break;
                case 4:
                    daftarResep.hapusResepDiAkhir();
                    break;
                case 5:
                    daftarResep.cetakResep();
                    break;
                case 6:
                    System.out.print("Masukkan Nama Resep yang Dicari: ");
                    String cari = scanner.nextLine();
                    daftarResep.cariResep(cari);
                    break;
                case 0:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}
