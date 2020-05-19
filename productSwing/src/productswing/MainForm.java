/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productswing;

import javax.swing.JFrame;

/**
 *
 * @author minh
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
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

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemClients = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemRooms = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemResservations = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 661, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 254, 250));
        jMenuBar1.setForeground(new java.awt.Color(214, 204, 183));
        jMenuBar1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N

        jMenu1.setForeground(new java.awt.Color(11, 9, 6));
        jMenu1.setText("Manage >");
        jMenu1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

        jMenuItemClients.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jMenuItemClients.setForeground(new java.awt.Color(4, 3, 2));
        jMenuItemClients.setText("Clients");
        jMenuItemClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClientsActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemClients);
        jMenu1.add(jSeparator1);

        jMenuItemRooms.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jMenuItemRooms.setForeground(new java.awt.Color(4, 3, 2));
        jMenuItemRooms.setText("Rooms");
        jMenuItemRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRoomsActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemRooms);
        jMenu1.add(jSeparator2);

        jMenuItemResservations.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jMenuItemResservations.setForeground(new java.awt.Color(4, 3, 2));
        jMenuItemResservations.setText("Resservations");
        jMenuItemResservations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemResservationsActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemResservations);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemResservationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemResservationsActionPerformed
        // open the manage resservation
        ManageReservationsForm resservationFrom = new ManageReservationsForm();
        resservationFrom.setVisible(true);
        resservationFrom.pack();
        resservationFrom.setLocationRelativeTo(null);
        resservationFrom.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jMenuItemResservationsActionPerformed

    private void jMenuItemClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClientsActionPerformed
        //open manage client from
        ManageClientsFrom clientsFrom = new ManageClientsFrom();
        clientsFrom.setVisible(true);
        clientsFrom.pack();
        clientsFrom.setLocationRelativeTo(null);
        clientsFrom.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        
    }//GEN-LAST:event_jMenuItemClientsActionPerformed

    private void jMenuItemRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRoomsActionPerformed
        //open the manage rooms from
   
        ManageRoomForm roomsFrom = new ManageRoomForm();
        roomsFrom.setVisible(true);
        roomsFrom.pack();
        roomsFrom.setLocationRelativeTo(null);
        roomsFrom.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jMenuItemRoomsActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemClients;
    private javax.swing.JMenuItem jMenuItemResservations;
    private javax.swing.JMenuItem jMenuItemRooms;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
