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
        this.oro = 100;
        this.gemas = 10;

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

    public void setOro(int oro) {
        this.oro = oro;
    }

}
