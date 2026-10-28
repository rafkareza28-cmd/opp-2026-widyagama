public class Main {
    public static void main(String[] args) {
        Makanan makanan = new Makanan(
            "Nasi Goreng", 15000, "1 porsi"
        );

        Minuman minuman = new Minuman(
            "Es Teh", 5000, "Large"
        );

        makanan.tampilMenu();
        System.out.println();

        minuman.tampilMenu();
        System.out.println();

        double total = makanan.getHarga() + minuman.getHarga();

        System.out.println("Total harga: Rp" + total);
    }
}


class Menu {
    private String nama;
    private double harga;

    public Menu(String nama, double harga) {
        this.nama = nama;
        setHarga(harga);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        if (harga > 0) {
            this.harga = harga;
        } else {
            throw new IllegalArgumentException(
                "Harga harus lebih dari 0!"
            );
        }
    }

    public void tampilMenu() {
        System.out.println("Nama: " + nama);
        System.out.println("Harga: Rp" + harga);
    }
}

class Makanan extends Menu {
    private String porsi;

    public Makanan(String nama, double harga, String porsi) {
        super(nama, harga);
        this.porsi = porsi;
    }

    @Override
    public void tampilMenu() {
        System.out.println("=== MENU MAKANAN ===");
        System.out.println("Nama: " + getNama());
        System.out.println("Harga: Rp" + getHarga());
        System.out.println("Porsi: " + porsi);
    }
}

class Minuman extends Menu {
    private String ukuran;

    public Minuman(String nama, double harga, String ukuran) {
        super(nama, harga);
        this.ukuran = ukuran;
    }

    @Override
    public void tampilMenu() {
        System.out.println("=== MENU MINUMAN ===");
        System.out.println("Nama: " + getNama());
        System.out.println("Harga: Rp" + getHarga());
        System.out.println("Ukuran: " + ukuran);
    }
}

