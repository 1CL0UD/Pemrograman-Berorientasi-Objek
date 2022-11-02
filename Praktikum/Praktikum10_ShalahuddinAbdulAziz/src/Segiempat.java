public class Segiempat extends bangunDatar {
    private double sisi;

    public Segiempat(String warna, double sisi) {
        super(warna);
        this.sisi = sisi;
        
    }
    @Override
    public double luas(){
        return this.sisi*this.sisi;
    }
    @Override
    public double keliling(){
        return this.sisi*4; 
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
}
