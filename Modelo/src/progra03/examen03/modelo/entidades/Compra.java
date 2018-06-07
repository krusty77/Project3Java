package progra03.examen03.modelo.entidades;

/**
 *
 * @author Beatriz Hernandez
 */
public class Compra {

    // - Atributos -------------------------------------------------------------   
    private int codId;
    private int codUsuario;
    private int codProducto;
    // - Getters y Setters -----------------------------------------------------

    public int getCodId() {
        return codId;
    }

    public int getCodProducto() {
        return codProducto;
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodId(int codId) {
        this.codId = codId;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    // - Constructores ---------------------------------------------------------
    public Compra() {
    }

    public Compra(int codId, int codUsuario, int codProducto) {
        this.codId = codId;
        this.codUsuario = codUsuario;
        this.codProducto = codProducto;
    }
    // - Metodos ---------------------------------------------------------------
}
