import java.util.Scanner;

/**
 * WhileKelipatan14
 */
public class WhileKelipatan14 {

  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);

    int kelipatan, jumlah= 0, counter= 0;
    float average=0;

    System.out.print("Masukkan bilangan kelipatan 1-9: ");
    kelipatan = scan.nextInt();

    // for (int i = 1; i <= 50; i++) {
    //   if(i % kelipatan == 0){
    //     jumlah += i;
    //     counter++;
    //   }
    // }
    int i = 1;

    while (i <= 50) {
      if(i % kelipatan == 0){
        jumlah += i;
        counter++;
      }
      i++;
    }


    // operasi untuk menghitung rata rata
    average = (kelipatan * jumlah) / counter;

    System.out.println("Rata-rata dari seluruh bilangan kelipatan adalah " + average);

    System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
    System.out.printf("Total bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
  }
}