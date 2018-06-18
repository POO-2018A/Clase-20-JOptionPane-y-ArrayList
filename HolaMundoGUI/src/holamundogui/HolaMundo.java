/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundogui;

import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JOptionPane;

/**
 *
 * @author chalosalvador
 */
public class HolaMundo extends javax.swing.JFrame {

    
    ArrayList list = new ArrayList();
    
    
    /**
     * Creates new form HolaMundo
     */
    public HolaMundo() {
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

        lblTexto = new javax.swing.JLabel();
        txtTexto = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtItems = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTexto.setText("Ingrese el texto:");

        txtTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTextoActionPerformed(evt);
            }
        });

        btnOK.setText("Añadir a la lista");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        txtItems.setColumns(20);
        txtItems.setRows(5);
        jScrollPane1.setViewportView(txtItems);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lblTexto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOK)
                            .addComponent(txtTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTexto)
                    .addComponent(txtTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnOK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTextoActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        
        int option = JOptionPane.showConfirmDialog(rootPane, "Está seguro?", "Confimación", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        
        if(option == 0) {
            String txt = txtTexto.getText();
            this.list.add(txt);
            JOptionPane.showMessageDialog(rootPane, "El item se añadió a la lista satisfactoriamente.");
            
            for(Object item : list) {
                txtItems.setText(txtItems.getText() + '\n'+ (String)item);                
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "El item no se ha añadido a la lista.");
        }
        
        
//        JOptionPane.showInputDialog("Ingrese el mensaje: ");
//        
//        String op[] = new String[4];
//        op[0]= "Futbol";
//        op[1]= "Tenis";
//        op[2]= "Basquet";
//        op[3]= "Natación";
//        int se = JOptionPane.showOptionDialog(rootPane, "Seleccione su deporte favorito", "Deportes", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, op, op[2]);
//        System.out.println("Seleccionó: " + se);
//        
//        switch(se) {
//            case 0:
//                
//        }
    }//GEN-LAST:event_btnOKActionPerformed

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
            java.util.logging.Logger.getLogger(HolaMundo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HolaMundo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HolaMundo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HolaMundo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HolaMundo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JTextArea txtItems;
    private javax.swing.JTextField txtTexto;
    // End of variables declaration//GEN-END:variables
}
