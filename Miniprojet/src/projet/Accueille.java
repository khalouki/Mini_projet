
package projet;
import java.awt.*;
import java.io.File;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Accueille extends javax.swing.JFrame {
     public  int id;
    public Accueille(int i) {
        initComponents();
        this.id=i;
        java.util.Date datee=new java.util.Date();
        date.setText(String.valueOf(String.valueOf(datee)));
        prix_pro.setText("0");
    }
  public JLabel titre(){
      return title;
  } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        pane = new javax.swing.JPanel();
        page = new javax.swing.JButton();
        cata = new javax.swing.JButton();
        histo = new javax.swing.JButton();
        comm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        grand_panel = new javax.swing.JPanel();
        pane1 = new javax.swing.JPanel();
        deco = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        table_pane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jTextField12 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        suprimer = new javax.swing.JButton();
        nom_pro = new javax.swing.JTextField();
        prix_pro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        add_file = new javax.swing.JButton();
        refrech = new javax.swing.JLabel();
        modifer = new javax.swing.JButton();
        ajouter = new javax.swing.JButton();
        chercher = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_pro = new projet.Tab();
        img_pro = new javax.swing.JTextField();
        type_pro = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        nom_his = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        client = new projet.Tab();
        prenom_his = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cherche = new javax.swing.JButton();
        jTextField11 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_com = new projet.Tab();
        jTextField9 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Bienvenu Ms");

        title.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 80));

        pane.setBackground(new java.awt.Color(51, 51, 51));
        pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        page.setBackground(new java.awt.Color(0, 102, 102));
        page.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        page.setForeground(new java.awt.Color(255, 255, 255));
        page.setText("Accueille");
        page.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pageMouseExited(evt);
            }
        });
        page.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pageActionPerformed(evt);
            }
        });
        pane.add(page, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 43, 221, 39));

        cata.setBackground(new java.awt.Color(0, 102, 102));
        cata.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cata.setForeground(new java.awt.Color(255, 255, 255));
        cata.setText("cattalogue");
        cata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cataMouseExited(evt);
            }
        });
        cata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cataActionPerformed(evt);
            }
        });
        pane.add(cata, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 115, 221, 39));

        histo.setBackground(new java.awt.Color(0, 102, 102));
        histo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        histo.setForeground(new java.awt.Color(255, 255, 255));
        histo.setText("historique de vente");
        histo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                histoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                histoMouseExited(evt);
            }
        });
        histo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                histoActionPerformed(evt);
            }
        });
        pane.add(histo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 194, 221, 39));

        comm.setBackground(new java.awt.Color(0, 102, 102));
        comm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comm.setForeground(new java.awt.Color(255, 255, 255));
        comm.setText("commantaire");
        comm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                commMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                commMouseExited(evt);
            }
        });
        comm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commActionPerformed(evt);
            }
        });
        pane.add(comm, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 268, 221, 42));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Desktop\\java projet\\Miniprojet\\src\\image projet\\home2.png")); // NOI18N
        pane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 35, -1, 39));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Desktop\\java projet\\Miniprojet\\src\\image projet\\market.png")); // NOI18N
        pane.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 100, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Desktop\\java projet\\Miniprojet\\src\\image projet\\archife.png")); // NOI18N
        pane.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 186, 59, 47));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Desktop\\java projet\\Miniprojet\\src\\image projet\\como.png")); // NOI18N
        pane.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 268, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Desktop\\java projet\\Miniprojet\\src\\image projet\\insta.png")); // NOI18N
        pane.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 46, 48));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Desktop\\java projet\\Miniprojet\\src\\image projet\\what.png")); // NOI18N
        pane.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 46, 48));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Desktop\\java projet\\Miniprojet\\src\\image projet\\face.png")); // NOI18N
        pane.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 46, 48));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel8.setText("Copyright @ abdelkhalk essaid");
        pane.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 187, 27));

        getContentPane().add(pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 320, 520));

        grand_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pane1.setBackground(new java.awt.Color(122, 115, 115));
        pane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        deco.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        deco.setForeground(new java.awt.Color(204, 204, 204));
        deco.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Desktop\\java projet\\Miniprojet\\src\\image projet\\deco.png")); // NOI18N
        deco.setText("Deconnection");
        deco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                decoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                decoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                decoMouseExited(evt);
            }
        });
        pane1.add(deco, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 0, 110, 32));

        date.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        pane1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 351, 30));

        grand_panel.add(pane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 30));

        table_pane.setBackground(new java.awt.Color(243, 237, 237));
        table_pane.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPanel1.setBackground(new java.awt.Color(243, 237, 237));

        jPanel5.setBackground(new java.awt.Color(239, 222, 239));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel13.setText("Total produit");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 156, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(239, 222, 239));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel18.setText("produit a vender");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 156, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(239, 222, 239));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel15.setText("Nombre de client");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 156, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(239, 222, 239));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(255, 204, 0));
        jTextField12.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jTextField12.setText("                                                            Statistique");
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(118, 118, 118))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(201, 201, 201))
        );

        table_pane.addTab("tab1", jPanel1);

        jPanel2.setBackground(new java.awt.Color(246, 239, 239));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        suprimer.setBackground(new java.awt.Color(255, 0, 51));
        suprimer.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        suprimer.setText("Supprimer");
        suprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suprimerMouseClicked(evt);
            }
        });
        suprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suprimerActionPerformed(evt);
            }
        });
        jPanel2.add(suprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 188, 30));
        jPanel2.add(nom_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 223, 30));
        jPanel2.add(prix_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 223, 32));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel9.setText("Nom:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 142, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel10.setText("Prix:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 174, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel11.setText("image:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 145, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel12.setText("Type:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 180, -1));

        add_file.setBackground(new java.awt.Color(204, 0, 204));
        add_file.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        add_file.setText("add");
        add_file.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_fileMouseClicked(evt);
            }
        });
        jPanel2.add(add_file, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 70, -1));

        refrech.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Desktop\\java projet\\Miniprojet\\src\\image projet\\refrech.png")); // NOI18N
        refrech.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refrechMouseClicked(evt);
            }
        });
        jPanel2.add(refrech, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, -1, 30));

        modifer.setBackground(new java.awt.Color(0, 0, 255));
        modifer.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        modifer.setForeground(new java.awt.Color(255, 255, 255));
        modifer.setText("Modifer");
        modifer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modiferActionPerformed(evt);
            }
        });
        jPanel2.add(modifer, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 188, 30));

        ajouter.setBackground(new java.awt.Color(102, 255, 0));
        ajouter.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        ajouter.setText("ajouter");
        ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterActionPerformed(evt);
            }
        });
        jPanel2.add(ajouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 200, 30));

        chercher.setBackground(new java.awt.Color(255, 0, 255));
        chercher.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        chercher.setText("chercher");
        jPanel2.add(chercher, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 100, 30));

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(255, 204, 0));
        jTextField10.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jTextField10.setText("                                                            Cattalogue");
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 690, 32));

        table_pro.setForeground(new java.awt.Color(255, 255, 255));
        table_pro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nom", "prix", "type", "image"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_pro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_proMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(table_pro);
        if (table_pro.getColumnModel().getColumnCount() > 0) {
            table_pro.getColumnModel().getColumn(0).setResizable(false);
            table_pro.getColumnModel().getColumn(1).setResizable(false);
            table_pro.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 680, 220));
        jPanel2.add(img_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 240, 30));

        type_pro.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        type_pro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pantalon", "chemis", "spadry", "chausset", "jacket", "casket" }));
        jPanel2.add(type_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 250, 30));

        table_pane.addTab("tab2", jPanel2);

        jPanel4.setBackground(new java.awt.Color(243, 237, 237));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(nom_his, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 250, 30));

        client.setForeground(new java.awt.Color(255, 255, 255));
        client.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nom", "contité", "taille", "prix", "nom client", "prenom"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(client);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 680, 330));

        prenom_his.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenom_hisActionPerformed(evt);
            }
        });
        jPanel4.add(prenom_his, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 270, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel16.setText("nom:");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 130, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel17.setText("prenom:");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 210, -1));

        cherche.setBackground(new java.awt.Color(255, 255, 102));
        cherche.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        cherche.setText("CHERCHER");
        cherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chercheActionPerformed(evt);
            }
        });
        jPanel4.add(cherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 160, -1));

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(255, 204, 0));
        jTextField11.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jTextField11.setText("                                                           Historique");
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 690, 32));

        table_pane.addTab("tab3", jPanel4);

        jPanel6.setBackground(new java.awt.Color(243, 237, 237));
        jPanel6.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_com.setForeground(new java.awt.Color(255, 255, 255));
        table_com.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "name", "commantaire"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(table_com);
        if (table_com.getColumnModel().getColumnCount() > 0) {
            table_com.getColumnModel().getColumn(0).setPreferredWidth(40);
            table_com.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 680, 340));

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(255, 204, 0));
        jTextField9.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jTextField9.setText("                                                            Commantaire");
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 690, 32));

        table_pane.addTab("tab4", jPanel6);

        grand_panel.add(table_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 750, 600));

        getContentPane().add(grand_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 730, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pageActionPerformed
        table_pane.setSelectedIndex(0);
    }//GEN-LAST:event_pageActionPerformed

    private void commActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commActionPerformed
               table_pane.setSelectedIndex(3);
                 try{
                 DefaultTableModel model = (DefaultTableModel)table_com.getModel();
                   for(int i = model.getRowCount(); i > 0; --i) model.removeRow(i-1);     
                ResultSet r;
                conn_bd conn= new conn_bd();
                Connection con=conn.getcon();
                String g="SELECT  nom,commantaire FROM client";
                PreparedStatement st = con.prepareStatement(g);
                r=st.executeQuery();
                while(r.next()){
                    Object data[]={r.getString(1),r.getString(2),};
                    DefaultTableModel ab=(DefaultTableModel)table_com.getModel();
                    ab.addRow(data);
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "erreur de commantiare");
            }
    }//GEN-LAST:event_commActionPerformed

    private void pageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pageMouseEntered
            page.setBackground(new Color(0,51,250));
            Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
            page.setCursor(cursor);
    }//GEN-LAST:event_pageMouseEntered

    private void pageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pageMouseExited
         page.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_pageMouseExited

    private void cataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cataMouseEntered
           cata.setBackground(new Color(0,51,250));
           Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
           cata.setCursor(cursor); 
    }//GEN-LAST:event_cataMouseEntered

    private void cataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cataMouseExited
         cata.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_cataMouseExited

    private void histoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_histoMouseEntered
         histo.setBackground(new Color(0,51,250));
           Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
           histo.setCursor(cursor);
    }//GEN-LAST:event_histoMouseEntered

    private void histoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_histoMouseExited
        histo.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_histoMouseExited

    private void commMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_commMouseEntered
         comm.setBackground(new Color(0,51,250));
         Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
         comm.setCursor(cursor);
    }//GEN-LAST:event_commMouseEntered

    private void commMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_commMouseExited
        comm.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_commMouseExited

    private void decoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decoMouseEntered
           deco.setForeground(new java.awt.Color(255, 255, 255));
           Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
           deco.setCursor(cursor);
    }//GEN-LAST:event_decoMouseEntered

    private void decoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decoMouseExited
        // TODO add your handling code here:
        deco.setForeground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_decoMouseExited

    private void decoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decoMouseClicked
             Login ab=new Login();
             ab.setVisible(true);
             ab.setLocationRelativeTo(null);
             this.dispose();
    }//GEN-LAST:event_decoMouseClicked

    private void cataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cataActionPerformed
          table_pane.setSelectedIndex(1);
          historique(table_pro);
    }//GEN-LAST:event_cataActionPerformed

    private void histoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_histoActionPerformed
           table_pane.setSelectedIndex(2);
           try{
                 DefaultTableModel model = (DefaultTableModel)client.getModel();
                  for(int i = model.getRowCount(); i > 0; --i) model.removeRow(i-1);     
                ResultSet r;
                conn_bd conn= new conn_bd();
                Connection con=conn.getcon();
                String g="SELECT *FROM commande";
                PreparedStatement st = con.prepareStatement(g);
                r=st.executeQuery();
                while(r.next()){
                    Object data[]={r.getString(1),r.getInt(2),r.getString(3),r.getInt(4),r.getString(5),r.getString(6)};
                    DefaultTableModel ab=(DefaultTableModel)client.getModel();
                    ab.addRow(data);
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "erreur de historique");
            } 
    }//GEN-LAST:event_histoActionPerformed

    private void add_fileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_fileMouseClicked
       JFileChooser ss=new  JFileChooser(); 
        int returnVal = ss.showOpenDialog(null);
    if (returnVal == JFileChooser.APPROVE_OPTION) {
         File file = ss.getSelectedFile();
         String filePath = file.getAbsolutePath();
         img_pro.setText(filePath);
       }
    }//GEN-LAST:event_add_fileMouseClicked

    private void refrechMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refrechMouseClicked
               historique(table_pro);
               nom_pro.setText("");
               prix_pro.setText("0");
               img_pro.setText("");
    }//GEN-LAST:event_refrechMouseClicked
    private void table_proMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_proMouseClicked
            int row = table_pro.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel)table_pro.getModel();
            nom_pro.setText((String)model.getValueAt(row, 0));
            prix_pro.setText(String.valueOf(model.getValueAt(row, 1)));
            type_pro.setSelectedItem(((String)model.getValueAt(row, 2)));
            img_pro.setText((String)model.getValueAt(row, 3));
            String nom=nom_pro.getText();
            String type=(String)type_pro.getSelectedItem();
            int pass= Integer.parseInt(prix_pro.getText());
            Connection con=new conn_bd().getcon();
         try {
             ResultSet r;
             PreparedStatement st=con.prepareStatement("select id_produit from produit where nom=? and prix=? and type=? and id_users=?");
             st.setString(1, nom);
             st.setInt(2, pass);
             st.setString(3, type);
             st.setInt(4, id);
             r=st.executeQuery();
             while(r.next()){ location=r.getInt(1);};
         } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erreur de selection");
         }
    }//GEN-LAST:event_table_proMouseClicked
public int location; 
    private void modiferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modiferActionPerformed
               String nom=nom_pro.getText();
               String type=String.valueOf(type_pro.getSelectedItem());
               int pass= Integer.parseInt(prix_pro.getText());
               if(nom.equals("")   || pass==0){
                     JOptionPane.showMessageDialog(null, "remplir tout les champs");
               }
              else{
                   try{
                   conn_bd conn = new conn_bd();
                   Connection con=  conn.getcon();
                   PreparedStatement st=con.prepareStatement("update produit set nom=?,type=?,prix=? where id_produit=? ");
                   st.setString(1, nom);
                   st.setString(2, type);
                   st.setInt(3, pass);
                   st.setInt(4, location);
                   st.execute();
                   JOptionPane.showMessageDialog(null, "la cas selecter a eté modifier fair un refrech pour voir la resulta👌👌👌");
            }catch(SQLException e){
                 JOptionPane.showMessageDialog(null, "les inforamtion non valider");
            }
          }
    }//GEN-LAST:event_modiferActionPerformed

    private void ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterActionPerformed
                 String nom=nom_pro.getText();
               String type=(String)type_pro.getSelectedItem();
               String image=img_pro.getText();
               int pass= Integer.parseInt(prix_pro.getText());
                 if(nom.equals("") || type.equals("") || image.equals("") || pass==0){
                      JOptionPane.showMessageDialog(null, "remplir tout les champs");
               }
        else{
            conn_bd test = new conn_bd();
            try{
                PreparedStatement st = test.getcon().prepareStatement("INSERT INTO produit(nom,prix,type,image,id_users) values(?,?,?,?,?)");
                st.setString(1, nom);
                st.setInt(2, pass);
                st.setString(3, type);
                st.setString(4, image);
                st.setInt(5, id);
                st.execute();
                JOptionPane.showMessageDialog( null,"OPERATION VALIDER");
               
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "les inforamtion non valider");
            }
        }
    }//GEN-LAST:event_ajouterActionPerformed

    private void suprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suprimerActionPerformed
                  String nom=nom_pro.getText();
               String type=(String)type_pro.getSelectedItem();
               int pass= Integer.parseInt(prix_pro.getText());
               if(nom.equals("") || type.equals("")  || pass==0){
                     JOptionPane.showMessageDialog(null, "remplir tout les champs");
               }
              else{
                  
                   try{
                   conn_bd conn = new conn_bd();
                   Connection con=  conn.getcon();
                   PreparedStatement st=con.prepareStatement("delete from produit  where id_produit=? ");
                   st.setInt(1, location);
                   st.execute();
                   JOptionPane.showMessageDialog(null, "le client a eté suprimer");
            }catch(SQLException e){
                 JOptionPane.showMessageDialog(null, "les inforamtion non valider");
            }
          }
    }//GEN-LAST:event_suprimerActionPerformed

    private void suprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suprimerMouseClicked
 
    }//GEN-LAST:event_suprimerMouseClicked

    private void prenom_hisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prenom_hisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prenom_hisActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void chercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chercheActionPerformed
                
              
             try{
                 DefaultTableModel model = (DefaultTableModel)client.getModel();
                   for(int i = model.getRowCount(); i > 0; --i) model.removeRow(i-1);     
                ResultSet r;
                conn_bd conn= new conn_bd();
                Connection con=conn.getcon();
                String g="SELECT  *FROM commande where nom_client=? and prenom_client=?";
                PreparedStatement st = con.prepareStatement(g);
                st.setString(1, nom_his.getText());
                st.setString(2, prenom_his.getText());
                r=st.executeQuery();
                while(r.next()){
                     Object data[]={r.getString(1),r.getInt(2),r.getString(3),r.getInt(4),r.getString(5),r.getString(6)};
                    DefaultTableModel ab=(DefaultTableModel)client.getModel();
                    ab.addRow(data);
                }
            }catch(SQLException e){
            } 
    }//GEN-LAST:event_chercheActionPerformed
   
     public void historique(JTable tab){
          try{
                 DefaultTableModel model = (DefaultTableModel)table_pro.getModel();
                   for(int i = model.getRowCount(); i > 0; --i) model.removeRow(i-1);     
                ResultSet r;
                conn_bd conn= new conn_bd();
                Connection con=conn.getcon();
                String g="SELECT  nom,prix,type,image FROM produit where id_users=?";
                PreparedStatement st = con.prepareStatement(g);
                st.setInt(1, id);
                r=st.executeQuery();
                while(r.next()){
                    Object data[]={r.getString(1),r.getInt(2),r.getString(3),r.getString(4)};
                    DefaultTableModel ab=(DefaultTableModel)table_pro.getModel();
                    ab.addRow(data);
                }
            }catch(SQLException e){
            } 
    }
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_file;
    private javax.swing.JButton ajouter;
    private javax.swing.JButton cata;
    private javax.swing.JButton cherche;
    private javax.swing.JButton chercher;
    private projet.Tab client;
    private javax.swing.JButton comm;
    private javax.swing.JLabel date;
    private javax.swing.JLabel deco;
    private javax.swing.JPanel grand_panel;
    private javax.swing.JButton histo;
    private javax.swing.JTextField img_pro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton modifer;
    private javax.swing.JTextField nom_his;
    private javax.swing.JTextField nom_pro;
    private javax.swing.JButton page;
    private javax.swing.JPanel pane;
    private javax.swing.JPanel pane1;
    private javax.swing.JTextField prenom_his;
    private javax.swing.JTextField prix_pro;
    private javax.swing.JLabel refrech;
    private javax.swing.JButton suprimer;
    private projet.Tab table_com;
    private javax.swing.JTabbedPane table_pane;
    private projet.Tab table_pro;
    private javax.swing.JLabel title;
    private javax.swing.JComboBox<String> type_pro;
    // End of variables declaration//GEN-END:variables
}
