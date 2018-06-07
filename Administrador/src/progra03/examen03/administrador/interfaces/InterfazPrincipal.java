package progra03.examen03.administrador.interfaces;

import java.awt.event.ActionListener;

/**
 * @author Beatriz Hernandez
 */
public class InterfazPrincipal extends javax.swing.JFrame {
    // - Atributos -------------------------------------------------------------   

    // - Getters y Setters -----------------------------------------------------
    // - Constructores ---------------------------------------------------------
    public InterfazPrincipal() {
        initComponents();
    }

    // - Metodos ---------------------------------------------------------------
    public void agregarListenerBotonAgregarProducto(ActionListener listener) {
        this.botonAgregarProducto.addActionListener(listener);
    }

    public void agregarListenerBotonConsultarProducto(ActionListener listener) {
        this.botonConsultarProductos.addActionListener(listener);
    }

    public void agregarListenerBotonConsultarCompras(ActionListener listener) {
        this.botonConsultarCompras.addActionListener(listener);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        botonAgregarProducto = new javax.swing.JButton();
        botonConsultarProductos = new javax.swing.JButton();
        botonConsultarCompras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Principal");
        setLocationByPlatform(true);
        setName("Login"); // NOI18N
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(0, 102, 102));

        labelTitulo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18));
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Sistema Admistrador");

        botonAgregarProducto.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        botonAgregarProducto.setText("Agregar Producto");

        botonConsultarProductos.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        botonConsultarProductos.setText("Consultar Prodcutos");

        botonConsultarCompras.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        botonConsultarCompras.setText("Consultar Compras");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap(85, Short.MAX_VALUE)
                        .addComponent(labelTitulo))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonConsultarCompras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(botonAgregarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(botonConsultarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))))
                .addGap(85, 85, 85))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addComponent(botonAgregarProducto)
                .addGap(16, 16, 16)
                .addComponent(botonConsultarProductos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonConsultarCompras)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarProducto;
    private javax.swing.JButton botonConsultarCompras;
    private javax.swing.JButton botonConsultarProductos;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
