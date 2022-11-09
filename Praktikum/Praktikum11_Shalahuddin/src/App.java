public class App {
    public static void main(String[] args) throws Exception {
        BangunDatar lingkaran = new Lingkaran(10, "Merah");
        BangunDatar segitiga = new Segitiga(13, 5, "Merah");
        BangunDatar segiempat = new SegiEmpat(5, "Hitam");
        
        BangunDatar[] bangunDatar = new BangunDatar[3];
        bangunDatar[0] = lingkaran;
        bangunDatar[1] = segitiga;
        bangunDatar[2] = segiempat;

        // for(int i=0; i<3; i++){
        //     System.out.println(bangunDatar[i].getClass().getSimpleName());
        //     System.out.println("Warna: " + bangunDatar[i].getWarna());
        //     System.out.printf("Luas: %.1f\n", bangunDatar[i].luas());
        //     System.out.printf("Keliling: %.1f\n\n", bangunDatar[i].keliling());
        // }
        for(int i=0; i<3; i++){
            bangunDatar[i].print();
            System.out.println();
        }
    }
}
