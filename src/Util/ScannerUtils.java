package Util;


import javax.print.DocFlavor;
import java.io.LineNumberReader;
import java.util.Scanner;


public class ScannerUtils {
    public static final Scanner SCANNER = new Scanner(System.in) ;

    public ScannerUtils (){

    }


    public static String capturarTexto (String mensaje){
        System.out.println(mensaje +":");
        return SCANNER.nextLine();
    }

    public static char capturarCaracter (String mensaje){
        System.out.println(mensaje +":");
        return   SCANNER.nextLine().charAt(0);
    }

    public static int capturarEntero (String mensaje){
        while (true){
            try{
                System.out.println(mensaje+":");
                int datoN = Integer.parseInt(SCANNER.nextLine());
                return datoN;
            } catch (NumberFormatException e){
                System.out.println("ERROR: debe ingresar numero entero.");
            }
        }
    }
    public static Double capturarDoble (String mensaje){
        while (true){
            try{
                System.out.println(mensaje+":");
                double datoD = Double.parseDouble(SCANNER.nextLine());
                return datoD;
            } catch (NumberFormatException e){
                System.out.println("ERROR:debe ingresar numero decimal.");
            }
        }
    }

}
