//buat dulu kelas pojo as always ygy
//attribut tergantung soal jangan lupa, karena kita cuman butuh 3 yaitu buat nama, bahan, dan waktu memasak jadi yah...
//int untuk waktu karena keepannya mungkin kita mau menambah fitur menambah bahan dan memengaruhi waktu memasak

public class Resep {
    public String namaResep;
    public String bahanUtama;
    public int waktuMemasak;

//constructor
    public Resep(String namaResep, String bahanUtama, int waktuMemasak) {
        this.namaResep = namaResep;
        this.bahanUtama = bahanUtama;
        this.waktuMemasak = waktuMemasak;
    }

    public String getNamaResep() {
        return namaResep;
    }
    


    @Override
    public String toString() {
        return "Cara Membuat " + namaResep + ", Bahan utama siapkan -> " + bahanUtama + ", durasi proses masak adalah" + waktuMemasak + "menit.";
    }
    
    
}
