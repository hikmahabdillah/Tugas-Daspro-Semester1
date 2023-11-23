import java.util.Scanner;

public class Ucapan_14 {
  public static String PenerimaUcapan() {
    Scanner Input14 = new Scanner(System.in);
    System.out.println("Tuliskan NAMA orang yang ingin Anda berikan ucapan: ");
    String namaOrang = Input14.nextLine();
    Input14.close();
    return namaOrang;
  }

  public static void main(String[] args) {
    String nama = PenerimaUcapan();
    System.out.println("Thank you " + nama + "\n May the force be with you.");
  }
}
