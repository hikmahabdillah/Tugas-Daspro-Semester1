/**
 * Terimakasih_14
 */
public class Terimakasih_14 {
  // Dengan fungsi
  public static void UcapanTerimakasih() {
    System.out.println("Thank you for being the best teacher in the world. \n"
        + "You inspired in me a love for learning and made me feel like I could ask you anything.");
  }

  public static void UcapanTambahan(String ucapan) {
    System.out.println(ucapan);
  }

  public static void main(String[] args) {
    // pemanggilan fungsi
    UcapanTerimakasih();
    String ucapan = "Terima Kasih Pak.. Bu.. Semoga Sehat Selalu";
    UcapanTambahan(ucapan);

    // // tidak menggunakan fungsi
    // System.out.println("Thank you for being the best teacher in the world. \n"
    // + "You inspired in me a love for learning and made me feel like I could ask
    // you anything.");
  }

}