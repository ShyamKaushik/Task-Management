import java.lang.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TaskManager extends javax.swing.JFrame {
    
    String task_name = "";
    String priority = "";
    int status;
    int is_deleted;
    
    public TaskManager() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        Cancel = new javax.swing.JButton();
        Submit = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        LoadTable = new javax.swing.JButton();
        TaskDone = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "task name", "priority", "status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Task Name*");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Priority*");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("P1");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("P2");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("P3");

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        LoadTable.setText("Load");
        LoadTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadTableActionPerformed(evt);
            }
        });

        TaskDone.setText("Task Done");
        TaskDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaskDoneActionPerformed(evt);
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
                        .addComponent(LoadTable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TaskDone))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButton1)
                                    .addComponent(jRadioButton2)
                                    .addComponent(jRadioButton3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Cancel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Submit)
                                            .addGap(112, 112, 112)
                                            .addComponent(Delete))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LoadTable)
                            .addComponent(TaskDone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancel)
                    .addComponent(Submit)
                    .addComponent(Delete))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        task_name = jTextField1.getText();
        
        if(task_name.equals("")) {
            JOptionPane.showMessageDialog(null,"Please enter the task name");
        }
        if(task_name.length() > 255) {
            JOptionPane.showMessageDialog(null,"Task name cannot be more than 255 character");
        }
        
        if(jRadioButton1.isSelected())
        {
            priority = "P1";
        }
        else if(jRadioButton2.isSelected())
        {
            priority = "P2";
        }
        else if(jRadioButton3.isSelected())
        {
            priority = "P3";
        }
        status = 1;
        is_deleted = 0;
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/TaskManagement","root","root");
            Statement stmt = (Statement)conn.createStatement();
            String query = "Insert into task_info (task_name, priority, status,is_deleted) values ('"+task_name+"','"+priority+"',"+status+","+is_deleted+");";
            stmt.executeUpdate(query);
            
            jTextField1.setText("");
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
            
            getTableDetails();
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_SubmitActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
    }//GEN-LAST:event_CancelActionPerformed

    private void LoadTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadTableActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        jTable1.setModel(new DefaultTableModel(null, new String[] {"id", "task name", "priority", "status"}));
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/TaskManagement","root","root");
            Statement stmt = (Statement)conn.createStatement();
            String query = "select id, task_name, priority, status from task_info where is_deleted = 0;";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {
                int id = Integer.parseInt(rs.getString("id"));
                //System.out.print(id+" ");
                String task = rs.getString("task_name");
                //System.out.print(task+" ");
                String priority = rs.getString("priority");
                //System.out.print(priority+" ");
                int status = Integer.parseInt(rs.getString("status"));
                //System.out.println(status);
                
                model.addRow(new Object[]{id,task,priority,status});
            }
        }
        catch(Exception e) {
            
        }
    }//GEN-LAST:event_LoadTableActionPerformed

    private void TaskDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaskDoneActionPerformed
        // TODO add your handling code here:
        int id = getId();
        System.out.println(id);
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/TaskManagement","root","root");
            Statement stmt = (Statement)conn.createStatement();
            String query = "select status from task_info where id = "+id+";";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {
                int status = Integer.parseInt(rs.getString("status"));
                System.out.println(status);
                
                if(status == 0) {
                    JOptionPane.showMessageDialog(null,"Task is already completed");
                }
                
                else if(status == 1) {
                    String query1 = "update task_info set status = 0 where id = "+id+";";
                    stmt.executeUpdate(query1);
                    JOptionPane.showMessageDialog(null,"Task completed for id: "+id);
                    getTableDetails();
                }
            }
        }
        catch (Exception e) {
            System.err.println(e);
        }
        
    }//GEN-LAST:event_TaskDoneActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        int id = getId();
        System.out.println(id);
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/TaskManagement","root","root");
            Statement stmt = (Statement)conn.createStatement();
            String query = "select is_deleted from task_info where id = "+id+";";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {
                int is_deleted = Integer.parseInt(rs.getString("is_deleted"));
                System.out.println(status);
                
                if(is_deleted == 1) {
                    JOptionPane.showMessageDialog(null,"Task is already deleted");
                }
                
                else if(is_deleted == 0) {
                    String query1 = "update task_info set status = 0, is_deleted = 1 where id = "+id+";";
                    stmt.executeUpdate(query1);
                    JOptionPane.showMessageDialog(null,"Task deleted successfully");
                    getTableDetails();
                }
            }
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_DeleteActionPerformed

    public void initialize() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/TaskManagement","root","root");
            System.out.println("Connected");
            Statement stmt = (Statement)conn.createStatement();
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
    
    public void getTableDetails() {
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        jTable1.setModel(new DefaultTableModel(null, new String[] {"id", "task name", "priority", "status"}));
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/TaskManagement","root","root");
            Statement stmt = (Statement)conn.createStatement();
            String query = "select id, task_name, priority, status from task_info where is_deleted = 0;";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {
                int id = Integer.parseInt(rs.getString("id"));
                //System.out.print(id+" ");
                String task = rs.getString("task_name");
                //System.out.print(task+" ");
                String priority = rs.getString("priority");
                //System.out.print(priority+" ");
                int status = Integer.parseInt(rs.getString("status"));
                //System.out.println(status);
                
                model.addRow(new Object[]{id,task,priority,status});
            }
        }
        catch(Exception e) {
            
        }
    }
    
    public int getId() {
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int indexs = jTable1.getSelectedRow();
        //System.out.println(indexs[(indexs.length) - 1]);
        
        int id = (int) model.getValueAt(indexs,0);
        //System.out.println(id);
        return id;
    }
    
    public static void main(String args[]) {
        TaskManager tm = new TaskManager();
        tm.initialize();
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TaskManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaskManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Delete;
    private javax.swing.JButton LoadTable;
    private javax.swing.JButton Submit;
    private javax.swing.JButton TaskDone;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
