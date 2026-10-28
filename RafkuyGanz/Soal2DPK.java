

public class Main {
    public static void main(String[] args) {

        Siswa siswa1 = new Siswa();

        siswa1.nama = "Budi";
        siswa1.kelas = "X DPK 1";

        System.out.println("Nama: " + siswa1.nama);
        System.out.println("Kelas: " + siswa1.kelas);

        siswa1.perkenalan();
    }
}

class Siswa {
    String nama;
    String kelas;

    void perkenalan() {
        System.out.println("Halo, perkenalkan nama saya " + nama + ".");
        System.out.println("Saya duduk di kelas " + kelas + ".");
    }
}