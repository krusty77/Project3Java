package progra03.examen03.usuario.interfaces;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
        inicializarListenerLabelRegistro();
    }

    // - Metodos ---------------------------------------------------------------
    public void agregarListenerBotonLogin(ActionListener listener) {
        this.botonLogin.addActionListener(listener);
    }

    public void agregarListenerLabelRegistro(MouseListener listener) {
        this.labelRegistro.addMouseListener(listener);
    }

    private void inicializarListenerLabelRegistro() {
        this.labelRegistro.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                labelRegistro.setForeground(Color.BLUE);
                labelRegistro.setCursor(new Cursor(Cursor.HAND_CURSOR));
                super.mouseEntered(e);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                labelRegistro.setForeground(Color.WHITE);
                labelRegistro.setCursor(new Cursor(Cursor.HAND_CURSOR));
                super.mouseExited(e);
            }
        });
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
        labelRegistro = new javax.swing.JLabel();
        botonLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Usuario Login");
        setLocationByPlatform(true);
        setName("Login"); // NOI18N
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(0, 102, 102));

        labelTitulo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Sistema Usuario");

        labelUsuario.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelUsuario.setText("Usuario:");

        labelPassword.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        labelPassword.setForeground(new java.awt.Color(255, 255, 255));
        labelPassword.setText("Password:");

        campoUsuario.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N

        campoPassword.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N

        labelRegistro.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        labelRegistro.setForeground(new java.awt.Color(255, 255, 255));
        labelRegistro.setText("Registro de Usuarios");

        botonLogin.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
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
                        .addComponent(labelRegistro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonLogin))
                    .addComponent(campoUsuario)
                    .addComponent(campoPassword))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(labelTitulo)
                .addGap(77, 77, 77))
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
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRegistro)
                    .addComponent(botonLogin))
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
    private javax.swing.JLabel labelRegistro;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
