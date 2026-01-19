package model;

public class Llanta {
    private int agarre;
    private int desgaste;
    private boolean pinchada;
    private int coeficiente;

    public Llanta (){
        this.coeficiente = 1;
    }

    public int getCoeficiente() {
        return coeficiente;
    }

    public void mejorar(int nuevoCoeficiente){
        coeficiente = nuevoCoeficiente;
    }
}
