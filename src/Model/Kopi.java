package Model;

import java.util.Arrays;
import java.util.List;

public class Kopi extends MenuItem implements Customizable {
    private int[] a;

    public Kopi(int id, String nama, double hargaBase, int stok) {
        super(id, nama, hargaBase, stok);
    }

    @Override
    public void customize(int[] a) {
        if (a.length != 4) {
            throw new IllegalArgumentException(
                "Kopi membutuhkan 4 nilai."
            );
        }

        if (a[0] < 0 || a[0] > 1 ||
            a[1] < 0 || a[1] > 5 ||
            a[2] < 0 || a[2] > 5 ||
            a[3] < 0 || a[3] > 5) {
            throw new IllegalArgumentException(
                "Jumlah kustomisasi Kopi tidak valid."
            );
        }

        this.a = Arrays.copyOf(a, a.length);
    }

    @Override
    public void customize(List<Integer> b) {
        if (b.size() != 4) {
            throw new IllegalArgumentException(
                "Kopi membutuhkan 4 nilai."
            );
        }

        int[] a = new int[4];

        for (int i = 0; i < b.size(); i++) {
            a[i] = b.get(i);
        }

        customize(a);
    }

    @Override
    public double hitungHargaTotal() {
        return getHargaBase()
            + (a[0] * 3000)
            + (a[3] * 3000);
    }

    @Override
    public String getOrderDetail() {
        return "Kopi: " + getNama()
            + "\nRum: " + a[0]
            + "\nEs: " + a[1]
            + "\nGula: " + a[2]
            + "\nKaramel: " + a[3];
    }
}
  
}


