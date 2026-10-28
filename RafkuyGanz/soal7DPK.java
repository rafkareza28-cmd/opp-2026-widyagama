public class Main {
    public static void main(String[] args) {
        Rekening r = new Rekening();

        r.setSaldo(100000);  
        r.setSaldo(-15000);  

        System.out.println("Saldo akhir: " + r.getSaldo());
    }
}

class Rekening {
    private int saldo;

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int jumlah) {
        if (jumlah < 0) {
            System.out.println("Error: Saldo tidak boleh negatif!");
        } else {
            saldo = jumlah;
            System.out.println("Sukses");
        }
    }
}

