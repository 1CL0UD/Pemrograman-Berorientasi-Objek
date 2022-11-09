public class SegiEmpat extends BangunDatar{
    private double sisi;
    
    public SegiEmpat(double sisi, String warna) {
        this.sisi = sisi;
        this.warna = warna;
    }

    @Override
    public void print() {
        // TODO Auto-generated method stub
        System.out.println(this.getClass().getSimpleName());
        System.out.println("Warna: " + this.warna);
        System.out.println("Sisi: " + this.sisi);
        System.out.printf("Luas: %.1f\n", luas());
        System.out.printf("Keliling: %.1f\n", keliling());
        
    }

    @Override
    public double keliling() {
        // TODO Auto-generated method stub
        return this.sisi*4;
    }

    @Override
    public double luas() {
        // TODO Auto-generated method stub
        return this.sisi*this.sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
}
