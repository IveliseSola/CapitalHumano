/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;

import Gestion.CapitalHumano;
import Gestion.CategoriaOcuapcional;
import Gestion.UnidadOrganizativa;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ModificarUO extends javax.swing.JFrame {

    /**
     * Creates new form ModificarUO
     */
    public ModificarUO() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        nivel = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        modificar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modificar Unidad organizativa");

        jLabel1.setText("Nombre:");

        jLabel2.setText("Nivel:");

        jLabel3.setText("Clasificación:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Unidad Presupuestada", "Área de Investigación y Desarrollo", "Unidad de Cencia y Técnica", "Unidad de Producción", "Centro de Estudios" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Identificador", "Nombre", "Nivel", "Clasificación"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
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
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(modificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nivel)
                            .addComponent(nombre))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar)
                    .addComponent(modificar))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
       dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        boolean enabled = (jTable1.getSelectedRowCount() > 0)? true : false;
        modificar.setEnabled(enabled);
        nombre.setEnabled(enabled);
        nivel.setEnabled(enabled);
        jComboBox1.setEnabled(enabled);
        FillComponents();
    }//GEN-LAST:event_jTable1MouseClicked

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        UnidadOrganizativa uo = new UnidadOrganizativa();
        int selectedRow = jTable1.getSelectedRow();
        int id = (Integer)jTable1.getModel().getValueAt(selectedRow, 0) ;
         
        uo.setNombre(nombre.getText());
        uo.setNivel(Integer.parseInt(nivel.getText()));
        uo.setClasificacion((String) jComboBox1.getSelectedItem());

        try {
            CapitalHumano.updateUO(uo,id);
            String Msng = "Ha Modificado La Unidad Organizativa con exito";
            JOptionPane.showOptionDialog(getContentPane(), Msng, "Informativo", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[] {"Aceptar"}, "Aceptar");
            FillTable ();
            resetcomponentes();
        } catch (SQLException ex) {
            Logger.getLogger(CapitalHumano.class.getName()).log(Level.SEVERE, null, ex);
            String Msng = "Ha Ocurrido un error  con la Base de Datos";
            JOptionPane.showOptionDialog(getContentPane(), Msng, "Error", JOptionPane.YES_OPTION, JOptionPane.ERROR_MESSAGE, null, new Object[] {"Aceptar"}, "Aceptar");
            FillTable();
        } 
    }//GEN-LAST:event_modificarActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarUO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarUO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarUO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarUO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ModificarUO().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField nivel;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables

private void FillComponents() {
       
        int  selectedRow = jTable1.getSelectedRow();
        int id = (Integer) jTable1.getModel().getValueAt(selectedRow, 0);
        
        try {
            
            UnidadOrganizativa uo= CapitalHumano.getUO(id);

            nombre.setText(uo.getNombre());
            nivel.setText(Integer.toString(uo.getNivel()));
            jComboBox1.setSelectedItem(uo.getClasificacion());
       
        } catch (SQLException ex) {
            Logger.getLogger(CapitalHumano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


private void FillTable (){

      try {
            List<UnidadOrganizativa> unidades = CapitalHumano.getAllUO();
            DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
            tableModel.setRowCount(0);
            for (UnidadOrganizativa element : unidades) {
                Object[] row = {element.getIdentificadorUO(), element.getNombre(),element.getNivel(), element.getClasificacion()};
                tableModel.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CapitalHumano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


  private void resetcomponentes() {
        nombre.setText("");
        nivel.setText("");
        jComboBox1.setSelectedIndex(-1);
        modificar.setEnabled(false);
        nombre.setEnabled(false);
        nivel.setEnabled(false);
        jComboBox1.setEnabled(false);

    }

}