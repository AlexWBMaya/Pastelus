/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import java.util.List;
import classes.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alek
 */
public class Visão extends javax.swing.JFrame {

    /**
     * Creates new form Visão
     */
    public Visão() {
        initComponents();
        filePathField.setEnabled(false);
        carregarContatosDoArquivo(); // Carregar contatos ao iniciar
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        scrollbar1 = new java.awt.Scrollbar();
        jLabel1 = new javax.swing.JLabel();
        FileChooser = new javax.swing.JButton();
        filePathField = new javax.swing.JTextField();
        BotaoInserirContato = new javax.swing.JButton();
        textFieldNomeCompleto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textFieldEmail = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaPrincipal = new javax.swing.JTable();
        formattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        botaoExcluirContato = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        botaoAlterar = new javax.swing.JButton();
        botaoPDF = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textFieldLogradouro = new javax.swing.JTextField();
        textFieldNumeroEndereco = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textFieldCep = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textFieldCidadeEstado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        textFieldConsulta = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        textField_complemento = new javax.swing.JTextField();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gerenciador de contatos 2000");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        FileChooser.setText("EscolherArquivo");
        FileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileChooserActionPerformed(evt);
            }
        });

        filePathField.setEditable(false);
        filePathField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        filePathField.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                filePathFieldComponentHidden(evt);
            }
        });
        filePathField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filePathFieldActionPerformed(evt);
            }
        });

        BotaoInserirContato.setText("Inserir Contato");
        BotaoInserirContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoInserirContatoActionPerformed(evt);
            }
        });

        textFieldNomeCompleto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setText("Nome Completo");

        jLabel5.setText("Telefone");

        jLabel6.setText("Email");

        textFieldEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tabelaPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Completo", "Email", "Telefone", "Endereço", "Cep/CidadeEstado"
            }
        ));
        tabelaPrincipal.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tabelaPrincipal.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaPrincipal.setShowGrid(true);
        jScrollPane2.setViewportView(tabelaPrincipal);

        try {
            formattedTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+### (##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        formattedTextFieldTelefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        formattedTextFieldTelefone.setText("+000 (00) 00000-0000");

        botaoExcluirContato.setText("Excluir");
        botaoExcluirContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirContatoActionPerformed(evt);
            }
        });

        jButton2.setText("Consultar");

        botaoAlterar.setText("Alterar");

        botaoPDF.setText("PDF");

        jLabel3.setText("Endereço");

        jLabel4.setText("Logradouro");

        textFieldLogradouro.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setText("Número");

        jLabel8.setText("CEP");

        textFieldCidadeEstado.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel9.setText("Cidade/Estado");

        textFieldConsulta.setText("jTextField5");

        jLabel10.setText("complemento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(260, 260, 260))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(textFieldNomeCompleto, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                            .addComponent(formattedTextFieldTelefone)
                                            .addComponent(textFieldEmail)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(114, 114, 114)
                                        .addComponent(jLabel5)))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(textFieldNumeroEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textField_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textFieldCidadeEstado)
                            .addComponent(textFieldLogradouro))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(filePathField)
                            .addComponent(textFieldConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(FileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(38, 38, 38))))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoExcluirContato, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoInserirContato, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(FileChooser)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filePathField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(textFieldLogradouro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldNumeroEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(textFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldCidadeEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotaoInserirContato, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoExcluirContato, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183)
                        .addComponent(botaoPDF))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileChooserActionPerformed
        // TODO add your handling code here:
        if (jFileChooser1.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jFileChooser1.getSelectedFile();
            filePathField.setText(selectedFile.getAbsolutePath());
            carregarContatosDoArquivo();
        }
    }//GEN-LAST:event_FileChooserActionPerformed

    private void filePathFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filePathFieldActionPerformed
        // TODO add your handling code here:        
    }//GEN-LAST:event_filePathFieldActionPerformed

    private void filePathFieldComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_filePathFieldComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_filePathFieldComponentHidden

    private void BotaoInserirContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoInserirContatoActionPerformed
      // TODO add your handling code here:
        try {
            String nomeCompleto = textFieldNomeCompleto.getText().trim();
            String telefone = formattedTextFieldTelefone.getText().trim();
            String email = textFieldEmail.getText().trim();
            String logradouro = textFieldLogradouro.getText().trim();
            int numeroEndereco = Integer.parseInt(textFieldNumeroEndereco.getText().trim());
            String cep = textFieldCep.getText().trim();
            String cidadeEstado = textFieldCidadeEstado.getText().trim();
            String complemento = textField_complemento.getText().trim();

            // Validation
            if (nomeCompleto.isEmpty() || telefone.isEmpty() || email.isEmpty() ||
                logradouro.isEmpty() || cep.isEmpty() || cidadeEstado.isEmpty()) {
                JOptionPane.showMessageDialog(this, "All fields except complemento are required.");
                return;
            }

            // Add new contact
            Contato contato = new Contato(nomeCompleto, telefone, email, logradouro, numeroEndereco, cep, cidadeEstado, complemento);
            FileManager.escreverContatoEmArquivo(filePathField.getText(), contato);
            carregarContatosDoArquivo();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid number format for address number.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_BotaoInserirContatoActionPerformed

    private void botaoExcluirContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirContatoActionPerformed
        // TODO add your handling code here:
        int selectedRow = tabelaPrincipal.getSelectedRow();
        if (selectedRow >= 0) {
            String nomeCompleto = (String) tabelaPrincipal.getValueAt(selectedRow, 0);
            FileManager.removerContatoDoArquivo(filePathField.getText(), nomeCompleto);
            carregarContatosDoArquivo(); // Refresh the table after removing the contact
        } else {
            JOptionPane.showMessageDialog(this, "No contact selected to delete.");
        }
    }//GEN-LAST:event_botaoExcluirContatoActionPerformed
        
    private void carregarContatosDoArquivo() {
        try {
            DefaultTableModel model = (DefaultTableModel) tabelaPrincipal.getModel();
            model.setRowCount(0); // Clear existing data

            List<Contato> contatos = FileManager.lerContatosDoArquivo(filePathField.getText());
            for (Contato contato : contatos) {
                model.addRow(new Object[]{
                    contato.getNomeCompleto(),
                    contato.getEmail(),
                    contato.getTelefone(),
                    contato.getEndereco().getLogradouro() + " " + contato.getEndereco().getComplemento() + " " + contato.getEndereco().getNumero(),
                    contato.getEndereco().getCep() + " " + contato.getCidadeEstado()
                });
            }
        } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error loading contacts: " + ex.getMessage());
        }
    }
    
    private void adicionarContatoNaTabela(Contato contato) {
        DefaultTableModel model = (DefaultTableModel) tabelaPrincipal.getModel();
        String endereco = contato.getEndereco().toString();
        model.addRow(new Object[]{contato.getNomeCompleto(), contato.getTelefone(), contato.getEmail(), endereco});
    }
    
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
            java.util.logging.Logger.getLogger(Visão.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visão.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visão.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visão.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Visão().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoInserirContato;
    private javax.swing.JButton FileChooser;
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoExcluirContato;
    private javax.swing.JButton botaoPDF;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField filePathField;
    private javax.swing.JFormattedTextField formattedTextFieldTelefone;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private java.awt.Scrollbar scrollbar1;
    private javax.swing.JTable tabelaPrincipal;
    private javax.swing.JTextField textFieldCep;
    private javax.swing.JTextField textFieldCidadeEstado;
    private javax.swing.JTextField textFieldConsulta;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldLogradouro;
    private javax.swing.JTextField textFieldNomeCompleto;
    private javax.swing.JTextField textFieldNumeroEndereco;
    private javax.swing.JTextField textField_complemento;
    // End of variables declaration//GEN-END:variables

    private String toString(java.util.List<Contato> readFromFile) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
