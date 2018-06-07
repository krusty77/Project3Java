package progra03.examen03.modelo.entidades;

/**
 *
 * @author Beatriz Hernandez
 */
public class Producto {

    // - Atributos -------------------------------------------------------------   
    private int codigo;
    private String nombre;
    private String descripcion;
    private double costo;
    private int cantidad;
    private int poularidad;

    // - Getters y Setters -----------------------------------------------------
    public int getPoularidad() {
        return poularidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getCosto() {
        return costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPoularidad(int poularidad) {
        this.poularidad = poularidad;
    }
    // - Constructores ---------------------------------------------------------

    public Producto() {
    }

    public Producto(int codigo, String nombre, String descripcion,
            double costo, int cantidad) {
        this.poularidad =0;
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
        this.cantidad = cantidad;
    }
    // - Metodos ---------------------------------------------------------------
}
