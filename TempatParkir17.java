import java.util.Scanner;

public class TempatParkir17 {

    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);

        int jenis, durasi;
        int total = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar): ");
            jenis = input17.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (dalam jam): ");
                durasi = input17.nextInt();

                if (jenis == 1) { 
                    if (durasi > 5) {
                        total = 12500; 
                    } else {
                        total = durasi * 3000;
                    }
                    System.out.println("Tarif parkir mobil: Rp " + total);
                } else if (jenis == 2) { 
                    if (durasi > 5) {
                        total = 12500; 
                    } else {
                        total = durasi * 2000; 
                    }
                    System.out.println("Tarif parkir motor: Rp " + total);
                }

            } else if (jenis == 0) {
                System.out.println("Keluar dari sistem parkir.");
                break;
            } else {
                System.out.println("Jenis kendaraan tidak valid. Silakan masukkan lagi.");
            }

        } while (true);

        input17.close();
    }
}
