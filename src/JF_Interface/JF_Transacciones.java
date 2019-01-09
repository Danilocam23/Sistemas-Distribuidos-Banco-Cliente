/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JF_Interface;

import banco_cliente.Conectar_Sockets;
import javax.swing.JOptionPane;

/**
 *
 * @author Danilo
 */
public class JF_Transacciones extends javax.swing.JFrame {

    /**
     * Creates new form JF_Transacciones
     */
    public JF_Transacciones() {
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

        bG_transacciones = new javax.swing.ButtonGroup();
        jR_consignacion = new javax.swing.JRadioButton();
        jR_tran_retiro = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jT_tran_numero = new javax.swing.JTextField();
        jT_tran_dinero = new javax.swing.JTextField();
        jB_guardar = new javax.swing.JButton();
        jB_tran_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(358, 359));

        bG_transacciones.add(jR_consignacion);
        jR_consignacion.setSelected(true);
        jR_consignacion.setText("Consignacion");
        jR_consignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jR_consignacionActionPerformed(evt);
            }
        });

        bG_transacciones.add(jR_tran_retiro);
        jR_tran_retiro.setText("Retiro");
        jR_tran_retiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jR_tran_retiroActionPerformed(evt);
            }
        });

        jLabel1.setText("Número de la cuenta");

        jLabel2.setText("Cantidad del dinero");

        jT_tran_dinero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jT_tran_dineroKeyTyped(evt);
            }
        });

        jB_guardar.setText("Guardar");
        jB_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_guardarActionPerformed(evt);
            }
        });

        jB_tran_cancelar.setText("Cancelar");
        jB_tran_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_tran_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jT_tran_numero)
                                    .addComponent(jT_tran_dinero, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jR_consignacion)
                                .addGap(18, 18, 18)
                                .addComponent(jR_tran_retiro)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jB_guardar)
                        .addGap(18, 18, 18)
                        .addComponent(jB_tran_cancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jR_consignacion)
                    .addComponent(jR_tran_retiro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jT_tran_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jT_tran_dinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_guardar)
                    .addComponent(jB_tran_cancelar))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jR_consignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jR_consignacionActionPerformed
        jT_tran_numero.setText("");
        jT_tran_dinero.setText("");
    }//GEN-LAST:event_jR_consignacionActionPerformed

    private void jB_tran_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_tran_cancelarActionPerformed

        jT_tran_numero.setText("");
        jT_tran_dinero.setText("");
        JF_Banco jfb = new JF_Banco();
        jfb.show();
        dispose();
    }//GEN-LAST:event_jB_tran_cancelarActionPerformed

    private void jB_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_guardarActionPerformed

        if (jT_tran_numero.getText().isEmpty()
                || jT_tran_dinero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Uno de los campos esta vacio", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String Operacion;

            if (jR_consignacion.isSelected()) {
                Operacion = "consignacion";
            } else {
                Operacion = "retiro";

            }

            String value
                    = "2,"
                    + Operacion + ","
                    + jT_tran_numero.getText() + ","
                    + jT_tran_dinero.getText();

            Conectar_Sockets cs = new Conectar_Sockets();

            cs.Datos(value);
        }
    }//GEN-LAST:event_jB_guardarActionPerformed

    private void jT_tran_dineroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jT_tran_dineroKeyTyped
        char car = evt.getKeyChar();
        if (Character.isDigit(car)) {

        } else {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_jT_tran_dineroKeyTyped

    private void jR_tran_retiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jR_tran_retiroActionPerformed
        jT_tran_numero.setText("");
        jT_tran_dinero.setText("");
    }//GEN-LAST:event_jR_tran_retiroActionPerformed

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
            java.util.logging.Logger.getLogger(JF_Transacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_Transacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_Transacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_Transacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_Transacciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bG_transacciones;
    private javax.swing.JButton jB_guardar;
    private javax.swing.JButton jB_tran_cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jR_consignacion;
    private javax.swing.JRadioButton jR_tran_retiro;
    private javax.swing.JTextField jT_tran_dinero;
    private javax.swing.JTextField jT_tran_numero;
    // End of variables declaration//GEN-END:variables
}
