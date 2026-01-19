package model;


import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private String nombre;
    private String nickname;
    private int edad;
    private int oro;
    private int gemas;
    private List<Vehiculo> vehiculos;
    private Vehiculo vehiculoActivo;


    public Jugador (String nombre, String nickname, int edad){
        this.nombre = nombre;
        this.nickname = nickname;
        this.edad = edad;
        this.oro = 50;
        this.gemas = 30;
        this.vehiculos = new ArrayList<>();
        this.vehiculoActivo =  null;
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

    /*public void setGemas(int gemas) {
        this.gemas = gemas;
    }

    public void setOro() {
        this.oro = oro;
    }*/

    public void agregarOro(int cantidad){
        if(cantidad >0){
            oro += cantidad;
        }
    }
    public void agregarGemas(int cantidad){
        if(cantidad > 0){
            gemas += cantidad;
        }
    }

    public boolean gastarGemas(int cantidad){
        if (cantidad <= gemas ){
            gemas -= cantidad;
            return true;
        }
        return false;
    }


    public void agregarVehiculo(Vehiculo v){
        if(vehiculos.size() < 5 ){
            vehiculos.add(v);
            if(vehiculoActivo == null){
                vehiculoActivo = v;
            }

        }else {
            System.out.println(" no puedes tener más de 5");

        }
    }
    public List<Vehiculo> getVehiculos(){
        return vehiculos;
    }

    public void SetVehiculoActivo(int indice){
        if(indice >=0 && indice <vehiculos.size() ){
            vehiculoActivo = vehiculos.get(indice);
        }

    }


}
