package Menu;

import Util.ScannerUtils;
import model.Jugador;
import Menu.MenuGarage;
public class MenuPrincipal {


    private Jugador player;
    private MenuGarage menuGarage;
    public MenuPrincipal(Jugador playerC) {
        this.player = playerC;
        this.menuGarage= new MenuGarage();
    }

    public void mostrarMenuPrincipal (){

        int opcion = 0;
        do {
            System.out.println("Bienvenido " + this.player.getNickname() + "tienes " +this.player.getOro() +" de oro" +"//  Tienes "+ player.getGemas() +" gemas");
            System.out.println("BIENVENIDO A RPG RACING \n"+
                    "..................MENU..................\n"+
                    "1. COMPETIR\n"+ "2. RULETA\n"+"3. GARAGE\n"+"4. PISTAS\n"+"5. ESTADISTICAS Y REPORTES\n"+"6. SALIR\n");


            opcion = ScannerUtils.capturarEntero("Seleccione una opcion");

            switch (opcion){
                case 1:
                    System.out.println("Entrando a...");
                    break;
                case 2:
                    System.out.println("Entrando a...");

                    break;
                case 3:
                    menuGarage.mostrarMenu();

                    break;
                case 4:
                    System.out.println("Entrando a...");

                    break;
                case 5:
                    System.out.println("Entrando a...");

                    break;
                case 6:
                    System.out.println("SALIENDO DEL JUEGO....");
                    break;
                default:
                    System.out.println("opcion no valida.");
            }
            System.out.println();
        } while (opcion != 6);
    }

}
