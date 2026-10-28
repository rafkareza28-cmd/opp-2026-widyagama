public class Main {
    public static void main(String[] args) {
        Produk p1 = new Produk("Sapi Perah", 200000);
        p1.tampilkan();
    }
}

class Produk {
    String namaProduk;
    int harga;

    Produk(String namaProduk, int harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    void tampilkan() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: Rp" + harga);
    }
}

