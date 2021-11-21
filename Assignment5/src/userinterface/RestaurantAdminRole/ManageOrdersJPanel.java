/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Order.Order;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dhaval
 */
public class ManageOrdersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrdersJPanel
     */
    EcoSystem ecoSystem;
    UserAccount userAccount;
    JPanel userProcessContainer;
    public ManageOrdersJPanel(EcoSystem ecoSystem,UserAccount userAccount,JPanel userProcessContainer) {
        initComponents();
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
        this.userProcessContainer = userProcessContainer;
        populateOrderTable();
    }

    private void populateOrderTable() {
        DefaultTableModel model = (DefaultTableModel)tblOrders.getModel();
        model.setRowCount(0);
        for (Restaurant restaurant :ecoSystem.getRestaurantDirectory().getRestaurantList())
        {
            if (restaurant.getRestaurantName().equals(userAccount.getName())) 
            {
               for(Order order:restaurant.getOrderList())
               {
                    Object[] row = new Object[5];
                    row[0] = order.getOrderId();
                    row[1] = order.getCustomerName();
                    row[2] = order.getDeliveryAddress();
                    row[3] = order.getTotalAmount();
                    row[4] = order.getStatus();
                    model.addRow(row);
               }
                
            } 
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();
        lblOrderInfo = new javax.swing.JLabel();
        btnAssignDel = new javax.swing.JButton();
        btnViewOrder = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "OrderId", "Customer Name", "Delivery Address", "Order Amount", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrders);

        lblOrderInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblOrderInfo.setText("Order Information :");

        btnAssignDel.setText("Assign Delivery Man");
        btnAssignDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignDelActionPerformed(evt);
            }
        });

        btnViewOrder.setText("View Order");
        btnViewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOrderInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAssignDel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnViewOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblOrderInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssignDel)
                    .addComponent(btnViewOrder)
                    .addComponent(btnBack)
                    .addComponent(btnRefresh))
                .addContainerGap(63, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignDelActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrders.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to assign details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            String OrderId  = (String)tblOrders.getValueAt(selectedRow, 0);
            for (Restaurant restaurant :ecoSystem.getRestaurantDirectory().getRestaurantList())
            {
                if (restaurant.getRestaurantName().equals(userAccount.getName())) 
                {
                   for(Order order:restaurant.getOrderList())
                   {
                       if(order.getOrderId().equals(OrderId))
                       {
                           if(order.getStatus().equals("In Process"))
                           {
                                AssignDeliveryMan viewOrder=new AssignDeliveryMan(userProcessContainer,userAccount,order,ecoSystem);
                                userProcessContainer.add("View Order",viewOrder);
                                CardLayout layout=(CardLayout)userProcessContainer.getLayout();
                                layout.next(userProcessContainer);
                           }
                           else
                           {
                                JOptionPane.showMessageDialog(null,"Order must be In process for further process");
                           }
                       }
                   }
                }
            }
        }
    }//GEN-LAST:event_btnAssignDelActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrders.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            String OrderId  = (String)tblOrders.getValueAt(selectedRow, 0);
            for (Restaurant restaurant :ecoSystem.getRestaurantDirectory().getRestaurantList())
            {
                if (restaurant.getRestaurantName().equals(userAccount.getName())) 
                {
                   for(Order order:restaurant.getOrderList())
                   {
                       if(order.getOrderId().equals(OrderId))
                       {  
                            ViewOrderDetailsPanel viewOrder = new ViewOrderDetailsPanel(userProcessContainer,userAccount,order,ecoSystem);
                            userProcessContainer.add("View Order",viewOrder);
                            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
                            layout.next(userProcessContainer);
                       }
                   }
                }
            }
        }
    }//GEN-LAST:event_btnViewOrderActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateOrderTable();
    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignDel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnViewOrder;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOrderInfo;
    private javax.swing.JTable tblOrders;
    // End of variables declaration//GEN-END:variables
}
