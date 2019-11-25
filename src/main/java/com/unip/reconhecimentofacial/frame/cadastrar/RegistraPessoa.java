package com.unip.reconhecimentofacial.frame.cadastrar;

import util.ConectaBanco;
import util.PessoaControl;
import util.PessoaModel;

public class RegistraPessoa extends javax.swing.JFrame {
    
    
    PessoaControl pc;
    PessoaModel pm;
    ConectaBanco conecta = new ConectaBanco();
    public RegistraPessoa() {
        initComponents();
        showIdUsuario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txt_id_label = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txt_Nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_Telefone = new javax.swing.JTextField();
        txt_Sobrenome = new javax.swing.JTextField();
        txt_Email = new javax.swing.JTextField();
        bt_Salvar = new javax.swing.JButton();
        bt_Anexar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de Segurança - Cadastro");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txt_id_label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_id_label.setForeground(new java.awt.Color(100, 100, 100));
        txt_id_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_id_label.setText("1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_id_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txt_id_label, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 390, 70));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NomeActionPerformed(evt);
            }
        });
        jPanel3.add(txt_Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 180, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(100, 100, 100));
        jLabel2.setText("Telefone:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(100, 100, 100));
        jLabel3.setText("Nome ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(100, 100, 100));
        jLabel4.setText("Sobrenome ");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 130, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(100, 100, 100));
        jLabel5.setText("Email:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 80, -1));
        jPanel3.add(txt_Telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 190, -1));
        jPanel3.add(txt_Sobrenome, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 190, -1));
        jPanel3.add(txt_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 180, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 410, 120));

        bt_Salvar.setBackground(new java.awt.Color(60, 207, 127));
        bt_Salvar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt_Salvar.setForeground(new java.awt.Color(255, 255, 255));
        bt_Salvar.setText("Salvar");
        bt_Salvar.setContentAreaFilled(false);
        bt_Salvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_Salvar.setOpaque(true);
        bt_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_SalvarActionPerformed(evt);
            }
        });
        jPanel1.add(bt_Salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 140, 40));

        bt_Anexar.setBackground(new java.awt.Color(0, 153, 153));
        bt_Anexar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_Anexar.setForeground(new java.awt.Color(255, 255, 255));
        bt_Anexar.setText("Anexar Biometria");
        bt_Anexar.setContentAreaFilled(false);
        bt_Anexar.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        bt_Anexar.setOpaque(true);
        bt_Anexar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AnexarActionPerformed(evt);
            }
        });
        jPanel1.add(bt_Anexar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        setBounds(0, 0, 428, 423);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_SalvarActionPerformed
              
        txt_Nome.setText(pm.getNome());
        txt_Sobrenome.setText(pm.getSobrenome());
        txt_Email.setText(pm.getEmail());
        //txt_Telefone.setText(pm.setTelefone());
        
    }//GEN-LAST:event_bt_SalvarActionPerformed

    private void bt_AnexarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AnexarActionPerformed
    }//GEN-LAST:event_bt_AnexarActionPerformed

    private void txt_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NomeActionPerformed
    }//GEN-LAST:event_txt_NomeActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistraPessoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Anexar;
    private javax.swing.JButton bt_Salvar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_Nome;
    private javax.swing.JTextField txt_Sobrenome;
    private javax.swing.JTextField txt_Telefone;
    private javax.swing.JLabel txt_id_label;
    // End of variables declaration//GEN-END:variables

    private void showIdUsuario() {
        conecta.conecta();
        try{
            conecta.executaPostegres("SELECT * FROM pessoa ");
            conecta.rs.first();
            txt_id_label.setText(String.valueOf(conecta.rs.getInt("id")));
            int id = Integer.parseInt(txt_id_label.getText());
            id++;
            txt_id_label.setText(String.valueOf("id"));
        }catch(Exception e){
            
        }
    }
}
