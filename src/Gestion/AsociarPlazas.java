/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;

import Util.ValidaNumeros;
import Gestion.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AsociarPlazas extends javax.swing.JFrame {

    /**
     * Creates new form AsociarPlazas
     */
    public AsociarPlazas() {
        initComponents();
        FillTable ();
        resetcomponentes();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation((screenSize.width - getWidth()) / 2, (screenSize.height - getHeight())/ 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        plazasp = new javax.swing.JTextField();
        plazasa = new javax.swing.JTextField();
        plazasc = new javax.swing.JTextField();
        asociar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Plazas");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Identificador", "Nombre", "Grupo Escala", "CO", "Unidad Org", "Plazas Propuestas", "Plazas Aprobadas", "Plazas Cubiertas"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Plazas Propuestas:");

        jLabel2.setText("Plazas Aprobadas:");

        jLabel3.setText("Plazas Cubiertas:");

        plazasp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                plazaspKeyPressed(evt);
            }
        });

        plazasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                plazasaKeyPressed(evt);
            }
        });

        plazasc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                plazascKeyPressed(evt);
            }
        });

        asociar.setText("Asociar");
        asociar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asociarActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(asociar)
                        .addGap(115, 115, 115)
                        .addComponent(cancelar)
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(plazasp, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(plazasa, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(plazasc, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plazasp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(plazasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(plazasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asociar)
                    .addComponent(cancelar))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
       dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        boolean enabled = (jTable1.getSelectedRowCount() > 0)? true : false;
        asociar.setEnabled(enabled);
        plazasp.setEnabled(enabled);
        plazasa.setEnabled(enabled);
        plazasc.setEnabled(enabled);
    }//GEN-LAST:event_jTable1MouseClicked

    private void plazaspKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_plazaspKeyPressed
        ValidaNumeros.txtentero(evt);
    }//GEN-LAST:event_plazaspKeyPressed

    private void plazasaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_plazasaKeyPressed
         ValidaNumeros.txtentero(evt);
    }//GEN-LAST:event_plazasaKeyPressed

    private void plazascKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_plazascKeyPressed
         ValidaNumeros.txtentero(evt);
    }//GEN-LAST:event_plazascKeyPressed

    private void asociarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asociarActionPerformed
      Cargo c = new Cargo();
      int selectedRow = jTable1.getSelectedRow();
      int id = (Integer)jTable1.getModel().getValueAt(selectedRow, 0) ;
      
      c.setPlazasP(Integer.parseInt(plazasp.getText()));
      c.setPlazasA(Integer.parseInt(plazasa.getText()));
      c.setPlazasC(Integer.parseInt(plazasc.getText()));
      
      try {
            CapitalHumano.updatePlazas(c, id);
            String Msng = "Ha Modificado el Cargo con exito";
            JOptionPane.showOptionDialog(getContentPane(), Msng, "Informativo", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[] {"Aceptar"}, "Aceptar");
            FillTable ();
            resetcomponentes();
        } catch (SQLException ex) {
            Logger.getLogger(CapitalHumano.class.getName()).log(Level.SEVERE, null, ex);
            String Msng = "Ha Ocurrido un error  con la Base de Datos";
            JOptionPane.showOptionDialog(getContentPane(), Msng, "Error", JOptionPane.YES_OPTION, JOptionPane.ERROR_MESSAGE, null, new Object[] {"Aceptar"}, "Aceptar");
            //FillTable();
        } 
         
    }//GEN-LAST:event_asociarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AsociarPlazas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AsociarPlazas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AsociarPlazas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AsociarPlazas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AsociarPlazas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton asociar;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField plazasa;
    private javax.swing.JTextField plazasc;
    private javax.swing.JTextField plazasp;
    // End of variables declaration//GEN-END:variables

private void FillTable (){

      try {
            List<Cargo> cargos = CapitalHumano.getAllCargos();
            DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
            tableModel.setRowCount(0);
            for (Cargo element : cargos) {
                
                CategoriaOcuapcional co= CapitalHumano.getCO(element.getIdco());
                UnidadOrganizativa uo= CapitalHumano.getUO(element.getIduo());
                
                Object[] row = {element.getId(), element.getNombre(),element.getGrupoEscala(), co.getNombre(), uo.getNombre(), element.getPlazasP(), element.getPlazasA(), element.getPlazasC()};
                tableModel.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CapitalHumano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


  private void resetcomponentes() {
        plazasa.setText("");
        plazasc.setText("");
        plazasp.setText("");
        asociar.setEnabled(false);
        plazasa.setEnabled(false);
        plazasp.setEnabled(false);
        plazasc.setEnabled(false);
    }


}
