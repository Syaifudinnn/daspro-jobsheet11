import java.util.Scanner;

public class Tugas2 {
    
    //deklarasi inputan
    static Scanner input = new Scanner(System.in);

    //fungsi input data penjualan
    public static void inputDataPenjualan(String[] menu, int[][] dataPenjualan) {
        System.out.println("Masukkan data penjualan : ");

        for (int i = 0; i < menu.length; i++) { //loop utk menu
            System.out.println((i+1) + "." + menu[i] + " : "); //panggil nama menu

            for (int j = 0; j < 7; j++) { //loop utk hari
                System.out.print("Hari ke-" + (j+1) + " : ");
                dataPenjualan[i][j] = input.nextInt();
            }

            System.out.println();
        }
    }

    //fungsi untuk menampilkan seluruh data
    public static void tampilDataPenjuanal(String[] menu, int[][] dataPenjualan) {
        System.out.println("\nData Penjualan : ");

        //header tabel
        System.out.print("               "); 
        for (int i = 0; i < 7; i++) { //loop untuk setiap hari
            System.out.printf("%-15s", "Hari " + (i + 1));
        }
        System.out.println();

        // Tabel data penjualan
        for (int i = 0; i < menu.length; i++) { //loop untuk setiap menu
            System.out.printf("%-15s", menu[i]);
            for (int j = 0; j < 7; j++) { //loop untuk setiap hari
                System.out.printf("%-15d", dataPenjualan[i][j]); // Menampilkan jumlah penjualan
            }
            System.out.println();
        }
    }

    //fungsi untuk mencari menu dengan penjualan tertinggi
    public static void cariPenjualanTertinggi(String[] menu, int[][] dataPenjualan) {
        //deklarasi nilai awal dari penjualan
        int maxPenjualan = 0;
        String menuTertinggi = "";

        //cari menu dgn penjualan tertinggi
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;

            //hitung total penjualan menu ke i
            for (int j = 0; j < 7; j++) {
                totalPenjualan += dataPenjualan[i][j];
            }

            //update menu tertinggi
            if (totalPenjualan >= maxPenjualan) {
                maxPenjualan = totalPenjualan;
                menuTertinggi = menu[i];
            }
        }

        //output
        System.out.println("\nMenu dengan penjualan tertinggi : " + menuTertinggi);
        System.out.println("dengan total penjualan : " + maxPenjualan);
    }

    //fungsi untuk hitung rata-rata penjualan tiap menu
    public static void hitungRataTiapMenu(String[] menu, int[][] dataPenjualan) {
        System.out.println("\nRata-rata Penjualan Tiap Menu : ");

        for (int i = 0; i < menu.length; i++) { //loop untuk setiap menu
            int totalPenjualan = 0;

            //hitung total penjualan menu ke i
            for (int j = 0; j < 7; j++) {
                totalPenjualan += dataPenjualan[i][j];
            }

            //hitung rata2
            double rata = totalPenjualan / 7;

            //output
            System.out.printf("%-15s : %.2f\n", menu[i], rata);
        }
    }

    public static void main(String[] args) {
        //deklarasi array menu
        String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
        //deklarasi array data penjualan
        int[][] dataPenjualan = new int[5][7]; //5 menu 7 hari

        //panggil fungsi input data
        inputDataPenjualan(menu, dataPenjualan);

        //panggil fungsi tampil data
        tampilDataPenjuanal(menu, dataPenjualan);

        //panggil fungsi untuk tampil menu dengan penjualan tertinggi
        cariPenjualanTertinggi(menu, dataPenjualan);

        //panggil fungsi untuk tampil rata-rata penjualan setiap menu
        hitungRataTiapMenu(menu, dataPenjualan);
    }


}
