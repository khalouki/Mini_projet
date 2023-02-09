package projet;
import java.awt.Color;
import java.awt.Cursor;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public  class client extends javax.swing.JFrame {

    public client() {
        initComponents();
        java.util.Date datee=new java.util.Date();
        la_date.setText(String.valueOf(String.valueOf(datee)));
        remplire();
    }
    public void remplire(){
        try {
            Connection con=new conn_bd().getcon();
            ResultSet r1,r2,r3,r4,r5,r6;
            String a="pantalon",b="chemis",c="jacket",d="spadry",e="casket",f="chausset";
            PreparedStatement st1=con.prepareStatement("select image,prix from produit where type=? ");
            PreparedStatement st2=con.prepareStatement("select image,prix from produit where type=?");
            PreparedStatement st3=con.prepareStatement("select image,prix from produit where type=?");
            PreparedStatement st4=con.prepareStatement("select image,prix from produit where type=?");
            PreparedStatement st5=con.prepareStatement("select image,prix from produit where type=?");
            PreparedStatement st6=con.prepareStatement("select image,prix from produit where type=?");
            st1.setString(1, a);r1=st1.executeQuery();
            st2.setString(1, b);r2=st2.executeQuery();
            st3.setString(1, c);r3=st3.executeQuery();
            st4.setString(1, d);r4=st4.executeQuery();
            st5.setString(1, e);r5=st5.executeQuery();
            st6.setString(1, f);r6=st6.executeQuery();
            while( r6.next() && r5.next() && r4.next() && r3.next() && r2.next() && r1.next()){
               photo1.setIcon(new javax.swing.ImageIcon(r1.getString(1)));
               photo2.setIcon(new javax.swing.ImageIcon(r2.getString(1)));
               photo3.setIcon(new javax.swing.ImageIcon(r3.getString(1)));
               photo4.setIcon(new javax.swing.ImageIcon(r4.getString(1)));
               photo5.setIcon(new javax.swing.ImageIcon(r5.getString(1)));
               photo6.setIcon(new javax.swing.ImageIcon(r6.getString(1)));
               prix1.setText(String.valueOf(r1.getInt(2)));
                prix2.setText(String.valueOf(r2.getInt(2)));
               prix3.setText(String.valueOf(  r3.getInt(2)));
               prix4.setText(String.valueOf( r4.getInt(2)));
               prix5.setText(String.valueOf( r5.getInt(2)));
               prix6.setText(String.valueOf(r6.getInt(2)));
            }
            
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "erreur de base");
        }
    }
    public double totalprix;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pane2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        la_date = new javax.swing.JLabel();
        table = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        titre1 = new javax.swing.JLabel();
        acheter1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        taille1 = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        contité1 = new javax.swing.JSpinner();
        photo1 = new javax.swing.JLabel();
        prix1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        titre2 = new javax.swing.JLabel();
        acheter2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        taille2 = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        contité2 = new javax.swing.JSpinner();
        photo2 = new javax.swing.JLabel();
        prix2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        titre4 = new javax.swing.JLabel();
        acheter4 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        taille4 = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();
        contité4 = new javax.swing.JSpinner();
        prix4 = new javax.swing.JLabel();
        photo4 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        titre3 = new javax.swing.JLabel();
        acheter3 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        taille3 = new javax.swing.JSpinner();
        jLabel21 = new javax.swing.JLabel();
        contité3 = new javax.swing.JSpinner();
        photo3 = new javax.swing.JLabel();
        prix3 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        titre6 = new javax.swing.JLabel();
        acheter6 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        taille6 = new javax.swing.JSpinner();
        jLabel24 = new javax.swing.JLabel();
        contité6 = new javax.swing.JSpinner();
        prix6 = new javax.swing.JLabel();
        photo6 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        titre5 = new javax.swing.JLabel();
        acheter5 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        taille5 = new javax.swing.JSpinner();
        jLabel27 = new javax.swing.JLabel();
        contité5 = new javax.swing.JSpinner();
        prix5 = new javax.swing.JLabel();
        photo5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        label7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        comm = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        envoyer = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        valider = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_panier = new projet.Tab();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(171, 232, 209));

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setText("magasin");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton2.setText("panier");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton3.setText("comantaire");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Desktop\\java projet\\Miniprojet\\src\\image projet\\text.png")); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Desktop\\java projet\\Miniprojet\\src\\image projet\\panie.png")); // NOI18N

        pane2.setBackground(new java.awt.Color(171, 232, 209));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel3.setText("Bienvenue");

        javax.swing.GroupLayout pane2Layout = new javax.swing.GroupLayout(pane2);
        pane2.setLayout(pane2Layout);
        pane2Layout.setHorizontalGroup(
            pane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane2Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        pane2Layout.setVerticalGroup(
            pane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Desktop\\java projet\\Miniprojet\\src\\image projet\\store.png")); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 255));
        jLabel9.setText("Sortie");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Desktop\\java projet\\Miniprojet\\src\\image projet\\cccc.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(170, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 620));

        jPanel2.setBackground(new java.awt.Color(80, 79, 79));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(80, 79, 79));

        la_date.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        la_date.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(la_date, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(391, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(la_date, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 930, 50));

        table.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(80, 79, 79));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 204));
        jLabel5.setText("Liste des produit");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 6, 237, 35));

        jScrollPane2.setBackground(new java.awt.Color(80, 79, 79));
        jScrollPane2.setBorder(null);

        jPanel6.setBackground(new java.awt.Color(80, 79, 79));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titre1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        titre1.setText("Pantalon");

        acheter1.setBackground(new java.awt.Color(255, 51, 204));
        acheter1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        acheter1.setText("acheter");
        acheter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acheter1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel11.setText("la taile:");

        taille1.setModel(new javax.swing.SpinnerListModel(new String[] {"M", "S", "XL", "2X", "3X"}));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel12.setText("contité");

        contité1.setModel(new javax.swing.SpinnerListModel(new String[] {"1", "2", "3", "4", "5"}));

        prix1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(taille1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contité1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(photo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(titre1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(prix1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(acheter1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titre1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(prix1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addComponent(photo1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(taille1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(contité1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(acheter1)
                .addGap(8, 8, 8))
        );

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 16, -1, 260));

        titre2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        titre2.setText("Chemis");

        acheter2.setBackground(new java.awt.Color(255, 51, 204));
        acheter2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        acheter2.setText("acheter");
        acheter2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acheter2ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel14.setText("la taile:");

        taille2.setModel(new javax.swing.SpinnerListModel(new String[] {"M", "S", "XL", "2X", "3X"}));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel15.setText("contité");

        contité2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        prix2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(taille2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contité2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(acheter2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(photo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(titre2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(prix2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titre2, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(prix2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(photo2, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(taille2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(contité2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(acheter2)
                .addContainerGap())
        );

        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 18, -1, -1));

        titre4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        titre4.setText("Cascket");

        acheter4.setBackground(new java.awt.Color(255, 51, 204));
        acheter4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        acheter4.setText("acheter");
        acheter4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acheter4ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel17.setText("la taile:");

        taille4.setModel(new javax.swing.SpinnerListModel(new String[] {"M", "S", "XL", "2X", "3X"}));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel18.setText("contité");

        contité4.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        prix4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(taille4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contité4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(acheter4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(titre4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(prix4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(photo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titre4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prix4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(photo4, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(taille4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(contité4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(acheter4)
                .addContainerGap())
        );

        jPanel6.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 329, -1, -1));

        titre3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        titre3.setText("Spady");

        acheter3.setBackground(new java.awt.Color(255, 51, 204));
        acheter3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        acheter3.setText("acheter");
        acheter3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acheter3ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel20.setText("la taile:");

        taille3.setModel(new javax.swing.SpinnerNumberModel(35, 35, 45, 1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel21.setText("contité");

        contité3.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        prix3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(taille3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contité3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(acheter3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(photo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(titre3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(prix3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titre3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prix3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(photo3, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(taille3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(contité3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(acheter3)
                .addContainerGap())
        );

        jPanel6.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, -1, -1));

        titre6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        titre6.setText("jacket");

        acheter6.setBackground(new java.awt.Color(255, 51, 204));
        acheter6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        acheter6.setText("acheter");
        acheter6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acheter6ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel23.setText("la taile:");

        taille6.setModel(new javax.swing.SpinnerListModel(new String[] {"M", "S", "XL", "2X", "3X"}));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel24.setText("contité");

        contité6.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        prix6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        prix6.setText("DH");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(taille6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contité6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(acheter6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(titre6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(prix6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(photo6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titre6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prix6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(photo6, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(taille6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(contité6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(acheter6)
                .addContainerGap())
        );

        jPanel6.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 329, -1, -1));

        titre5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        titre5.setText("chausset");

        acheter5.setBackground(new java.awt.Color(255, 51, 204));
        acheter5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        acheter5.setText("acheter");
        acheter5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acheter5ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel26.setText("la taile:");

        taille5.setModel(new javax.swing.SpinnerListModel(new String[] {"M", "S", "XL", "2X", "3X"}));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel27.setText("contité");

        contité5.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        prix5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(taille5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contité5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(acheter5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(titre5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(prix5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(photo5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titre5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prix5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(photo5, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(taille5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(contité5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(acheter5)
                .addContainerGap())
        );

        jPanel6.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 329, -1, -1));

        jScrollPane2.setViewportView(jPanel6);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 910, 460));

        table.addTab("tab1", jPanel3);

        jPanel5.setBackground(new java.awt.Color(80, 79, 79));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label7.setForeground(new java.awt.Color(204, 0, 204));
        label7.setText("Commantaire");
        jPanel5.add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 26, 160, 35));

        comm.setColumns(20);
        comm.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        comm.setRows(5);
        jScrollPane1.setViewportView(comm);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 190, 580, 150));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ecriver votre Commantaire:");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 310, 29));

        envoyer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        envoyer.setText("Envoyer");
        envoyer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                envoyerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                envoyerMouseExited(evt);
            }
        });
        jPanel5.add(envoyer, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 170, 37));

        table.addTab("tab3", jPanel5);

        jPanel4.setBackground(new java.awt.Color(80, 79, 79));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 204));
        jLabel6.setText("Liste commandé");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 34, 194, 35));

        total.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });
        jPanel4.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 230, 40));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 51, 255));
        jLabel28.setText("Prix tatal:");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 366, 110, 30));

        valider.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        valider.setText("Valider");
        valider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                validerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                validerMouseExited(evt);
            }
        });
        valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerActionPerformed(evt);
            }
        });
        jPanel4.add(valider, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 362, 150, 40));

        table_panier.setForeground(new java.awt.Color(255, 255, 255));
        table_panier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "type", "contité", "taille", "prix"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(table_panier);
        if (table_panier.getColumnModel().getColumnCount() > 0) {
            table_panier.getColumnModel().getColumn(0).setResizable(false);
            table_panier.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 670, 210));

        table.addTab("tab2", jPanel4);

        jPanel2.add(table, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 950, 630));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 930, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       table.setSelectedIndex(0);
       remplire();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          table.setSelectedIndex(2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        table.setSelectedIndex(1);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void envoyerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_envoyerMouseExited
        envoyer.setBackground(Color.white);
        envoyer.setForeground(Color.black);
    }//GEN-LAST:event_envoyerMouseExited

    private void envoyerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_envoyerMouseEntered
        envoyer.setBackground(Color.blue);
        envoyer.setForeground(Color.white);
    }//GEN-LAST:event_envoyerMouseEntered

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
           inter ab= new inter();
           ab.setTitle("Aplication de abdelkhalk");
           ab.setVisible(true);
           ab.setLocationRelativeTo(null);
           this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
          Cursor ab=new Cursor(Cursor.HAND_CURSOR);
          jLabel9.setCursor(ab);
    }//GEN-LAST:event_jLabel9MouseEntered

    private void validerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validerMouseEntered
            valider.setBackground(Color.blue);
            valider.setForeground(Color.white);
    }//GEN-LAST:event_validerMouseEntered

    private void validerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validerMouseExited

          valider.setBackground(Color.white);
            valider.setForeground(Color.black);
    }//GEN-LAST:event_validerMouseExited

    private void acheter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acheter1ActionPerformed
       
          String tp=titre1.getText();
          String ta=(String)taille1.getValue();
          String con=(String)contité1.getValue();
          String pri=prix1.getText();
            String data[]={tp,con,ta,pri};
                    DefaultTableModel ab=(DefaultTableModel)table_panier.getModel();
                    ab.addRow(data);
                    JOptionPane.showMessageDialog(null, "valider");
                    int numrow = table_panier.getRowCount();
                    double tot=0;
                    for(int i=0; i<numrow;i++){
                        double val= Double.parseDouble(table_panier.getValueAt(i, 3).toString());
                        tot+=val;
                    }
                    totalprix=tot;
                    total.setText(String.valueOf(tot)+"DH");
    }//GEN-LAST:event_acheter1ActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        
    }//GEN-LAST:event_totalActionPerformed

    private void validerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerActionPerformed
          String[][] tab1 =new String[20][20];
          int a=table_panier.getRowCount();
          DefaultTableModel model = (DefaultTableModel)table_panier.getModel();
          for(int i=0;i<a;i++){
              for(int j=0;j<4;j++){
                  tab1[i][j]=String.valueOf(model.getValueAt(i, j));
              }
          }
         
          double pri=totalprix;
          String com=comm.getText();
          Valider ab= new Valider(pri,com,a);
          ab.setVisible(true);
          ab.setLocationRelativeTo(null);
          
           for(int i=0;i<a;i++){
              for(int j=0;j<4;j++){
                  ab.comande[i][j]=tab1[i][j];
              }
          }
            this.dispose();
    }//GEN-LAST:event_validerActionPerformed

    private void acheter4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acheter4ActionPerformed

          String tp=titre4.getText();
          String ta=(String)taille4.getValue();
          String con=(String)contité4.getValue();
          String pri=prix4.getText();
          String data[]={tp,con,ta,pri};
                    DefaultTableModel ab=(DefaultTableModel)table_panier.getModel();
                    ab.addRow(data);
                    JOptionPane.showMessageDialog(null, "valider");
                    int numrow = table_panier.getRowCount();
                    double tot=0;
                    for(int i=0; i<numrow;i++){
                        double val= Double.parseDouble(table_panier.getValueAt(i, 3).toString());
                        tot+=val;
                    }
                    totalprix=tot;
                    total.setText(String.valueOf(tot)+"DH");
    }//GEN-LAST:event_acheter4ActionPerformed

    private void acheter5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acheter5ActionPerformed
         
          String tp=titre5.getText();
          String ta=(String)taille5.getValue();
          String con=(String)contité5.getValue();
          String pri=prix5.getText();
            String data[]={tp,con,ta,pri};
                    DefaultTableModel ab=(DefaultTableModel)table_panier.getModel();
                    ab.addRow(data);
                    JOptionPane.showMessageDialog(null, "valider");
                    int numrow = table_panier.getRowCount();
                    double tot=0;
                    for(int i=0; i<numrow;i++){
                        double val= Double.parseDouble(table_panier.getValueAt(i, 3).toString());
                        tot+=val;
                    }
                    totalprix=tot;
                    total.setText(String.valueOf(tot)+"DH");
    }//GEN-LAST:event_acheter5ActionPerformed

    private void acheter6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acheter6ActionPerformed
       
          String tp=titre6.getText();
          String ta=(String)taille6.getValue();
          String con=(String)contité6.getValue();
          String pri=prix6.getText();
            String data[]={tp,con,ta,pri};
                    DefaultTableModel ab=(DefaultTableModel)table_panier.getModel();
                    ab.addRow(data);
                    JOptionPane.showMessageDialog(null, "valider");
                    int numrow = table_panier.getRowCount();
                    double tot=0;
                    for(int i=0; i<numrow;i++){
                        double val=Double.parseDouble(table_panier.getValueAt(i, 3).toString());
                        tot+=val;
                    }
                    totalprix=tot;
                    total.setText(String.valueOf(tot)+"DH");
    }//GEN-LAST:event_acheter6ActionPerformed

    private void acheter3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acheter3ActionPerformed
        
          String tp=titre3.getText();
          String ta=(String)taille3.getValue();
          String con=(String)contité3.getValue();
          String pri=prix3.getText();
            String data[]={tp,con,ta,pri};
                    DefaultTableModel ab=(DefaultTableModel)table_panier.getModel();
                    ab.addRow(data);
                    JOptionPane.showMessageDialog(null, "valider");
                    int numrow = table_panier.getRowCount();
                    double tot=0;
                    for(int i=0; i<numrow;i++){
                        double val= Double.parseDouble(table_panier.getValueAt(i, 3).toString());
                        tot+=val;
                    }
                    totalprix=tot;
                    total.setText(String.valueOf(tot)+"DH");
    }//GEN-LAST:event_acheter3ActionPerformed

    private void acheter2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acheter2ActionPerformed
     
          String tp=titre2.getText();
          String ta=(String)taille2.getValue();
          String con=(String)contité2.getValue();
          String pri=prix2.getText();
          String data[]={tp,con,ta,pri};
                    DefaultTableModel ab=(DefaultTableModel)table_panier.getModel();
                    ab.addRow(data);
                    JOptionPane.showMessageDialog(null, "valider");
                    int numrow = table_panier.getRowCount();
                    double tot=0;
                    for(int i=0; i<numrow;i++){
                        double val= Double.parseDouble(table_panier.getValueAt(i, 3).toString());
                        tot+=val;
                    }
                    totalprix=tot;
                    total.setText(String.valueOf(tot)+"DH");
    }//GEN-LAST:event_acheter2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acheter1;
    private javax.swing.JButton acheter2;
    private javax.swing.JButton acheter3;
    private javax.swing.JButton acheter4;
    private javax.swing.JButton acheter5;
    private javax.swing.JButton acheter6;
    private javax.swing.JTextArea comm;
    private javax.swing.JSpinner contité1;
    private javax.swing.JSpinner contité2;
    private javax.swing.JSpinner contité3;
    private javax.swing.JSpinner contité4;
    private javax.swing.JSpinner contité5;
    private javax.swing.JSpinner contité6;
    private javax.swing.JButton envoyer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel la_date;
    private javax.swing.JLabel label7;
    private javax.swing.JPanel pane2;
    private javax.swing.JLabel photo1;
    private javax.swing.JLabel photo2;
    private javax.swing.JLabel photo3;
    private javax.swing.JLabel photo4;
    private javax.swing.JLabel photo5;
    private javax.swing.JLabel photo6;
    private javax.swing.JLabel prix1;
    private javax.swing.JLabel prix2;
    private javax.swing.JLabel prix3;
    private javax.swing.JLabel prix4;
    private javax.swing.JLabel prix5;
    private javax.swing.JLabel prix6;
    private javax.swing.JTabbedPane table;
    private projet.Tab table_panier;
    private javax.swing.JSpinner taille1;
    private javax.swing.JSpinner taille2;
    private javax.swing.JSpinner taille3;
    private javax.swing.JSpinner taille4;
    private javax.swing.JSpinner taille5;
    private javax.swing.JSpinner taille6;
    private javax.swing.JLabel titre1;
    private javax.swing.JLabel titre2;
    private javax.swing.JLabel titre3;
    private javax.swing.JLabel titre4;
    private javax.swing.JLabel titre5;
    private javax.swing.JLabel titre6;
    private javax.swing.JTextField total;
    private javax.swing.JButton valider;
    // End of variables declaration//GEN-END:variables
}
