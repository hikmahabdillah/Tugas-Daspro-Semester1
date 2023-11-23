import java.util.Scanner;

public class NilaiMahasiswa_14 {
  static String[] namaMhs;
  static int[][] nilaiTugas = new int[5][7]; // array 2 dimensinya

  public static void inputNilai() {
    Scanner input14 = new Scanner(System.in);

    System.out.print("Masukkan jumlah mahasiswa: ");
    int jumlahMhs = input14.nextInt();
    namaMhs = new String[jumlahMhs];

    for (int i = 0; i < namaMhs.length; i++) {
      System.out.println("Masukkan Nama mahasiswa :");
      namaMhs[i] = input14.next();
      System.out.println("Masukkan Nilai Tugas Mahasiswa " + namaMhs[i] + ": ");
      for (int j = 0; j < nilaiTugas[i].length; j++) {
        nilaiTugas[i][j] = input14.nextInt();
      }
    }
    System.out.println();
  }

  // Fungsi untuk menampilkan seluruh nilai mahasiswa mulai dari minggu pertama
  // hingga minggu ketujuh
  public static void tampilkanNilaiMahasiswa() {
    System.out.println("\nSeluruh Nilai Mahasiswa :");
    System.out.printf("| %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s |\n", "NAMA", "MINGGU 1",
        "MINGGU 2", "MINGGU 3", "MINGGU 4", "MINGGU 5", "MINGGU 6", "MINGGU 7");

    for (int i = 0; i < namaMhs.length; i++) {
      System.out.printf("| %-10s", namaMhs[i]);

      for (int j = 0; j < nilaiTugas[i].length; j++) {
        System.out.printf(" | %-10s", nilaiTugas[i][j]);
      }

      System.out.println(" |");
    }

    System.out.println();
  }

  // Fungsi untuk mencari pada hari keberapakah terdapat nilai tertinggi dari
  public static int mingguNilaiTertinggi() {
    int mingguTertinggi = 0;
    int nilaiTertinggi = 0;

    for (int j = 0; j < nilaiTugas[0].length; j++) {
      int totalNilaiPerminggu = 0;
      for (int i = 0; i < namaMhs.length; i++) {
        totalNilaiPerminggu += nilaiTugas[i][j];
      }
      if (totalNilaiPerminggu > nilaiTertinggi) {
        nilaiTertinggi = totalNilaiPerminggu;
        mingguTertinggi = j + 1;
      }
    }
    return mingguTertinggi;
  }

  // Fungsi untuk menampilkan mahasiswa yang memiliki nilai tertinggi
  public static void mhsNilaiTertinggi(int minggu) {
    int nilaiTertinggi = 0;
    String mhsNilaiTertinggi = "";

    for (int i = 0; i < namaMhs.length; i++) {
      if (nilaiTugas[i][minggu - 1] > nilaiTertinggi) {
        nilaiTertinggi = nilaiTugas[i][minggu - 1];
        mhsNilaiTertinggi = namaMhs[i];
      }
    }
    System.out.println("Mahasiswa dengan nilai tertinggi adalah " + mhsNilaiTertinggi + " dengan nilai "
        + nilaiTertinggi + ", pada minggu ke-" + minggu + ".");
  }

  public static void main(String[] args) {
    inputNilai();
    tampilkanNilaiMahasiswa();
    int mingguTertinggi = mingguNilaiTertinggi();
    System.out.println("Pada minggu ke-" + mingguTertinggi
        + " terdapat nilai mahasiswa yang lebih tinggi dibandingkan nilai mahasiswa di minggu lain.");
    mhsNilaiTertinggi(mingguTertinggi);
  }
}
