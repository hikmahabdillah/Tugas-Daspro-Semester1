import java.util.Scanner;

public class SistemAkademik {

    // deklarasi variable global
    // private static int levelAcc;
    private static Scanner inputScanner = new Scanner(System.in);
    public static void main(String[] args) {
        String username, password;
        int levelAcc;

        System.out.println("Login User");
        System.out.print("Masukkan username : ");
        username = inputScanner.next();
        System.out.print("Masukkan password : ");
        password = inputScanner.next();

        if ("admin".equals(username) && "admin".equals(password)) {
            levelAcc = 1;
            System.out.println("Selamat datang " + username);
            System.out.println("level" + levelAcc);
            System.out.println("\n");

            // BERANDA ADMIN
            while (true) {
              System.out.println("Sistem Akademik");
              System.out.println("1. Input Data Mahasiswa");
              System.out.println("2. Update Data Mahasiswa");
              System.out.println("3. Cek Data Mahasiswa");
              System.out.println("4. Input Nilai Mahasiswa");
              System.out.println("5. Update Nilai Mahasiswa");
              System.out.println("6. Cek Jadwal Perkuliahan");
              System.out.println("7. Update KRS Mahasiswa");
              System.out.println("8. Cek Data KRS Mahasiswa");
              System.out.println("9. Contact");
              System.out.println("0. LogOut\n");
  
              System.out.print("Masukkan pilihan anda: ");
              int choice = inputScanner.nextInt();
              switch (choice) {
                  case 1:
                      // inDataMhs();
                      break;
                  case 2:
                      // updDataMhs();
                      break;
                  case 3:
                      // cekDataMhs();
                      break;
                  case 4:
                      // inNilaiMhs();
                      break;
                  case 5:
                      // updNilaiMhs();
                      break;
                  case 6:
                      // cekJadwalKuliah();
                      break;
                  case 7:
                      // updKrsMhs();
                      break;
                  case 8:
                      // cekDataKrsMhs();
                      break;
                  case 9:
                      // contact();
                      break;
                  case 0:
                      return;
                  default:
                      System.out.println("Pilihan tidak valid.");
              }
          }
        }else if("dosen".equals(username) && "dosen".equals(password)){
            levelAcc = 2;
            System.out.println("Selamat datang " + username);
            System.out.println("level" + levelAcc);

            // BERANDA DOSEN
            while (true) {
              System.out.println("Sistem Akademik");
              System.out.println("1. Cek Data Mahasiswa");
              System.out.println("2. Input Nilai Mahasiswa");
              System.out.println("3. Update Nilai Mahasiswa");
              System.out.println("4. Contact");
              System.out.println("0. LogOut\n");
      
               System.out.print("Masukkan pilihan anda: ");
                  int choice = inputScanner.nextInt();
                  switch (choice) {
                      case 1:
                          // cekDataMhs();
                          break;
                      case 2:
                          // inNilaiMhs();
                          break;
                      case 3:
                          // updNilaiMhs();
                          break;
                      case 4:
                          // contact();
                          break;
                      case 0:
                          return;
                      default:
                          System.out.println("Pilihan tidak valid.");
                  }
              }
        }else if("mahasiswa".equals(username) && "mahasiswa".equals(password)){
            levelAcc = 3;
            System.out.println("Selamat datang " + username);
            System.out.println("level" + levelAcc);

            // BERANDA MAHASISWA
            while (true) {
              System.out.println("Sistem Akademik");
              System.out.println("1. Cek Data Mahasiswa");
              System.out.println("2. Cek Jadwal Kuliah");
              System.out.println("3. Cek Data KRS Mahasiswa");
              System.out.println("4. Contact");
              System.out.println("0. LogOut\n");
      
               System.out.print("Masukkan pilihan anda: ");
                  int choice = inputScanner.nextInt();
                  switch (choice) {
                      case 1:
                          // cekDataMhs();
                          break;
                      case 2:
                          // cekJadwalKuliah();
                          break;
                      case 3:
                          // cekDataKrsMhs();
                          break;
                      case 4:
                          // contact();
                          break;
                      case 0:
                          return;
                      default:
                          System.out.println("Pilihan tidak valid.");
                  }
              }
        }else{
            System.out.println("username/password salah");
        }
    }
}
    // private static List<String> menuStack = new ArrayList<>();

     
