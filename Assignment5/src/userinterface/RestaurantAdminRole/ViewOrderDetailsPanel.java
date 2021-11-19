/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Order.Order;
import Business.Restaurant.Dishes;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dhaval
 */
public class ViewOrderDetailsPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewOrderDetailsPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    Order order;
    EcoSystem ecoSystem;
    public ViewOrderDetailsPanel(JPanel userProcessContainer,UserAccount userAccount,Order order,EcoSystem ecoSystem) {
        initComponents();
        this.ecoSystem = ecoSystem;
        this.userProcessContainer=userProcessContainer;
        this.userAccount = userAccount;
        this.order = order;
        populateOrderDetailsTable();
    }
    
    private void populateOrderDetailsTable() {
        jLabel2.setText("Order ID:"+order.getOrderId());
        DefaultTableModel model = (DefaultTableModel) tblOrderDetails.getModel();
        model.setRowCount(0);
        Object[] row = new Object[3];
        for(Dishes dish:order.getOrder()){
            row[0] = dish.getdishName();
            row[1] = dish.getDescription();
            row[2] = dish.getDishAmount();
            model.addRow(row);
        }  
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
        tblOrderDetails = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        orderStatusCombo = new javax.swing.JComboBox<>();
        btnChangeStatus = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblOrderDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Dish Name", "Description", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblOrderDetails);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, 120));

        jLabel1.setText("Change Order Status");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 120, 20));

        orderStatusCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ready to delivery", "Reject" }));
        add(orderStatusCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 170, -1));

        btnChangeStatus.setText("Change Status");
        btnChangeStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeStatusActionPerformed(evt);
            }
        });
        add(btnChangeStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Order Id: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 80, 20));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 80, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangeStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeStatusActionPerformed
        // TODO add your handling code here:
        int Selectedindex = orderStatusCombo.getSelectedIndex();
        if(Selectedindex == 0)
        {
            order.setStatus("Ready to Deliver");
            for(Customer cust:ecoSystem.getCustomerDirectory().getCustList()){
                if(order.getCustomerName().equals(cust.getUserName())){
                    for(Order order : cust.getCustomerOrderList()){
                        order.setStatus("Ready to Deliver");
                    }
                }
            }
        }
        else if(Selectedindex == 1)
        {
            order.setStatus("Reject");
            for(Customer cust:ecoSystem.getCustomerDirectory().getCustList()){
                if(order.getCustomerName().equals(cust.getUserName())){
                    for(Order order : cust.getCustomerOrderList()){
                        order.setStatus("Reject");
                    }
                }
            }
        }
    }//GEN-LAST:event_btnChangeStatusActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnChangeStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> orderStatusCombo;
    private javax.swing.JTable tblOrderDetails;
    // End of variables declaration//GEN-END:variables
}