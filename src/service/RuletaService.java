package service;

import Util.RandomUtils;
import model.Jugador;
import Util.ScannerUtils;

public class RuletaService {
    private Jugador jugador;
    private  static final int COSTOGIRO =5;

    public RuletaService (Jugador jugadorRuleta){
        this.jugador = jugadorRuleta;
    }

    public void validarGemas(){
        System.out.println("hola " + this.jugador.getNickname() + " para jugar se usara 5 GEMAS, TIENES: " +  this.jugador.getNickname() + " tienes " +this.jugador.getOro() +" monedas de oro" +"//  Tienes "+ jugador.getGemas() +" Gemas");
        System.out.println(" EL COSTO DE GIRARA LA RULETA ES: "+ COSTOGIRO+ "GEMAS");
        if(jugador.getGemas() <5 ){
            System.out.println("TE HACE FALTA GEMAS, POR QUE TIENES " + jugador.getGemas() +"GEMAS");
            return;
        }

        if (jugador.getGemas() < COSTOGIRO){
            System.out.println("te hace falta GEMAS para girara");
            return;
        }


        String respuesta = ScannerUtils.capturarTexto("Desea  girara la ruleta\n"+
                "SI/NO");

        if(respuesta.equalsIgnoreCase("SI")){
            jugador.gastarGemas(COSTOGIRO);
            girarRuleta();
        }else{
            System.out.println("SALIENDO DE LA RULETA................");
        }

    }

    public void girarRuleta(){

        int resultado = RandomUtils.numeroEntero(1,100);

        if (resultado <= 10){
            jugador.agregarGemas(40);
            System.out.println("FELICIDADES GANASTE 40 GEMAS");
        } else if (resultado <= 25){
            jugador.agregarOrgo(75);
            System.out.println( "FELICIDADES GANASTE 75 MONEDAS DE ORO");
        }else if (resultado <= 30){
            jugador.agregarGemas(1000);
            System.out.println("FELICIADES GANASTE 1,000 GEMAS");
        }else if (resultado <= 35){
            jugador.agregarOrgo(2000);
            System.out.println("FELICIDADES GANASTE 2,000 ORO");
        }else if (resultado <= 65){
            jugador.agregarGemas(5);
            System.out.println("FELICIDADES GANASTE 5 GEMAS");
        }else{
         jugador.agregarOrgo(10);
         System.out.println("FELICIDADES GANASTE 10 MONEDAS DE ORO ");;
        }


    }
}
