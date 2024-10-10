import java.util.Scanner;
public class TugasBioskop27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tiket = 0;
        int hargaTiket = 50000;
        double diskon = 0, pendapatan, total;

        for (int i = 0; i <= 1;) {
            System.out.print("Jumlah tiket terjual: ");
            tiket = sc.nextInt();

            if (tiket < 0) {
                System.out.println("Jumlah tiket tidak valid, masukan jumlah tiket dengan benar!");
                continue;
            }

            if (tiket > 10) {
              diskon = 0.15;
            } else if (tiket > 4) {
                diskon = 0.10;
            } else {
                diskon = 0;
            }
            pendapatan = tiket*hargaTiket;
            total = pendapatan*diskon;
            System.out.println("Jumlah tiket yang terjual : " + tiket);
            System.out.println("Total harga sebelum diskon: Rp." + pendapatan);
            System.out.println("Diskon: " + diskon);
            System.out.println("Total harga setelah diskon: Rp." + total);
     }


    }
}
