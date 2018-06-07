package progra03.examen03.administrador.interfaces;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/** 
 * @author Beatriz Hernandez
 */
public class InterfazConsultaDetalleProducto extends javax.swing.JFrame {

    // - Atributos -------------------------------------------------------------   
    // - Getters y Setters -----------------------------------------------------
    public String getCampoPopularidad() {
        return campoPopularidad.getText();
    }

    public String getCampoEstado() {
        return campoEstado.getText();
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

    public void setCampoPopularidad(String texto) {
        this.campoPopularidad.setText(texto);
    }

    public void setCampoEstado(String texto) {
        this.campoEstado.setText(texto);
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
    public InterfazConsultaDetalleProducto() {
        initComponents();
    }

    // - Metodos ---------------------------------------------------------------
    private JPanel nuevaPublicacion(String publicacion, String fecha, String nombre) {
        JPanel panelPublicacion = new JPanel(new BorderLayout());
        JPanel flowUp = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel fecha1 = new JLabel();
        fecha1.setText(fecha);
        fecha1.setFont(new java.awt.Font("Comic Sans MS", 1, 12));
        fecha1.setForeground(new java.awt.Color(0, 102, 204));

        JLabel nombre1 = new JLabel();
        nombre1.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        fecha1.setForeground(new java.awt.Color(0, 102, 204));
        nombre1.setText(nombre);
        JLabel publicacionCenter = new JLabel(publicacion);
        flowUp.add(nombre1);
        flowUp.add(fecha1);
        panelPublicacion.add(flowUp, BorderLayout.NORTH);
        panelPublicacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelPublicacion.add(publicacionCenter, BorderLayout.CENTER);
        panelPublicacion.validate();
        panelPublicacion.repaint();
        panelPublicacion.setVisible(true);

        return panelPublicacion;
    }
    
    
    public void agregarPanelNuevaPublicacion(String publicacion, String fecha, String nombre) {
        this.listaPublicaciones.add(this.nuevaPublicacion(publicacion, fecha, nombre)).setVisible(true);      
    }
    
    
    public void limpiarPanel(){
    listaPublicaciones.removeAll();
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
        labelEstado = new javax.swing.JLabel();
        campoEstado = new javax.swing.JTextField();
        labelPopularidad = new javax.swing.JLabel();
        campoPopularidad = new javax.swing.JTextField();
        labelComentarios = new javax.swing.JLabel();
        scrollPanePublicaciones = new javax.swing.JScrollPane();
        listaPublicaciones = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Conusltar Detalle Producto");
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(0, 102, 102));

        labelTitulo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Detalle Producto");

        labelCodigo.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        labelCodigo.setForeground(new java.awt.Color(255, 255, 255));
        labelCodigo.setText("Codigo Producto:");

        campoCodigo.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));

        labelNombre.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        labelNombre.setForeground(new java.awt.Color(255, 255, 255));
        labelNombre.setText("Nombre :");

        campoNombre.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));

        labelDescripcion.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        labelDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        labelDescripcion.setText("Descripcion:");

        campoDescripcion.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N

        labelCosto.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        labelCosto.setForeground(new java.awt.Color(255, 255, 255));
        labelCosto.setText("Costo:");

        campoCosto.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));

        labelEstado.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        labelEstado.setForeground(new java.awt.Color(255, 255, 255));
        labelEstado.setText("Estado:");

        campoEstado.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        campoEstado.setForeground(new java.awt.Color(102, 0, 0));

        labelPopularidad.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        labelPopularidad.setForeground(new java.awt.Color(255, 255, 255));
        labelPopularidad.setText("Contador \"Me Gusta\":");

        campoPopularidad.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        campoPopularidad.setForeground(new java.awt.Color(102, 0, 0));

        labelComentarios.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        labelComentarios.setForeground(new java.awt.Color(255, 255, 255));
        labelComentarios.setText("COMENTARIOS");

        listaPublicaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listaPublicaciones.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        listaPublicaciones.setLayout(new javax.swing.BoxLayout(listaPublicaciones, javax.swing.BoxLayout.Y_AXIS));
        scrollPanePublicaciones.setViewportView(listaPublicaciones);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(labelTitulo)
                .addContainerGap(200, Short.MAX_VALUE))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(labelComentarios)
                        .addContainerGap())
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelNombre)
                            .addComponent(labelDescripcion)
                            .addComponent(labelCodigo)
                            .addComponent(labelCosto)
                            .addComponent(labelEstado)
                            .addComponent(labelPopularidad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoCosto, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addComponent(campoDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoPopularidad, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addComponent(campoEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                        .addGap(87, 87, 87))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(scrollPanePublicaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        panelPrincipalLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {campoCosto, campoDescripcion, campoEstado, campoNombre});

        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
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
                    .addComponent(labelEstado)
                    .addComponent(campoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoPopularidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPopularidad))
                .addGap(18, 18, 18)
                .addComponent(labelComentarios)
                .addGap(11, 11, 11)
                .addComponent(scrollPanePublicaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        panelPrincipalLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {campoCosto, campoDescripcion, campoEstado, campoNombre});

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
    private javax.swing.JTextField campoCodigo;
    private javax.swing.JTextField campoCosto;
    private javax.swing.JTextField campoDescripcion;
    private javax.swing.JTextField campoEstado;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoPopularidad;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelComentarios;
    private javax.swing.JLabel labelCosto;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPopularidad;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel listaPublicaciones;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JScrollPane scrollPanePublicaciones;
    // End of variables declaration//GEN-END:variables
}
