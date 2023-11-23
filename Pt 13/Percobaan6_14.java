import java.util.Scanner;

public class Percobaan6_14 {
  // JIKA TIDAK MENGGUNAKAN FUNCTION
  // public static void main(String[] args) {
  // Scanner input = new Scanner(System.in);

  // int p, l, t, L, vol;

  // System.out.println("Masukkan panjang");
  // p = input.nextInt();
  // System.out.println("Masukkan lebar");
  // l = input.nextInt();
  // System.out.println("Masukkan tinggi");
  // t = input.nextInt();

  // L = p*l;
  // System.out.println("Luas Persegi panjang adalah "+L);

  // vol=p*l*t;
  // System.out.println("Volume balok adalah "+vol);
  // }

  // fungsi hitungLuas
  static int hitungLuas(int pjg, int lb) {
    int Luas = pjg * lb;
    return Luas;
  }

  // Fungsi hitungVolume
  static int hitungVolume(int tinggi, int a, int b) {
    int Volume = hitungLuas(a, b) * tinggi;
    return Volume;
  }

  // Fungsi main
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int p, l, t, L, vol;

    System.out.println("Masukkan panjang");
    p = input.nextInt();
    System.out.println("Masukkan lebar");
    l = input.nextInt();
    System.out.println("Masukkan tinggi");
    t = input.nextInt();

    L = hitungLuas(p, l);
    System.out.println("Luas Persegi panjang adalah " + L);

    vol = hitungVolume(t, p, l);
    System.out.println("Volume balok adalah " + vol);
  }

}
