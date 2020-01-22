/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmapp;

import dmapp.Model.Indikator;
import dmapp.Model.IndikatorJpaController;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author G4_HOMES
 */
public class Kelasutama extends javax.swing.JFrame {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("DMAppPU");
    IndikatorJpaController Ije = new IndikatorJpaController(emf);

    /**
     * Creates new form Kelasutama
     */
    public Kelasutama() {
        initComponents();
        this.setLocationRelativeTo(null);
        tka.setEditable(false);
        tra.setEditable(false);
        Jres.setVisible(false);
        Jsimpan.setVisible(false);
        tka.setVisible(false);
        tra.setVisible(false);
        tka.setVisible(false);
        tnama.setVisible(false);
        lna.setVisible(false);
        lku.setVisible(false);
        lki.setVisible(false);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        DMAppPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("DMAppPU").createEntityManager();
        indikatorQuery = java.beans.Beans.isDesignTime() ? null : DMAppPUEntityManager.createQuery("SELECT i FROM Indikator i");
        indikatorList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(indikatorQuery.getResultList());
        jLabel1 = new javax.swing.JLabel();
        lna = new javax.swing.JLabel();
        Jsimpan = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lku = new javax.swing.JLabel();
        angka1 = new javax.swing.JTextField();
        angka2 = new javax.swing.JTextField();
        angka3 = new javax.swing.JTextField();
        angka4 = new javax.swing.JTextField();
        angka5 = new javax.swing.JTextField();
        tka = new javax.swing.JTextField();
        Jco = new javax.swing.JButton();
        lki = new javax.swing.JLabel();
        tra = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Jres = new javax.swing.JButton();
        tnama = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tindikator = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Perhitungan Rule Naive Bayes");

        lna.setText("Nama Wilayah");

        Jsimpan.setText("Simpan Data");
        Jsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JsimpanActionPerformed(evt);
            }
        });

        jLabel3.setText("kadar PM10*");

        jLabel4.setText("kadar SO2*");

        jLabel5.setText("kadar CO*");

        jLabel6.setText("kadar O3*");

        jLabel7.setText("kadar NO2*");

        lku.setText("Klasifikasi Udara");

        angka1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                angka1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                angka1KeyTyped(evt);
            }
        });

        angka2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                angka2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                angka2KeyTyped(evt);
            }
        });

        angka3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                angka3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                angka3KeyTyped(evt);
            }
        });

        angka4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                angka4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                angka4KeyTyped(evt);
            }
        });

        angka5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                angka5KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                angka5KeyTyped(evt);
            }
        });

        Jco.setText("Counter");
        Jco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcoActionPerformed(evt);
            }
        });

        lki.setText("Indeks Kualitas");

        jLabel10.setText("Inputan Numerik 0-99");

        jLabel11.setText("Inputan Numerik 0-99");

        jLabel12.setText("Inputan Numerik 0-99");

        jLabel13.setText("Inputan Numerik 0-99");

        jLabel14.setText("Inputan Numerik 0-99");

        Jres.setText("refresh");
        Jres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JresActionPerformed(evt);
            }
        });

        tnama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilihan Wilayah", "DKI-1", "DKI-2", "DKI-3", "DKI-4", "DKI-5" }));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, indikatorList, tindikator);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Long.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${wilayah}"));
        columnBinding.setColumnName("Wilayah");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pm10}"));
        columnBinding.setColumnName("Pm10");
        columnBinding.setColumnClass(Short.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${so2}"));
        columnBinding.setColumnName("So2");
        columnBinding.setColumnClass(Short.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${co}"));
        columnBinding.setColumnName("Co");
        columnBinding.setColumnClass(Short.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ozon}"));
        columnBinding.setColumnName("Ozon (o3)");
        columnBinding.setColumnClass(Short.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${no2}"));
        columnBinding.setColumnName("No2");
        columnBinding.setColumnClass(Short.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${kategori}"));
        columnBinding.setColumnName("Klasifikasi");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${rerata}"));
        columnBinding.setColumnName("Indeks");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane2.setViewportView(tindikator);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lna)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(lku)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(lki))
                        .addGap(174, 174, 174)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(angka2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(angka3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(angka4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel13))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(angka5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel14))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(angka1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tka, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Jco, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tnama, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                                        .addComponent(Jres, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(tra, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Jsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(23, 23, 23)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lna)
                    .addComponent(Jres)
                    .addComponent(tnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(angka1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(angka2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(angka3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(angka4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(angka5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Jco))
                    .addComponent(lku))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lki)
                    .addComponent(tra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jsimpan))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcoActionPerformed
        // TODO add your handling code here:
        int satu, dua, tiga, empat, lima;
        double hasil, hasil1;
        satu = Integer.parseInt(angka1.getText());
        dua = Integer.parseInt(angka2.getText());
        tiga = Integer.parseInt(angka3.getText());
        empat = Integer.parseInt(angka4.getText());
        lima = Integer.parseInt(angka5.getText());

        hasil = satu + dua + tiga + empat + lima;
        hasil1 = hasil / 500;

        tra.setText(" " + hasil1);
        tka.setVisible(true);
        tra.setVisible(true);
        Jres.setVisible(true);
        Jsimpan.setVisible(true);
        Jco.setVisible(false);
        tnama.setVisible(true);
        angka1.setEditable(false);
        angka2.setEditable(false);
        angka3.setEditable(false);
        angka4.setEditable(false);
        angka5.setEditable(false);
        lna.setVisible(true);
        lku.setVisible(true);
        lki.setVisible(true);

        if (hasil1 <= 0.45) {
            tka.setText("Baik");
        } else if (hasil1 > 0.46 && hasil1 <= 0.63) {
            tka.setText("Sedang");
        } else {
            tka.setText("Buruk");
        }
    }//GEN-LAST:event_JcoActionPerformed

    private void JresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JresActionPerformed
        // TODO add your handling code here:
        new Kelasutama().setVisible(true);
    }//GEN-LAST:event_JresActionPerformed

    private void JsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JsimpanActionPerformed
        try {          
            int satu, dua, tiga, empat, lima;
            satu = Integer.parseInt(angka1.getText());
            dua = Integer.parseInt(angka2.getText());
            tiga = Integer.parseInt(angka3.getText());
            empat = Integer.parseInt(angka4.getText());
            lima = Integer.parseInt(angka5.getText());
            String code = (String) tnama.getSelectedItem();
            if (code.equals("Pilihan Wilayah")) {
                JOptionPane.showMessageDialog(null, "pilihan data wilayah belum ada");
                return;
            }
            Indikator ij = new Indikator();
            ij.setWilayah(code);
            ij.setPm10((short) satu);
            ij.setSo2((short) dua);
            ij.setCo((short) tiga);
            ij.setOzon((short) empat);
            ij.setNo2((short) lima);
            ij.setKategori(tka.getText());
            ij.setRerata(tra.getText());
            
            Ije.create(ij);
            JOptionPane.showMessageDialog(null, "Data Tersimpan");
            indikatorList.clear();
            indikatorList.addAll(Ije.findIndikatorEntities());
            tindikator.updateUI();

        } catch (Exception ex) {
            Logger.getLogger(Kelasutama.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data sudah ada ATAU data tidak tersimpan");
        }
        this.dispose();
        new Kelasutama().setVisible(true);
    }//GEN-LAST:event_JsimpanActionPerformed

    private void angka1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_angka1KeyTyped
        // TODO add your handling code here:
        char karakter = evt.getKeyChar();
        if (!(((karakter >= '0') && (karakter <= '9')
                || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_angka1KeyTyped

    private void angka2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_angka2KeyTyped
        // TODO add your handling code here:
        char karakter = evt.getKeyChar();
        if (!(((karakter >= '0') && (karakter <= '9')
                || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_angka2KeyTyped

    private void angka3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_angka3KeyTyped
        // TODO add your handling code here:
        char karakter = evt.getKeyChar();
        if (!(((karakter >= '0') && (karakter <= '9')
                || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_angka3KeyTyped

    private void angka4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_angka4KeyTyped
        // TODO add your handling code here:
        char karakter = evt.getKeyChar();
        if (!(((karakter >= '0') && (karakter <= '9')
                || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_angka4KeyTyped

    private void angka5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_angka5KeyTyped
        // TODO add your handling code here:
        char karakter = evt.getKeyChar();
        if (!(((karakter >= '0') && (karakter <= '9')
                || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_angka5KeyTyped

    private void angka1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_angka1KeyReleased
        // TODO add your handling code here:
        String input = angka1.getText();
        if (input.length() > 2) {
            JOptionPane.showMessageDialog(rootPane, "jumlah inputan melebihi batas");
            angka1.setText("");
        }
    }//GEN-LAST:event_angka1KeyReleased

    private void angka2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_angka2KeyReleased
        // TODO add your handling code here:
        String input = angka2.getText();
        if (input.length() > 2) {
            JOptionPane.showMessageDialog(rootPane, "jumlah inputan melebihi batas");
            angka2.setText("");
        }
    }//GEN-LAST:event_angka2KeyReleased

    private void angka3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_angka3KeyReleased
        // TODO add your handling code here:
        String input = angka3.getText();
        if (input.length() > 2) {
            JOptionPane.showMessageDialog(rootPane, "jumlah inputan melebihi batas");
            angka3.setText("");
        }
    }//GEN-LAST:event_angka3KeyReleased

    private void angka4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_angka4KeyReleased
        // TODO add your handling code here:
        String input = angka4.getText();
        if (input.length() > 2) {
            JOptionPane.showMessageDialog(rootPane, "jumlah inputan melebihi batas");
            angka4.setText("");
        }
    }//GEN-LAST:event_angka4KeyReleased

    private void angka5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_angka5KeyReleased
        // TODO add your handling code here:
        String input = angka5.getText();
        if (input.length() > 2) {
            JOptionPane.showMessageDialog(rootPane, "jumlah inputan melebihi batas");
            angka5.setText("");
        }
    }//GEN-LAST:event_angka5KeyReleased

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
            java.util.logging.Logger.getLogger(Kelasutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kelasutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kelasutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kelasutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kelasutama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager DMAppPUEntityManager;
    private javax.swing.JButton Jco;
    private javax.swing.JButton Jres;
    private javax.swing.JButton Jsimpan;
    private javax.swing.JTextField angka1;
    private javax.swing.JTextField angka2;
    private javax.swing.JTextField angka3;
    private javax.swing.JTextField angka4;
    private javax.swing.JTextField angka5;
    private java.util.List<dmapp.Model.Indikator> indikatorList;
    private javax.persistence.Query indikatorQuery;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lki;
    private javax.swing.JLabel lku;
    private javax.swing.JLabel lna;
    private javax.swing.JTable tindikator;
    private javax.swing.JTextField tka;
    private javax.swing.JComboBox<String> tnama;
    private javax.swing.JTextField tra;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
