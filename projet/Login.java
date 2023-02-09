 
package projet;

import java.awt.*;
import java.sql.*;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        close.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        gmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        log = new javax.swing.JButton();
        oublier = new javax.swing.JLabel();
        flech = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        close = new javax.swing.JLabel();
        open = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Desktop\\java projet\\Miniprojet\\src\\image projet\\chario.png")); // NOI18N

        logout.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(204, 0, 0));
        logout.setText("Logout");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 490));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setText("Connection");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 66, 185, -1));

        gmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gmailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gmailMouseExited(evt);
            }
        });
        jPanel2.add(gmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 164, 274, 36));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText("Gmail");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 132, 67, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Password");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 218, 95, -1));

        log.setBackground(new java.awt.Color(0, 51, 255));
        log.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        log.setForeground(new java.awt.Color(255, 255, 255));
        log.setText("Connection");
        log.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logMouseEntered(evt);
            }
        });
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });
        jPanel2.add(log, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 336, 166, 37));

        oublier.setForeground(new java.awt.Color(0, 102, 255));
        oublier.setText("Mot de pass oublier ?");
        oublier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                oublierMouseEntered(evt);
            }
        });
        jPanel2.add(oublier, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 391, 134, 27));

        flech.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Desktop\\java projet\\Miniprojet\\src\\image projet\\flexr4.png")); // NOI18N
        flech.setText("Sign in");
        flech.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flechMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                flechMouseEntered(evt);
            }
        });
        jPanel2.add(flech, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 6, 84, 24));

        pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passMouseExited(evt);
            }
        });
        jPanel2.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 274, 40));

        close.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Desktop\\java projet\\Miniprojet\\src\\image projet\\eye1.png")); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel2.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, 26));

        open.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Desktop\\java projet\\Miniprojet\\src\\image projet\\eyec.png")); // NOI18N
        open.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openMouseClicked(evt);
            }
        });
        jPanel2.add(open, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 258, -1, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 440, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logMouseEntered
         Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
              log.setCursor(cursor);
    }//GEN-LAST:event_logMouseEntered

    private void oublierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oublierMouseEntered
       Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
              oublier.setCursor(cursor);
    }//GEN-LAST:event_oublierMouseEntered

    private void gmailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gmailMouseEntered
         gmail.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 3, Color.blue));
    }//GEN-LAST:event_gmailMouseEntered

    private void gmailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gmailMouseExited
          gmail.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY));
    }//GEN-LAST:event_gmailMouseExited

    private void openMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openMouseClicked
             open.setVisible(false);
             close.setVisible(true);
             pass.setEchoChar('*');
    }//GEN-LAST:event_openMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
            open.setVisible(true);
            close.setVisible(false);
            pass.setEchoChar((char)0);
    }//GEN-LAST:event_closeMouseClicked

    private void passMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passMouseEntered
         pass.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 3, Color.blue));
    }//GEN-LAST:event_passMouseEntered

    private void passMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passMouseExited
       pass.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY));
    }//GEN-LAST:event_passMouseExited

    private void flechMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flechMouseEntered
        Cursor ab=new Cursor(Cursor.HAND_CURSOR);
        flech.setCursor(ab);
    }//GEN-LAST:event_flechMouseEntered

    private void flechMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flechMouseClicked
           Sign ab=new Sign();
           ab.setVisible(true);
           ab.setLocationRelativeTo(null);
           this.dispose();
    }//GEN-LAST:event_flechMouseClicked

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
          String gm=gmail.getText();
                      char[] b=pass.getPassword();
                      String pa=String.valueOf(b);
                        try {
                              ResultSet r;
                              conn_bd conn= new conn_bd();
                               Connection con=conn.getcon();
                                String g="SELECT  user,id FROM users WHERE gmail=? and pass=?";
                                PreparedStatement st = con.prepareStatement(g);
                                st.setString(1, gm);
                                st.setString(2, pa);
                                r=st.executeQuery();
                           if(r.next()){
                                    Accueille user=new Accueille(r.getInt(2));
                                    user.setVisible(true);
                                    user.setTitle("Application de abdelkhalk");
                                    this.dispose();
                                    user.setLocationRelativeTo(null);
                                    user.titre().setText(r.getString(1));
                                   }
                           else{
                                  incorrect ab=new incorrect();
                                  ab.setVisible(true);
                                  ab.setLocationRelativeTo(null);
                           }
                           }catch(SQLException e){
                                 JOptionPane.showMessageDialog(null, "probleme de connection");
                              }                    
    }//GEN-LAST:event_logActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
                inter ab=new inter();
                ab.setVisible(true);
                ab.setLocationRelativeTo(null);
                this.dispose();
                        
    }//GEN-LAST:event_logoutMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private javax.swing.JLabel flech;
    private javax.swing.JTextField gmail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton log;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel open;
    private javax.swing.JLabel oublier;
    private javax.swing.JPasswordField pass;
    // End of variables declaration//GEN-END:variables
}
