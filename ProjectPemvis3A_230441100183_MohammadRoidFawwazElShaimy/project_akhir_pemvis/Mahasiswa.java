/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project_akhir_pemvis;

import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.*;
import java.awt.print.*;
import java.io.File;
import javax.swing.table.TableModel;
import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.*;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;


/**
 *
 * @author HP
 */
public class Mahasiswa extends javax.swing.JFrame {

    /**
     * Creates new form Mahasiswa
     */
    public Mahasiswa() {
        initComponents();
        load_data1();
        load_data2();
    }
    
    
    private void load_data1(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("NIM");
        model.addColumn("Nama");
        model.addColumn("Kelamin");
        model.addColumn("Matakuliah");
        model.addColumn("Semester");
        model.addColumn("Nilai Akhir");
        model.addColumn("Predikat");
        try{
            int no = 1;
            String sql ="SELECT * FROM nilai";
            java.sql.Connection conn = (Connection) koneksi.getConnection();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()){
                model.addRow(
                        new Object[]{
                            no++,
                            res.getString("Nim"),
                            res.getString("Nama"),
                            res.getString("Kelamin"),
                            res.getString("Matakuliah"),
                            res.getString("semester"),
                            res.getString("nilai_akhir"),
                            res.getString("predikat"),
                        }
                );
                tbNilai.setModel(model);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
            System.out.println("e "+ e.getMessage());
        }
        
    }
     private void load_data2(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("NIM");
        model.addColumn("Nama");
        model.addColumn("Matakuliah");
        model.addColumn("Semester");
        model.addColumn("Nilai Akhir");
        model.addColumn("Predikat");
        try{
            int no = 1;
            String sql ="SELECT * FROM nilai";
            java.sql.Connection conn = (Connection) koneksi.getConnection();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()){
                model.addRow(
                        new Object[]{
                            no++,
                            res.getString("Nim"),
                            res.getString("Nama"),
                            res.getString("Matakuliah"),
                            res.getString("semester"),
                            res.getString("nilai_akhir"),
                            res.getString("predikat")
                        }
                );
                tblCari.setModel(model);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
            System.out.println("e "+ e.getMessage());
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
        tabbedPaneCustom1 = new project_akhir_pemvis.TabbedPaneCustom();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNilai = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        KELUAR = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCari = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        BtnCariMatkul = new javax.swing.JButton();
        cboMatakuliah = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        btnCetak = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabbedPaneCustom1.setSelectedColor(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        tbNilai.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tbNilai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbNilai);

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel1.setText("NILAI AKHIR MAHASISWA INFORMATIKA");

        KELUAR.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        KELUAR.setText("KELUAR");
        KELUAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KELUARActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnLogout.setText("LOGOUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_akhir_pemvis/score.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_akhir_pemvis/score (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(KELUAR)
                        .addGap(25, 25, 25)
                        .addComponent(btnLogout)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KELUAR)
                    .addComponent(btnLogout))
                .addContainerGap())
        );

        tabbedPaneCustom1.addTab("KESELURUHAN NILAI", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));

        tblCari.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblCari);

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel3.setText("CARI NILAI AKHIR MAHASISWA");

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        jLabel15.setText("NIM");

        BtnCariMatkul.setText("Cari");
        BtnCariMatkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCariMatkulActionPerformed(evt);
            }
        });

        cboMatakuliah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH", "RISET OPERASI", "ANALISA DAN DESAIN SISTEM INFORMASI", "REKAYASA PERANGKAT LUNAK", "INTERAKSI MANUSIA DAN KOMPUTER", "ARSITEKTUR SI/TI PERUSAHAAN", "KEAMANAN INFORMASI", "BAHASA INDONESIA" }));

        jLabel13.setText("Matakuliah");

        btnCetak.setText("Cetak");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_akhir_pemvis/score.png"))); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_akhir_pemvis/score (1).png"))); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_akhir_pemvis/score.png"))); // NOI18N

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_akhir_pemvis/score (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCetak))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(cboMatakuliah, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnCariMatkul)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel15)
                        .addGap(24, 24, 24)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCari)
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel18)
                .addGap(90, 90, 90)
                .addComponent(jLabel3)
                .addGap(85, 85, 85)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(133, 133, 133)
                    .addComponent(jLabel16)
                    .addGap(463, 463, 463)
                    .addComponent(jLabel17)
                    .addContainerGap(117, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(jLabel19)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboMatakuliah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(BtnCariMatkul)
                    .addComponent(jLabel15)
                    .addComponent(btnCari)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCetak)
                .addGap(13, 13, 13))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(211, 211, 211)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(jLabel17))
                    .addContainerGap(224, Short.MAX_VALUE)))
        );

        tabbedPaneCustom1.addTab("CARI NILAI", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPaneCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPaneCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        try {
            int no = 1;
            String sql = "SELECT * FROM nilai WHERE nim = ?";
            java.sql.Connection conn = (Connection) koneksi.getConnection();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, txtCari.getText());
            java.sql.ResultSet res = pst.executeQuery();

            DefaultTableModel model = (DefaultTableModel) tblCari.getModel();
            model.setRowCount(0);

            while (res.next()) {
                Object[] row = {
                    no++,
                    res.getString("Nim"),
                    res.getString("Nama"),
                    res.getString("Kelamin"),
                    res.getString("Matakuliah"),
                    res.getString("semester"),
                    res.getString("nilai_akhir"),
                    res.getString("predikat"),
                };
                model.addRow(row);
            }

            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnCariActionPerformed

    private void BtnCariMatkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCariMatkulActionPerformed
        // TODO add your handling code here:
        try {
            int no = 1;
            String sql = "SELECT * FROM nilai WHERE matakuliah = ?";
            java.sql.Connection conn = (Connection) koneksi.getConnection();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, cboMatakuliah.getSelectedItem().toString());
            java.sql.ResultSet res = pst.executeQuery();

            DefaultTableModel model = (DefaultTableModel) tblCari.getModel();
            model.setRowCount(0); // Menghapus data lama di tabel

            // Loop melalui hasil query dan tambahkan ke tabel
            while (res.next()) {

                Object[] row = {
                    no++,
                    res.getString("Nim"),
                    res.getString("Nama"),
                    res.getString("Kelamin"),
                    res.getString("Matakuliah"),
                    res.getString("semester"),
                    res.getString("nilai_akhir"),
                    res.getString("predikat"),
                };
                model.addRow(row); // Tambahkan baris ke tabel
            }

            // Jika tidak ada hasil
            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_BtnCariMatkulActionPerformed

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        // TODO add your handling code here:
        // Input data dari user melalui popup
        String nimMahasiswa = JOptionPane.showInputDialog(null, "Masukkan NIM Mahasiswa:", "Input NIM", JOptionPane.QUESTION_MESSAGE);
        String namaMahasiswa = JOptionPane.showInputDialog(null, "Masukkan Nama Mahasiswa:", "Input Nama", JOptionPane.QUESTION_MESSAGE);
        String semesterMahasiswa = JOptionPane.showInputDialog(null, "Masukkan Semester:", "Input Semester", JOptionPane.QUESTION_MESSAGE);

        // Validasi input kosong
        if (namaMahasiswa == null || namaMahasiswa.isEmpty() ||
            semesterMahasiswa == null || semesterMahasiswa.isEmpty() ||
            nimMahasiswa == null || nimMahasiswa.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Semua data harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Pilih lokasi penyimpanan PDF
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Simpan PDF");
        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String filePath = file.getAbsolutePath() + ".pdf";

            try {
                // Buat dokumen PDF
                PDDocument document = new PDDocument();
                PDPage page = new PDPage(PDRectangle.A4);
                document.addPage(page);

                // Mulai menulis konten ke halaman
                PDPageContentStream contentStream = new PDPageContentStream(document, page);

                // Tambahkan logo kiri atas dengan ukuran lebih besar
                PDImageXObject logoKiri = PDImageXObject.createFromFile("src/images/logo_kiri.png", document);
                contentStream.drawImage(logoKiri, 50, page.getMediaBox().getHeight() - 150, 50, 50); // Lebar & tinggi 100px

                // Tambahkan logo kanan atas dengan ukuran lebih besar
                PDImageXObject logoKanan = PDImageXObject.createFromFile("src/images/logo_kanan.png", document);
                contentStream.drawImage(logoKanan, page.getMediaBox().getWidth() - 150, page.getMediaBox().getHeight() - 150, 50, 50); // Lebar & tinggi 100px

                // Tambahkan teks di tengah atas
                PDFont customFont = PDType0Font.load(document, new File("src/Roboto/Roboto-Regular.ttf"));
                contentStream.beginText();
                contentStream.setFont(customFont, 14); // Ukuran font lebih besar untuk header

                // Posisi awal teks tengah atas (horizontal center)
                float pageWidth = page.getMediaBox().getWidth();
                float textStartY = page.getMediaBox().getHeight() - 80; // Atur posisi vertikal teks
                float textCenterX = pageWidth / 2; // Posisi tengah halaman
                contentStream.newLineAtOffset(textCenterX, textStartY);

                // Tambahkan teks satu per satu dan sesuaikan posisi
                String[] teksHeader = {
                    "HASIL NILAI AKHIR",
                    "MAHASISWA INFORMATIKA",
                    "UNIVERSITAS TRUNOJOYO MADURA"
                };
                for (String baris : teksHeader) {
                    float textWidth = customFont.getStringWidth(baris) / 1000 * 16; // Hitung lebar teks
                    contentStream.newLineAtOffset(-textWidth / 2, 0); // Posisikan agar teks di tengah
                    contentStream.showText(baris);
                    contentStream.newLineAtOffset(textWidth / 2, -25); // Turun ke baris berikutnya
                }
                contentStream.endText();

                // Tambahkan inputan NIM, Nama, dan Semester
                contentStream.beginText();
                contentStream.setFont(customFont, 12);

                // NIM
                contentStream.newLineAtOffset(50, page.getMediaBox().getHeight() - 200);
                contentStream.showText("NIM: " + nimMahasiswa);

                // Nama
                contentStream.newLineAtOffset(0, -20);
                contentStream.showText("Nama: " + namaMahasiswa);

                // Semester
                contentStream.newLineAtOffset(page.getMediaBox().getWidth() - 300, 40); // Pindah ke kanan atas
                contentStream.showText("Semester: " + semesterMahasiswa);

                contentStream.endText();

                // Ambil model dari JTable
                TableModel model = tblCari.getModel();

                // Atur margin dan posisi awal untuk tabel
                float margin = 50;
                float startYTable = page.getMediaBox().getHeight() - 250; // Mulai dari bawah teks input
                float startXTable = margin; // Posisi kiri
                float cellHeight = 20; // Tinggi setiap baris
                float[] columnWidths = {30, 300, 70, 70}; // Lebar kolom: No, Matakuliah, Nilai Akhir, Predikat

                // Header kolom
                String[] headers = {"No", "Matakuliah", "Nilai Akhir", "Predikat"};
                float currentY = startYTable;

                contentStream.setFont(customFont, 12);
                contentStream.setLineWidth(0.5f);

                // Tulis header tabel
                for (int i = 0; i < headers.length; i++) {
                    float cellX = startXTable + getColumnOffset(i, columnWidths);
                    contentStream.addRect(cellX, currentY - cellHeight, columnWidths[i], cellHeight);
                    contentStream.beginText();
                    contentStream.newLineAtOffset(cellX + 5, currentY - 15);
                    contentStream.showText(headers[i]);
                    contentStream.endText();
                }
                contentStream.stroke();

                // Tulis data tabel
                for (int row = 0; row < model.getRowCount(); row++) {
                    currentY -= cellHeight; // Pindah ke baris berikutnya
                    for (int col = 0; col < headers.length; col++) {
                        float cellX = startXTable + getColumnOffset(col, columnWidths);
                        contentStream.addRect(cellX, currentY - cellHeight, columnWidths[col], cellHeight);
                        contentStream.beginText();
                        contentStream.newLineAtOffset(cellX + 5, currentY - 15);

                        String cellValue = "";
                        switch (col) {
                            case 0:
                                cellValue = String.valueOf(row + 1); // Kolom No
                                break;
                            case 1:
                                cellValue = model.getValueAt(row, 3).toString(); // Kolom Matakuliah
                                break;
                            case 2:
                                cellValue = model.getValueAt(row, 5).toString(); // Kolom Nilai Akhir
                                break;
                            case 3:
                                cellValue = model.getValueAt(row, 6).toString(); // Kolom Predikat
                                break;
                        }
                        contentStream.showText(cellValue);
                        contentStream.endText();
                    }
                    contentStream.stroke();
                }

                // Tutup contentStream dan simpan file
                contentStream.close();
                document.save(filePath);
                document.close();

                JOptionPane.showMessageDialog(null, "PDF berhasil disimpan di: " + filePath);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnCetakActionPerformed
    // Fungsi untuk menghitung offset kolom
   private float getColumnOffset(int columnIndex, float[] columnWidths) {
    float offset = 0;
    for (int i = 0; i < columnIndex; i++) {
        offset += columnWidths[i];
    }
    return offset;
    }
    private void KELUARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KELUARActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_KELUARActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCariMatkul;
    private javax.swing.JButton KELUAR;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnLogout;
    private javax.swing.JComboBox<String> cboMatakuliah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private project_akhir_pemvis.TabbedPaneCustom tabbedPaneCustom1;
    private javax.swing.JTable tbNilai;
    private javax.swing.JTable tblCari;
    private javax.swing.JTextField txtCari;
    // End of variables declaration//GEN-END:variables
}
