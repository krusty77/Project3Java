package progra03.examen03.modelo.entidades;

/**
 *
 * @author Beatriz Hernandez
 */
public class Administrador {

    // - Atributos -------------------------------------------------------------
    private int codId;
    private String nombre;
    private String cuentaUsuario;
    private String password;

    // - Getters y Setters -----------------------------------------------------
    public int getCodId() {
        return codId;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public String getCuentaUsuario() {
        return cuentaUsuario;
    }

    public void setCodId(int codId) {
        this.codId = codId;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPassword(String clave) {
        this.password = clave;
    }

    public void setCuentaUsuario(String cuenta_usuario) {
        this.cuentaUsuario = cuenta_usuario;
    }
    // - Constructores ---------------------------------------------------------

    public Administrador() {
    }

    public Administrador(int codId, String nombre, String cuentaUsuario, String password) {
        this.codId = codId;
        this.nombre = nombre;
        this.cuentaUsuario = cuentaUsuario;
        this.password = password;
    }
    // - Metodos ---------------------------------------------------------------
}
