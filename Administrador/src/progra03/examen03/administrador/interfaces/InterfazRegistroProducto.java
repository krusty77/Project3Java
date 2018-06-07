package progra03.examen03.administrador.interfaces;

import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

/** 
 * @author Beatriz Hernandez
 */
public class InterfazRegistroProducto extends javax.swing.JFrame {

    // - Atributos -------------------------------------------------------------   
    // - Getters y Setters -----------------------------------------------------
    public int getCampoCantidad() {
        return Integer.parseInt(campoCantidad.getText());
    }

    public int getCampoCodigo() {
        return Integer.parseInt(campoCodigo.getText());
    }

    public double getCampoCosto() {
        return Double.parseDouble(campoCosto.getText());
    }

    public String getCampoDescripcion() {
        return campoDescripcion.getText();
    }

    public String getCampoNombre() {
        return campoNombre.getText();
    }

    public void setCampoCantidad(String texto) {
        this.campoCantidad.setText(texto);
    }

    public void setCampoCodigo(String texto) {
        this.campoCodigo.setText(texto);
    }

    public void setCampoCosto(String texto) {
        this.campoCosto.setText(texto);
    }

    public void setCampoDescripcion(String texto) {
        this.campoDescripcion.setText(texto);
    }

    public void setCampoNombre(String texto) {
        this.campoNombre.setText(texto);
    }

    // - Constructores ---------------------------------------------------------
    public InterfazRegistroProducto() {
        initComponents();
    }

    // - Metodos ---------------------------------------------------------------
    public void agregarListenerBotonRegistrarProducto(ActionListener listener) {
        this.btnRegistrarProducto.addActionListener(listener);
    }

    public void agregarListenerCampoCodigo(KeyListener listener) {
        campoCodigo.addKeyListener(listener);
    }

    public void agregarListenerCampoCantidad(KeyListener listener) {
        campoCantidad.addKeyListener(listener);
    }

    public void agregarListenerCampoCosto(KeyListener listener) {
        campoCosto.addKeyListener(listener);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        campoCodigo = new javax.swing.JTextField();
        labelNombre = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        labelDescripcion = new javax.swing.JLabel();
        campoDescripcion = new javax.swing.JTextField();
        labelCosto = new javax.swing.JLabel();
        campoCosto = new javax.swing.JTextField();
        labelCantidad = new javax.swing.JLabel();
        campoCantidad = new javax.swing.JTextField();
        btnRegistrarProducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro Producto");
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(0, 102, 102));

        labelTitulo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18));
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Registro Producto");

        labelCodigo.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        labelCodigo.setForeground(new java.awt.Color(255, 255, 255));
        labelCodigo.setText("Codigo Producto:");

        campoCodigo.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));

        labelNombre.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        labelNombre.setForeground(new java.awt.Color(255, 255, 255));
        labelNombre.setText("Nombre :");

        campoNombre.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));

        labelDescripcion.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        labelDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        labelDescripcion.setText("Descripcion:");

        campoDescripcion.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));

        labelCosto.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        labelCosto.setForeground(new java.awt.Color(255, 255, 255));
        labelCosto.setText("Costo:");

        campoCosto.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));

        labelCantidad.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        labelCantidad.setForeground(new java.awt.Color(255, 255, 255));
        labelCantidad.setText("Cantidad Disponble:");

        campoCantidad.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));

        btnRegistrarProducto.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14));
        btnRegistrarProducto.setText("Guardar Registro");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                        .addComponent(labelTitulo)
                        .addGap(121, 121, 121))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRegistrarProducto)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(labelNombre)
                                            .addComponent(labelDescripcion)
                                            .addComponent(labelCodigo)
                                            .addComponent(labelCosto)))
                                    .addComponent(labelCantidad))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                    .addComponent(campoCosto, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                    .addComponent(campoDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(26, 26, 26))))
        );

        panelPrincipalLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {campoCantidad, campoCosto, campoDescripcion, campoNombre});

        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDescripcion)
                    .addComponent(campoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCosto)
                    .addComponent(campoCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCantidad)
                    .addComponent(campoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarProducto)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        panelPrincipalLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {campoCantidad, campoCosto, campoDescripcion, campoNombre});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarProducto;
    private javax.swing.JTextField campoCantidad;
    private javax.swing.JTextField campoCodigo;
    private javax.swing.JTextField campoCosto;
    private javax.swing.JTextField campoDescripcion;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JLabel labelCantidad;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelCosto;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables

    public void limpiarCampos() {
        setCampoCodigo("");
        setCampoNombre("");
        setCampoDescripcion("");
        setCampoCosto("");
        setCampoCantidad("");            
        
    }
}
