
package projet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Valider extends javax.swing.JFrame {
     public String com;
     public int leng;
     public String comande[][]=new String[10][10];
    public Valider(double p,String b,int l) {
        initComponents();
        prix.setText(String.valueOf(p));
        com=b;
        leng=l;
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nom = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        prenom = new javax.swing.JTextField();
        cin = new javax.swing.JTextField();
        rip = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        adress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        teli = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        valider = new javax.swing.JButton();
        prix = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        vide = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 121, 282, 35));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 204));
        jLabel1.setText("Credit carte Inforamtion");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 294, 25));
        jPanel1.add(prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 121, 282, 35));
        jPanel1.add(cin, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 217, 282, 35));
        jPanel1.add(rip, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 217, 282, 35));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 89, 103, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText("Last name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 89, 131, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Rip cridit Cart");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 185, 182, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setText("CIN:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 185, 137, -1));
        jPanel1.add(adress, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 308, 282, 35));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setText("Adress");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 282, 182, -1));
        jPanel1.add(teli, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 308, 282, 35));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setText("Telephone");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 282, 175, -1));

        valider.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        valider.setText("Valider");
        valider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                validerMouseClicked(evt);
            }
        });
        valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerActionPerformed(evt);
            }
        });
        jPanel1.add(valider, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 206, 38));

        prix.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        prix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prixActionPerformed(evt);
            }
        });
        jPanel1.add(prix, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 90, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setText("Total prix");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 70, 30));

        vide.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        vide.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(vide, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 270, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prixActionPerformed
        
    }//GEN-LAST:event_prixActionPerformed

    private void validerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerActionPerformed
       
    }//GEN-LAST:event_validerActionPerformed

    private void validerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validerMouseClicked
        String nm=nom.getText();
        String pre=prenom.getText();
        String ri=rip.getText();
        String tel=teli.getText();
        String ci=cin.getText();
        String add=adress.getText();
        float pr=Float.parseFloat(prix.getText());
        if( nm.equals("")|| pre.equals("")|| ri.equals("") || tel.equals("")){
            vide.setText("\"remplir tout les champs\"");
        }
        else{
            conn_bd test = new conn_bd();
            try{
                PreparedStatement st = test.getcon().prepareStatement("INSERT INTO client values(?,?,?,?,?,?,?)");
                st.setString(1, nm);
                st.setString(2, pre);
                st.setString(3, ri);
                st.setString(4, ci);
                st.setString(5, add);
                st.setString(6, tel);
                st.setString(7, com);
                st.execute();
               
            ///////////////////////commande///////////////////////////////////////
            for(int i=0;i<leng;i++){
                PreparedStatement st2 = test.getcon().prepareStatement("INSERT INTO commande values(?,?,?,?,?,?)");
                st2.setString(1, comande[i][0]);
                st2.setString(2, comande[i][1]);
                st2.setString(3, comande[i][2]);
                st2.setString(4, comande[i][3]);
                st2.setString(5, pre);
                st2.setString(6, nm);
                st2.execute();
                }
            /////////////////fin///////////////////////////////////////////
                recu cc= new recu(ri,nm,pr);
                cc.setVisible(true);
                cc.setLocationRelativeTo(null);
                this.dispose();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "les inforamtion non valider2");
            }
        }
        
    }//GEN-LAST:event_validerMouseClicked

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adress;
    private javax.swing.JTextField cin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField prenom;
    private javax.swing.JTextField prix;
    private javax.swing.JTextField rip;
    private javax.swing.JTextField teli;
    private javax.swing.JButton valider;
    private javax.swing.JLabel vide;
    // End of variables declaration//GEN-END:variables
}
