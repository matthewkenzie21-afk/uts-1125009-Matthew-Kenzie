package Model;

import java.util.List;

public class Kopi extends MenuItem implements Customizable {
    public Kopi(int id, String nama, double hargaBase, int stok) {
        super(id, nama, hargaBase, stok);
    }

    @Override
    public double hitungHargaTotal() {
        return hitungHargaTotal();  
    }

    @Override
    public String getOrderDetail() {
        
    }

    @Override
    public void customize(List<Integer> customizations) {
        
        throw new UnsupportedOperationException("Unimplemented method 'customize'");
    }

    @Override
    public void customize(int[] customizations) {
     
        
        throw new UnsupportedOperationException("Unimplemented method 'customize'");
    }
  
}


