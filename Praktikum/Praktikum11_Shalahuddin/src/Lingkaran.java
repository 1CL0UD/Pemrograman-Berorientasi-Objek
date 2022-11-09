public class Lingkaran extends BangunDatar{
    private double jari;

    public Lingkaran(double jari, String warna) {
        this.jari = jari;
        this.warna = warna;
    }

    @Override
    public double luas() {
        return jari*jari*Math.PI;
    }

    @Override
    public double keliling() {
        return 2*jari*Math.PI;
    }

    @Override
    public void print(){
        System.out.println(this.getClass().getSimpleName());
        System.out.println("Warna: " + this.warna);
        System.out.println("Jari-Jari: " + this.jari);
        System.out.printf("Luas: %.1f\n", luas());
        System.out.printf("Keliling: %.1f\n", keliling());
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }
    
}
