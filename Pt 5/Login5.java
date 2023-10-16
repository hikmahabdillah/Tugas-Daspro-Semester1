import java.util.Scanner;
public class Login5 {
  public static void main(String[] args) {
    String username="hikmahald";
    String password="hikmah44";
    String inUser, inPassword;

    Scanner inLog = new Scanner (System.in);

    System.out.println("Login User");
    System.out.print("Masukkan username : ");
    inUser = inLog.next();
    System.out.print("Masukkan password : ");
    inPassword = inLog.next();

    if (username.equals(inUser) && password.equals(inPassword)) {
      System.out.println("Masuk ke system");
    }else{
      System.out.println("user dan password salah");
    }
  }
}
