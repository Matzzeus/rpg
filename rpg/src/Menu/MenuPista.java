package Menu;

import Util.ScannerUtils;

import java.sql.SQLOutput;

public class MenuPista {
    public void  mostrarMenuPistas (){
        int opcion = 0;

        do{
            System.out.println(".............MENU PISTA..........");
            System.out.println("1. VER GASOLINA MINIMA\n"+
                    "2. VER PISTAS RACING\n"+
                    "3. REGRESAR");
            opcion = ScannerUtils.capturarEntero("selecciones una opcion");

            switch (opcion){
                case 1:
                    System.out.println("gasolina");
                    break;
                case 2:
                    System.out.println("pistas de carrera");
                    break;
                case 3:
                    System.out.println("regreso al menu principal----");;
                    break;
                default:
                    System.out.println("OPCION NO VALIDA....");
            }
        }while (opcion!=3);
    }
}
