import java.util.Scanner;

public class UcapanTerimakasih_14 {
  public static String PenerimaUcapan() {
    Scanner Input14 = new Scanner(System.in);
    System.out.println("Tuliskan NAMA orang yang ingin Anda berikan ucapan: ");
    String namaOrang = Input14.nextLine();
    Input14.close();
    return namaOrang;
  }

  public static void UcapanTerimakasih() {
    String nama = PenerimaUcapan();
    System.out.println("Thank you " + nama + " for being the best teacher in the world. \n"
        + "You  inspired in me a love for learning and made me feel like I could ask you anything.");
  }

  public static void UcapanTambahan(String ucapan) {
    System.out.println("Ucapan Tambahan : " + ucapan);
  }

  public static void main(String[] args) {
    UcapanTerimakasih();
    UcapanTambahan("You've made a great impact on my life ! Thank you sir");

  }
}
