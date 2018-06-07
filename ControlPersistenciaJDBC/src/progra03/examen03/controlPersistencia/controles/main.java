package progra03.examen03.controlPersistencia.controles;

import progra03.examen03.controlPersistencia.entidades.GestionConexion;

public class main {

    
    public static void main(String[] args) {
      GestionConexion.obtenerInstancia().obtieneConexion();
    }
}
