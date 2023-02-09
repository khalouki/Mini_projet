package projet;
import java.awt.*;
import java.sql.*;
import javax.swing.JOptionPane;
public class Sign extends javax.swing.JFrame {
    public Sign() {
        this.setTitle("application de abdelkhalk");
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        gmail = new javax.swing.JTextField();
        magasin = new javax.swing.JTextField();
        sauv = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        flech = new javax.swing.JLabel();
        vide = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Desktop\\java projet\\Miniprojet\\src\\image projet\\chario.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 330, 520));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("New Account");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 26, 192, -1));
        jPanel2.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 174, 230, 30));
        jPanel2.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 174, 230, 30));
        jPanel2.add(gmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 312, 230, 30));
        jPanel2.add(magasin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 312, 230, 30));

        sauv.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sauv.setForeground(new java.awt.Color(0, 51, 255));
        sauv.setText("Save");
        sauv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sauvMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sauvMouseExited(evt);
            }
        });
        sauv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sauvActionPerformed(evt);
            }
        });
        jPanel2.add(sauv, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 406, 186, 38));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Full name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 142, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Password");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 142, 96, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Gmail");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("store Name");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, -1, -1));

        flech.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Desktop\\java projet\\Miniprojet\\src\\image projet\\flexg2.png")); // NOI18N
        flech.setText("Log in");
        flech.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flechMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                flechMouseEntered(evt);
            }
        });
        jPanel2.add(flech, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 90, 26));

        vide.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        vide.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(vide, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 89, 214, 27));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sauvMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sauvMouseEntered
        sauv.setBackground(new Color(0,0,255));
        sauv.setForeground(Color.WHITE);
    }//GEN-LAST:event_sauvMouseEntered

    private void sauvMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sauvMouseExited
         sauv.setVisible(true);
        sauv.setBackground(new Color(255,255,255));
        sauv.setForeground(Color.BLUE);
    }//GEN-LAST:event_sauvMouseExited

    private void sauvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sauvActionPerformed
        String nm=user.getText();
        String g=gmail.getText();
        String pa=pass.getText();
        String ma=magasin.getText();
        if( nm.equals("")|| ma.equals("")|| g.equals("") || pa.equals("")){
            vide.setText("\"remplir tout les champs\"");
        }
        else{
            conn_bd test = new conn_bd();
            try{
                PreparedStatement st = test.getcon().prepareStatement("INSERT INTO users(user,gmail,pass,magasin) values(?,?,?,?)");
                st.setString(1, nm);
                st.setString(2, g);
                st.setString(3, pa);
                st.setString(4, ma);
                st.execute();
                done cc= new done();
                cc.setVisible(true);
                cc.setLocationRelativeTo(null);
                this.dispose();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "les inforamtion non valider");
            }
        }
    }//GEN-LAST:event_sauvActionPerformed

    private void flechMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flechMouseClicked
       Login ab=new Login();
           ab.setVisible(true);
           ab.setTitle("Application de abdelkhalk");
           ab.setLocationRelativeTo(null);
           this.dispose();
    }//GEN-LAST:event_flechMouseClicked

    private void flechMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flechMouseEntered
      Cursor ab=new Cursor(Cursor.HAND_CURSOR);
         flech.setCursor(ab);
    }//GEN-LAST:event_flechMouseEntered

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel flech;
    private javax.swing.JTextField gmail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField magasin;
    private javax.swing.JTextField pass;
    private javax.swing.JButton sauv;
    private javax.swing.JTextField user;
    private javax.swing.JLabel vide;
    // End of variables declaration//GEN-END:variables
}
