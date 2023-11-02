import java.util.Scanner;

public class BioskopWithScanner14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int baris, kolom;
    // modif
    int choice;
    String nama, next;

    String[][] penonton = new String[4][2];

    while (true) {
      System.out.println("=============================");
      System.out.println("PILIH MENU");
      System.out.println("1. Input data penonton");
      System.out.println("2. Tampilkan daftar penonton");
      System.out.println("3. Exit");
      System.out.println("=============================");

      System.out.print("Pilih menu : ");
      choice = sc.nextInt();

      switch (choice) {
        case 1:
          while (true) {
            sc.nextLine();
            System.out.print("Masukkan nama: ");
            nama = sc.nextLine();
            System.out.print("Masukkan baris: ");
            baris = sc.nextInt();

            // Validasi apakah baris kursi tersedia atau tidak
            if (baris < 1 || baris > 4) {
              System.out.println("Kursi pada baris ini tidak tersedia, mohon inputkan dengan benar");
              continue; // kembali ke input baris
            }

            System.out.print("Masukkan kolom: ");
            kolom = sc.nextInt();
            sc.nextLine();

            // Validasi apakah kolom kursi tersedia atau tidak
            if (kolom < 1 || kolom > 4) {
              System.out.println("Kursi pada kolom ini tidak tersedia, mohon inputkan dengan benar");
              continue; // kembali ke input kolom
            }

            // input baris dan kolom dikurang 1 agar bisa masuk ke indeks pada array
            // yang kemudian ditampung di array penonton sebagai nama
            penonton[baris - 1][kolom - 1] = nama;

            System.out.println("Input penonton lainnya? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
              break;
            }
            // Cek apakah kursi sudah terisi atau belum
            if (penonton[baris - 1][kolom - 1] != null) {
              System.out.println("Kursi tersebut telah terisi oleh penonton lainnya");
              System.out.println("masukkan input an baris dan kolom kembali");
              continue;// Kembali ke input
            }

          }
          break;
        case 2:
          System.out.println("Daftar Nama Penonton");
          System.out.println("====================");
          for (int i = 0; i < penonton.length; i++) {
            for (int j = 0; j < penonton[i].length; j++) {
              if (penonton[i][j] == null) {
                penonton[i][j] = "***";
              }
              System.out.println("Nama penonton pada baris ke-" + i + " kolom ke-" + (j + 1) + ": " + penonton[i][j]);
            }
          }

          break;
        case 3:
          System.exit(0);
          break;
        default:
          break;
      }
    }

  }
}
