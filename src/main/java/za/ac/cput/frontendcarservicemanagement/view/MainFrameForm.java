/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.frontendcarservicemanagement.view;

import com.formdev.flatlaf.FlatIntelliJLaf;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author kurtj
 */
public class MainFrameForm extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrameForm() {
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

        mainPanel = new javax.swing.JPanel();
        mainSidePanel = new javax.swing.JPanel();
        waitListBtn = new javax.swing.JButton();
        cusomerBtn = new javax.swing.JButton();
        serviceBtn = new javax.swing.JButton();
        bookingsBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        logoPnl = new javax.swing.JPanel();
        switchPnl = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(846, 480));
        setResizable(false);
        setSize(new java.awt.Dimension(720, 480));
        getContentPane().setLayout(null);

        mainPanel.setBackground(new java.awt.Color(221, 242, 235));

        mainSidePanel.setBackground(new java.awt.Color(136, 149, 141));

        waitListBtn.setBackground(new java.awt.Color(102, 102, 102));
        waitListBtn.setText("Wait-list repairs");
        waitListBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                waitListBtnMouseClicked(evt);
            }
        });
        waitListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waitListBtnActionPerformed(evt);
            }
        });

        cusomerBtn.setBackground(new java.awt.Color(102, 102, 102));
        cusomerBtn.setText("Customers");
        cusomerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cusomerBtnMouseClicked(evt);
            }
        });
        cusomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusomerBtnActionPerformed(evt);
            }
        });

        serviceBtn.setBackground(new java.awt.Color(102, 102, 102));
        serviceBtn.setText("Services");
        serviceBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                serviceBtnMouseClicked(evt);
            }
        });
        serviceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceBtnActionPerformed(evt);
            }
        });

        bookingsBtn.setBackground(new java.awt.Color(102, 102, 102));
        bookingsBtn.setText("Bookings");
        bookingsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookingsBtnMouseClicked(evt);
            }
        });
        bookingsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingsBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Logout");

        javax.swing.GroupLayout mainSidePanelLayout = new javax.swing.GroupLayout(mainSidePanel);
        mainSidePanel.setLayout(mainSidePanelLayout);
        mainSidePanelLayout.setHorizontalGroup(
            mainSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainSidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(waitListBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addGroup(mainSidePanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(mainSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainSidePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(cusomerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(mainSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainSidePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(serviceBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(mainSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainSidePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(bookingsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        mainSidePanelLayout.setVerticalGroup(
            mainSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainSidePanelLayout.createSequentialGroup()
                .addContainerGap(232, Short.MAX_VALUE)
                .addComponent(waitListBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jLabel2)
                .addGap(37, 37, 37))
            .addGroup(mainSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainSidePanelLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(cusomerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(359, Short.MAX_VALUE)))
            .addGroup(mainSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainSidePanelLayout.createSequentialGroup()
                    .addGap(84, 84, 84)
                    .addComponent(serviceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(291, Short.MAX_VALUE)))
            .addGroup(mainSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainSidePanelLayout.createSequentialGroup()
                    .addGap(157, 157, 157)
                    .addComponent(bookingsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(218, Short.MAX_VALUE)))
        );

        logoPnl.setBackground(new java.awt.Color(136, 149, 141));

        javax.swing.GroupLayout logoPnlLayout = new javax.swing.GroupLayout(logoPnl);
        logoPnl.setLayout(logoPnlLayout);
        logoPnlLayout.setHorizontalGroup(
            logoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 167, Short.MAX_VALUE)
        );
        logoPnlLayout.setVerticalGroup(
            logoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        switchPnl.setBackground(new java.awt.Color(221, 242, 235));
        switchPnl.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mainSidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(switchPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(logoPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mainSidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(switchPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(mainPanel);
        mainPanel.setBounds(0, 0, 850, 480);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookingsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingsBtnActionPerformed
        if(evt.getActionCommand().equals("Bookings")){
            swapPanels(this.switchPnl, bookingPanel.getBookingPnl());
            System.out.println("bN ORKS");
        }
    }//GEN-LAST:event_bookingsBtnActionPerformed

    private void bookingsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingsBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bookingsBtnMouseClicked

    private void serviceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceBtnActionPerformed
        if(evt.getActionCommand().equals("Services")){
            swapPanels(this.switchPnl, servicesPnl.getServicesPnl());
            System.out.println("bN ORKS");
        }
    }//GEN-LAST:event_serviceBtnActionPerformed

    private void serviceBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serviceBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_serviceBtnMouseClicked

    private void cusomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusomerBtnActionPerformed
        if(evt.getActionCommand().equals("Customers")){
            swapPanels(this.switchPnl, custPnl.getCustomerPanel());
            System.out.println("bN ORKS");
        }
    }//GEN-LAST:event_cusomerBtnActionPerformed

    private void cusomerBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cusomerBtnMouseClicked

    }//GEN-LAST:event_cusomerBtnMouseClicked

    private void waitListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waitListBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_waitListBtnActionPerformed

    private void waitListBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_waitListBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_waitListBtnMouseClicked

      public void swapPanels(JPanel oldPanel, JPanel newPanel){ 
        //oldPanel == panel with cardlayout
        oldPanel.removeAll();
        oldPanel.add(newPanel);
        oldPanel.repaint();
        oldPanel.revalidate();
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
            java.util.logging.Logger.getLogger(MainFrameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new FlatIntelliJLaf());
                    new MainFrameForm().setVisible(true);
                }catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }    
            }
        });
    }
    
    
    //iniialize in constructor
    private CustomerPnl custPnl = new CustomerPnl();
    private BookingPanelForm bookingPanel = new BookingPanelForm();
    private ServicePanelForm servicesPnl = new ServicePanelForm();
    private WaitListGUI waitListGUI = new WaitListGUI();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookingsBtn;
    private javax.swing.JButton cusomerBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel logoPnl;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel mainSidePanel;
    private javax.swing.JButton serviceBtn;
    private javax.swing.JPanel switchPnl;
    private javax.swing.JButton waitListBtn;
    // End of variables declaration//GEN-END:variables
}
