public abstract class BangunDatar implements ViewData{
    protected String warna;
    
    public abstract double keliling();
    public abstract double luas();

    public String getWarna() {
        return warna;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
}
