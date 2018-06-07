package progra03.examen03.administrador.interfaces;

import java.awt.event.MouseListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * @author Beatriz Hernandez
 */
public class InterfazListaCompras extends javax.swing.JFrame {
    // - Atributos -------------------------------------------------------------   
    // - Getters y Setters -----------------------------------------------------

    // - Constructores ---------------------------------------------------------
    public InterfazListaCompras() {
        initComponents();
        tablaCompras.setModel(new DefaultTableModel());
    }

    // - Metodos ---------------------------------------------------------------
    public void agregarColumnaTabla(String nombre) {
        ((DefaultTableModel) tablaCompras.getModel()).addColumn(nombre);
    }

    public void agregarElementoTabla(Object[] fila) {
        ((DefaultTableModel) tablaCompras.getModel()).addRow(fila);
    }

    public void limpiarElementosTablaCompras() {
        int size = tablaCompras.getRowCount() - 1;
        for (int i = size; i >= 0; i--) {
            ((DefaultTableModel) tablaCompras.getModel()).removeRow(i);
        }
    }

    public void agregarListenerSeleccionTablaProductos(MouseListener listener) {
        this.tablaCompras.addMouseListener(listener);
    }

    public JTable getTablaProductos() {
        return tablaCompras;
    }

    public int getFilaProductos() {
        return tablaCompras.getSelectedRow();
    }

    public int getColunmaProductos() {
        return tablaCompras.getSelectedColumn();
    }

    public void setCampoNombreProducto(String texto) {
        this.labelNombreProducto.setText(texto);
    }

    public void setCamporResultado(String texto) {
        this.labelResultado.setText(texto);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        scrollPaneTablaResultados = new javax.swing.JScrollPane();
        tablaCompras = new javax.swing.JTable();
        labelTitulo1 = new javax.swing.JLabel();
        labelNombreProducto = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        labelResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Compras");

        panelPrincipal.setBackground(new java.awt.Color(0, 102, 102));

        tablaCompras.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        tablaCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scrollPaneTablaResultados.setViewportView(tablaCompras);

        labelTitulo1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        labelTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo1.setText("Compras Realizadas");

        labelNombreProducto.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        labelNombreProducto.setForeground(new java.awt.Color(255, 255, 255));

        labelTotal.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        labelTotal.setForeground(new java.awt.Color(255, 255, 255));
        labelTotal.setText("Total de Ventas:");

        labelResultado.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        labelResultado.setForeground(new java.awt.Color(255, 255, 255));
        labelResultado.setText("0");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(labelTotal)
                        .addGap(18, 18, 18)
                        .addComponent(labelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelPrincipalLayout.createSequentialGroup()
                            .addComponent(labelTitulo1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(labelNombreProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                        .addComponent(scrollPaneTablaResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTitulo1))
                .addGap(18, 18, 18)
                .addComponent(scrollPaneTablaResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTotal)
                    .addComponent(labelResultado))
                .addContainerGap(63, Short.MAX_VALUE))
        );

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
    private javax.swing.JLabel labelNombreProducto;
    private javax.swing.JLabel labelResultado;
    private javax.swing.JLabel labelTitulo1;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JScrollPane scrollPaneTablaResultados;
    private javax.swing.JTable tablaCompras;
    // End of variables declaration//GEN-END:variables
}
