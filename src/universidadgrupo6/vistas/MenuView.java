/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package universidadgrupo6.vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import static jdk.nashorn.internal.objects.NativeDebug.getClass;

/**
 *
 * @author elise
 */
public class MenuView extends javax.swing.JFrame {

    /**
     * Creates new form MenuView
     */
    public MenuView() {
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

        ImageIcon icon = new ImageIcon(getClass().getResource("/universidadgrupo6/recursos/fondo.jpg"));
        Image image = icon.getImage();
        menuGeneral = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);}};
        jMenuBar2 = new javax.swing.JMenuBar();
        jMAlumno = new javax.swing.JMenu();
        jMIFormularioAlumno = new javax.swing.JMenuItem();
        jMMateria = new javax.swing.JMenu();
        jMIFormularioMateria = new javax.swing.JMenuItem();
        jMAdministracion = new javax.swing.JMenu();
        jMIManejoInscripciones = new javax.swing.JMenuItem();
        jMIManipulacionNotas = new javax.swing.JMenuItem();
        jMConsultas = new javax.swing.JMenu();
        jMIAlumnosPorMateria = new javax.swing.JMenuItem();
        jMSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout menuGeneralLayout = new javax.swing.GroupLayout(menuGeneral);
        menuGeneral.setLayout(menuGeneralLayout);
        menuGeneralLayout.setHorizontalGroup(
            menuGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        menuGeneralLayout.setVerticalGroup(
            menuGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        jMAlumno.setText("Alumno");

        jMIFormularioAlumno.setText("Formulario de Alumno");
        jMAlumno.add(jMIFormularioAlumno);

        jMenuBar2.add(jMAlumno);

        jMMateria.setText("Materia");

        jMIFormularioMateria.setText("Formulario de Materia");
        jMMateria.add(jMIFormularioMateria);

        jMenuBar2.add(jMMateria);

        jMAdministracion.setText("Adminiatración");

        jMIManejoInscripciones.setText("Manejo de Inscripciones");
        jMAdministracion.add(jMIManejoInscripciones);

        jMIManipulacionNotas.setText("Manipulación de notas");
        jMAdministracion.add(jMIManipulacionNotas);

        jMenuBar2.add(jMAdministracion);

        jMConsultas.setText("Consultas");

        jMIAlumnosPorMateria.setText("Alumnos por Materia");
        jMConsultas.add(jMIAlumnosPorMateria);

        jMenuBar2.add(jMConsultas);

        jMSalir.setText("Salir");
        jMenuBar2.add(jMSalir);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuGeneral, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuGeneral, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMAdministracion;
    private javax.swing.JMenu jMAlumno;
    private javax.swing.JMenu jMConsultas;
    private javax.swing.JMenuItem jMIAlumnosPorMateria;
    private javax.swing.JMenuItem jMIFormularioAlumno;
    private javax.swing.JMenuItem jMIFormularioMateria;
    private javax.swing.JMenuItem jMIManejoInscripciones;
    private javax.swing.JMenuItem jMIManipulacionNotas;
    private javax.swing.JMenu jMMateria;
    private javax.swing.JMenu jMSalir;
    private javax.swing.JMenuBar jMenuBar2;
    public javax.swing.JDesktopPane menuGeneral;
    // End of variables declaration//GEN-END:variables
}
