 import java.util.Scanner;

public class perkenalan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan kelas: ");
        String kelas = input.nextLine();

        System.out.println("\n=== PERKENALAN SISWA ===");
        System.out.println("Nama  : " + nama);
        System.out.println("Kelas : " + kelas);

        input.close();
    }
}