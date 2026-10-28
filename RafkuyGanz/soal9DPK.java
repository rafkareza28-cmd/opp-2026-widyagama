public class Main {

    int tambah(int a, int b) {
        return a + b;
    }

    int tambah(int a, int b, int c) {
        return a + b + c;
    }

    double tambah(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Main k = new Main();

        System.out.println(k.tambah(5, 15));
        System.out.println(k.tambah(5, 20, 15));
        System.out.println(k.tambah(2.5, 4.5));
    }
}