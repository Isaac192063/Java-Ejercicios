/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import javax.swing.JOptionPane;
import java.util.Arrays;

/**
 *
 * @author ASUS
 */
public class GestionNombre extends javax.swing.JFrame {

  String nombres[];
  int tam;

  /**
   * Creates new form GestionNombre
   */
  public GestionNombre() {
    initComponents();
    setLocationRelativeTo(null);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jButton1 = new javax.swing.JButton();
    llenar = new javax.swing.JButton();
    ver = new javax.swing.JButton();
    orden = new javax.swing.JButton();
    eliminar = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jButton1.setText("definir tamaño");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    llenar.setText("llenar");
    llenar.setEnabled(false);
    llenar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        llenarActionPerformed(evt);
      }
    });

    ver.setText("ver nombres");
    ver.setEnabled(false);
    ver.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        verActionPerformed(evt);
      }
    });

    orden.setText("mostrar en orden");
    orden.setEnabled(false);
    orden.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        ordenActionPerformed(evt);
      }
    });

    eliminar.setText("eliminar repetidos");
    eliminar.setEnabled(false);
    eliminar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        eliminarActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(97, 97, 97)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(orden, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
            .addComponent(llenar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(28, 28, 28)
            .addComponent(ver)))
        .addGap(93, 93, 93))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(83, 83, 83)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(llenar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(ver, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(44, 44, 44)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(orden, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(95, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  public String mayMen(String cad) {
    for (int i = 0; i < cad.length(); i++) {

      if (cad.charAt(i) == 'a' || cad.charAt(i) == 'A') {
        return cad.toUpperCase();
      } else if (cad.charAt(i) == 'e' || cad.charAt(i) == 'E') {
        return cad.toLowerCase();
      }

    }
    return cad;
  }

  private void verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verActionPerformed
    String name = "";
    boolean salir = false;
    for (int i = 0; i < this.tam; i++) {

      if (!nombres[i].equals("")) {
        String nuevo = mayMen(nombres[i]);
        nombres[i] = nuevo;
      }

    }
    for (String a : nombres) {
      if (!a.equals("")) {
        name += a + "\n";
      }

    }
    JOptionPane.showMessageDialog(rootPane, name);
  }//GEN-LAST:event_verActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    this.tam = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el tamaño del arreglo"));
    this.nombres = new String[this.tam];
    if (this.tam != 0) {
      llenar.setEnabled(true);
    }
  }//GEN-LAST:event_jButton1ActionPerformed

  private void llenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llenarActionPerformed

    for (int i = 0; i < this.tam; i++) {
      this.nombres[i] = JOptionPane.showInputDialog(null, "ingrese nombre de la posicion " + (i + 1));
    }
     ver.setEnabled(true);
     orden.setEnabled(true);
     eliminar.setEnabled(true);
  }//GEN-LAST:event_llenarActionPerformed

  private void ordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenActionPerformed

    String invertido[] = nombres.clone();
    Arrays.sort(nombres);
    int j = 0;
    for (int i = nombres.length - 1; i >= 0; i--) {
      invertido[i] = nombres[j];
      j++;
    }

    String nombresOrden = "";

    for (String a : invertido) {
      if (!a.equals("")) {
        nombresOrden += a + "\n";
      }
    }
    JOptionPane.showMessageDialog(rootPane, nombresOrden);
  }//GEN-LAST:event_ordenActionPerformed

  private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed

    String name = "";
    for (int i = 0; i < nombres.length; i++) {
      for (int j = 0; j < nombres.length; j++) {
        if (i != j) {
          if (nombres[i].equalsIgnoreCase(nombres[j])) {
            nombres[i] = "";
          }
        }
      }
    }
    for (String asa : nombres) {
      if (!asa.equals("")) {
        name += asa.trim() + "\n";
      }

    }
    JOptionPane.showMessageDialog(rootPane, name);
  }//GEN-LAST:event_eliminarActionPerformed

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
      java.util.logging.Logger.getLogger(GestionNombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(GestionNombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(GestionNombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(GestionNombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new GestionNombre().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton eliminar;
  private javax.swing.JButton jButton1;
  private javax.swing.JButton llenar;
  private javax.swing.JButton orden;
  private javax.swing.JButton ver;
  // End of variables declaration//GEN-END:variables
}
