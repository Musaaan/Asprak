import  java.util.*;
public class Main {
    public static void main(String[] args) {
        LinkedList<Barang> listBuku = new LinkedList<Barang>();

        listBuku.add(new Barang(1, "Pemrograman Java", "Komputer", 10000, "Tersedia"));
        listBuku.addLast(new Barang(2, "Pemrograman C++", "Komputer", 20000, "Tersedia"));
        listBuku.addFirst(new Barang(3, "Pemrograman Python", "Komputer", 30000, "Tidak Tersedia"));
        listBuku.add(2, new Barang(4, "Pemrograman PHP", "Komputer", 40000, "Tersedia"));

        System.out.println("CetakBuku");
        ListIterator<Barang> print = listBuku.listIterator();
        while (print.hasNext()) {
            System.out.println(print.next());
        }

        System.out.println();

        System.out.println("Cetak Mundur Buku");
        while (print.hasPrevious()) {
            System.out.println(print.previous());
        }

        System.out.println();

        ListIterator<Barang> delete = listBuku.listIterator();
        while (delete.hasNext()) {
            Barang buku = delete.next();
            if (buku.getIsbn() == 2) {
                delete.remove();
            }
        }

        System.out.println("Cetak Buku setelah dihapus");
        for (Barang book : listBuku) {
            System.out.println(book);
        }

        System.out.println();

        ListIterator<Barang> update = listBuku.listIterator();
        while (update.hasNext()) {
            Barang buku = update.next();
            if (buku.getIsbn() == 3) {
                buku.setJudul("Pemrograman Javascript");
                buku.setKategori("Komputer");
                buku.setStatus("Tersedia");
                update.set(buku);
            }
        }

        System.out.println("Cetak Buku setelah diupdate");
        for (Barang book : listBuku) {
            System.out.println(book);
        }


    }
}