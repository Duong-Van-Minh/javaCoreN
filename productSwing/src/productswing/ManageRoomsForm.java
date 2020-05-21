/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productswing;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author minh
 */
public class ManageRoomsForm extends javax.swing.JFrame {

    /**
     * Creates new form ManageRoomsForm
     */
    
    Rooms rooms = new Rooms();
    public ManageRoomsForm() {
        initComponents();
        //dispaly room_type id in comcobox
        rooms.fillRoomTypeJcomboboxJTable(jComboBoxType);
        //show all room in jTsable 
        rooms.fillRoomJTable(jTable1);
        //set a height to jtable
        jTable1.setRowHeight(30);
        
        //create a button group for th radi
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButton2Yes);
        bg.add(jRadioButton1No);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNumber = new javax.swing.JTextField();
        jButtonAddRooms = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_Refresh_Table_Data = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPhone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonEditRooms = new javax.swing.JButton();
        jButtonRemoveRooms = new javax.swing.JButton();
        jButtonClearFields = new javax.swing.JButton();
        jButton1ShowRoomType = new javax.swing.JButton();
        jComboBoxType = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton1No = new javax.swing.JRadioButton();
        jRadioButton2Yes = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();

        jPanel2.setBackground(new java.awt.Color(6, 0, 255));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Manage Rooms");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTextFieldNumber.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

        jButtonAddRooms.setBackground(new java.awt.Color(227, 227, 27));
        jButtonAddRooms.setText("Add Room");
        jButtonAddRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddRoomsActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Type", "Phone", "Reserved"}

        )
        //make the jtable cells not editable
        {public boolean isCellEditable(int row, int column){return false;}}
    );
    jTable1.setGridColor(new java.awt.Color(255, 253, 0));
    jTable1.setSelectionBackground(new java.awt.Color(33, 250, 3));
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable1MouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(jTable1);

    jButton_Refresh_Table_Data.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
    jButton_Refresh_Table_Data.setText("Refresh");
    jButton_Refresh_Table_Data.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton_Refresh_Table_DataActionPerformed(evt);
        }
    });

    jPanel1.setBackground(new java.awt.Color(101, 78, 79));
    jPanel1.setPreferredSize(new java.awt.Dimension(964, 609));

    jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(254, 247, 247));
    jLabel2.setText("Number:");

    jTextFieldPhone.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

    jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(254, 247, 247));
    jLabel3.setText("Type:");

    jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(254, 247, 247));
    jLabel4.setText("Phone");

    jButtonEditRooms.setBackground(new java.awt.Color(227, 227, 27));
    jButtonEditRooms.setText("Edit");
    jButtonEditRooms.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonEditRoomsActionPerformed(evt);
        }
    });

    jButtonRemoveRooms.setBackground(new java.awt.Color(227, 227, 27));
    jButtonRemoveRooms.setText("Remove");
    jButtonRemoveRooms.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonRemoveRoomsActionPerformed(evt);
        }
    });

    jButtonClearFields.setBackground(new java.awt.Color(242, 246, 240));
    jButtonClearFields.setText("Clear Fields");
    jButtonClearFields.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonClearFieldsActionPerformed(evt);
        }
    });

    jButton1ShowRoomType.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
    jButton1ShowRoomType.setText("Show Type");
    jButton1ShowRoomType.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ShowRoomTypeActionPerformed(evt);
        }
    });

    jComboBoxType.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
    jComboBoxType.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jComboBoxTypeActionPerformed(evt);
        }
    });

    jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(254, 247, 247));
    jLabel5.setText("Reverved:");

    jRadioButton1No.setForeground(new java.awt.Color(218, 46, 54));
    jRadioButton1No.setText("NO");
    jRadioButton1No.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jRadioButton1NoActionPerformed(evt);
        }
    });

    jRadioButton2Yes.setForeground(new java.awt.Color(0, 255, 19));
    jRadioButton2Yes.setText("YES");

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jRadioButton2Yes)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
            .addComponent(jRadioButton1No)
            .addContainerGap())
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jRadioButton1No)
                .addComponent(jRadioButton2Yes))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(19, 19, 19)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextFieldPhone)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jComboBoxType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton1ShowRoomType))
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jButtonEditRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jButtonRemoveRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jButtonClearFields, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(610, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(120, 120, 120)
            .addComponent(jLabel2)
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3)
                .addComponent(jButton1ShowRoomType)
                .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(17, 17, 17)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel4))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel5)))
            .addGap(75, 75, 75)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jButtonEditRooms, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addComponent(jButtonRemoveRooms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(30, 30, 30)
            .addComponent(jButtonClearFields, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(84, Short.MAX_VALUE))
    );

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setPreferredSize(new java.awt.Dimension(577, 79));

    jPanel4.setBackground(new java.awt.Color(228, 139, 50));

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 995, Short.MAX_VALUE)
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 584, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1NoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1NoActionPerformed

    private void jButton1ShowRoomTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ShowRoomTypeActionPerformed
        // TODO add your handling code here:
        All_Room_Type_From roomTypefom = new All_Room_Type_From();
        roomTypefom.setVisible(true);
        roomTypefom.pack();
        roomTypefom.setLocationRelativeTo(null);
        roomTypefom.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton1ShowRoomTypeActionPerformed

    private void jButton_Refresh_Table_DataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Refresh_Table_DataActionPerformed

        jTable1.setModel(new DefaultTableModel(null, new Object[]{"Number","Type","Phone","Reserved"}));

        rooms.fillRoomJTable(jTable1);
    }//GEN-LAST:event_jButton_Refresh_Table_DataActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();

        int rIndex = jTable1.getSelectedRow();

        //dispaly data
        jTextFieldNumber.setText(model.getValueAt(rIndex, 0).toString());
        jComboBoxType.setSelectedItem(model.getValueAt(rIndex, 1));
        jTextFieldPhone.setText(model.getValueAt(rIndex,2).toString());

        String isReserved = model.getValueAt(rIndex, 3).toString();
        if(isReserved.equals("Yes")){
            jRadioButton2Yes.setSelected(true);
        }else if(isReserved.equals("No")){
            jRadioButton1No.setSelected(true);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonClearFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearFieldsActionPerformed
        //remove text from all
        jTextFieldNumber.setText("");
        jTextFieldPhone.setText("");
        jComboBoxType.setSelectedIndex(0);
        jRadioButton1No.setSelected(true);
    }//GEN-LAST:event_jButtonClearFieldsActionPerformed

    private void jButtonRemoveRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveRoomsActionPerformed
        // TODO add your handling code here:
        try{

            int roomNumber = Integer.valueOf(jTextFieldNumber.getText());
            if(rooms.removeRooms(roomNumber)){
                JOptionPane.showMessageDialog(rootPane, "remove successfully", "remove room", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(rootPane, "room not delete", "room delelte error", JOptionPane.ERROR_MESSAGE);
            }

        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(rootPane, ex.getMessage() + "Enter the room", "room id error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonRemoveRoomsActionPerformed

    private void jButtonAddRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddRoomsActionPerformed
        //add a new client

        try{

            int roomNuber = Integer.valueOf(jTextFieldNumber.getText());
            int roomTyoe = Integer.valueOf(jComboBoxType.getSelectedItem().toString());
            String phone = jTextFieldPhone.getText();
            //            if(roomNuber..equals("") || roomTyoe.trim().equals("") || phone.trim().equals("") ){
                //            JOptionPane.showMessageDialog(rootPane, "Required Fields -> fist/name + number", "Empty file", JOptionPane.INFORMATION_MESSAGE);
                //            }else{
                if (rooms.addRooms(roomNuber, roomTyoe, phone)) {
                    JOptionPane.showMessageDialog(rootPane, "new room succsessfully", "add room", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(rootPane, " room not add", "room error", JOptionPane.ERROR_MESSAGE);

                }
                //}

        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(rootPane, ex.getMessage() + "Enter the room", "room id error", JOptionPane.ERROR_MESSAGE);
        }

        //get data from the fields
    }//GEN-LAST:event_jButtonAddRoomsActionPerformed

    private void jButtonEditRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditRoomsActionPerformed
        //edit the select client
        int roomNumber = 0;
        int type = Integer.valueOf(jComboBoxType.getSelectedItem().toString());
        String phone = jTextFieldPhone.getText();
        String isReserved = "No";
        if(jRadioButton2Yes.isSelected()){
            isReserved = "Yes";
        }
        if(phone.trim().equals("")){
            JOptionPane.showMessageDialog(rootPane, "enter thr room phone number", "Empty fiels", JOptionPane.INFORMATION_MESSAGE);
        }else{

            try {
                roomNumber = Integer.valueOf(jTextFieldNumber.getText());

                if(rooms.editRoom(roomNumber, phone, isReserved, type)){
                    JOptionPane.showMessageDialog(rootPane, "Client Data successfully", "edit room", JOptionPane.INFORMATION_MESSAGE);

                }else{
                    JOptionPane.showMessageDialog(rootPane, "client data not Update", "edit client error", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(rootPane, ex.getMessage() + "Enter the room", "room id error", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_jButtonEditRoomsActionPerformed

    private void jComboBoxTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTypeActionPerformed

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
            java.util.logging.Logger.getLogger(ManageRoomsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageRoomsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageRoomsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageRoomsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageRoomsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1ShowRoomType;
    private javax.swing.JButton jButtonAddRooms;
    private javax.swing.JButton jButtonClearFields;
    private javax.swing.JButton jButtonEditRooms;
    private javax.swing.JButton jButtonRemoveRooms;
    private javax.swing.JButton jButton_Refresh_Table_Data;
    private javax.swing.JComboBox<String> jComboBoxType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1No;
    private javax.swing.JRadioButton jRadioButton2Yes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldNumber;
    private javax.swing.JTextField jTextFieldPhone;
    // End of variables declaration//GEN-END:variables
}
