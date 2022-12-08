/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package admin;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import login.KoneksiDB;
import login.utama;

/**
 *
 * @author LENOVO
 */
public class Admin extends javax.swing.JFrame {
    private static String usernme;
 private ArrayList<JPanel> menus = new ArrayList<>();
    private Color primaryColor = new Color(0,102,255);
    private Color primaryColorHover = new Color(108,163,247);
    /**
     * Creates new form Admin
     */
    
   
    public Admin(String username) {
        
        initComponents();
        this.setLocationRelativeTo(null);// center form in the screen
        this.usernme = username;
        labeladmin.setText(username);
        jLabel12.setText(usernme);
        setMenus();
        initHome();
        
    }
    
    public void hm(String username){
         this.usernme = username;
        jLabel12.setText(usernme);
    }
    private void resetActiveMenu() {
        menus.forEach(menu -> menu.setBackground(primaryColor));
    }
    
    private void setActiveMenu(JPanel menu) {
        resetActiveMenu();
        menu.setBackground(primaryColorHover);
    }
    
    private void setMenus() {
        menus.add(btnHome);
        menus.add(admin);
        menus.add(guru);
         menus.add(dtsiswa);
         menus.add(btnjurusan);
         menus.add(btnmapel);
        
    }
    
    private void initHome() {
        setActiveMenu(btnHome);
        setActivePanel(jPanel1, home);
        
    }
    
    private void setActivePanel(JPanel parentPanel, JPanel panel) {
        parentPanel.removeAll();
        parentPanel.repaint();
        parentPanel.revalidate();
        parentPanel.add(panel);
        parentPanel.repaint();
        parentPanel.revalidate();
    }
    
    void search (){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("id");
        tbl.addColumn("username");
        tbl.addColumn("password");
        tbl.addColumn("level");
        
        try {
            String sql = "SELECT * FROM login WHERE username LIKE '%" + cariadmin.getText() +  "%'";
            Connection con = (Connection) KoneksiDB.getKoneksi();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                tbl.addRow(new Object[] {
                    rs.getString("id"),
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getString("level"),

                });
                tblogin.setModel(tbl);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

 public void table(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("id");
        tbl.addColumn("username");
        tbl.addColumn("password");
         tbl.addColumn("level");
       
        
        try {
            Statement st = (Statement) KoneksiDB.getKoneksi().createStatement();
            ResultSet rs =st.executeQuery("SELECT * FROM login ");
            
            while(rs.next()){
                tbl.addRow(new Object[] {
                rs.getString("id"),
                rs.getString("username"),
                rs.getString("password"),
                rs.getString("level"),
              
                
                });
                tblogin.setModel(tbl);
            }

            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi Database gagal" + e.getMessage());
        }
    }
 
 //CRUD KUSUS DATA LOGIN
  void refreshlogin(){
        id.setText("");
        username.setText("");
        password.setText("");
 
        role.setSelectedItem("");
    
    }
 
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labeladmin = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        admin = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnHome = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        guru = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        dtsiswa = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btnjurusan = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        btnmapel = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        datalogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblogin = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        tambahlogin = new javax.swing.JButton();
        editlogin = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        hapuslogin = new javax.swing.JButton();
        role = new javax.swing.JComboBox<>();
        cariadmin = new javax.swing.JTextField();
        dataguru = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        np = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        tambahguru = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        editguru = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbguru = new javax.swing.JTable();
        cariguru = new javax.swing.JButton();
        hapusguru = new javax.swing.JButton();
        searchguru = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        notelp = new javax.swing.JTextField();
        datasiswa = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        editsiswa = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbsiswa = new javax.swing.JTable();
        carisiswa = new javax.swing.JButton();
        hapussiswa = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        searchsiswa1 = new javax.swing.JTextField();
        NIS = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        namasiswa = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        telpsiswa = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        tambahsiswa = new javax.swing.JButton();
        almt = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        kdjurusan = new javax.swing.JComboBox<>();
        datajurusan = new javax.swing.JPanel();
        tambahjurusan = new javax.swing.JButton();
        carijurusan = new javax.swing.JButton();
        hapusjurusan = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        searchjurusan = new javax.swing.JTextField();
        jrsan = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        kdkelas = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jurus = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        editjurusan = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbjurusan = new javax.swing.JTable();
        tingkat = new javax.swing.JComboBox<>();
        datamapel = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        carimapel = new javax.swing.JButton();
        jam = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        hapusmapel = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        editmapel = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbmapel = new javax.swing.JTable();
        searchmapel = new javax.swing.JTextField();
        nipp = new javax.swing.JComboBox<>();
        kdmapel = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        nmmapel = new javax.swing.JTextField();
        tambahmapel = new javax.swing.JButton();
        kodejurusan = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icon_user.png"))); // NOI18N

        labeladmin.setForeground(new java.awt.Color(255, 255, 255));
        labeladmin.setText("ADMIN");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icon_logout.png"))); // NOI18N
        jLabel4.setText("LOGOUT");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labeladmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(labeladmin))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 102, 255));

        admin.setBackground(new java.awt.Color(0, 102, 255));
        admin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icon_register.png"))); // NOI18N
        jLabel5.setText("DATA LOGIN");
        jLabel5.setIconTextGap(20);

        javax.swing.GroupLayout adminLayout = new javax.swing.GroupLayout(admin);
        admin.setLayout(adminLayout);
        adminLayout.setHorizontalGroup(
            adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        adminLayout.setVerticalGroup(
            adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(16, 16, 16))
        );

        btnHome.setBackground(new java.awt.Color(0, 102, 255));
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icon_home.png"))); // NOI18N
        jLabel6.setText("HOME");
        jLabel6.setIconTextGap(20);

        javax.swing.GroupLayout btnHomeLayout = new javax.swing.GroupLayout(btnHome);
        btnHome.setLayout(btnHomeLayout);
        btnHomeLayout.setHorizontalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnHomeLayout.setVerticalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnHomeLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        guru.setBackground(new java.awt.Color(0, 102, 255));
        guru.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guruMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icon_register.png"))); // NOI18N
        jLabel13.setText("DATA GURU");
        jLabel13.setIconTextGap(20);

        javax.swing.GroupLayout guruLayout = new javax.swing.GroupLayout(guru);
        guru.setLayout(guruLayout);
        guruLayout.setHorizontalGroup(
            guruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guruLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        guruLayout.setVerticalGroup(
            guruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guruLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel13)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        dtsiswa.setBackground(new java.awt.Color(0, 102, 255));
        dtsiswa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dtsiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dtsiswaMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icon_register.png"))); // NOI18N
        jLabel14.setText("DATA SISWA");
        jLabel14.setIconTextGap(20);

        javax.swing.GroupLayout dtsiswaLayout = new javax.swing.GroupLayout(dtsiswa);
        dtsiswa.setLayout(dtsiswaLayout);
        dtsiswaLayout.setHorizontalGroup(
            dtsiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dtsiswaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dtsiswaLayout.setVerticalGroup(
            dtsiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dtsiswaLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(16, 16, 16))
        );

        btnjurusan.setBackground(new java.awt.Color(0, 102, 255));
        btnjurusan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnjurusan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnjurusanMouseClicked(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icon_code.png"))); // NOI18N
        jLabel26.setText("DATA JURUSAN");
        jLabel26.setIconTextGap(20);

        javax.swing.GroupLayout btnjurusanLayout = new javax.swing.GroupLayout(btnjurusan);
        btnjurusan.setLayout(btnjurusanLayout);
        btnjurusanLayout.setHorizontalGroup(
            btnjurusanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnjurusanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        btnjurusanLayout.setVerticalGroup(
            btnjurusanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnjurusanLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addGap(16, 16, 16))
        );

        btnmapel.setBackground(new java.awt.Color(0, 102, 255));
        btnmapel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmapel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmapelMouseClicked(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icon_book.png"))); // NOI18N
        jLabel28.setText("DATA MAPEL");
        jLabel28.setIconTextGap(20);

        javax.swing.GroupLayout btnmapelLayout = new javax.swing.GroupLayout(btnmapel);
        btnmapel.setLayout(btnmapelLayout);
        btnmapelLayout.setHorizontalGroup(
            btnmapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnmapelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnmapelLayout.setVerticalGroup(
            btnmapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnmapelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(guru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dtsiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnjurusan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmapel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(guru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(dtsiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnjurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnmapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new java.awt.CardLayout());

        home.setBackground(new java.awt.Color(102, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("HALAMAN HOME");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Selamat Datang admin,");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homeLayout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(homeLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(461, Short.MAX_VALUE))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(571, Short.MAX_VALUE))
        );

        jPanel1.add(home, "card3");

        datalogin.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("DATA LOGIN");

        tblogin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "username", "password", "role"
            }
        ));
        tblogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbloginMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblogin);

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("id");

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("username");

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("password");

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("role");

        tambahlogin.setText("Tambah");
        tambahlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahloginActionPerformed(evt);
            }
        });

        editlogin.setText("edit");
        editlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editloginMouseClicked(evt);
            }
        });
        editlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editloginActionPerformed(evt);
            }
        });

        jButton3.setText("cari");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        hapuslogin.setText("hapus");
        hapuslogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusloginActionPerformed(evt);
            }
        });

        role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "siswa", "guru", "admin" }));

        javax.swing.GroupLayout dataloginLayout = new javax.swing.GroupLayout(datalogin);
        datalogin.setLayout(dataloginLayout);
        dataloginLayout.setHorizontalGroup(
            dataloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataloginLayout.createSequentialGroup()
                .addGroup(dataloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dataloginLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(dataloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataloginLayout.createSequentialGroup()
                                    .addComponent(tambahlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                .addGroup(dataloginLayout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(44, 44, 44)))
                            .addGroup(dataloginLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(86, 86, 86)))
                        .addGroup(dataloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(dataloginLayout.createSequentialGroup()
                                .addComponent(editlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(hapuslogin, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(dataloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dataloginLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(dataloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataloginLayout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(role, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataloginLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(34, 34, 34)
                                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataloginLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(dataloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cariadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3)))))
                    .addGroup(dataloginLayout.createSequentialGroup()
                        .addGap(0, 188, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 203, Short.MAX_VALUE))
            .addGroup(dataloginLayout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dataloginLayout.setVerticalGroup(
            dataloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataloginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(dataloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(20, 20, 20)
                .addGroup(dataloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(cariadmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dataloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapuslogin)
                    .addComponent(tambahlogin)
                    .addComponent(editlogin)
                    .addComponent(jButton3))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(datalogin, "card2");

        dataguru.setBackground(new java.awt.Color(153, 255, 255));

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("no telp");

        tambahguru.setText("Tambah");
        tambahguru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahguruActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("DATA GURU");

        editguru.setText("edit");
        editguru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editguruMouseClicked(evt);
            }
        });
        editguru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editguruActionPerformed(evt);
            }
        });

        tbguru.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "nip", "nama guru", "alamat", "no telp"
            }
        ));
        tbguru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbguruMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbguru);

        cariguru.setText("cari");
        cariguru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariguruActionPerformed(evt);
            }
        });

        hapusguru.setText("hapus");
        hapusguru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusguruActionPerformed(evt);
            }
        });

        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("nip");

        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("nama guru");

        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("alamat");

        javax.swing.GroupLayout dataguruLayout = new javax.swing.GroupLayout(dataguru);
        dataguru.setLayout(dataguruLayout);
        dataguruLayout.setHorizontalGroup(
            dataguruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataguruLayout.createSequentialGroup()
                .addGroup(dataguruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dataguruLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(dataguruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataguruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataguruLayout.createSequentialGroup()
                                    .addComponent(tambahguru, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                .addGroup(dataguruLayout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addGap(44, 44, 44)))
                            .addGroup(dataguruLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(86, 86, 86)))
                        .addGroup(dataguruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(np, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(dataguruLayout.createSequentialGroup()
                                .addComponent(editguru, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(hapusguru, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(dataguruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dataguruLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(dataguruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataguruLayout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(34, 34, 34))
                                    .addGroup(dataguruLayout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(33, 33, 33)))
                                .addGroup(dataguruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(alamat, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                    .addComponent(notelp)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataguruLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(dataguruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(searchguru, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cariguru)))))
                    .addGroup(dataguruLayout.createSequentialGroup()
                        .addGap(0, 188, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 203, Short.MAX_VALUE))
            .addGroup(dataguruLayout.createSequentialGroup()
                .addGap(404, 404, 404)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dataguruLayout.setVerticalGroup(
            dataguruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataguruLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(34, 34, 34)
                .addGroup(dataguruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(np, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(20, 20, 20)
                .addGroup(dataguruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(notelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(searchguru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dataguruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapusguru)
                    .addComponent(tambahguru)
                    .addComponent(editguru)
                    .addComponent(cariguru))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(dataguru, "card4");

        datasiswa.setBackground(new java.awt.Color(102, 255, 255));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("DATA SISWA");

        editsiswa.setText("edit");
        editsiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editsiswaMouseClicked(evt);
            }
        });
        editsiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editsiswaActionPerformed(evt);
            }
        });

        tbsiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "nip", "nama siswa", "alamat", "no telp", "kode jurusan"
            }
        ));
        tbsiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbsiswaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbsiswa);
        if (tbsiswa.getColumnModel().getColumnCount() > 0) {
            tbsiswa.getColumnModel().getColumn(4).setHeaderValue("kode jurusan");
        }

        carisiswa.setText("cari");
        carisiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carisiswaActionPerformed(evt);
            }
        });

        hapussiswa.setText("hapus");
        hapussiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapussiswaActionPerformed(evt);
            }
        });

        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("alamat");

        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("NIS");

        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("nama_siswa");

        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("no_telp");

        tambahsiswa.setText("Tambah");
        tambahsiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahsiswaActionPerformed(evt);
            }
        });

        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("kode jurusan");

        kdjurusan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kdjurusanMouseClicked(evt);
            }
        });
        kdjurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kdjurusanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout datasiswaLayout = new javax.swing.GroupLayout(datasiswa);
        datasiswa.setLayout(datasiswaLayout);
        datasiswaLayout.setHorizontalGroup(
            datasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datasiswaLayout.createSequentialGroup()
                .addGroup(datasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(datasiswaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(datasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datasiswaLayout.createSequentialGroup()
                                .addComponent(tambahsiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datasiswaLayout.createSequentialGroup()
                                    .addComponent(jLabel23)
                                    .addGap(44, 44, 44))
                                .addGroup(datasiswaLayout.createSequentialGroup()
                                    .addComponent(jLabel22)
                                    .addGap(86, 86, 86))))
                        .addGroup(datasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datasiswaLayout.createSequentialGroup()
                                .addGroup(datasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NIS, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(namasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(67, 67, 67))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datasiswaLayout.createSequentialGroup()
                                .addComponent(editsiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hapussiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(datasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(datasiswaLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(datasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datasiswaLayout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addGap(34, 34, 34))
                                    .addGroup(datasiswaLayout.createSequentialGroup()
                                        .addGroup(datasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel25))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(datasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(telpsiswa, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                    .addComponent(almt)
                                    .addComponent(kdjurusan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datasiswaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(datasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(searchsiswa1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(carisiswa)))))
                    .addGroup(datasiswaLayout.createSequentialGroup()
                        .addGap(0, 188, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 203, Short.MAX_VALUE))
            .addGroup(datasiswaLayout.createSequentialGroup()
                .addGap(404, 404, 404)
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        datasiswaLayout.setVerticalGroup(
            datasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datasiswaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addGap(34, 34, 34)
                .addGroup(datasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(telpsiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(20, 20, 20)
                .addGroup(datasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(namasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(almt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(datasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(kdjurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(searchsiswa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(datasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carisiswa)
                    .addComponent(hapussiswa)
                    .addComponent(editsiswa)
                    .addComponent(tambahsiswa))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(datasiswa, "card5");

        datajurusan.setBackground(new java.awt.Color(102, 255, 255));

        tambahjurusan.setText("Tambah");
        tambahjurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahjurusanActionPerformed(evt);
            }
        });

        carijurusan.setText("cari");
        carijurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carijurusanActionPerformed(evt);
            }
        });

        hapusjurusan.setText("hapus");
        hapusjurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusjurusanActionPerformed(evt);
            }
        });

        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("tingkat");

        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("kode jurusan");

        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("kode kelas");

        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("jurusan");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("DATA JURUSAN");

        editjurusan.setText("edit");
        editjurusan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editjurusanMouseClicked(evt);
            }
        });
        editjurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editjurusanActionPerformed(evt);
            }
        });

        tbjurusan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "kode jurusan", "kode kelas", "jurusan", "tingkat"
            }
        ));
        tbjurusan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbjurusanMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbjurusan);

        tingkat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "X", "XII", "XIII" }));

        javax.swing.GroupLayout datajurusanLayout = new javax.swing.GroupLayout(datajurusan);
        datajurusan.setLayout(datajurusanLayout);
        datajurusanLayout.setHorizontalGroup(
            datajurusanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datajurusanLayout.createSequentialGroup()
                .addGroup(datajurusanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(datajurusanLayout.createSequentialGroup()
                        .addContainerGap(211, Short.MAX_VALUE)
                        .addGroup(datajurusanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datajurusanLayout.createSequentialGroup()
                                .addComponent(tambahjurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datajurusanLayout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addGap(44, 44, 44))
                            .addGroup(datajurusanLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(datajurusanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datajurusanLayout.createSequentialGroup()
                                .addGroup(datajurusanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrsan, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kdkelas, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(67, 67, 67))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datajurusanLayout.createSequentialGroup()
                                .addComponent(editjurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hapusjurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(datajurusanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datajurusanLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(datajurusanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(searchjurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(carijurusan)))
                            .addGroup(datajurusanLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(datajurusanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datajurusanLayout.createSequentialGroup()
                                        .addComponent(jLabel31)
                                        .addGap(34, 34, 34))
                                    .addGroup(datajurusanLayout.createSequentialGroup()
                                        .addComponent(jLabel27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(datajurusanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jurus, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                    .addComponent(tingkat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(datajurusanLayout.createSequentialGroup()
                        .addGap(0, 188, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(202, 202, 202))
            .addGroup(datajurusanLayout.createSequentialGroup()
                .addGap(373, 373, 373)
                .addComponent(jLabel32)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        datajurusanLayout.setVerticalGroup(
            datajurusanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datajurusanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addGap(34, 34, 34)
                .addGroup(datajurusanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrsan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(jurus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(20, 20, 20)
                .addGroup(datajurusanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(kdkelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(tingkat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(searchjurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(datajurusanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carijurusan)
                    .addComponent(hapusjurusan)
                    .addComponent(editjurusan)
                    .addComponent(tambahjurusan))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(datajurusan, "card6");

        datamapel.setBackground(new java.awt.Color(153, 255, 255));

        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("nama mapel");

        carimapel.setText("cari");
        carimapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carimapelActionPerformed(evt);
            }
        });

        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("jam");

        hapusmapel.setText("hapus");
        hapusmapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusmapelActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("DATA MAPEL");

        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("kode jurusan");

        editmapel.setText("edit");
        editmapel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editmapelMouseClicked(evt);
            }
        });
        editmapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editmapelActionPerformed(evt);
            }
        });

        tbmapel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "kode mapel", "nama mapel", "jam", "kode jurusan", "kode mapel"
            }
        ));
        tbmapel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbmapelMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tbmapel);

        nipp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nippMouseClicked(evt);
            }
        });
        nipp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nippActionPerformed(evt);
            }
        });

        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("kode mapel");

        tambahmapel.setText("Tambah");
        tambahmapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahmapelActionPerformed(evt);
            }
        });

        kodejurusan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kodejurusanMouseClicked(evt);
            }
        });
        kodejurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodejurusanActionPerformed(evt);
            }
        });

        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("nip");

        javax.swing.GroupLayout datamapelLayout = new javax.swing.GroupLayout(datamapel);
        datamapel.setLayout(datamapelLayout);
        datamapelLayout.setHorizontalGroup(
            datamapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datamapelLayout.createSequentialGroup()
                .addGroup(datamapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(datamapelLayout.createSequentialGroup()
                        .addContainerGap(199, Short.MAX_VALUE)
                        .addGroup(datamapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datamapelLayout.createSequentialGroup()
                                .addComponent(tambahmapel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datamapelLayout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addGap(44, 44, 44))
                            .addGroup(datamapelLayout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(datamapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datamapelLayout.createSequentialGroup()
                                .addGroup(datamapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kdmapel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nmmapel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(67, 67, 67))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datamapelLayout.createSequentialGroup()
                                .addComponent(editmapel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hapusmapel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22)
                        .addGroup(datamapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(datamapelLayout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(datamapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(searchmapel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(carimapel)
                                    .addComponent(nipp, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(datamapelLayout.createSequentialGroup()
                                .addGroup(datamapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datamapelLayout.createSequentialGroup()
                                        .addComponent(jLabel34)
                                        .addGap(34, 34, 34))
                                    .addGroup(datamapelLayout.createSequentialGroup()
                                        .addComponent(jLabel36)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(datamapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jam, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kodejurusan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(datamapelLayout.createSequentialGroup()
                        .addGap(0, 188, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(202, 202, 202))
            .addGroup(datamapelLayout.createSequentialGroup()
                .addGap(373, 373, 373)
                .addComponent(jLabel35)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        datamapelLayout.setVerticalGroup(
            datamapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datamapelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35)
                .addGap(34, 34, 34)
                .addGroup(datamapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(datamapelLayout.createSequentialGroup()
                        .addGroup(datamapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kdmapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34)
                            .addComponent(jam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37))
                        .addGap(20, 20, 20)
                        .addGroup(datamapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(nmmapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36)
                            .addComponent(kodejurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nipp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel38))
                .addGap(24, 24, 24)
                .addComponent(searchmapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(datamapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carimapel)
                    .addComponent(hapusmapel)
                    .addComponent(editmapel)
                    .addComponent(tambahmapel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(datamapel, "card7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
         dispose();
        utama ea = new utama();
        ea.setVisible(true);
        ea.pack();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseClicked

        setActiveMenu(admin);
        setActivePanel(jPanel1, datalogin);
        table();
    }//GEN-LAST:event_adminMouseClicked

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
       hm(usernme);
        setActiveMenu(btnHome);
         setActivePanel(jPanel1, home);
         
    }//GEN-LAST:event_btnHomeMouseClicked

    private void hapusloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusloginActionPerformed
        // TODO add your handling code here:
        
        try {
            String sql = "DELETE FROM login WHERE id =' " + id.getText() + " ' ";

            Connection con = (Connection) KoneksiDB.getKoneksi();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil menghapus data admin");
            table();
             refreshlogin();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_hapusloginActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        search();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void editloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editloginActionPerformed
        // TODO add your handling code here:
         try {
            String sql = "UPDATE login SET id='"+id.getText()+"',username ='"+username.getText()
                    +"',password ='"+password.getText()+"',level ='"+role.getSelectedItem()+"'WHERE id='"+id.getText()+"'";
                    
            Connection con = (Connection) KoneksiDB.getKoneksi();
            PreparedStatement pst = con.prepareStatement(sql);  
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil megubah data admin");
            table();
             refreshlogin();
          } catch (Exception e) {
        
    }       
           
    }//GEN-LAST:event_editloginActionPerformed

    private void tambahloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahloginActionPerformed
        // TODO add your handling code here:
        try {
            String a = id.getText();
            String sql = "INSERT INTO login VALUES('"+a+"','"+username.getText()+"','"+password.getText()+"','"+role.getSelectedItem()+"')";
            Connection con =(Connection) KoneksiDB.getKoneksi();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();

            JOptionPane.showInternalMessageDialog(null, "Berhasil Menambahkan");
            table();
            refreshlogin();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menambahkan" + e.getMessage());

        }
    }//GEN-LAST:event_tambahloginActionPerformed

    private void editloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editloginMouseClicked
        // TODO add your handling code here:
          
    }//GEN-LAST:event_editloginMouseClicked

    private void tbloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbloginMouseClicked
        // TODO add your handling code here:
        
         int baris = tblogin.rowAtPoint(evt.getPoint());
        String i = tblogin.getValueAt(baris, 0).toString();
        id.setText(i);
        String user = tblogin.getValueAt(baris, 1).toString();
        username.setText(user);
        String pw = tblogin.getValueAt(baris, 2).toString();
        password.setText(pw);
        String admin = tblogin.getValueAt(baris, 3).toString();
        role.setSelectedItem(admin);
    }//GEN-LAST:event_tbloginMouseClicked

    
    
    //HALAMAN GURU
    
     void searchguru (){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("nip");
        tbl.addColumn("nama guru");
        tbl.addColumn("alamat");
        tbl.addColumn("no telp");
        
        try {
            String sql = "SELECT * FROM guru WHERE nama_guru LIKE '%" + searchguru.getText() +  "%'";
            Connection con = (Connection) KoneksiDB.getKoneksi();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                tbl.addRow(new Object[] {
                    rs.getString("nip"),
                    rs.getString("nama_guru"),
                    rs.getString("alamat"),
                    rs.getString("no_telp"),

                });
                tbguru.setModel(tbl);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

 public void tabelguru(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("nip");
        tbl.addColumn("nama guru");
        tbl.addColumn("alamat");
         tbl.addColumn("no telp");
       
        
        try {
            Statement st = (Statement) KoneksiDB.getKoneksi().createStatement();
            ResultSet rs =st.executeQuery("SELECT * FROM guru ");
            
            while(rs.next()){
                tbl.addRow(new Object[] {
                rs.getString("nip"),
                rs.getString("nama_guru"),
                rs.getString("alamat"),
                rs.getString("no_telp"),
              
                
                });
                tbguru.setModel(tbl);
            }

            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi Database gagal" + e.getMessage());
        }
    }
 
    void refreshguru(){
        np.setText("");
        nama.setText("");
        alamat.setText("");
 
        notelp.setText("");
    
    }
    
    
    private void guruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guruMouseClicked
        // TODO add your handling code here:
         setActiveMenu(guru);
        setActivePanel(jPanel1, dataguru);
        tabelguru();
    }//GEN-LAST:event_guruMouseClicked

    private void tambahguruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahguruActionPerformed
        // TODO add your handling code here:
         try {
            String a = np.getText();
            String sql = "INSERT INTO guru VALUES('"+a+"','"+nama.getText()+"','"+alamat.getText()+"','"+notelp.getText()+"')";
            Connection con =(Connection) KoneksiDB.getKoneksi();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();

            JOptionPane.showInternalMessageDialog(null, "Berhasil Menambahkan");
            tabelguru();
            refreshguru();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menambahkan" + e.getMessage());

        }
    }//GEN-LAST:event_tambahguruActionPerformed

    private void editguruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editguruMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_editguruMouseClicked

    private void editguruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editguruActionPerformed
        // TODO add your handling code here:
          try {
            String sql = "UPDATE guru SET nip='"+np.getText()+"',nama_guru ='"+nama.getText()
                    +"',alamat ='"+alamat.getText()+"',no_telp ='"+notelp.getText()+"'WHERE nip='"+np.getText()+"'";
                    
            Connection con = (Connection) KoneksiDB.getKoneksi();
            PreparedStatement pst = con.prepareStatement(sql);  
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil megubah data guru");
             tabelguru();
             refreshguru();
          } catch (Exception e) {
        
    }       
    }//GEN-LAST:event_editguruActionPerformed

    private void tbguruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbguruMouseClicked
        // TODO add your handling code here:
        int baris = tbguru.rowAtPoint(evt.getPoint());
        String a = tbguru.getValueAt(baris, 0).toString();
        np.setText(a);
        String namaguru = tbguru.getValueAt(baris, 1).toString();
        nama.setText(namaguru);
        String almt = tbguru.getValueAt(baris, 2).toString();
        alamat.setText(almt);
        String telp = tbguru.getValueAt(baris, 3).toString();
        notelp.setText(telp);
        
        
        
        
        
    }//GEN-LAST:event_tbguruMouseClicked

    private void cariguruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariguruActionPerformed
        // TODO add your handling code here:
        searchguru();
    }//GEN-LAST:event_cariguruActionPerformed

    private void hapusguruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusguruActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "DELETE FROM guru WHERE nip =' " + np.getText() + " ' ";

            Connection con = (Connection) KoneksiDB.getKoneksi();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil menghapus data guru");
            tabelguru();
            refreshguru();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_hapusguruActionPerformed

    
    
    //KUSUS SISWA
    
    private void dtsiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dtsiswaMouseClicked
        // TODO add your handling code here:
     
            setActiveMenu(dtsiswa);
        setActivePanel(jPanel1, datasiswa);
        tabelsiswa();
        combojurusan();
        
         
        
    }//GEN-LAST:event_dtsiswaMouseClicked

    
    
    
    
     void searchsiswa (){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("nis");
        tbl.addColumn("nama siswa");
        tbl.addColumn("alamat");
        tbl.addColumn("no telp");
        tbl.addColumn("kode jurusan");
        
        try {
            String sql = "SELECT * FROM siswa WHERE nama_siswa LIKE '%" + searchsiswa1.getText() +  "%'";
            Connection con = (Connection) KoneksiDB.getKoneksi();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                tbl.addRow(new Object[] {
                    rs.getString("NIS"),
                    rs.getString("nama_siswa"),
                    rs.getString("alamat"),
                    rs.getString("no_telp"),
                     rs.getString("kode_jurusan"),

                });
                tbsiswa.setModel(tbl);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
 public void combojurusan(){
        DefaultTableModel tbl = new DefaultTableModel();
      
          tbl.addColumn("kode jurusan");
      
        
        try {
            String sql = "SELECT * FROM jurusan";
            Connection con = (Connection) KoneksiDB.getKoneksi();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                tbl.addRow(new Object[] {
                   rs.getString("kode_jurusan"),
                   

                });
                
            
              kdjurusan.addItem(rs.getString("kode_jurusan"));
                
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
   }
 public void tabelsiswa(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("nis");
        tbl.addColumn("nama siswa");
        tbl.addColumn("alamat");
        tbl.addColumn("no telp");
        tbl.addColumn("kode jurusan");
        
        try {
            String sql = "SELECT * FROM siswa";
            Connection con = (Connection) KoneksiDB.getKoneksi();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                tbl.addRow(new Object[] {
                    rs.getString("NIS"),
                    rs.getString("nama_siswa"),
                    rs.getString("alamat"),
                    rs.getString("no_telp"),
                     rs.getString("kode_jurusan"),

                });
                
                tbsiswa.setModel(tbl);
              
                
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
     void refreshsiswa(){
        NIS.setText("");
        namasiswa.setText("");
        telpsiswa.setText("");
        almt.setText("");
 
        kdjurusan.setSelectedItem("");
    
    }
    private void editsiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editsiswaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_editsiswaMouseClicked

    private void editsiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editsiswaActionPerformed
        // TODO add your handling code here:
          try {
            String sql = "UPDATE siswa SET NIS='"+NIS.getText()+"',nama_siswa ='"+namasiswa.getText()
                    +"',alamat ='"+almt.getText()+"',no_telp ='"+telpsiswa.getText()+"',kode_jurusan ='"+kdjurusan.getSelectedItem()+"'WHERE NIS='"+NIS.getText()+"'";
                    
            Connection con = (Connection) KoneksiDB.getKoneksi();
            PreparedStatement pst = con.prepareStatement(sql);  
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil megubah data siswa");
             tabelsiswa();
             refreshsiswa();
          } catch (Exception e) {
        
    }       
    }//GEN-LAST:event_editsiswaActionPerformed

    private void tbsiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbsiswaMouseClicked
        // TODO add your handling code here:
         int baris = tbsiswa.rowAtPoint(evt.getPoint());
        String a = tbsiswa.getValueAt(baris, 0).toString();
        NIS.setText(a);
        String namaguru = tbsiswa.getValueAt(baris, 1).toString();
        namasiswa.setText(namaguru);
        String almts = tbsiswa.getValueAt(baris, 2).toString();
        almt.setText(almts);
        String telp = tbsiswa.getValueAt(baris, 3).toString();
        telpsiswa.setText(telp);
        String kd = tbsiswa.getValueAt(baris, 4).toString();
        kdjurusan.setSelectedItem(kd);
    }//GEN-LAST:event_tbsiswaMouseClicked

    private void carisiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carisiswaActionPerformed
        // TODO add your handling code here
        searchsiswa();
    }//GEN-LAST:event_carisiswaActionPerformed

    private void hapussiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapussiswaActionPerformed
        // TODO add your handling code here:
        
         try {
            String sql = "DELETE FROM siswa WHERE NIS =' " + NIS.getText() + " ' ";

            Connection con = (Connection) KoneksiDB.getKoneksi();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil menghapus data siswa");
            tabelsiswa();
            refreshsiswa();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_hapussiswaActionPerformed

    private void tambahsiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahsiswaActionPerformed
        // TODO add your handling code here:
        
         try {
            String a = NIS.getText();
            String sql = "INSERT INTO siswa VALUES('"+a+"','"+namasiswa.getText()+ "','"+telpsiswa.getText()+"','"+almt.getText()+"','"+kdjurusan.getSelectedItem()+"')";
            Connection con =(Connection) KoneksiDB.getKoneksi();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();

            JOptionPane.showInternalMessageDialog(null, "Berhasil Menambahkan");
            tabelsiswa();
            refreshsiswa();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menambahkan" + e.getMessage());

        }
    }//GEN-LAST:event_tambahsiswaActionPerformed

    

    
    
    //KUSUS JURUSAN
    
    
    
     void searchjurusan (){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("kode jurusan");
        tbl.addColumn("kode kelas");
        tbl.addColumn("jurusan");
        tbl.addColumn("tingkat");
       
        
        try {
            String sql = "SELECT * FROM jurusan WHERE jurusan LIKE '%" + searchjurusan.getText() +  "%'";
            Connection con = (Connection) KoneksiDB.getKoneksi();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                tbl.addRow(new Object[] {
                    rs.getString("kode_jurusan"),
                    rs.getString("kode_kelas"),
                     rs.getString("jurusan"),
                    rs.getString("tingkat"),
                   
                   

                });
                tbjurusan.setModel(tbl);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

 public void tabeljurusan(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("kode jurusan");
        tbl.addColumn("kode kelas");
        tbl.addColumn("jurusan");
        tbl.addColumn("tingkat");
    
        
        try {
            String sql = "SELECT * FROM jurusan";
            Connection con = (Connection) KoneksiDB.getKoneksi();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                tbl.addRow(new Object[] {
                    rs.getString("kode_jurusan"),
                    rs.getString("kode_kelas"),
                    rs.getString("jurusan"),
                    rs.getString("tingkat"),
                     

                });
                tbjurusan.setModel(tbl);
             
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
 
  void refreshjurusan(){
        jrsan.setText("");
        kdkelas.setText("");
        jurus.setText("");
      
 
        tingkat.setSelectedItem("");
    
    }
    
    private void btnjurusanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnjurusanMouseClicked
        // TODO add your handling code here
 setActiveMenu(btnjurusan);
        setActivePanel(jPanel1, datajurusan);
        tabeljurusan();
    }//GEN-LAST:event_btnjurusanMouseClicked

    private void tambahjurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahjurusanActionPerformed
        // TODO add your handling code here:
         try {
            String a = jrsan.getText();
            String sql = "INSERT INTO jurusan VALUES('"+a+"','"+kdkelas.getText()+"','"+jurus.getText()+"','"+tingkat.getSelectedItem()+"')";
            Connection con =(Connection) KoneksiDB.getKoneksi();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();

            JOptionPane.showInternalMessageDialog(null, "Berhasil Menambahkan");
            tabeljurusan();
            refreshjurusan();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menambahkan" + e.getMessage());

        }
    }//GEN-LAST:event_tambahjurusanActionPerformed

    private void carijurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carijurusanActionPerformed
        // TODO add your handling code here:
        searchjurusan();
    }//GEN-LAST:event_carijurusanActionPerformed

    private void hapusjurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusjurusanActionPerformed
        // TODO add your handling code here:
         try {
            String sql = "DELETE FROM jurusan WHERE kode_jurusan =' " + jrsan.getText() + " ' ";

            Connection con = (Connection) KoneksiDB.getKoneksi();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil menghapus data jurusan");
            tabeljurusan();
            refreshjurusan();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_hapusjurusanActionPerformed

    private void editjurusanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editjurusanMouseClicked
        // TODO add your handling code here:
        
         try {
            String sql = "UPDATE jurusan SET kode_jurusan='"+jrsan.getText()+"',kode_kelas ='"+kdkelas.getText()
                    +"',jurusan ='"+jurus.getText()+"',tingkat ='"+tingkat.getSelectedItem()+"'WHERE kode_jurusan='"+jrsan.getText()+"'";
                    
            Connection con = (Connection) KoneksiDB.getKoneksi();
            PreparedStatement pst = con.prepareStatement(sql);  
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil megubah data jurusan");
             tabeljurusan();
             refreshjurusan();
          } catch (Exception e) {
        
    }       
    }//GEN-LAST:event_editjurusanMouseClicked

    private void editjurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editjurusanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editjurusanActionPerformed

    private void tbjurusanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbjurusanMouseClicked
        // TODO add your handling code here:
         int baris = tbjurusan.rowAtPoint(evt.getPoint());
        String a = tbjurusan.getValueAt(baris, 0).toString();
        jrsan.setText(a);
        String namaguru = tbjurusan.getValueAt(baris, 1).toString();
        kdkelas.setText(namaguru);
        String almts = tbjurusan.getValueAt(baris, 2).toString();
        jurus.setText(almts);
        String telp = tbjurusan.getValueAt(baris, 3).toString();
        tingkat.setSelectedItem(telp);
       
    }//GEN-LAST:event_tbjurusanMouseClicked

    private void kdjurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kdjurusanActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_kdjurusanActionPerformed

    private void kdjurusanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kdjurusanMouseClicked
        // TODO add your handling code here:
         try {
            Connection con = (Connection) KoneksiDB.getKoneksi();
             Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from jurusan where kode_jurusan='"+kdjurusan.getSelectedItem()+"'");
            
       
            
           
            
            
           
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_kdjurusanMouseClicked

    
    
    //KUSUS MAPEL
    
     void searchmapel (){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("kode mapel");
        tbl.addColumn("nama mapel");
        tbl.addColumn("jam");
        tbl.addColumn("kode jurusan");
        tbl.addColumn("nip");
        
        try {
            String sql = "SELECT * FROM mapel WHERE nama_mapel LIKE '%" + searchmapel.getText() +  "%'";
            Connection con = (Connection) KoneksiDB.getKoneksi();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                tbl.addRow(new Object[] {
                    rs.getString("kode_mapel"),
                    rs.getString("nama_mapel"),
                    rs.getString("jam"),
                    rs.getString("kode_jurusan"),
                     rs.getString("nip"),

                });
                tbmapel.setModel(tbl);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
   public void kdjurusan(){
        DefaultTableModel tbl = new DefaultTableModel();
      
          tbl.addColumn("kode jurusan");
      
        
        try {
            String sql = "SELECT * FROM jurusan";
            Connection con = (Connection) KoneksiDB.getKoneksi();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                tbl.addRow(new Object[] {
                   rs.getString("kode_jurusan"),
                   

                });
                
            
              kodejurusan.addItem(rs.getString("kode_jurusan"));
                
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
   }
    public void nip(){
        DefaultTableModel tbl = new DefaultTableModel();
      
          tbl.addColumn("nip");
      
        
        try {
            String sql = "SELECT * FROM guru";
            Connection con = (Connection) KoneksiDB.getKoneksi();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                tbl.addRow(new Object[] {
                   rs.getString("nip"),
                   

                });
                
            
              nipp.addItem(rs.getString("nip"));
                
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
   }
 public void tabelmapel(){
         DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("kode mapel");
        tbl.addColumn("nama mapel");
        tbl.addColumn("jam");
        tbl.addColumn("kode jurusan");
        tbl.addColumn("nip");
        
        try {
            String sql = "SELECT * FROM mapel";
            Connection con = (Connection) KoneksiDB.getKoneksi();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                tbl.addRow(new Object[] {
                    rs.getString("kode_mapel"),
                    rs.getString("nama_mapel"),
                    rs.getString("jam"),
                    rs.getString("kode_jurusan"),
                     rs.getString("nip"),

                });
                tbmapel.setModel(tbl);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
 
  void refreshmapel(){
        kdmapel.setText("");
        nmmapel.setText("");
        jam.setText("");
       
 
        kodejurusan.setSelectedItem("");
         nipp.setSelectedItem("");
    
    }
    
    private void btnmapelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmapelMouseClicked
        // TODO add your handling code here:
        setActiveMenu(btnmapel);
        setActivePanel(jPanel1, datamapel);
        tabelmapel();
        kdjurusan();
        nip();
    }//GEN-LAST:event_btnmapelMouseClicked

    private void carimapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carimapelActionPerformed
        // TODO add your handling code here:
        searchmapel();
    }//GEN-LAST:event_carimapelActionPerformed

    private void hapusmapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusmapelActionPerformed
        // TODO add your handling code here:
         try {
            String sql = "DELETE FROM mapel WHERE kode_mapel =' " + kdmapel.getText() + " ' ";

            Connection con = (Connection) KoneksiDB.getKoneksi();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil menghapus data mapel");
            tabelmapel();
            refreshmapel();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_hapusmapelActionPerformed

    private void editmapelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editmapelMouseClicked
        // TODO add your handling code here:
         try {
            String sql = "UPDATE mapel SET kode_mapel='"+kdmapel.getText()+"',nama_mapel ='"+nmmapel.getText()
                    +"',jam ='"+jam.getText()+"',kode_jurusan ='"+kodejurusan.getSelectedItem()+"',nip ='"+nipp.getSelectedItem()+"'WHERE kode_mapel='"+kdmapel.getText()+"'";
                    
            Connection con = (Connection) KoneksiDB.getKoneksi();
            PreparedStatement pst = con.prepareStatement(sql);  
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil megubah data mapel");
             tabelmapel();
             refreshmapel();
          } catch (Exception e) {
        
    }       
    }//GEN-LAST:event_editmapelMouseClicked

    private void editmapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editmapelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editmapelActionPerformed

    private void tbmapelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbmapelMouseClicked
        // TODO add your handling code here:
          int baris = tbmapel.rowAtPoint(evt.getPoint());
        String a = tbmapel.getValueAt(baris, 0).toString();
        kdmapel.setText(a);
        String namaguru = tbmapel.getValueAt(baris, 1).toString();
        nmmapel.setText(namaguru);
        String almts = tbmapel.getValueAt(baris, 2).toString();
        jam.setText(almts);
        String telp = tbmapel.getValueAt(baris, 3).toString();
        kodejurusan.setSelectedItem(telp);
         String mp = tbmapel.getValueAt(baris, 4).toString();
        nipp.setSelectedItem(mp);
    }//GEN-LAST:event_tbmapelMouseClicked

    private void tambahmapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahmapelActionPerformed
        // TODO add your handling code here:
         try {
            String a = kdmapel.getText();
            String sql = "INSERT INTO mapel VALUES('"+a+"','"+nmmapel.getText()+"','"+jam.getText()+"','"+kodejurusan.getSelectedItem()+"','"+nipp.getSelectedItem()+"')";
            Connection con =(Connection) KoneksiDB.getKoneksi();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();

            JOptionPane.showInternalMessageDialog(null, "Berhasil Menambahkan");
            tabelmapel();
            refreshmapel();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menambahkan" + e.getMessage());

        }
    }//GEN-LAST:event_tambahmapelActionPerformed

    private void kodejurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodejurusanActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_kodejurusanActionPerformed

    private void nippActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nippActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_nippActionPerformed

    private void nippMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nippMouseClicked
        // TODO add your handling code here:
         try {
            Connection con = (Connection) KoneksiDB.getKoneksi();
             Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from guru where kode_jurusan='"+nipp.getSelectedItem()+"'");
            
       
            
           
            
            
           
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_nippMouseClicked

    private void kodejurusanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kodejurusanMouseClicked
        // TODO add your handling code here:
         try {
            Connection con = (Connection) KoneksiDB.getKoneksi();
             Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from jurusan where kode_jurusan='"+kodejurusan.getSelectedItem()+"'");
            
       
            
           
            
            
           
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_kodejurusanMouseClicked

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin(usernme).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NIS;
    private javax.swing.JPanel admin;
    private javax.swing.JTextField alamat;
    private javax.swing.JTextField almt;
    private javax.swing.JPanel btnHome;
    private javax.swing.JPanel btnjurusan;
    private javax.swing.JPanel btnmapel;
    private javax.swing.JTextField cariadmin;
    private javax.swing.JButton cariguru;
    private javax.swing.JButton carijurusan;
    private javax.swing.JButton carimapel;
    private javax.swing.JButton carisiswa;
    private javax.swing.JPanel dataguru;
    private javax.swing.JPanel datajurusan;
    private javax.swing.JPanel datalogin;
    private javax.swing.JPanel datamapel;
    private javax.swing.JPanel datasiswa;
    private javax.swing.JPanel dtsiswa;
    private javax.swing.JButton editguru;
    private javax.swing.JButton editjurusan;
    private javax.swing.JButton editlogin;
    private javax.swing.JButton editmapel;
    private javax.swing.JButton editsiswa;
    private javax.swing.JPanel guru;
    private javax.swing.JButton hapusguru;
    private javax.swing.JButton hapusjurusan;
    private javax.swing.JButton hapuslogin;
    private javax.swing.JButton hapusmapel;
    private javax.swing.JButton hapussiswa;
    private javax.swing.JPanel home;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jam;
    private javax.swing.JTextField jrsan;
    private javax.swing.JTextField jurus;
    private javax.swing.JComboBox<String> kdjurusan;
    private javax.swing.JTextField kdkelas;
    private javax.swing.JTextField kdmapel;
    private javax.swing.JComboBox<String> kodejurusan;
    private javax.swing.JLabel labeladmin;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField namasiswa;
    private javax.swing.JComboBox<String> nipp;
    private javax.swing.JTextField nmmapel;
    private javax.swing.JTextField notelp;
    private javax.swing.JTextField np;
    private javax.swing.JTextField password;
    private javax.swing.JComboBox<String> role;
    private javax.swing.JTextField searchguru;
    private javax.swing.JTextField searchjurusan;
    private javax.swing.JTextField searchmapel;
    private javax.swing.JTextField searchsiswa1;
    private javax.swing.JButton tambahguru;
    private javax.swing.JButton tambahjurusan;
    private javax.swing.JButton tambahlogin;
    private javax.swing.JButton tambahmapel;
    private javax.swing.JButton tambahsiswa;
    private javax.swing.JTable tbguru;
    private javax.swing.JTable tbjurusan;
    private javax.swing.JTable tblogin;
    private javax.swing.JTable tbmapel;
    private javax.swing.JTable tbsiswa;
    private javax.swing.JTextField telpsiswa;
    private javax.swing.JComboBox<String> tingkat;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
