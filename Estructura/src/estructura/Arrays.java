/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura;

/**
 *
 * @author ASUS
 */
public class Arrays extends javax.swing.JFrame {

  private int tama;
  private int index;
  private String array[];

  public Arrays() {
    initComponents();
    this.index = 0;
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    tamanio = new javax.swing.JTextField();
    llenar = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    jButton3 = new javax.swing.JButton();
    imprimir = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(204, 255, 255));

    jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
    jLabel1.setText("Inicializar array");

    jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
    jLabel2.setText("llenar Array");

    tamanio.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tamanioActionPerformed(evt);
      }
    });
    tamanio.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyReleased(java.awt.event.KeyEvent evt) {
        tamanioKeyReleased(evt);
      }
    });

    llenar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        llenarActionPerformed(evt);
      }
    });
    llenar.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        llenarKeyPressed(evt);
      }
    });

    jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
    jLabel4.setText("imprimir Array");

    jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    jButton1.setText("enviar");
    jButton1.setEnabled(false);
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    jButton2.setText("imprimir");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton2ActionPerformed(evt);
      }
    });

    jButton3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    jButton3.setText("def");
    jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton3ActionPerformed(evt);
      }
    });

    imprimir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    imprimir.setText("Imprimir");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jButton2)
        .addGap(61, 61, 61))
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1)
        .addGap(68, 68, 68)
        .addComponent(jLabel2)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
        .addComponent(jLabel4)
        .addGap(20, 20, 20))
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(67, 67, 67)
        .addComponent(jButton3)
        .addGap(160, 160, 160)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton1))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
          .addGap(66, 66, 66)
          .addComponent(tamanio, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addContainerGap(549, Short.MAX_VALUE)))
      .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
          .addGap(229, 229, 229)
          .addComponent(llenar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addContainerGap(253, Short.MAX_VALUE)))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(76, 76, 76)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(jLabel2)
          .addComponent(jLabel4))
        .addGap(39, 39, 39)
        .addComponent(jButton2)
        .addGap(50, 50, 50)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButton1)
          .addComponent(jButton3))
        .addGap(29, 29, 29)
        .addComponent(imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(62, Short.MAX_VALUE))
      .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
          .addGap(144, 144, 144)
          .addComponent(tamanio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addContainerGap(287, Short.MAX_VALUE)))
      .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
          .addGap(148, 148, 148)
          .addComponent(llenar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addContainerGap(283, Short.MAX_VALUE)))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void tamanioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tamanioKeyReleased

  }//GEN-LAST:event_tamanioKeyReleased

  private void llenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llenarActionPerformed


  }//GEN-LAST:event_llenarActionPerformed

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    String casa = "<html>";
    for (String a : array) {
      casa += a + "<p>";
    }
    casa += "<html>";
    imprimir.setText(casa);
  }//GEN-LAST:event_jButton2ActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    if (this.index < array.length) {
      array[this.index] = llenar.getText();
      System.out.println(this.index);
      llenar.setText("");
      getIndex();
    }else{
      jButton1.setEnabled(false);
    }


  }//GEN-LAST:event_jButton1ActionPerformed

  private void tamanioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamanioActionPerformed


  }//GEN-LAST:event_tamanioActionPerformed

  private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    jButton1.setEnabled(true);
    int tam = Integer.parseInt(tamanio.getText());
    array = new String[tam];
    jButton3.setEnabled(false);
    System.out.println(tam);
  }//GEN-LAST:event_jButton3ActionPerformed

  private void llenarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_llenarKeyPressed
    // TODO add your handling code here:
  }//GEN-LAST:event_llenarKeyPressed

  public void getIndex() {
    this.index++;
  }

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
      java.util.logging.Logger.getLogger(Arrays.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Arrays.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Arrays.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Arrays.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Arrays().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel imprimir;
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton3;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JTextField llenar;
  private javax.swing.JTextField tamanio;
  // End of variables declaration//GEN-END:variables
}
