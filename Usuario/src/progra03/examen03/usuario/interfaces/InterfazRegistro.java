package progra03.examen03.usuario.interfaces;

import java.awt.event.ActionListener;
import javax.swing.JComboBox;

/** 
 * @author Beatriz Hernandez
 */
public class InterfazRegistro extends javax.swing.JFrame {

    // - Atributos -------------------------------------------------------------   
    // - Getters y Setters -----------------------------------------------------
    public String getCampoCorreo() {
        return campoCorreo.getText();
    }

    public String getCampoNombre() {
        return campoNombre.getText();
    }

    public char[] getCampoPassword() {
        return campoPassword.getPassword();
    }

    public String getCampoTelefono() {
        return campoTelefonos.getText();
    }

    public String getCampoUsuario() {
        return campoUsuario.getText();
    }

    public String getCampoPais() {
        return (String.valueOf(cboPais.getSelectedItem()));
    }

    public void setCampoCorreo(String texto) {
        this.campoCorreo.setText(texto);
    }

    public void setCampoNombre(String texto) {
        this.campoNombre.setText(texto);
    }

    public void setCampoPassword(String texto) {
        this.campoPassword.setText(texto);
    }

    public void setCampoTelefonos(String texto) {
        this.campoTelefonos.setText(texto);
    }

    public void setCampoUsuario(String texto) {
        this.campoUsuario.setText(texto);
    }

    // - Constructores ---------------------------------------------------------
    public InterfazRegistro() {
        initComponents();
    }

    // - Metodos ---------------------------------------------------------------
    public void agregarListenerBotonRegistrarse(ActionListener listener) {
        this.botonRegistrarse.addActionListener(listener);
    }

    public void limpiarCampos() {
        setCampoCorreo("");
        setCampoNombre("");
        setCampoPassword("");
        setCampoTelefonos("");
        setCampoUsuario("");
        cboPais.setSelectedIndex(0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        labelUsuario = new javax.swing.JLabel();
        campoUsuario = new javax.swing.JTextField();
        labelPassword = new javax.swing.JLabel();
        campoPassword = new javax.swing.JPasswordField();
        labelPais = new javax.swing.JLabel();
        cboPais = new javax.swing.JComboBox();
        labelCorreo = new javax.swing.JLabel();
        campoCorreo = new javax.swing.JTextField();
        labelTelefonos = new javax.swing.JLabel();
        campoTelefonos = new javax.swing.JTextField();
        botonRegistrarse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro Usuario");
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(0, 102, 102));

        labelTitulo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Registro Usuario");

        labelNombre.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(255, 255, 255));
        labelNombre.setText("Nombre Completo:");

        campoNombre.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N

        labelUsuario.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelUsuario.setText("Cuenta de Usuario:");

        campoUsuario.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N

        labelPassword.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        labelPassword.setForeground(new java.awt.Color(255, 255, 255));
        labelPassword.setText("Password:");

        campoPassword.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        labelPais.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        labelPais.setForeground(new java.awt.Color(255, 255, 255));
        labelPais.setText("País:");

        cboPais.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14));
        cboPais.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Costa Rica", "Canada", "Chile", "Argentina", "Nicaragua", "Japon", "Panama", "China", "Francia", "España", "Holanda" }));

        labelCorreo.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        labelCorreo.setForeground(new java.awt.Color(255, 255, 255));
        labelCorreo.setText("Correo Electronico");

        campoCorreo.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        campoCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCorreoActionPerformed(evt);
            }
        });

        labelTelefonos.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        labelTelefonos.setForeground(new java.awt.Color(255, 255, 255));
        labelTelefonos.setText("Telefonos");

        campoTelefonos.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));

        botonRegistrarse.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        botonRegistrarse.setText("Registrarse");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonRegistrarse))
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                            .addGap(136, 136, 136)
                            .addComponent(labelTitulo)
                            .addGap(96, 96, 96))
                        .addGroup(panelPrincipalLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(labelNombre)
                                .addComponent(labelUsuario)
                                .addComponent(labelPassword)
                                .addComponent(labelPais)
                                .addComponent(labelCorreo)
                                .addComponent(labelTelefonos))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cboPais, 0, 238, Short.MAX_VALUE)
                                .addComponent(campoCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                .addComponent(campoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                .addComponent(campoPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                .addComponent(campoTelefonos, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(26, 26, 26))
        );

        panelPrincipalLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {campoCorreo, campoNombre, campoPassword, campoTelefonos, campoUsuario});

        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsuario)
                    .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPassword)
                    .addComponent(campoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPais)
                    .addComponent(cboPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCorreo)
                    .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTelefonos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTelefonos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonRegistrarse)
                .addGap(20, 20, 20))
        );

        panelPrincipalLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {campoCorreo, campoNombre, campoPassword, campoTelefonos, campoUsuario});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void campoCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCorreoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_campoCorreoActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegistrarse;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JPasswordField campoPassword;
    private javax.swing.JTextField campoTelefonos;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JComboBox cboPais;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPais;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelTelefonos;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
