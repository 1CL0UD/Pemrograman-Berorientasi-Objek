public class Segitiga extends BangunDatar{
    private double alas;
    private double tinggi;

    
    public Segitiga(double alas, double tinggi, String warna) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.warna = warna;
    }
    @Override
    public void print() {
        System.out.println(this.getClass().getSimpleName());
        System.out.println("Warna: " + this.warna);
        System.out.println("Alas: " + this.alas);
        System.out.println("Tinggi: " + this.tinggi);
        System.out.printf("Luas: %.1f\n", luas());
        System.out.printf("Keliling: %.1f\n", keliling());        
    }
    @Override
    public double keliling() {
        // TODO Auto-generated method stub
        return this.alas*3;
    }
    @Override
    public double luas() {
        // TODO Auto-generated method stub
        return this.alas*this.tinggi/2;
    }
    public double getAlas() {
        return alas;
    }
    public void setAlas(double alas) {
        this.alas = alas;
    }
    public double getTinggi() {
        return tinggi;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
}
