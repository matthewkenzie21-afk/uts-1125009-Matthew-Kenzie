package Model;

public abstract class MenuItem {
    private String id;
    private String nama;
    private double hargaBase;
    private int stok;

    public MenuItem(int id2, String nama, double hargaBase, int stok) {
        this.id = id2;
        this.nama = nama;
        this.hargaBase = hargaBase;
        this.stok = stok;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public double getHargaBase() {
        return hargaBase;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public abstract double hitungHargaTotal();
    public abstract String getOrderDetail();

    public double hitungHargaTotal(int jumlah) {
        return hitungHargaTotal() * jumlah;
    }
}