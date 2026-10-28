
public class Main {
    public static void main(String[] args) {
        Barang b1 = new Barang("Keyboard", 150000, 10);
        Barang b2 = new Barang("Mouse", 75000, 3);

        System.out.println("=== Data Awal ===");
        b1.info();
        System.out.println();
        b2.info();

        System.out.println("\n=== Transaksi ===");
        b1.beli(4);
        b1.beli(7);
        b2.beli(2);
        b2.beli(2);

        System.out.println("\n=== Data Akhir ===");
        b1.info();
        System.out.println();
        b2.info();
    }
}

class Barang {
    String nama;
    int harga;
    int stok;

    Barang(String nama, int harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    void beli(int jumlah) {
        if (jumlah > stok) {
            System.out.println("Stok tidak cukup! (" + nama + " tersisa " + stok + ")");
        } else {
            stok -= jumlah;
            int total = harga * jumlah;
            System.out.println("Berhasil membeli " + jumlah + " " + nama + ". Total: Rp " + total);
        }
    }

    void info() {
        System.out.println("Nama : " + nama);
        System.out.println("Harga: Rp " + harga);
        System.out.println("Stok : " + stok);
    }
}
