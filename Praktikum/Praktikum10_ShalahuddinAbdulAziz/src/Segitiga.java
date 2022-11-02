public class Segitiga extends bangunDatar {
    private double alas;
    private double tinggi;

    public Segitiga(String warna, double alas, double tinggi) {
        super(warna);
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double luas(){
        return this.alas*this.tinggi/2;
    }
    @Override
    public double keliling(){
        return 3*this.alas;
    }
    
    public double keliling1(){
        double sisi = Math.sqrt(Math.pow(this.alas/2,2)+Math.pow(this.tinggi,2));
        return 3*sisi;
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
