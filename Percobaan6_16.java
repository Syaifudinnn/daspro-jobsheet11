import java.util.Scanner;

public class Percobaan6_16 {

    //fungsi hitung luas
    static int hitungLuas (int panjang, int lebar) {
        int Luas = panjang * lebar;
        return Luas;
    }

    //fungsi hitung volume
    static int hitungVolume (int panjang, int lebar, int tinggi) {
        int volume = panjang * lebar * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //deklarasi variable 
        int p, l, t, L, vol;

        //inputan
        System.out.print("Masukkan panjang : ");
        p = input.nextInt();

        System.out.print("Masukkan lebar : ");
        l = input.nextInt();

        System.out.print("Masukkan tinggi : ");
        t = input.nextInt();

        //panggil fungsi
        L = hitungLuas(p, l);
        System.out.println("\nLuas Persegi Panjang : " + L);

        vol = hitungVolume(p, L, t);
        System.out.println("\nVolume Persegi Panjang : " + vol);
    }

}