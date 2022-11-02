public class App {
    public static void main(String[] args) throws Exception {
        bangunDatar bd = new bangunDatar("Hitam");
        System.out.println("Warna Bangun Datar: " + bd.getWarna());

        Lingkaran lk = new Lingkaran("Merah", 26);
        System.out.println("Luas Lingkaran: " + lk.luas());
        System.out.println("Keliling Lingkaran: "+ lk.keliling());
        System.out.println();

        Segitiga sgt = new Segitiga("Kuning", 15, 7);
        System.out.println("Luas Segitiga: " + sgt.luas());
        System.out.println("Keliling Segitiga: "+ sgt.keliling());
        System.out.println();

        Segiempat sgp = new Segiempat("Hijau", 10);
        System.out.println("Luas Segi Empat: " + sgp.luas());
        System.out.println("Keliling Segi Empat: "+ sgp.keliling());
        System.out.println();

    }
}
