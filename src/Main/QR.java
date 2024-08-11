package Main;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.awt.Color;
import javax.swing.*;

public class QR extends JFrame{
    public QR() {
        initComponents();
    }
    
    private void clear(){
        txLink.setText("");
        ImageIcon icon = new ImageIcon();
        hasilQR.setIcon(icon);
        txLink.requestFocus();
    }
    
    private void generate(){
        try{
            String QrCodeData = txLink.getText();
            String filePath = "D:\\Java\\QRCodes\\qr.png";
            String charset = "UTF-8";
        
            Map <EncodeHintType,ErrorCorrectionLevel> hintMap = new HashMap <EncodeHintType,ErrorCorrectionLevel>();
            hintMap.put(EncodeHintType.ERROR_CORRECTION,ErrorCorrectionLevel.L);
            
            BitMatrix matrix = new MultiFormatWriter().encode(
                new String(QrCodeData.getBytes(charset),charset),
                    BarcodeFormat.QR_CODE,250,250,hintMap);
            
            MatrixToImageWriter.writeToFile(matrix, filePath.substring(filePath.lastIndexOf('.')+1),new File (filePath));
            System.out.println("QR Code has been genereted successfully at the location" + filePath);
            
            ImageIcon icon = new ImageIcon("D:\\Java\\QRCodes\\qr.png");
            hasilQR.setIcon(icon);
        }catch (Exception e){
            System.out.println(e);
        }
    }

     // Metode untuk mendapatkan warna acak
    private Color getRandomColor() {
        // Menghasilkan nilai acak untuk komponen warna RGB
        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);
        
        // Membuat objek warna dengan nilai RGB yang dihasilkan
        return new Color(red, green, blue);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgQR2 = new Main.bgQR();
        copyrigth = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        hasilQR = new javax.swing.JLabel();
        btnGenerate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        txLink = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        bgQR2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        bgQR2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bgQR2MouseDragged(evt);
            }
        });
        bgQR2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bgQR2MousePressed(evt);
            }
        });
        bgQR2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bgQR2KeyPressed(evt);
            }
        });

        copyrigth.setFont(new java.awt.Font("Lucida Calligraphy", 1, 13)); // NOI18N
        copyrigth.setForeground(new java.awt.Color(255, 255, 255));
        copyrigth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        copyrigth.setText("@Created By Yand");
        copyrigth.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                copyrigthMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                copyrigthMouseExited(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "QR CODE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Lucida Calligraphy", 1, 20), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 300));

        hasilQR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(hasilQR, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(hasilQR, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        btnGenerate.setBackground(new java.awt.Color(204, 204, 204));
        btnGenerate.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16)); // NOI18N
        btnGenerate.setForeground(new java.awt.Color(0, 0, 0));
        btnGenerate.setText("Generate");
        btnGenerate.setBorder(null);
        btnGenerate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGenerateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGenerateMouseExited(evt);
            }
        });
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });
        btnGenerate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnGenerateKeyPressed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(204, 204, 204));
        btnClear.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16)); // NOI18N
        btnClear.setForeground(new java.awt.Color(0, 0, 0));
        btnClear.setText("Clear");
        btnClear.setBorder(null);
        btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClearMouseExited(evt);
            }
        });
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        btnClear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnClearKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter Link ");

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QR CODE GENERATOR");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/icons8_cancel_30px.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/icons8_minus_30px.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(204, 204, 204));
        btnCancel.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(0, 0, 0));
        btnCancel.setText("Cancel");
        btnCancel.setBorder(null);
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelMouseExited(evt);
            }
        });
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        btnCancel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCancelKeyPressed(evt);
            }
        });

        txLink.setBackground(new java.awt.Color(255, 255, 255));
        txLink.setColumns(20);
        txLink.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txLink.setForeground(new java.awt.Color(0, 0, 0));
        txLink.setLineWrap(true);
        txLink.setRows(5);
        txLink.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txLink.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txLinkKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout bgQR2Layout = new javax.swing.GroupLayout(bgQR2);
        bgQR2.setLayout(bgQR2Layout);
        bgQR2Layout.setHorizontalGroup(
            bgQR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgQR2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(3, 3, 3)
                .addComponent(jLabel5)
                .addGap(15, 15, 15))
            .addGroup(bgQR2Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(bgQR2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(bgQR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgQR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(bgQR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgQR2Layout.createSequentialGroup()
                                .addComponent(btnGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgQR2Layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(txLink, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgQR2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(copyrigth)
                .addGap(218, 218, 218))
        );
        bgQR2Layout.setVerticalGroup(
            bgQR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgQR2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(bgQR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGroup(bgQR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgQR2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgQR2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(txLink, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)))
                .addGroup(bgQR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(copyrigth)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgQR2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgQR2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
        if(txLink.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Mohon isi linknya!!!");
            txLink.requestFocus();
        }else{
            generate();
        }
    }//GEN-LAST:event_btnGenerateActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        txLink.setText("");
        txLink.requestFocus();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txLinkKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txLinkKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            btnGenerate.requestFocus();
        }
    }//GEN-LAST:event_txLinkKeyPressed

    private void btnGenerateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnGenerateKeyPressed
    
    }//GEN-LAST:event_btnGenerateKeyPressed

    private void btnCancelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCancelKeyPressed

    }//GEN-LAST:event_btnCancelKeyPressed

    private void btnClearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnClearKeyPressed

    }//GEN-LAST:event_btnClearKeyPressed

    private void bgQR2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bgQR2KeyPressed
        
    }//GEN-LAST:event_bgQR2KeyPressed

    private int X,Y;
    private void bgQR2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgQR2MousePressed
        X = evt.getX();
        Y = evt.getY();
    }//GEN-LAST:event_bgQR2MousePressed

    private void bgQR2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgQR2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-X, y-Y);
    }//GEN-LAST:event_bgQR2MouseDragged

    private void btnGenerateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerateMouseEntered
        btnGenerate.setBackground(new java.awt.Color(51,255,255));
    }//GEN-LAST:event_btnGenerateMouseEntered

    private void btnGenerateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerateMouseExited
        btnGenerate.setBackground(new java.awt.Color(204,204,204));
    }//GEN-LAST:event_btnGenerateMouseExited

    private void btnCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseEntered
        btnCancel.setBackground(new java.awt.Color(51,255,255));
    }//GEN-LAST:event_btnCancelMouseEntered

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseExited
        btnCancel.setBackground(new java.awt.Color(204,204,204));
    }//GEN-LAST:event_btnCancelMouseExited

    private void btnClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseEntered
        btnClear.setBackground(new java.awt.Color(51,255,255));
    }//GEN-LAST:event_btnClearMouseEntered

    private void btnClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseExited
        btnClear.setBackground(new java.awt.Color(204,204,204));
    }//GEN-LAST:event_btnClearMouseExited

    private void copyrigthMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_copyrigthMouseEntered
        copyrigth.setForeground(getRandomColor());
    }//GEN-LAST:event_copyrigthMouseEntered

    private void copyrigthMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_copyrigthMouseExited
        copyrigth.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_copyrigthMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(QR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(QR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(QR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(QR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Main.bgQR bgQR2;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JLabel copyrigth;
    private javax.swing.JLabel hasilQR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextArea txLink;
    // End of variables declaration//GEN-END:variables
}
