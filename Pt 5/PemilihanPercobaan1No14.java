import java.util.Scanner;

/**
 * PemilihanPercobaan1No14
 */
public class PemilihanPercobaan1No14 {
public static void main(String[] args) {
    Scanner input14 = new Scanner(System.in);

    System.out.println("Masukkan angka :  ");
    int angka = input14.nextInt();
     
    if (angka % 2 == 0)
      System.out.println("Angka "+ angka + " bilangan genap");
    else 
      System.out.println("Angka "+ angka + " bilangan ganjil");
    
  } 
}