/**
 * Bioskop14
 */
public class Bioskop14 {

  public static void main(String[] args) {
    String[][] penonton = new String[4][2];

    penonton[0][0] = "Amin";
    penonton[0][1] = "Bena";
    penonton[1][0] = "Candra";
    penonton[1][1] = "Dela";
    penonton[2][0] = "Eka";
    penonton[2][1] = "Farhan";
    penonton[3][0] = "Gisel";
    penonton[3][1] = "Hana";

    System.out.printf("%s \t %s \n", penonton[0][0], penonton[0][1]);
    System.out.printf("%s \t %s \n", penonton[1][0], penonton[1][1]);
    System.out.printf("%s \t %s \n", penonton[2][0], penonton[2][1]);
    System.out.printf("%s \t %s \n", penonton[3][0], penonton[3][1]);

    /*
     * 
     * System.out.println(penonton.length);
     * System.out.println(penonton[0].length);
     * System.out.println(penonton[1].length);
     * System.out.println(penonton[2].length);
     * System.out.println(penonton[3].length);
     * 
     */

    // modif no 5
    // System.out.println(penonton.length);

    // for (int i = 0; i < penonton.length; i++) {
    // System.out.println("Panjang baris ke" + (i + 1) + ": " + penonton[i].length);
    // }

    // modif no 6

    // System.out.println(penonton.length);
    // for (String[] barisPenonton : penonton) {
    // System.out.println("Panjang baris: " + barisPenonton.length);
    // }

    // modif no 10
    // x adalah variable untuk menyimpan indeks kolom
    // for (int x = 0; x < 2; x++) {
    // System.out.println("Nama penonton pada baris ke-3 kolom ke-" + x + ": " +
    // penonton[2][x]);
    // }

    // modif no 11 n 12
    for (String nama : penonton[2]) {
      System.out.println("Nama penonton pada baris ke-3: " + nama);
    }
  }
}