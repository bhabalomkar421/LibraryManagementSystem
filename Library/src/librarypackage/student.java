
package librarypackage;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author hp
 */
public final class student extends javax.swing.JFrame {
    
    Connection con;
    public student() {
        initComponents();
        createConnection();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        Borrow = new javax.swing.JButton();
        Return = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        r1 = new javax.swing.JTextField();
        sssa = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bkname = new javax.swing.JTextField();
        Aname = new javax.swing.JTextField();
        d1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Roll no", "Bookname", "Author", "Date_of_Issue", "Date_of_Return"
            }
        ));
        jScrollPane1.setViewportView(table);

        Borrow.setText("Borrow");
        Borrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrowActionPerformed(evt);
            }
        });

        Return.setText("Return");
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });

        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        jLabel3.setText("Roll No.");

        sssa.setText("Book Name");

        jLabel5.setText("Author name");

        jLabel6.setText("Date of Issue");

        bkname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bknameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(sssa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Aname, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bkname, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Return, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Borrow, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(224, 224, 224))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sssa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bkname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(118, 118, 118))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(Aname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(65, 65, 65))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(Borrow, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Return, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    void createConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","421202om");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(begin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(begin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void BorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrowActionPerformed
        
       
        try {
            int rno=Integer.parseInt(r1.getText());
            String bookname=bkname.getText();
            String name=Aname.getText();
            String dt=d1.getText();
            String d2="2019-09-09";
            
          
            PreparedStatement stmt=con.prepareStatement("INSERT INTO book VALUES(?,?,?,?,?)");
            stmt.setInt(1,rno);
            stmt.setString(2,name);
            stmt.setString(3,bookname);
            stmt.setString(4,dt);
            stmt.setString(5,d2);
            stmt.execute();
            System.out.println(dt);
            System.out.println("Inserion Completed");
            stmt.close();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NullPointerException e1) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, e1);
        }
    }//GEN-LAST:event_BorrowActionPerformed

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        
        //DELETE FROM book WHERE ;        
        int rno=Integer.parseInt(r1.getText());
        
        try {
            PreparedStatement stmt=con.prepareStatement("DELETE FROM book WHERE Roll_no=?");
            stmt.setInt(1,rno);
            boolean exe = stmt.execute();
            System.out.println("Done");
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_ReturnActionPerformed
      
    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed

        try {
            DefaultTableModel tableModel;
            tableModel = (DefaultTableModel) table.getModel();
            tableModel.setRowCount(0);
            PreparedStatement st=con.prepareStatement("select * from book");
            ResultSet rs=st.executeQuery();
            
            
            while(rs.next()){
                int r1=rs.getInt("Roll_no");
                String bkn=rs.getString("Bookname");
                String an=rs.getString("Author");
                String d1=rs.getDate("Date of Issue").toString();
                String d2=rs.getDate("Date of Return").toString();
                tableModel.addRow(new Object[]{r1,bkn,an,d1,d2});
   
            }
            st.close();
              
               
        } catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_RefreshActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here
        int rn=Integer.parseInt(r1.getText());
        try {
            DefaultTableModel tableModel;
            
            tableModel = (DefaultTableModel) table.getModel();
            PreparedStatement st=con.prepareStatement("select * from book where Roll_no=?");
            tableModel.setRowCount(0);
            st.setInt(1, rn);
            ResultSet rs=st.executeQuery();
            
            while(rs.next()){
                int r1=rs.getInt("Roll_no");
                String bkn=rs.getString("Bookname");
                String an=rs.getString("Author");
                String d1=rs.getDate("Date of Issue").toString();
                String d2=rs.getDate("Date of Return").toString();
                tableModel.addRow(new Object[]{r1,bkn,an,d1,d2}); 
                
            }
            st.close();                           
        } catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }                                
    }//GEN-LAST:event_searchActionPerformed

    private void bknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bknameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bknameActionPerformed
/* */
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
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Aname;
    private javax.swing.JButton Borrow;
    private javax.swing.JButton Refresh;
    private javax.swing.JButton Return;
    private javax.swing.JTextField bkname;
    private javax.swing.JTextField d1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField r1;
    private javax.swing.JButton search;
    private javax.swing.JLabel sssa;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    
}
