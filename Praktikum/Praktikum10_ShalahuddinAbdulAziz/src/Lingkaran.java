public class Lingkaran extends bangunDatar{
    private double jari;

    public Lingkaran(String warna, double jari) {
        super(warna);
        this.jari = jari;
    }

    @Override
    public double luas(){
        return Math.PI*Math.pow(this.jari, 2);
    }
    @Override
    public double keliling(){
        return Math.PI*2*this.jari;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

}