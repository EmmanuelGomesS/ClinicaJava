/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloConection.ConexaoBD;

/**
 *
 * @author emmanuelgomes
 */
public class TelaPrincipal extends javax.swing.JFrame {
    
    ConexaoBD conecta = new ConexaoBD();
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal(String usuario) {
        initComponents();
        jLabelUsuario.setText(usuario);
        conecta.conexao();
    }

    private TelaPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameBemVindo = new javax.swing.JInternalFrame();
        jPanelInternal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButtonCadMedico = new javax.swing.JButton();
        jButtonCadEnfermeiras = new javax.swing.JButton();
        jButtonCadPacientes = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonAgenda = new javax.swing.JButton();
        jLabelPainelFundo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonFecharBemVindo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelPlanoFundo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItemCadMedico = new javax.swing.JMenuItem();
        jMenuItemCadPaciente = new javax.swing.JMenuItem();
        jMenuItemCadEnfermeira = new javax.swing.JMenuItem();
        jMenuItemCadUsuario = new javax.swing.JMenuItem();
        jMenuRelatórios = new javax.swing.JMenu();
        jMenuFerramentasTelaBemVindo = new javax.swing.JMenu();
        jMenuItemTelaBemVindo = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jInternalFrameBemVindo.setTitle("Bem-Vindo!");
        jInternalFrameBemVindo.setVisible(true);
        jInternalFrameBemVindo.getContentPane().setLayout(null);

        jPanelInternal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelInternal.setLayout(null);

        jLabel2.setText("Cadastros -");
        jPanelInternal.add(jLabel2);
        jLabel2.setBounds(20, 10, 80, 20);

        jButtonCadMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CadMedicos.png"))); // NOI18N
        jButtonCadMedico.setToolTipText("Médicos");
        jButtonCadMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadMedicoActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonCadMedico);
        jButtonCadMedico.setBounds(20, 30, 120, 120);

        jButtonCadEnfermeiras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-infermeira.png"))); // NOI18N
        jButtonCadEnfermeiras.setToolTipText("Enfermeiras");
        jPanelInternal.add(jButtonCadEnfermeiras);
        jButtonCadEnfermeiras.setBounds(150, 30, 120, 120);

        jButtonCadPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadPacientes.png"))); // NOI18N
        jButtonCadPacientes.setToolTipText("Pacientes");
        jPanelInternal.add(jButtonCadPacientes);
        jButtonCadPacientes.setBounds(280, 30, 120, 120);

        jLabel3.setText("Agenda -");
        jPanelInternal.add(jLabel3);
        jLabel3.setBounds(20, 150, 70, 14);

        jButtonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Agenda.png"))); // NOI18N
        jButtonAgenda.setToolTipText("Agendamento");
        jPanelInternal.add(jButtonAgenda);
        jButtonAgenda.setBounds(20, 170, 120, 130);

        jLabelPainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/internalframe.png"))); // NOI18N
        jPanelInternal.add(jLabelPainelFundo);
        jLabelPainelFundo.setBounds(0, 0, 650, 300);

        jInternalFrameBemVindo.getContentPane().add(jPanelInternal);
        jPanelInternal.setBounds(10, 50, 650, 300);

        jLabel1.setText("Sistema de Gerenciamneto de:");
        jInternalFrameBemVindo.getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 20, 200, 14);

        jButtonFecharBemVindo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        jButtonFecharBemVindo.setToolTipText("Fechar Bem-Vindo");
        jButtonFecharBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharBemVindoActionPerformed(evt);
            }
        });
        jInternalFrameBemVindo.getContentPane().add(jButtonFecharBemVindo);
        jButtonFecharBemVindo.setBounds(600, 0, 50, 50);

        getContentPane().add(jInternalFrameBemVindo);
        jInternalFrameBemVindo.setBounds(10, 10, 690, 400);

        jLabel4.setText("Usuário:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 420, 50, 14);

        jLabelUsuario.setText("jLabel5");
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(70, 420, 150, 14);

        jLabelPlanoFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo_telaprincipal.jpg"))); // NOI18N
        getContentPane().add(jLabelPlanoFundo);
        jLabelPlanoFundo.setBounds(0, 0, 730, 440);

        jMenuCadastros.setText("Cadastros");

        jMenuItemCadMedico.setText("Médicos");
        jMenuItemCadMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadMedicoActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadMedico);

        jMenuItemCadPaciente.setText("Pacientes");
        jMenuCadastros.add(jMenuItemCadPaciente);

        jMenuItemCadEnfermeira.setText("Enfermeiras");
        jMenuCadastros.add(jMenuItemCadEnfermeira);

        jMenuItemCadUsuario.setText("Usuários");
        jMenuItemCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadUsuarioActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadUsuario);

        jMenuBar1.add(jMenuCadastros);

        jMenuRelatórios.setText("Relatórios");
        jMenuBar1.add(jMenuRelatórios);

        jMenuFerramentasTelaBemVindo.setText("Ferramentas");

        jMenuItemTelaBemVindo.setText("Tela Bem-Vindo");
        jMenuItemTelaBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTelaBemVindoActionPerformed(evt);
            }
        });
        jMenuFerramentasTelaBemVindo.add(jMenuItemTelaBemVindo);

        jMenuBar1.add(jMenuFerramentasTelaBemVindo);

        jMenuSair.setText("Sair");
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(734, 501));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFecharBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharBemVindoActionPerformed
        jInternalFrameBemVindo.dispose();
    }//GEN-LAST:event_jButtonFecharBemVindoActionPerformed

    private void jMenuItemTelaBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTelaBemVindoActionPerformed
        jInternalFrameBemVindo.setVisible(true);
        //TelaPrincipal tela = new TelaPrincipal();
        //tela.setVisible(true);
        //dispose();
    }//GEN-LAST:event_jMenuItemTelaBemVindoActionPerformed

    private void jMenuItemCadMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadMedicoActionPerformed
        try {
            conecta.executaSql("select *from usuarios where usu_nome='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("usu_tipo").equals("Administrador(a)")){
                FormMedico tela = new FormMedico();
                tela.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Você não possui privilégios para está funcionalidade!\n Contate o administrador do sistema!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Você não possui privilégios para está funcionalidade!\n Contate o administrador do sistema!"+ex);
        }
        
    }//GEN-LAST:event_jMenuItemCadMedicoActionPerformed

    private void jButtonCadMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadMedicoActionPerformed
        try {
            conecta.executaSql("select *from usuarios where usu_nome='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("usu_tipo").equals("Administrador(a)")){
                FormMedico tela = new FormMedico();
                tela.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Você não possui privilégios para está funcionalidade!\n Contate o administrador do sistema!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Você não possui privilégios para está funcionalidade!\n Contate o administrador do sistema!"+ex);
        }
    }//GEN-LAST:event_jButtonCadMedicoActionPerformed

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenuSairMouseClicked

    private void jMenuItemCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadUsuarioActionPerformed
         try {
            conecta.executaSql("select *from usuarios where usu_nome='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("usu_tipo").equals("Administrador(a)")){
                FormUsuario tela = new FormUsuario();
                tela.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Você não possui privilégios para está funcionalidade!\n Contate o administrador do sistema!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Você não possui privilégios para está funcionalidade!\n Contate o administrador do sistema!"+ex);
        }
    }//GEN-LAST:event_jMenuItemCadUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgenda;
    private javax.swing.JButton jButtonCadEnfermeiras;
    private javax.swing.JButton jButtonCadMedico;
    private javax.swing.JButton jButtonCadPacientes;
    private javax.swing.JButton jButtonFecharBemVindo;
    private javax.swing.JInternalFrame jInternalFrameBemVindo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelPainelFundo;
    private javax.swing.JLabel jLabelPlanoFundo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenu jMenuFerramentasTelaBemVindo;
    private javax.swing.JMenuItem jMenuItemCadEnfermeira;
    private javax.swing.JMenuItem jMenuItemCadMedico;
    private javax.swing.JMenuItem jMenuItemCadPaciente;
    private javax.swing.JMenuItem jMenuItemCadUsuario;
    private javax.swing.JMenuItem jMenuItemTelaBemVindo;
    private javax.swing.JMenu jMenuRelatórios;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanelInternal;
    // End of variables declaration//GEN-END:variables
}
