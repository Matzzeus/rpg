package model;

public class Motor {
    private int potecnia;
    private double consumo;
    private boolean encendido;

    public void encender (){
        encendido = true;
    }
    public void apagar(){
        encendido = false;
    }
    public int getPotecnia(){
        return potecnia;
    }

}
