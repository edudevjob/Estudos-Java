/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.JOptionPane;

/**
 *
 * @author edudeveloper
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1User = new javax.swing.JTextField();
        jPasswordField1Pass = new javax.swing.JPasswordField();
        jLabel2Pass = new javax.swing.JLabel();
        jLabel1User = new javax.swing.JLabel();
        jButtonAcessar = new javax.swing.JButton();
        jButton1Cancelar = new javax.swing.JButton();
        jLabelFundoLogin = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/EA.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 110, 50, 50);

        jTextField1User.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1User.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTextField1User.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField1User);
        jTextField1User.setBounds(190, 160, 250, 30);

        jPasswordField1Pass.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordField1Pass.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jPasswordField1Pass);
        jPasswordField1Pass.setBounds(190, 210, 250, 30);

        jLabel2Pass.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2Pass.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2Pass.setText("Senha:");
        getContentPane().add(jLabel2Pass);
        jLabel2Pass.setBounds(290, 190, 70, 17);

        jLabel1User.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1User.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1User.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1User.setText("Usuário:");
        getContentPane().add(jLabel1User);
        jLabel1User.setBounds(280, 140, 80, 17);

        jButtonAcessar.setText("Acessar");
        jButtonAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessar);
        jButtonAcessar.setBounds(190, 254, 110, 30);

        jButton1Cancelar.setText("Sair");
        jButton1Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Cancelar);
        jButton1Cancelar.setBounds(320, 254, 120, 30);

        jLabelFundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bg.png"))); // NOI18N
        getContentPane().add(jLabelFundoLogin);
        jLabelFundoLogin.setBounds(0, 0, 456, 290);

        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(320, 140, 9, 23);

        setSize(new java.awt.Dimension(466, 321));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarActionPerformed
        if(jTextField1User.getText().equals("admin")&& jPasswordField1Pass.getText().equals("123")){
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        dispose();    
        }else{
            JOptionPane.showMessageDialog(rootPane, "Senha ou Usuário Inválidos");
        }
        
    }//GEN-LAST:event_jButtonAcessarActionPerformed

    private void jButton1CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1CancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1CancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Cancelar;
    private javax.swing.JButton jButtonAcessar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1User;
    private javax.swing.JLabel jLabel2Pass;
    private javax.swing.JLabel jLabelFundoLogin;
    private javax.swing.JPasswordField jPasswordField1Pass;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1User;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
