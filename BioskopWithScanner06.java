import java.util.Scanner;

public class BioskopWithScanner06 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, pilihan;
        String nama, next;
        String [][] penonton = new String[4][2];
        boolean menu = true;

        while (menu) {
            System.out.println("Ini Menu");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1,2,3): ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                while (true) {
                    System.out.print("Masukkan nama: ");
                    sc.nextLine();
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();
                    if (baris >=1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length) {                        
                        if (penonton[baris-1][kolom-1] == null){
                            penonton[baris-1][kolom-1] = nama;
                            
                            System.out.print("Input Penonton Lainnya? (y/n): ");
                            next = sc.nextLine();
                            
                            if (next.equalsIgnoreCase("n")) {
                                break;
                            }
                        }
                        else
                        System.out.println("Kursi telah terisi, silahkan input lagi");
                    }
                    else
                        System.out.println("Kursi tidak ada");
                }
                break;

                case 2:
                    System.out.println("Daftar Penonton");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] != null) {                                
                                System.out.println("Penonton pada baris ke-" + (i+1) + ": " + "Kolom ke-" + (j+1) + ": " + ", " + penonton[i][j]);
                            }
                            else 
                                System.out.println("Penonton pada baris ke-" + (i+1) + ": " + "Kolom ke-" + (j+1) + ": " + ", " + "***");
                                                               
                    }
                }
                break;    
                
                case 3:
                    System.out.println("Bye-bye");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Input salah, Silahkan input lagi (1,2,3)");
                    break;
            }
        }
    }
}
