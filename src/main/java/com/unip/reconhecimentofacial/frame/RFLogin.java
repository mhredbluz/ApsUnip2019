
package com.unip.reconhecimentofacial.frame;

import com.unip.reconhecimentofacial.frame.cadastrar.RegistraPessoa;

public class RFLogin extends javax.swing.JFrame {

    public RFLogin() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        bt_Cancelar = new javax.swing.JButton();
        bt_Cadastrar = new javax.swing.JButton();
        bt_Entrar = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de Autorização - Login");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -40, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(37, 112, 112));
        jLabel2.setText("Sistema de Segurança");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 290, 30));

        bt_Cancelar.setBackground(new java.awt.Color(255, 51, 51));
        bt_Cancelar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt_Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        bt_Cancelar.setText("Cancelar");
        bt_Cancelar.setContentAreaFilled(false);
        bt_Cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        bt_Cancelar.setOpaque(true);
        jPanel2.add(bt_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 170, 110));

        bt_Cadastrar.setBackground(new java.awt.Color(255, 153, 0));
        bt_Cadastrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt_Cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        bt_Cadastrar.setText("Cadastrar");
        bt_Cadastrar.setContentAreaFilled(false);
        bt_Cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        bt_Cadastrar.setFocusable(false);
        bt_Cadastrar.setOpaque(true);
        bt_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CadastrarActionPerformed(evt);
            }
        });
        jPanel2.add(bt_Cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 170, 110));

        bt_Entrar.setBackground(new java.awt.Color(0, 204, 51));
        bt_Entrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt_Entrar.setForeground(new java.awt.Color(255, 255, 255));
        bt_Entrar.setText("Entrar");
        bt_Entrar.setContentAreaFilled(false);
        bt_Entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        bt_Entrar.setOpaque(true);
        bt_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_EntrarActionPerformed(evt);
            }
        });
        jPanel2.add(bt_Entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 170, 110));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 590, 390));

        setSize(new java.awt.Dimension(590, 414));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CadastrarActionPerformed
        new RegistraPessoa().setVisible(true);
    }//GEN-LAST:event_bt_CadastrarActionPerformed

    private void bt_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_EntrarActionPerformed
        new Entrar().setVisible(true);
    }//GEN-LAST:event_bt_EntrarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RFLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Cadastrar;
    private javax.swing.JButton bt_Cancelar;
    private javax.swing.JButton bt_Entrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
