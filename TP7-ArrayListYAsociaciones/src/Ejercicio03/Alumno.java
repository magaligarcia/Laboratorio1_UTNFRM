package Ejercicio03;

import java.util.ArrayList;

public class Alumno {
    private String nombreCompleto;
    private long legajo;
    private ArrayList<Nota> arrayListNotas;

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public long getLegajo() {
        return legajo;
    }

    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }

    public ArrayList<Nota> getArrayListNotas() {
        return arrayListNotas;
    }

    public void setArrayListNotas(ArrayList<Nota> arrayListNotas) {
        this.arrayListNotas = arrayListNotas;
    }
}
