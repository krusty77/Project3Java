package progra03.examen03.administrador.interfaces;

import java.awt.event.ActionListener;

/**
 * @author Beatriz Hernandez
 */
public class InterfazLogin extends javax.swing.JFrame {
    // - Atributos -------------------------------------------------------------   

    // - Getters y Setters -----------------------------------------------------
    public String getCampoUsuario() {
        return this.campoUsuario.getText();
    }

    public char[] getCampoClave() {
        return this.campoPassword.getPassword();
    }

    public void setCampoUsuario(String campo) {
        this.campoUsuario.setText(campo);
    }

    public void setCampoPassword(String campo) {
        this.campoPassword.setText(campo);
    }

    // - Constructores ---------------------------------------------------------
    public InterfazLogin() {
        initComponents();
    }

    // - Metodos ---------------------------------------------------------------
    public void agregarListenerBotonLogin(ActionListener listener) {
        this.botonLogin.addActionListener(listener);
    }

    public void limpiarCampos() {
        setCampoUsuario("");
        setCampoPassword("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        campoUsuario = new javax.swing.JTextField();
        campoPassword = new javax.swing.JPasswordField();
        botonLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador Login");
        setLocationByPlatform(true);
        setName("Login"); // NOI18N
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(0, 102, 102));

        labelTitulo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18));
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Sistema Admistrador");

        labelUsuario.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        labelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelUsuario.setText("Usuario:");

        labelPassword.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        labelPassword.setForeground(new java.awt.Color(255, 255, 255));
        labelPassword.setText("Password:");

        campoUsuario.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N

        campoPassword.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N

        botonLogin.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12));
        botonLogin.setText("Login");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelUsuario, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(botonLogin))
                    .addComponent(campoUsuario)
                    .addComponent(campoPassword))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(labelTitulo)
                .addGap(85, 85, 85))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsuario)
                    .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPassword)
                    .addComponent(campoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPrincipalLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {campoPassword, campoUsuario});

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
    private javax.swing.JButton botonLogin;
    private javax.swing.JPasswordField campoPassword;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
