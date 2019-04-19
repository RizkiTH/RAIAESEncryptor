/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RAIAESEncryptor_GUI;

import java.awt.Component;
import static java.lang.System.exit;
import javax.swing.JOptionPane;

/**
 *
 * @author Rizki The Hedgeman
 */
public class RAIAESEncryptor_GUI extends javax.swing.JFrame {

    /**
     * Creates new form RAIAESEncryptor_GUI
     */
    public RAIAESEncryptor_GUI() {
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

        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        outputArea = new javax.swing.JTextArea();
        inputLabel = new javax.swing.JLabel();
        keyField = new javax.swing.JTextField();
        keyLabel = new javax.swing.JLabel();
        enkripButton = new javax.swing.JButton();
        dekripButton = new javax.swing.JButton();
        outputLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tipsLabel = new javax.swing.JLabel();
        tipsText = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RAI AES Sysmetric Encryptor");
        setMinimumSize(new java.awt.Dimension(680, 492));
        setPreferredSize(new java.awt.Dimension(680, 492));
        setResizable(false);

        inputArea.setColumns(20);
        inputArea.setLineWrap(true);
        inputArea.setRows(5);
        inputArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(inputArea);

        outputArea.setEditable(false);
        outputArea.setColumns(20);
        outputArea.setLineWrap(true);
        outputArea.setRows(5);
        outputArea.setWrapStyleWord(true);
        jScrollPane2.setViewportView(outputArea);

        inputLabel.setText("Text Buat di-decrypt atau di-encrypt");

        keyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyFieldActionPerformed(evt);
            }
        });

        keyLabel.setText("Kunci Rahasia:");

        enkripButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        enkripButton.setText("ENKRIP");
        enkripButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enkripButtonActionPerformed(evt);
            }
        });

        dekripButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dekripButton.setText("DEKRIP");
        dekripButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dekripButtonActionPerformed(evt);
            }
        });

        outputLabel.setText("Hasil Encrypt atau Decrypt");

        tipsLabel.setText("Tips:");

        tipsText.setText("Gunakan kombinasi kunci keyboard untuk melakukan seleksi text dan mencopy hasil enkripsi di atas.");

        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(outputLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(keyLabel)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tipsLabel)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(enkripButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(dekripButton, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(9, 9, 9)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(keyField, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tipsText, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(inputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(keyLabel)
                .addGap(4, 4, 4)
                .addComponent(keyField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enkripButton)
                    .addComponent(dekripButton)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipsText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void keyFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keyFieldActionPerformed

    private void dekripButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dekripButtonActionPerformed
        // TODO add your handling code here:
        try{
            //cek apakah kotak isian ada yang kosong
            if (keyField.getText().trim().isEmpty() && inputArea.getText().trim().isEmpty()){
                Component frame = null;
                JOptionPane.showMessageDialog(frame, "Isikan teks yang mau dienkrip atau didekrip dan isikan kata kunci rahasianya.", "Coba perhatikan", JOptionPane.ERROR_MESSAGE);
                throw new RuntimeException("");
            }else if(keyField.getText().trim().isEmpty()){
                Component frame = null;
                JOptionPane.showMessageDialog(frame, "Kata kunci Rahasia harus diisi.", "Perhatikan kembali", JOptionPane.WARNING_MESSAGE);
//                logField.setText("Kata Kunci Harus Diisi!!!");
                throw new RuntimeException("");
            } else if (inputArea.getText().trim().isEmpty()){
                Component frame = null;
                JOptionPane.showMessageDialog(frame, "Masukkan teks yang mau dienkrip atau didekrip.", "Perhatikan kembali", JOptionPane.WARNING_MESSAGE);
                throw new RuntimeException("");
            }
            
            //hapus hasil yang masih ada
            outputArea.setText("");

            //ambil inputan dari inputArea
            String originalText = inputArea.getText();

            //ambil kunci yang diinput oleh user
            String key = keyField.getText();

            //tes apakah kunci dan kata-kata berhasil diinput
            //System.out.println(originalText);
            //System.out.println(key);
            
            //lakukan proses dekrip
            String decryptedText = AES.decrypt(originalText, key);
            
            //taruh hasilnya pada outputArea
            outputArea.setText(decryptedText);
        }catch (RuntimeException e){
            
        }
    }//GEN-LAST:event_dekripButtonActionPerformed

    private void enkripButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enkripButtonActionPerformed
        // TODO add your handling code here:
        
        try{
            //cek apakah kotak isian ada yang kosong
            if (keyField.getText().trim().isEmpty() && inputArea.getText().trim().isEmpty()){
                Component frame = null;
                JOptionPane.showMessageDialog(frame, "Isikan teks yang mau dienkrip atau didekrip dan isikan kata kunci rahasianya.", "Coba perhatikan", JOptionPane.ERROR_MESSAGE);
                throw new RuntimeException("");
            }else if(keyField.getText().trim().isEmpty()){
                Component frame = null;
                JOptionPane.showMessageDialog(frame, "Kata kunci Rahasia harus diisi.", "Perhatikan kembali", JOptionPane.WARNING_MESSAGE);
//                logField.setText("Kata Kunci Harus Diisi!!!");
                throw new RuntimeException("");
            } else if (inputArea.getText().trim().isEmpty()){
                Component frame = null;
                JOptionPane.showMessageDialog(frame, "Masukkan teks yang mau dienkrip atau didekrip.", "Perhatikan kembali", JOptionPane.WARNING_MESSAGE);
                throw new RuntimeException("");
            }

            //hapus hasil yang masih ada
            outputArea.setText("");

            //ambil inputan dari inputArea
            String originalText = inputArea.getText();

            //ambil kunci yang diinput oleh user
            String key = keyField.getText();

            //tes apakah kunci dan kata-kata berhasil diinput
            //System.out.println(originalText);
            //System.out.println(key);
            
            //lakukan proses enkripsi
            String encryptedText = AES.encrypt(originalText, key);
            
            //taruh hasilnya pada outputArea
            outputArea.setText(encryptedText);
            
//            //buat tips pada tips text
//            tipsText.setText("");
        }
        catch (RuntimeException exc){
//            inputArea.setText("");
        }
    }//GEN-LAST:event_enkripButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //lakukan penghapusan nilai pada seluruh kotak input
        inputArea.setText("");
        outputArea.setText("");
        keyField.setText("");
        Component frame = null;
                JOptionPane.showMessageDialog(frame, "Form berhasil di-reset.", "", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(RAIAESEncryptor_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RAIAESEncryptor_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RAIAESEncryptor_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RAIAESEncryptor_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RAIAESEncryptor_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dekripButton;
    private javax.swing.JButton enkripButton;
    private javax.swing.JTextArea inputArea;
    private javax.swing.JLabel inputLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField keyField;
    private javax.swing.JLabel keyLabel;
    private javax.swing.JTextArea outputArea;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JLabel tipsLabel;
    private javax.swing.JLabel tipsText;
    // End of variables declaration//GEN-END:variables
}
