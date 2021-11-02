package Ejercicio04;

import java.util.ArrayList;

public class Plato {
    private String nombreCompleto;
    private double precio;
    private boolean esBebida;
    private ArrayList<Ingrediente> arrayIngredientes;

    public void addArrayIngredientes(Ingrediente detalle){
        if(this.arrayIngredientes == null){
            this.arrayIngredientes = new ArrayList<Ingrediente>();
        }
        this.arrayIngredientes.add(detalle);
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEsBebida() {
        return esBebida;
    }

    public void setEsBebida(boolean esBebida) {
        this.esBebida = esBebida;
    }

    public ArrayList<Ingrediente> getArrayIngredientes() {
        return arrayIngredientes;
    }

    public void setArrayIngredientes(ArrayList<Ingrediente> arrayIngredientes) {
        this.arrayIngredientes = arrayIngredientes;
    }
}
