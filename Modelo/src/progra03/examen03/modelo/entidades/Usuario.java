package progra03.examen03.modelo.entidades;

/**
 *
 * @author Beatriz Hernandez
 */
public class Usuario {

    // - Atributos -------------------------------------------------------------
    private int codId;
    private String nombre;
    private String cuenta_usuario;
    private String password;
    private String pais;
    private String correo;
    private String telefonos;

    // - Getters y Setters -----------------------------------------------------   
    public int getCodId() {
        return codId;
    }

    public String getPassword() {
        return password;
    }

    public String getCuenta_usuario() {
        return cuenta_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefonos() {
        return telefonos;
    }

    public void setCodId(int codId) {
        this.codId = codId;
    }

    public void setPassword(String clave) {
        this.password = clave;
    }

    public void setCuenta_usuario(String cuenta_usuario) {
        this.cuenta_usuario = cuenta_usuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }

    // - Constructores ---------------------------------------------------------    
    public Usuario() {
    }

    public Usuario(String nombre, String cuenta_usuario, String password, String pais, String correo, String telefonos) {
        this.nombre = nombre;
        this.cuenta_usuario = cuenta_usuario;
        this.password = password;
        this.pais = pais;
        this.correo = correo;
        this.telefonos = telefonos;
    }
    // - Metodos ---------------------------------------------------------------
}
