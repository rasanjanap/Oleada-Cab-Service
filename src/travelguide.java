
import java.lang.String;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;


public class travelguide extends javax.swing.JFrame {

    /** Creates new form travelguide */
    
    String user = null;
    
    public travelguide() {
        initComponents();
    }
    
    public void travelguideuser(String username){
       user = username;
    }
    
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox_availablevehicles = new javax.swing.JComboBox();
        jButton_av_vehicles = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField_sDate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_eDate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_nof = new javax.swing.JTextField();
        jButton_rset = new javax.swing.JButton();
        jButton_reservevehicle = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1_a = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton_exit2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Travel Guide");
        setBounds(new java.awt.Rectangle(500, 200, 0, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Available Vehicles"));

        jLabel1.setText("Available Vehicles :");

        jComboBox_availablevehicles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_availablevehiclesActionPerformed(evt);
            }
        });

        jButton_av_vehicles.setText("Generate Available Vehicles");
        jButton_av_vehicles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_av_vehiclesActionPerformed(evt);
            }
        });

        jLabel2.setText("Start Date :");

        jLabel3.setText(" YYYY-MM-DD");

        jLabel4.setText("End Date :");

        jTextField_eDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_eDateActionPerformed(evt);
            }
        });

        jLabel6.setText("Number of Seats :");

        jButton_rset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh222.png"))); // NOI18N
        jButton_rset.setText("Refresh");
        jButton_rset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_rsetActionPerformed(evt);
            }
        });

        jButton_reservevehicle.setText("Reserve Vehicle");
        jButton_reservevehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_reservevehicleActionPerformed(evt);
            }
        });

        jLabel7.setText(" YYYY-MM-DD");

        jComboBox1_a.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "car", "van", "bus" }));
        jComboBox1_a.setSelectedIndex(-1);
        jComboBox1_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1_aActionPerformed(evt);
            }
        });

        jLabel5.setText("Vehicle Type  :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_nof, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField_sDate, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField_eDate, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jButton_rset))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jComboBox1_a, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox_availablevehicles, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addComponent(jButton_av_vehicles, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_reservevehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_sDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_eDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_rset, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_nof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox_availablevehicles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_av_vehicles, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jButton_reservevehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/compupic22.png"))); // NOI18N
        jButton2.setText("View Reservations");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Sign-Back-icon2.png"))); // NOI18N
        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton_exit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Exit-the-2222.png"))); // NOI18N
        jButton_exit2.setText("Exit");
        jButton_exit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_exit2ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logout.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setText("Pay");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_exit2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 13, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_exit2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton_av_vehiclesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_av_vehiclesActionPerformed
        jComboBox_availablevehicles.removeAllItems();
    if (jTextField_sDate.getText().isEmpty() && jTextField_eDate.getText().isEmpty() && jTextField_nof.getText().isEmpty() ) 
    {
        JOptionPane.showMessageDialog(null,"Enter details for search","Invalid Search Data",JOptionPane.ERROR_MESSAGE);
    }else
    {
        try {
        String nos = jTextField_nof.getText();
        String sDate = jTextField_sDate.getText();
        String eDate = jTextField_eDate.getText();
        
        String Vehicletype1;
            Vehicletype1 = jComboBox1_a.getSelectedItem().toString();
        
        Database db = new Database();
        ResultSet set1 = db.GetInformation("select reg_no from vehicle where no_of_seats>='"+nos+"' and reg_no not in ( select vehicle from reserve where isApproved =1 ) and vehicle_type='"+Vehicletype1+"'");
        
        while (set1.next()) 
        {
            String vnumber = set1.getString("reg_no");
            jComboBox_availablevehicles.addItem(vnumber); //add selected values to the combo box
        }
        
        jTextField_sDate.setEditable(false);
        jTextField_eDate.setEditable(false);
        jTextField_nof.setEditable(true);

        } catch (Exception e) 
        {   
        }
        
    }
    
    
    
}//GEN-LAST:event_jButton_av_vehiclesActionPerformed

private void jButton_rsetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_rsetActionPerformed

    jComboBox_availablevehicles.removeAllItems();
    jTextField_eDate.setEditable(true);
    jTextField_sDate.setEditable(true);
    jTextField_nof.setEditable(true);
    jTextField_eDate.setText("");
    jTextField_nof.setText("");
    jTextField_sDate.setText("");
    
}//GEN-LAST:event_jButton_rsetActionPerformed

private void jButton_reservevehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_reservevehicleActionPerformed

    try {
        String Vehicle = jComboBox_availablevehicles.getSelectedItem().toString();
        String Vehicletype = jComboBox1_a.getSelectedItem().toString();
        String Travel_guide = user;
        String sDate = jTextField_sDate.getText();
        String eDate = jTextField_eDate.getText();
        String None = null;

        if (JOptionPane.showConfirmDialog(rootPane,"Are your sure to reserve the following vehicle?","Confirm Submission",JOptionPane.OK_CANCEL_OPTION, WIDTH) == 0) {
            Database db = new Database();
            db.putdata("Insert into reserve values ('" + Vehicle + "','" + Travel_guide + "','" + sDate + "','" + eDate + "'," + None + "," + None + "," + None +")");
        }
        
    } catch (Exception e) {
    }
    
}//GEN-LAST:event_jButton_reservevehicleActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    reservations re = new reservations();
    re.setVisible(true);
    this.dispose();
    
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    travelguidelogin TG = new travelguidelogin();
    TG.setVisible(true);
    this.dispose();
    
}//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField_eDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_eDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_eDateActionPerformed

    private void jButton_exit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_exit2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_exit2ActionPerformed

    private void jComboBox1_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1_aActionPerformed

    private void jComboBox_availablevehiclesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_availablevehiclesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_availablevehiclesActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Payment TG = new Payment ();
        TG.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

       travelguidelogin TO2 = new  travelguidelogin();
    TO2.setVisible(true);
    this.dispose();
           
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(travelguide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(travelguide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(travelguide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(travelguide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new travelguide().setVisible(true);
                
                
            }
        });
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton_av_vehicles;
    private javax.swing.JButton jButton_exit2;
    private javax.swing.JButton jButton_reservevehicle;
    private javax.swing.JButton jButton_rset;
    private javax.swing.JComboBox jComboBox1_a;
    private javax.swing.JComboBox jComboBox_availablevehicles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_eDate;
    private javax.swing.JTextField jTextField_nof;
    private javax.swing.JTextField jTextField_sDate;
    // End of variables declaration//GEN-END:variables

}
