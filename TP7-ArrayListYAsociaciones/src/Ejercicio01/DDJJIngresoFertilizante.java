package Ejercicio01;

import java.util.ArrayList;

public class DDJJIngresoFertilizante {

    private int anioDeclaracion;
    private int mesDeclaracion;
    private double montoXIngreso;
    private String empresa;
    private long cuitEmpresa;
    private ArrayList<DDJJFertilizanteIngresoDetalle> detallesFertilizantes;

    public ArrayList<DDJJFertilizanteIngresoDetalle> getDetallesFertilizantes() {
        return detallesFertilizantes;
    }

    public void setDetallesFertilizantes(ArrayList<DDJJFertilizanteIngresoDetalle> detallesFertilizantes) {
        this.detallesFertilizantes = detallesFertilizantes;
    }

    public void addDetalleFerilizante(DDJJFertilizanteIngresoDetalle detalle){
        if(this.detallesFertilizantes == null){
            this.detallesFertilizantes = new ArrayList<DDJJFertilizanteIngresoDetalle>();
            this.detallesFertilizantes.add(detalle);
        }
    }

    public int getAnioDeclaracion() {
        return anioDeclaracion;
    }

    public void setAnioDeclaracion(int anioDeclaracion) {
        this.anioDeclaracion = anioDeclaracion;
    }

    public int getMesDeclaracion() {
        return mesDeclaracion;
    }

    public void setMesDeclaracion(int mesDeclaracion) {
        this.mesDeclaracion = mesDeclaracion;
    }

    public double getMontoXIngreso() {
        return montoXIngreso;
    }

    public void setMontoXIngreso(double montoXIngreso) {
        this.montoXIngreso = montoXIngreso;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public long getCuitEmpresa() {
        return cuitEmpresa;
    }

    public void setCuitEmpresa(long cuitEmpresa) {
        this.cuitEmpresa = cuitEmpresa;
    }

    public void calcularMontoIngresoTotal(){
        double total=0;
        for(int i = 0; i < this.detallesFertilizantes.size(); i++){
            total += this.detallesFertilizantes.get(i).getSubtotal();
        }
        this.montoXIngreso = total;
    }


}