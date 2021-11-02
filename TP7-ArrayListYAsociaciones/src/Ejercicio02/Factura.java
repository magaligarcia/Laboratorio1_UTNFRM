package Ejercicio02;

import Ejercicio01.DDJJFertilizanteIngresoDetalle;

import java.util.ArrayList;

public class Factura {
    private String fechaFactura;
    private long numeroFactura;
    private double totalCalculadoFactura;
    private String cliente;
    private ArrayList<DetalleFactura> detallesFactura;

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public long getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(long numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public double getTotalCalculadoFactura() {
        return totalCalculadoFactura;
    }

    public void setTotalCalculadoFactura(double totalCalculadoFactura) {
        this.totalCalculadoFactura = totalCalculadoFactura;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void calcularMontoTotal(){  //2 - d
        double total=0;
        for(int i = 0; i < this.detallesFactura.size(); i++){
            total += this.detallesFactura.get(i).getSubtotal();
        }
        this.totalCalculadoFactura = total;
    }

    public ArrayList<DetalleFactura> getDetallesFactura() {
        return detallesFactura;
    }

    public void setDetallesFactura(ArrayList<DetalleFactura> detallesFactura) {
        this.detallesFactura = detallesFactura;
    }

    public void addDetalleFactura(DetalleFactura detalle){
        if(this.detallesFactura == null){
            this.detallesFactura = new ArrayList<DetalleFactura>();
            this.detallesFactura.add(detalle);
        }
    }
}
