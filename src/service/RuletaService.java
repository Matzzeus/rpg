package service;

import Util.RandomUtils;
import model.Jugador;
import Util.ScannerUtils;

public class RuletaService {
    private Jugador jugadorRuleta;
    private  static final int COSTOGIRO =5;

    public RuletaService (Jugador jugadorRuleta){
        this.jugadorRuleta = jugadorRuleta;
    }

    public void validarGemas(){
        System.out.println("hola " + this.jugadorRuleta.getNickname() + " para jugar se usara 5 GEMAS, TIENES: " +  this.jugadorRuleta.getNickname() + " tienes " +this.jugadorRuleta.getOro() +" monedas de oro" +"//  Tienes "+ jugadorRuleta.getGemas() +" Gemas");
        System.out.println(" EL COSTO DE GIRARA LA RULETA ES: "+ COSTOGIRO+ "GEMAS");


        if (jugadorRuleta.getGemas() < COSTOGIRO){
            System.out.println("te hace falta GEMAS para girara");
            return;
        }


        String respuesta = ScannerUtils.capturarTexto("Desea  girara la ruleta\n"+
                "SI/NO");

        if(respuesta.equalsIgnoreCase("SI")){
            jugadorRuleta.gastarGemas(COSTOGIRO);
            girarRuleta();
        }else{
            System.out.println("SALIENDO DE LA RULETA................");
        }

    }

    public void girarRuleta(){

        int resultado = RandomUtils.numeroEntero(1,100);

        if (resultado <= 10){
            jugadorRuleta.agregarGemas(40);
            System.out.println("FELICIDADES GANASTE 40 GEMAS");
        } else if (resultado <= 25){
            jugadorRuleta.agregarOro(75);
            System.out.println( "FELICIDADES GANASTE 75 MONEDAS DE ORO");
        }else if (resultado <= 30){
            jugadorRuleta.agregarGemas(1000);
            System.out.println("FELICIADES GANASTE 1,000 GEMAS");
        }else if (resultado <= 35){
            jugadorRuleta.agregarOro(2000);
            System.out.println("FELICIDADES GANASTE 2,000 ORO");
        }else if (resultado <= 65){
            jugadorRuleta.agregarGemas(5);
            System.out.println("FELICIDADES GANASTE 5 GEMAS");
        }else{
         jugadorRuleta.agregarOro(10);
         System.out.println("FELICIDADES GANASTE 10 MONEDAS DE ORO ");;
        }


    }
}
