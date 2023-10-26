import java.util.Scanner;

public class LinearSearch14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int key = 0;
    int hasil = 0;
    int n_elemen = 0;

    System.out.print("Masukkan jumlah elemen array : ");
    n_elemen = sc.nextInt();

    int[] arrayInt = new int[n_elemen];

    for (int i = 0; i < arrayInt.length; i++) {
      System.out.print("Masukkan elemen array ke -" + i + " : ");
      arrayInt[i] = sc.nextInt();
    }

    System.out.print("Msukkan key yang ingin dicari : ");
    key = sc.nextInt();

    for (int i = 0; i < arrayInt.length; i++) {
      if (arrayInt[i] == key) {
        hasil = i;
        break;
      }
    }
    System.out.println("Key ada dalam array pada posisi indeks ke-" + hasil);
  }

}
