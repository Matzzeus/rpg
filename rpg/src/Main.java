import Menu.MenuPrincipal;
import Util.ScannerUtils;
import model.Jugador;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("BIENVENIDO AL RPG RACING");
        System.out.println();

        String respuesta = ScannerUtils.capturarTexto("ACEPTAS TERMINOS Y CONDICIONES DEL JUEGO?\n"+
                "SI/NO");

        if (!respuesta.equalsIgnoreCase("SI")){
            System.out.println(" debe aceptar (SI)");
            return;
        }
        String nonmbre = ScannerUtils.capturarTexto("Ingrese su Nombre");
        String nickname = ScannerUtils.capturarTexto("Ingrese su Nickname");
        int edad = ScannerUtils.capturarEntero("Ingrese su edad");

        Jugador player = new Jugador( nonmbre , nickname, edad );

        System.out.println( "BIENVENIDO A RACING TOUR "+ player.getNickname());

        MenuPrincipal menuPrincipal = new MenuPrincipal(player);
        menuPrincipal.mostrarMenuPrincipal();


    }
}