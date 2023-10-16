import java.util.Scanner;

public class GameFPS {
  public static void main(String[] args) {
    Scanner inputScanner = new Scanner (System.in);

    int jarak;

    System.out.println("Masukkan Jarak : ");
    jarak = inputScanner.nextInt();

    if (jarak <= 5) {
      System.out.println("Melee Weapon");
    }else{
      System.out.println("Range Weapon");
    }
  }
}
