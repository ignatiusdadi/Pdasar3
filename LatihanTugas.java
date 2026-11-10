import java.util.Scanner;

public class LatihanTugas {
    public static void main(String args[]) {
        try (Scanner input = new Scanner(System.in)) {
            String karyawan[][];
            int jumlah;

            System.out.println("DATA GAJI KARYAWAN");
            System.out.print("Jumlah Karyawan : ");
            jumlah = Integer.parseInt(input.nextLine());

            // 4 kolom: 0=NAMA, 1=JABATAN, 2=GAPOK, 3=TUNJANGAN
            karyawan = new String[jumlah][4];

            for (int i = 0; i < jumlah; i++) {
                System.out.println("Data Karyawan ke -" + (i + 1));
                System.out.print("NAMA : ");
                karyawan[i][0] = input.nextLine();
                System.out.print("JABATAN : ");
                karyawan[i][1] = input.nextLine();
                System.out.print("GAPOK : ");
                karyawan[i][2] = input.nextLine();
                System.out.print("TUNJANGAN : ");
                karyawan[i][3] = input.nextLine();
            }

            System.out.print("\nNO\tNAMA\tJABATAN\tGAPOK\tTUNJANGAN\n");
            for (int i = 0; i < jumlah; i++) {
                System.out.println((i + 1) + "\t" + karyawan[i][0] + "\t" + karyawan[i][1] + "\t" + karyawan[i][2] + "\t" + karyawan[i][3]);
            }
        }
    }
}