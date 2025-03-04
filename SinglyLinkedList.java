public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList(){
        this.head =null;
    }

    public void addResepDiawal(Resep resep){
        Node newNode = new Node(resep);
        newNode.next = head;
        head = newNode;
    }

    public void addResepDiakhir (Resep resep){
        Node newNode = new Node (resep);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void cetakResep(){
        if (head == null) {
            System.out.println("Daftar resep kosong.");
            return;
        }
        Node temp = head;
        while (temp!= null) {
            System.out.println(temp.data);
            System.out.println("~~~~~~~~~~~");
            temp = temp.next;
            
        }
    }

    public void hapusResepDiAwal() {
        if (head == null) {
            System.out.println("Daftar resep kosong, tidak ada yang bisa dihapus.");
            return;
        }
        head = head.next;
        System.out.println("Resep di awal berhasil dihapus.");
    }

    public void hapusResepDiAkhir() {
        if (head == null) {
            System.out.println("Daftar resep kosong, tidak ada yang bisa dihapus.");
            return;
        }
        if (head.next == null) {
            head = null;
            System.out.println("Resep terakhir berhasil dihapus.");
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        System.out.println("Resep di akhir berhasil dihapus.");
    }

    public void cariResep(String nama) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.getNamaResep().equalsIgnoreCase(nama)) {
                System.out.println("Resep ditemukan:");
                System.out.println(temp.data);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Resep dengan nama \"" + nama + "\" tidak ditemukan.");
    }

}
