public class Main {
    public static void main(String[] args) {
        Kucing k = new Kucing();

        k.nama = "Kitty";
        System.out.println("Nama: " + k.nama);
        k.suara();
    }
}

class Hewan {
    String nama;

    public void suara() {
        System.out.println("...");
    }
}

class Kucing extends Hewan {
    @Override
    public void suara() {
        System.out.println("Meong!");
    }
}

