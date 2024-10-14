import java.util.Scanner;

public class SiakadWhile27 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0, nilai, jml;

    System.out.print("Masukkan Jumlah Mahasiswa: ");
    jml = sc.nextInt()

    while (i < jml) {
        System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
        nilai = sc.nextInt()

        if(nilai < 0 || nilai > 100) {
            System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
            continue;
        }
 
        if (nilai > 80 && nilai <= 100) {
            
        }
        i++;
    }
    }
}
