package Ejercicio01;

public class DDJJFertilizanteIngresoDetalle {

    private String codigo;
    private String nombre;
    private String tipoEnvase;
    private double capacidadEnvase;
    private int Cantidad;
    private double Subtotal;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoEnvase() {
        return tipoEnvase;
    }

    public void setTipoEnvase(String tipoEnvase) {
        this.tipoEnvase = tipoEnvase;
    }

    public double getCapacidadEnvase() {
        return capacidadEnvase;
    }

    public void setCapacidadEnvase(double capacidadEnvase) {
        this.capacidadEnvase = capacidadEnvase;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public double getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(double subtotal) {
        Subtotal = subtotal;
    }
}
