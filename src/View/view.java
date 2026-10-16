package View;
import Controller.MenuController;
import Model.*;
import Util.InputUtil;

public class View {
    public class MenuView {
    private MenuController controller;

    public MenuView(MenuController controller) {
        this.controller = controller;
    }

    public void tampilkanMenu() {
        int pilihan;

        do {
            System.out.println("\n=== COFFEE SHOP ===");
            System.out.println("1. Lihat Menu");
            System.out.println("2. Pesan Menu");
            System.out.println("0. Keluar");

            pilihan = InputUtil.inputInt("Pilih: ");

            if (pilihan == 1) {
                tampilkanDaftarMenu();
            } else if (pilihan == 2) {
                pesanMenu();
            } else if (pilihan == 0) {
                System.out.println("Terima kasih!");
            } else {
                System.out.println("Pilihan tidak tersedia!");
            }
        } while (pilihan != 0);
    }

    private void pesanMenu() {
        throw new UnsupportedOperationException("Unimplemented method 'pesanMenu'");
    }

    private void tampilkanDaftarMenu() {
        for (MenuItem menu : controller.getDaftarMenu()) {
            System.out.println(
                menu.getId() + " - " +
                menu.getNama() + " - Rp" +
                menu.getHargaBase() + " - Stok: " +
                menu.getStok()
            );
        }
    }
    }
}
