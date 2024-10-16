import java.util.Scanner;

public class bioskop17 {

    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);

        double harga = 50000, hargaTotal = 0;
        int tiket = 0, totalTiketTerjual = 0;

        for (int i = 1; ; i++) {
            System.out.print("Masukkan tiket yang ingin dibeli (ketik 0 untuk selesai): ");
            tiket = input17.nextInt();

            if (tiket < 0) {
                System.out.println("Masukan salah");
                continue;
            }

            if (tiket == 0) {
                break;
            }

            if (tiket > 10) {
                hargaTotal = (tiket * harga) * 0.85;  
                System.out.println("Harga tiket " + harga);
                System.out.println("Mendapat diskon 10%");
            } else if (tiket > 4) {
                hargaTotal = (tiket * harga) * 0.90;  
                System.out.println("Harga tiket " + harga);
                System.out.println("Mendapat diskon 15%");
            } else {
                hargaTotal = tiket * harga;  
                System.out.println("Harga tiket " + harga);
            }

            totalTiketTerjual += tiket;
            System.out.println("Harga tiket yang harus dibayar: Rp " + hargaTotal);
        }

        System.out.println("\nTotal tiket terjual hari ini: " + totalTiketTerjual);
        input17.close();
    }
}
