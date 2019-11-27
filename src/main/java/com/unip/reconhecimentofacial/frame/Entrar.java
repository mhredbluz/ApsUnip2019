package com.unip.reconhecimentofacial.frame;

import java.io.File;
import javax.swing.JFileChooser;

public class Entrar extends javax.swing.JFrame {

    public Entrar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txt_Digital = new javax.swing.JTextField();
        bt_ImpDig = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bt_Logar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txt_Digital.setText("arquivo ...");

        bt_ImpDig.setBackground(new java.awt.Color(255, 51, 51));
        bt_ImpDig.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt_ImpDig.setForeground(new java.awt.Color(255, 255, 255));
        bt_ImpDig.setText("Impressão Digital");
        bt_ImpDig.setContentAreaFilled(false);
        bt_ImpDig.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        bt_ImpDig.setOpaque(true);
        bt_ImpDig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ImpDigActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Entre com sua digital !!!");

        bt_Logar.setBackground(new java.awt.Color(153, 153, 153));
        bt_Logar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt_Logar.setForeground(new java.awt.Color(255, 255, 255));
        bt_Logar.setText("Confirmar");
        bt_Logar.setContentAreaFilled(false);
        bt_Logar.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        bt_Logar.setOpaque(true);
        bt_Logar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_LogarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_ImpDig)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_Digital, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(bt_Logar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_ImpDig, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Digital, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(bt_Logar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_ImpDigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ImpDigActionPerformed
        JFileChooser arquivo = new JFileChooser();
        arquivo.setDialogTitle("Anexar Digital");
        arquivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        int opc = arquivo.showOpenDialog(this);
        if(opc == JFileChooser.APPROVE_OPTION){
            File file = new File("Caminho");
            file = arquivo.getSelectedFile(); // recebe o caminho
            
            String filename = file.getAbsolutePath();   
            txt_Digital.setText(filename);
        }    
    }//GEN-LAST:event_bt_ImpDigActionPerformed

    private void bt_LogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_LogarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_LogarActionPerformed
        
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_ImpDig;
    private javax.swing.JButton bt_Logar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_Digital;
    // End of variables declaration//GEN-END:variables
}
