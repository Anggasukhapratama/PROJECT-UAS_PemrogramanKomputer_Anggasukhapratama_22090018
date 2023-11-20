/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class Form_Barang extends javax.swing.JPanel {

    
    DefaultTableModel model;
    /**
     * 
     * 
     */
    public Form_Barang() {
        initComponents();
        initializeTable();
    }
        private void initializeTable() {
        // Create a table model with appropriate column names
        model = new DefaultTableModel();
        model.addColumn("Kode Barang");
        model.addColumn("Nama Barang");
        model.addColumn("Satuan");
        model.addColumn("Harga Beli");
        model.addColumn("Harga Jual");
        model.addColumn("Stok");

        // Set the table model to tbl_databarang
        tbl_databarang.setModel(model);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        DataBarang = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_databarang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Btn_tambah = new javax.swing.JButton();
        Btn_hapus = new javax.swing.JButton();
        Btn_batal2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txt_caribarang = new javax.swing.JTextField();
        TambahBarang = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Btn_simpan = new javax.swing.JButton();
        Btn_batal = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_kodebarang = new javax.swing.JTextField();
        txt_namabarang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_satuan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_hargabeli = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_hargajual = new javax.swing.JTextField();
        txt_stok = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        mainPanel.setLayout(new java.awt.CardLayout());

        DataBarang.setBackground(new java.awt.Color(255, 255, 255));

        tbl_databarang.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_databarang.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tbl_databarang);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 255));
        jLabel1.setText("DATA BARANG");

        Btn_tambah.setBackground(new java.awt.Color(102, 255, 255));
        Btn_tambah.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Btn_tambah.setForeground(new java.awt.Color(255, 255, 255));
        Btn_tambah.setText("TAMBAH");
        Btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_tambahActionPerformed(evt);
            }
        });

        Btn_hapus.setBackground(new java.awt.Color(102, 255, 255));
        Btn_hapus.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Btn_hapus.setForeground(new java.awt.Color(255, 255, 255));
        Btn_hapus.setText("HAPUS");
        Btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_hapusActionPerformed(evt);
            }
        });

        Btn_batal2.setBackground(new java.awt.Color(102, 255, 255));
        Btn_batal2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Btn_batal2.setForeground(new java.awt.Color(255, 255, 255));
        Btn_batal2.setText("BATAL");
        Btn_batal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_batal2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 255, 255));
        jLabel9.setText("Cari Barang");

        txt_caribarang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 2));
        txt_caribarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_caribarangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DataBarangLayout = new javax.swing.GroupLayout(DataBarang);
        DataBarang.setLayout(DataBarangLayout);
        DataBarangLayout.setHorizontalGroup(
            DataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DataBarangLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(DataBarangLayout.createSequentialGroup()
                        .addGroup(DataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(DataBarangLayout.createSequentialGroup()
                                .addComponent(Btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)))
                        .addComponent(Btn_batal2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                        .addGroup(DataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txt_caribarang, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))))
        );
        DataBarangLayout.setVerticalGroup(
            DataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DataBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DataBarangLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(DataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Btn_tambah, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(Btn_batal2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn_hapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(DataBarangLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_caribarang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE))
        );

        mainPanel.add(DataBarang, "card2");

        TambahBarang.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 255, 255));
        jLabel2.setText("TAMBAH DATA BARANG");

        Btn_simpan.setBackground(new java.awt.Color(102, 255, 255));
        Btn_simpan.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Btn_simpan.setForeground(new java.awt.Color(255, 255, 255));
        Btn_simpan.setText("SIMPAN");
        Btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_simpanActionPerformed(evt);
            }
        });

        Btn_batal.setBackground(new java.awt.Color(102, 255, 255));
        Btn_batal.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Btn_batal.setForeground(new java.awt.Color(255, 255, 255));
        Btn_batal.setText("BATAL");
        Btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_batalActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("KODE BARANG");

        txt_kodebarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kodebarangActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("NAMA BARANG");

        txt_satuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_satuanActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("SATUAN");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("HARGA BELI");

        txt_hargabeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hargabeliActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("HARGA JUAL");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("STOK");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_stok)
                    .addComponent(txt_kodebarang, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 646, Short.MAX_VALUE))
                    .addComponent(txt_namabarang, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_satuan, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_hargabeli, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_hargajual, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_kodebarang, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_namabarang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_satuan, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_hargabeli, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_hargajual, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_stok, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout TambahBarangLayout = new javax.swing.GroupLayout(TambahBarang);
        TambahBarang.setLayout(TambahBarangLayout);
        TambahBarangLayout.setHorizontalGroup(
            TambahBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TambahBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TambahBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(TambahBarangLayout.createSequentialGroup()
                        .addComponent(Btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(Btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TambahBarangLayout.setVerticalGroup(
            TambahBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TambahBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(TambahBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btn_simpan, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(Btn_batal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(344, Short.MAX_VALUE))
        );

        mainPanel.add(TambahBarang, "card2");

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_tambahActionPerformed
        mainPanel.removeAll();
         mainPanel.repaint();
          mainPanel.revalidate();
          
           mainPanel.add(TambahBarang);
            mainPanel.repaint();
             mainPanel.revalidate();
        
    }//GEN-LAST:event_Btn_tambahActionPerformed

    private void Btn_batal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_batal2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_batal2ActionPerformed

    private void Btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_simpanActionPerformed
        // Get the data from the text fields
    String kodeBarang = txt_kodebarang.getText();
    String namaBarang = txt_namabarang.getText();
    String satuan = txt_satuan.getText();
    String hargaBeli = txt_hargabeli.getText();
    String hargaJual = txt_hargajual.getText();
    String stok = txt_stok.getText();

    // Add the values to the table model
    model.addRow(new Object[]{kodeBarang, namaBarang, satuan, hargaBeli, hargaJual, stok});

    // Update the table with the new model
    tbl_databarang.setModel(model);

    // Clear the text fields
    clearTextFields();        
    }//GEN-LAST:event_Btn_simpanActionPerformed

    private void Btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_batalActionPerformed
        mainPanel.removeAll();
        mainPanel.add(DataBarang);
            mainPanel.repaint();
             mainPanel.revalidate();
    }//GEN-LAST:event_Btn_batalActionPerformed

    private void txt_kodebarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kodebarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kodebarangActionPerformed

    private void txt_satuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_satuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_satuanActionPerformed

    private void txt_hargabeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hargabeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hargabeliActionPerformed

    private void Btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_hapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_hapusActionPerformed

    private void txt_caribarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_caribarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_caribarangActionPerformed
  private void clearTextFields() {
        txt_kodebarang.setText("");
        txt_namabarang.setText("");
        txt_satuan.setText("");
        txt_hargabeli.setText("");
        txt_hargajual.setText("");
        txt_stok.setText("");
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_batal;
    private javax.swing.JButton Btn_batal2;
    private javax.swing.JButton Btn_hapus;
    private javax.swing.JButton Btn_simpan;
    private javax.swing.JButton Btn_tambah;
    private javax.swing.JPanel DataBarang;
    private javax.swing.JPanel TambahBarang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTable tbl_databarang;
    private javax.swing.JTextField txt_caribarang;
    private javax.swing.JTextField txt_hargabeli;
    private javax.swing.JTextField txt_hargajual;
    private javax.swing.JTextField txt_kodebarang;
    private javax.swing.JTextField txt_namabarang;
    private javax.swing.JTextField txt_satuan;
    private javax.swing.JTextField txt_stok;
    // End of variables declaration//GEN-END:variables

  
}
