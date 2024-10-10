import java.util.Scanner;
public class TugasParkir27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total = 0;

        do {
            System.out.print("Masukan jenis kendaraan(1:mobil, 2:motor, 0:keluar): ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukan durasi parkir(jam): ");
                durasi =sc.nextInt();

                if (durasi > 5) {
                    total += 12500;
                    System.out.println("Total pembayaran: " + total);
                } else {
                    if (jenis == 1) {
                        total = durasi*3000;
                    } else if (jenis == 2) {
                        total = durasi*2000;
                    }
                    System.out.println("Total pembayaran: " + total);
                } 
                } else if (jenis != 0) {
                    System.out.println("Jenis kendaraan tidak valid, masukan jenis kendaraan dengan benar!");
                }
        } while (jenis != 0);
                System.out.println("Total pembayaran: " + total);
        
        
    }
}
