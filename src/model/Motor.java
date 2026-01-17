package model;

public class Motor {
    private int potencia;
    private double consumo;
    private boolean encendido;
    private int nivel;
    public Motor (){
        this.potencia = 10;
        this.consumo = 0;
        this.nivel = 1;
        this.encendido = false;
    }

    public int getPotencia(){
        return potencia;
    }
    public int getNivel(){
        return nivel;
    }
    public  void mejorarMotor(){
        nivel++;
        potencia +=5;
    }

    public void encender (){
        encendido = true;
    }
    public void apagar(){
        encendido = false;
    }


}
