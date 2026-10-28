public class Main {
    public static void main(String[] args) {
        Rekening r = new Rekening();

        r.setSaldo(7000);

        System.out.println("Saldo: " + r.getSaldo());
    }
}

class Rekening {
    private int saldo;

    
    public int getSaldo() {
        return saldo;
    }

    
    public void setSaldo(int jumlah) {
        saldo = jumlah;
    }
}

