/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Guru;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import login.KoneksiDB;

/**
 *
 * @author LENOVO
 */
public class buku extends javax.swing.JFrame {
 Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        int curRow=0;
    /**
     * Creates new form buku
     */
    public buku() {
        initComponents();
         this.setLocationRelativeTo(null);// center form in the screen
        conn=KoneksiDB.getKoneksi();
        
        tabelsiswa();
        tabel();
        nip();
     
    }
    
      public void tabel(){
        try{
           String sql = "Select * From jurusan";
           java.sql.Connection conn = (Connection) KoneksiDB.getKoneksi();
           java.sql.PreparedStatement pst = conn.prepareStatement(sql);
           ResultSet rs = pst.executeQuery();
           
           while(rs.next()){
               kdjurusan.addItem(rs.getString("kode_jurusan"));
               
          
            
            
           }
           
           rs.last();
           int jumlahdata = rs.getRow();
           rs.first();
           
       
           
            
        } catch (Exception e) {
        }}
      
        public void nip(){
        try{
           String sql = "Select * From guru";
           java.sql.Connection conn = (Connection) KoneksiDB.getKoneksi();
           java.sql.PreparedStatement pst = conn.prepareStatement(sql);
           ResultSet rs = pst.executeQuery();
           
           while(rs.next()){
               nip.addItem(rs.getString("nip"));
               
          
            
            
            
           }
           
           rs.last();
           int jumlahdata = rs.getRow();
           rs.first();
           
       
           
            
        } catch (Exception e) {
        }}
        
        
void searchsiswa (){
        DefaultTableModel tbl = new DefaultTableModel();
       tbl.addColumn("kode mapel");
        tbl.addColumn("nama mapel");
        tbl.addColumn("jam");
        tbl.addColumn("kelas");
         tbl.addColumn("jurusan");
        tbl.addColumn("guru");
        
        try {
            String sql = "SELECT * FROM mapel INNER JOIN jurusan ON mapel.kode_jurusan=jurusan.kode_jurusan INNER JOIN guru ON mapel.nip=guru.nip WHERE jurusan LIKE '%" + searchsiswa.getText() +  "%'";
            Connection con = (Connection) KoneksiDB.getKoneksi();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                tbl.addRow(new Object[] {
                  rs.getString("kode_mapel"),
                    rs.getString("nama_mapel"),
                    rs.getString("jam"),
                    rs.getString("tingkat"),
                     rs.getString("jurusan"),
                      rs.getString("nama_guru"),

                });
                tbsiswa.setModel(tbl);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

 public void tabelsiswa(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("kode mapel");
        tbl.addColumn("nama mapel");
        tbl.addColumn("jam");
        tbl.addColumn("kelas");
         tbl.addColumn("jurusan");
        tbl.addColumn("guru");
        
        try {
            String sql = "SELECT * FROM mapel INNER JOIN jurusan ON mapel.kode_jurusan=jurusan.kode_jurusan INNER JOIN guru ON mapel.nip=guru.nip";
            Connection con = (Connection) KoneksiDB.getKoneksi();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                tbl.addRow(new Object[] {
                    rs.getString("kode_mapel"),
                    rs.getString("nama_mapel"),
                    rs.getString("jam"),
                    rs.getString("tingkat"),
                     rs.getString("jurusan"),
                      rs.getString("nama_guru"),

                });
                
                tbsiswa.setModel(tbl);
              
                
            }
            
        } catch (Exception e) {
            System.out.println(e);
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

        jPanel1 = new javax.swing.JPanel();
        searchsiswa = new javax.swing.JTextField();
        kdmapel = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        namamapel = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        editsiswa = new javax.swing.JButton();
        jam = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        tambahsiswa = new javax.swing.JButton();
        carisiswa = new javax.swing.JButton();
        hapussiswa = new javax.swing.JButton();
        guru = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jurusan = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbsiswa = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        nip = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        kdjurusan = new javax.swing.JComboBox<>();
        kelas = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        searchsiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchsiswaActionPerformed(evt);
            }
        });

        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("kode mapel");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("DATA MAPEL");

        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("nama_mapel");

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

        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("jam");

        tambahsiswa.setText("Tambah");
        tambahsiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahsiswaActionPerformed(evt);
            }
        });

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

        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("kelas");

        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("guru");

        jButton1.setText("kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tbsiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "kode_mapel", "nama_mapel", "jam", "kelas", "jurusan", "guru"
            }
        ));
        tbsiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbsiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbsiswa);

        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("kode jurusan");

        nip.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                nipPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        nip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nipMouseClicked(evt);
            }
        });
        nip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nipActionPerformed(evt);
            }
        });

        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("NIP");

        kdjurusan.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                kdjurusanPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("jurusan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(334, 334, 334)
                .addComponent(jLabel20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel22)
                .addGap(44, 44, 44)
                .addComponent(kdmapel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(jLabel24)
                .addGap(57, 57, 57)
                .addComponent(jam, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(jLabel25)
                .addGap(40, 40, 40)
                .addComponent(kelas, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel23)
                .addGap(38, 38, 38)
                .addComponent(namamapel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addComponent(kdjurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(jLabel29)
                .addGap(27, 27, 27)
                .addComponent(jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(537, 537, 537)
                .addComponent(jLabel28)
                .addGap(67, 67, 67)
                .addComponent(nip, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(jLabel26)
                .addGap(41, 41, 41)
                .addComponent(guru, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(tambahsiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(editsiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(hapussiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(searchsiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(carisiswa))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1103, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel20)))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kdmapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25))))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namamapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kdjurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel27)
                            .addComponent(jLabel29))))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel26))))
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tambahsiswa)
                    .addComponent(editsiswa)
                    .addComponent(hapussiswa)
                    .addComponent(searchsiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carisiswa))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchsiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchsiswaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchsiswaActionPerformed

    private void editsiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editsiswaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_editsiswaMouseClicked

    private void editsiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editsiswaActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "UPDATE mapel SET kode_mapel='"+kdmapel.getText()+"',nama_mapel='"+namamapel.getText()
            +"',jam='"+jam.getText()+"',kode_jurusan='"+kdjurusan.getSelectedItem()+"',nip='"+nip.getSelectedItem()+"'WHERE kode_mapel='"+kdmapel.getText()+"'";

            Connection con = (Connection) KoneksiDB.getKoneksi();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil megubah data siswa");
            tabelsiswa();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_editsiswaActionPerformed

    private void tambahsiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahsiswaActionPerformed
        // TODO add your handling code here:

        try {

            PreparedStatement stmt = conn.prepareStatement("INSERT INTO mapel (kode_mapel, nama_mapel,  jam, kode_jurusan, nip) values (?,?,?,?,?)");
            stmt.setString(1, kdmapel.getText());
            stmt.setString(2, namamapel.getText());
            stmt.setString(3,jam.getText());
            stmt.setString(4, (String) kdjurusan.getSelectedItem());
            stmt.setString(5, (String) nip.getSelectedItem());

            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            tabelsiswa();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menambahkan" + e.getMessage());

        }
    }//GEN-LAST:event_tambahsiswaActionPerformed

    private void carisiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carisiswaActionPerformed
        // TODO add your handling code here
        searchsiswa();
    }//GEN-LAST:event_carisiswaActionPerformed

    private void hapussiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapussiswaActionPerformed
        // TODO add your handling code here:

        try {
            String sql = "DELETE FROM mapel WHERE kode_mapel =' " + kdmapel.getText() + " ' ";

            Connection con = (Connection) KoneksiDB.getKoneksi();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil menghapus data siswa");
            tabelsiswa();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_hapussiswaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        this.dispose();
        guru ea = new guru();
        ea.setVisible(true);
        ea.pack();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nipMouseClicked
        // TODO add your handling code here:

       
        
    }//GEN-LAST:event_nipMouseClicked

    private void nipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nipActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_nipActionPerformed

    private void kdjurusanPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_kdjurusanPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        String item = (String) kdjurusan.getSelectedItem();
        String sql = "select * from jurusan where kode_jurusan = ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, item);
            rs =pst.executeQuery();
        
           
            
            
          if(rs.next()){
               
             String nm = rs.getString("tingkat");
                kelas.setText(nm);
                 String nam = rs.getString("jurusan");
                jurusan.setText(nam);
                
          }
            
           
            
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_kdjurusanPopupMenuWillBecomeInvisible

    private void tbsiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbsiswaMouseClicked
        // TODO add your handling code here:
            int baris = tbsiswa.rowAtPoint(evt.getPoint());
        String a = tbsiswa.getValueAt(baris, 0).toString();
        kdmapel.setText(a);
        String namaguru = tbsiswa.getValueAt(baris, 1).toString();
        namamapel.setText(namaguru);
       
        String almts = tbsiswa.getValueAt(baris,2).toString();
        jam.setText(almts);
       
      String t = tbsiswa.getValueAt(baris, 3).toString();
        kelas.setText(t);
        String te = tbsiswa.getValueAt(baris, 4).toString();
        jurusan.setText(te);
        String td = tbsiswa.getValueAt(baris, 5).toString();
        guru.setText(td);
    }//GEN-LAST:event_tbsiswaMouseClicked

    private void nipPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_nipPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        
         String item = (String) nip.getSelectedItem();
        String sql = "select * from guru where nip = ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, item);
            rs =pst.executeQuery();
        
           
            
            
          if(rs.next()){
               
            
                 String nam = rs.getString("nama_guru");
                guru.setText(nam);
          }
            
           
            
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_nipPopupMenuWillBecomeInvisible

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
            java.util.logging.Logger.getLogger(buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton carisiswa;
    private javax.swing.JButton editsiswa;
    private javax.swing.JTextField guru;
    private javax.swing.JButton hapussiswa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jam;
    private javax.swing.JTextField jurusan;
    private javax.swing.JComboBox<String> kdjurusan;
    private javax.swing.JTextField kdmapel;
    private javax.swing.JTextField kelas;
    private javax.swing.JTextField namamapel;
    private javax.swing.JComboBox<String> nip;
    private javax.swing.JTextField searchsiswa;
    private javax.swing.JButton tambahsiswa;
    private javax.swing.JTable tbsiswa;
    // End of variables declaration//GEN-END:variables
}