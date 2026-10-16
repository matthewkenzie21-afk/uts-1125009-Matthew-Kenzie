package Model;

public abstract class MenuItem {
    private int id;
    private String nama;
    private double hargaBase;
    private int stok;

    public MenuItem(int id, String nama, double hargaBase, int stok) {
        this.id = id;
        this.nama = nama;
        this.hargaBase = hargaBase;
        this.stok = stok;
    }

    abstract double hitungHargaTotal();
    abstract String getOrderDetail();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double setHargaBase() {
        return hargaBase;
    }

    public void setHargaBase(double hargaBase) {
        this.hargaBase = hargaBase;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

}
