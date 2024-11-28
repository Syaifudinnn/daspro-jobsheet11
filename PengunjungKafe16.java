public class PengunjungKafe16 {
    
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar nama pengunjung : ");
        
        for (String daftarPengunjung : namaPengunjung) {
            System.out.println("- " + daftarPengunjung);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra", "Adn");
    }

}
