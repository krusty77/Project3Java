package progra03.examen03.administrador.interfaces;

import java.awt.event.MouseListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * @author Beatriz Hernandez
 */
public class InterfazConsultarProdCompras extends javax.swing.JFrame {
    // - Atributos -------------------------------------------------------------   
    // - Getters y Setters -----------------------------------------------------

    // - Constructores ---------------------------------------------------------
    public InterfazConsultarProdCompras() {
        initComponents();
        tablaProductos.setModel(new DefaultTableModel());
    }

    // - Metodos ---------------------------------------------------------------
    public void agregarColumnaTabla(String nombre) {
        ((DefaultTableModel) tablaProductos.getModel()).addColumn(nombre);
    }

    public void agregarElementoTabla(Object[] fila) {
        ((DefaultTableModel) tablaProductos.getModel()).addRow(fila);
    }

    public void limpiarElementosTablaProductos() {
        int size = tablaProductos.getRowCount() - 1;
        for (int i = size; i >= 0; i--) {
            ((DefaultTableModel) tablaProductos.getModel()).removeRow(i);
        }
    }

    public void agregarListenerSeleccionTablaProductos(MouseListener listener) {
        this.tablaProductos.addMouseListener(listener);
    }

    public JTable getTablaProductos() {
        return tablaProductos;
    }

    public int getFilaProductos() {
        return tablaProductos.getSelectedRow();
    }

    public int getColunmaProductos() {
        return tablaProductos.getSelectedColumn();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        scrollPaneTablaResultados = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Productos");

        panelPrincipal.setBackground(new java.awt.Color(0, 102, 102));

        labelTitulo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18));
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Lista de Productos");

        tablaProductos.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11));
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scrollPaneTablaResultados.setViewportView(tablaProductos);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(labelTitulo))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollPaneTablaResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPaneTablaResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
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
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JScrollPane scrollPaneTablaResultados;
    private javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables
}
