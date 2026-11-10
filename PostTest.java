import java.util.Scanner;

public class PostTest {
    public static void main(String args[]) {
        try (Scanner input = new Scanner(System.in)) {
            String mahasiswa[][];
            int jumlah;
            double totalNilaiAkhir = 0;

            System.out.println("DATA NILAI MAHASISWA\nSISTEM INFORMASI\nFKOM - UNIKU");
            System.out.print("Jumlah Orang : ");
            jumlah = Integer.parseInt(input.nextLine());

            mahasiswa = new String[jumlah][6];

            for (int i = 0; i < jumlah; i++) {
                System.out.println("Data Mahasiswa ke -" + (i + 1));
                System.out.print("NIM : ");
                mahasiswa[i][0] = input.nextLine();
                System.out.print("NAMA : ");
                mahasiswa[i][1] = input.nextLine();
                System.out.print("NILAI TUGAS : ");
                mahasiswa[i][2] = input.nextLine();
                System.out.print("NILAI UTS : ");
                mahasiswa[i][3] = input.nextLine();
                System.out.print("NILAI UAS : ");
                mahasiswa[i][4] = input.nextLine();

                double tugas = Double.parseDouble(mahasiswa[i][2]);
                double uts = Double.parseDouble(mahasiswa[i][3]);
                double uas = Double.parseDouble(mahasiswa[i][4]);

                double nilaiAkhir = ((6 * tugas) + (2 * uts) + (2 * uas)) / 10;
                mahasiswa[i][5] = String.valueOf(nilaiAkhir);

                totalNilaiAkhir += nilaiAkhir;
            }

            System.out.print("\nNo.\tNIM\tNAMA\tTUGAS\tUTS\tUAS\tNILAI AKHIR\n");
            for (int i = 0; i < jumlah; i++) {
                System.out.println((i + 1) + "\t" + mahasiswa[i][0] + "\t" + mahasiswa[i][1] + "\t" + mahasiswa[i][2] + "\t" + mahasiswa[i][3] + "\t" + mahasiswa[i][4] + "\t" + mahasiswa[i][5]);
            }

            double rataRata = totalNilaiAkhir / jumlah;
            System.out.println("Rata-rata Nilai Akhir : " + rataRata);
        }
    }
}