package VentaComputadoras;

import java.util.HashSet;

public class Computadora {
    private String marca;
    private String modelo;
    private HashSet<ComponenteCPU> componentes;

    public void addArrayComponentes(ComponenteCPU detalle){
        if(this.componentes == null){
            this.componentes = new HashSet<ComponenteCPU>();
        }
        this.componentes.add(detalle);
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public HashSet<ComponenteCPU> getComponentes() {
        return componentes;
    }

    public void setComponentes(HashSet<ComponenteCPU> componentes) {
        this.componentes = componentes;
    }
}
