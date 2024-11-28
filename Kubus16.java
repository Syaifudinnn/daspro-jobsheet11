import java.util.Scanner;

public class Kubus16 {
    
    static int hitungVolume (int rusuk) {
        int volume = rusuk * rusuk * rusuk;
        return volume;
    }

    static int hitungLuasPermukaan (int rusuk) {
        int luas = 6 * (rusuk * rusuk);
        return luas;
    }

    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //input
        System.out.print("Masukkan panjang rusuk : ");
        int rusuk = input.nextInt();

        //panggil fungsi
        int volume = hitungVolume(rusuk);
        System.out.println("\nVolume Kubus : " + volume);
        
        int luasPermukaan = hitungLuasPermukaan(rusuk);
        System.out.println("Luas Permukaan Kubus : " + luasPermukaan);
    }

}
