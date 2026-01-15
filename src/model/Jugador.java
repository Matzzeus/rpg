package model;


public class Jugador {
    private String nombre;
    private String nickname;
    private int edad;
    private int oro;
    private int gemas;



    public Jugador (String nombre, String nickname, int edad){
        this.nombre = nombre;
        this.nickname = nickname;
        this.edad = edad;
        this.oro = 50;
        this.gemas = 30;

    }

    public String getNombre(){
        return nombre;
    }

    public String getNickname(){

        return nickname;
    }
    public int getEdad (){
        return  edad;
    }

    public int getOro(){
     return  oro;
    }
    public int getGemas(){
        return gemas;
    }

    public void setGemas(int gemas) {
        this.gemas = gemas;
    }

    public void setOro() {
        this.oro = oro;
    }

    public void agregarOrgo(int cantidad){
        if(cantidad >0){
            gemas += cantidad;
        }
    }
    public void agregarGemas(int cantidad){
        if(cantidad >= 0){
            oro += cantidad;
        }
    }

    public boolean gastarGemas(int cantidad){
        if (cantidad <= gemas ){
            gemas -= cantidad;
            return true;
        }
        return false;
    }





}
