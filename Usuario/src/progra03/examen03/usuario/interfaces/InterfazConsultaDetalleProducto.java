package progra03.examen03.usuario.interfaces;

import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

/** 
 * @author Beatriz Hernandez
 */
public class InterfazConsultaDetalleProducto extends javax.swing.JFrame {

    // - Atributos -------------------------------------------------------------   
    // - Getters y Setters -----------------------------------------------------
    public String getCampoCantidad() {
        return campoCantidad.getText();
    }

    public String getCampoCodigo() {
        return campoCodigo.getText();
    }

    public String getCampoCosto() {
        return campoCosto.getText();
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

    public String getCampoComentario() {
        return campoComentario.getText();
    }
    
    public void setCampoComentario(String texto) {
        this.campoComentario.setText(texto);
    }

    // - Constructores ---------------------------------------------------------
    public InterfazConsultaDetalleProducto() {
        initComponents();
    }

    // - Metodos ---------------------------------------------------------------
    public void agregarListenerBotonPublicar(ActionListener listener) {
        this.botonPublicar.addActionListener(listener);
    }

    public void agregarListenerBotonComprar(ActionListener listener) {
        this.botonComprar.addActionListener(listener);
    }

    public void agregarListenerCheckBoxMegusta(ActionListener listener) {
        this.checkMegusta.addActionListener(listener);
    }

    public void bloquearCampos() {
        campoCantidad.setEnabled(false);
        campoCodigo.setEnabled(false);
        campoCosto.setEnabled(false);
        campoDescripcion.setEnabled(false);
        campoNombre.setEnabled(false);
    }

    public void bloquearCompra() {
        botonComprar.setEnabled(false);
    }

    public JCheckBox getCheckMegusta() {
        return checkMegusta;
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
        labelPublicacion = new javax.swing.JLabel();
        campoComentario = new javax.swing.JTextField();
        botonPublicar = new javax.swing.JButton();
        botonComprar = new javax.swing.JButton();
        checkMegusta = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Informacion Producto");
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(0, 102, 102));

        labelTitulo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Informacion Producto");

        labelCodigo.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        labelCodigo.setForeground(new java.awt.Color(255, 255, 255));
        labelCodigo.setText("Codigo Producto:");

        campoCodigo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        campoCodigo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campoCodigo.setSelectionColor(new java.awt.Color(0, 51, 51));

        labelNombre.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(255, 255, 255));
        labelNombre.setText("Nombre :");

        campoNombre.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        campoNombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        labelDescripcion.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        labelDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        labelDescripcion.setText("Descripcion:");

        campoDescripcion.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        campoDescripcion.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        labelCosto.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        labelCosto.setForeground(new java.awt.Color(255, 255, 255));
        labelCosto.setText("Costo:");

        campoCosto.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        campoCosto.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        labelCantidad.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        labelCantidad.setForeground(new java.awt.Color(255, 255, 255));
        labelCantidad.setText("Cantidad Disponble:");

        campoCantidad.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        campoCantidad.setDisabledTextColor(new java.awt.Color(102, 0, 0));

        labelPublicacion.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        labelPublicacion.setForeground(new java.awt.Color(255, 255, 255));
        labelPublicacion.setText("Escribir Comentario:");

        campoComentario.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        campoComentario.setDisabledTextColor(new java.awt.Color(102, 0, 0));

        botonPublicar.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        botonPublicar.setText("Publicar");

        botonComprar.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        botonComprar.setText("Comprar");

        checkMegusta.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        checkMegusta.setText("Me gusta");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPublicacion)
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
                                .addGap(25, 25, 25)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                    .addComponent(campoCosto, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                    .addComponent(campoDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                    .addComponent(campoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                    .addComponent(campoCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))))
                        .addGap(4, 4, 4))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoComentario, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(checkMegusta)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonComprar)
                            .addComponent(botonPublicar))))
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addComponent(labelTitulo)
                .addGap(140, 140, 140))
        );

        panelPrincipalLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {campoCantidad, campoCodigo, campoCosto, campoDescripcion, campoNombre});

        panelPrincipalLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botonComprar, botonPublicar, checkMegusta});

        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
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
                .addComponent(labelPublicacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoComentario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonPublicar))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonComprar)
                    .addComponent(checkMegusta))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        panelPrincipalLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {campoCantidad, campoCosto, campoDescripcion, campoNombre});

        panelPrincipalLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botonComprar, botonPublicar, checkMegusta});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonComprar;
    private javax.swing.JButton botonPublicar;
    private javax.swing.JTextField campoCantidad;
    private javax.swing.JTextField campoCodigo;
    private javax.swing.JTextField campoComentario;
    private javax.swing.JTextField campoCosto;
    private javax.swing.JTextField campoDescripcion;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JCheckBox checkMegusta;
    private javax.swing.JLabel labelCantidad;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelCosto;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPublicacion;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
