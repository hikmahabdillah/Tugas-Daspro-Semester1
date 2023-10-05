import java.util.Scanner;

/**
 * PemilihanPercobaan1No14
 */
public class PemilihanPercobaan1No14 {
public static void main(String[] args) {
    Scanner input14 = new Scanner(System.in);

    System.out.println("Masukkan angka :  ");
    int angka = input14.nextInt();
     
     /* 
    if (angka % 2 == 0)
      System.out.println("Angka "+ angka + " bilangan genap");
    else 
      System.out.println("Angka "+ angka + " bilangan ganjil");
    */
    
    // ternary operator
    // variable = (condition) ? expressionTrue :  expressionFalse;
    // karena sebenarnya ternary operator adalah short hand dari pemilihan, hanya saja beda penulisan syntax saja. tetapi 
    String hasil = (angka % 2 == 0) ? ("Angka "+ angka + " bilangan genap") : ("Angka "+ angka + " bilangan ganjil");
    System.out.println(hasil);
  } 
}