/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIS;

import Gestion.Salario;
import Gestion.CatCO;
import Gestion.CatCargo;
import Gestion.CatUO;
import Reportes.PlantilladeCargos;
import Reportes.Vacantes;

public class PrincipalT extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalT
     */
    public PrincipalT() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        catoc = new javax.swing.JMenuItem();
        uo = new javax.swing.JMenuItem();
        cargos = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        generar = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        vacantes = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        salario = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        camusu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Capital Humano");

        jMenu1.setText("Archivo");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Catálogos");

        catoc.setText("Categorías Ocupacionales");
        catoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catocActionPerformed(evt);
            }
        });
        jMenu2.add(catoc);

        uo.setText("Unidades Organizativas");
        uo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uoActionPerformed(evt);
            }
        });
        jMenu2.add(uo);

        cargos.setText("Cargos");
        cargos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargosActionPerformed(evt);
            }
        });
        jMenu2.add(cargos);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Gestionar");
        jMenuBar1.add(jMenu3);

        jMenu6.setText("Plantilla");

        generar.setText("Generar");
        generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarActionPerformed(evt);
            }
        });
        jMenu6.add(generar);

        jMenuBar1.add(jMenu6);

        jMenu5.setText("Reportes");

        vacantes.setText("Plazas Vacantes");
        vacantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vacantesActionPerformed(evt);
            }
        });
        jMenu5.add(vacantes);

        jMenuBar1.add(jMenu5);

        jMenu7.setText("Buscar");

        salario.setText("Salarios");
        salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salarioActionPerformed(evt);
            }
        });
        jMenu7.add(salario);

        jMenuBar1.add(jMenu7);

        jMenu4.setText("Configuración");

        camusu.setText("Cambiar de Usuario");
        jMenu4.add(camusu);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 287, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void catocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catocActionPerformed
       new CatCO().setVisible(true);
    }//GEN-LAST:event_catocActionPerformed

    private void uoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uoActionPerformed
        new CatUO().setVisible(true);
    }//GEN-LAST:event_uoActionPerformed

    private void cargosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargosActionPerformed
       new CatCargo().setVisible(true);
    }//GEN-LAST:event_cargosActionPerformed

    private void generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarActionPerformed
       new PlantilladeCargos().setVisible(true);
    }//GEN-LAST:event_generarActionPerformed

    private void vacantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vacantesActionPerformed
       new Vacantes().setVisible(true);
    }//GEN-LAST:event_vacantesActionPerformed

    private void salarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salarioActionPerformed
        new Salario().setVisible(true);
    }//GEN-LAST:event_salarioActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PrincipalT().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem camusu;
    private javax.swing.JMenuItem cargos;
    private javax.swing.JMenuItem catoc;
    private javax.swing.JMenuItem generar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem salario;
    private javax.swing.JMenuItem uo;
    private javax.swing.JMenuItem vacantes;
    // End of variables declaration//GEN-END:variables
}
