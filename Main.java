import Modelo.Menu.MenuBanco;
import Modelo.Banco;

public class Main {
    public static void main(String[] args) {
        Banco miBanco = new Banco("Banco Virtual");
        MenuBanco menu = new MenuBanco(miBanco);
        menu.mostrarMenu();
    }
}