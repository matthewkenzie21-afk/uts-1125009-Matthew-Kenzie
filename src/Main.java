import Controller.MenuController;
import View.View;

public class Main {
    public static void main(String[] args) {
        MenuController controller = new MenuController();
        MenuView view = new MenuView(controller);

        view.tampilkanMenu();
    }
}