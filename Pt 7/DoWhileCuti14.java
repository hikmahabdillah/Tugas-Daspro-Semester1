import java.util.Scanner;

public class DoWhileCuti14 {
    public static void main(String[] args) {
        Scanner scan14 = new Scanner(System.in);
        
        int jatahCuti, jumlahHari; 
        String konfirmasi;

        System.out.print("Jatah cuti: "); 
        jatahCuti = scan14.nextInt();
        
        do {
            System.out.print ("Apakah Anda ingin mengambil cuti (y/t)? "); 
            konfirmasi = scan14.next();

            if (konfirmasi.equalsIgnoreCase("y")) { 
                System.out.print("Jumlah hari: "); 
                jumlahHari = scan14.nextInt();

                    if (jumlahHari <= jatahCuti) { 
                        jatahCuti -= jumlahHari; 
                        System.out.println("Sisa jatah cuti: " + jatahCuti);
                    } else {
                        System.out.println("Sisa jatah cuti Anda tidak mencukupi"); 
                        System.out.println("apakah anda ingin mengisi lagi (y/t)?");
                        konfirmasi = scan14.next();

                        System.out.print("Jumlah hari: "); 
                        jumlahHari = scan14.nextInt();
                        jatahCuti -= jumlahHari; 
                        System.out.println("Sisa jatah cuti: " + jatahCuti);

                        break;
                    }
                } else if (konfirmasi.equalsIgnoreCase("t")){
                  break;
                }else{
                  System.out.println("inputkan dengan format yang benar");
                }
            }while(jatahCuti > 0);
          }
}
