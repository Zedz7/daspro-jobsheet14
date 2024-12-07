import java.util.Scanner;

public class Tugas06 {
    static int hitungRekursif (int[] angka, int N) {
        if (N == 0) {
            return 0;
        } else {
            return angka[N - 1] + hitungRekursif(angka, N-1);
        }
    }
    static int hitungIteratif (int[] angka, int N) {
        int total = 0;
        for(int i = 0; i < N; i++) {
            total += angka[i];
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int jmlAngka = sc.nextInt();

        int[] angka = new int[jmlAngka];

        for (int i = jmlAngka; i > 0; i--) {
            System.out.println("Masukkan angka ke-" + i + ": ");
            angka[i - 1] = sc.nextInt();
        }

        int pilihMetode;

        System.out.println("\nPilihan Metode Hitung");
        System.out.println("1. Metode Rekursif");
        System.out.println("2. Metode Iteratif");
        System.out.print("Pilih metode: ");
        pilihMetode = sc.nextInt();

        switch (pilihMetode) {
            case 1: 
                int totalRekursif = hitungRekursif(angka, jmlAngka);
                System.out.println("Total dari " + jmlAngka + " angka yang dimasukkan (Rekursif): " + totalRekursif);
                break;
            case 2:
                int totalIteratif = hitungIteratif(angka, jmlAngka);
                System.out.println("Total dari " + jmlAngka + " angka yang dimasukkan (Iteratif): " + totalIteratif);
                break;
            default: 
                System.out.println("Pilihan tidak valid");
        }
    }
}