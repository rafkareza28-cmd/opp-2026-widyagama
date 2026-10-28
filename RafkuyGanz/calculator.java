public class Main {
    public static void main(String[] args) {
        java.util.Scanner inputAngka = new java.util.Scanner(System.in);

        System.out.println("============= Program penjumlahan =============");
        System.out.println("masukan angka pertama = ");
        var angka1 = inputAngka.nextInt();

        System.out.println("masukan angka kedua = ");
        var angka2 = inputAngka.nextInt();

        var hasil = angka1 + angka2;
        System.out.println("============= hasil =============");
        System.out.println("hasil " + hasil);
    }
}