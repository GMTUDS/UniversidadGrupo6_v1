/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package universidadgrupo6.vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadgrupo6.accesoADatos.AlumnoData;
import universidadgrupo6.accesoADatos.InscripcionData;
import universidadgrupo6.accesoADatos.MateriaData;
import universidadgrupo6.entidades.Alumno;
import universidadgrupo6.entidades.Inscripcion;
import universidadgrupo6.entidades.Materia;

/**
 *
 * @author elise
 */
public class FormularioInscripcionView extends javax.swing.JInternalFrame {

    private  List<Materia> listaM;
    private  List<Alumno> listaA;
    private DefaultTableModel modelo;
    private InscripcionData inscData;
    private MateriaData mData;
    private AlumnoData aData;
    public FormularioInscripcionView() {
        initComponents();
        aData=new AlumnoData();
        listaA=aData.listarAlumnos();
        modelo=new DefaultTableModel();
        inscData=new InscripcionData();
        mData=new MateriaData();
        cargaAlumnos();
        armarCabecera();
        
    }
     public void cargaAlumnos(){
         for(Alumno item :listaA){
            jCBSelecAlumno.addItem(item);  
         }
        
     }
     private void armarCabecera(){
         ArrayList<Object> filaCabecera= new ArrayList<>();
         filaCabecera.add("ID");
          filaCabecera.add("Nombre");
           filaCabecera.add("Año");
           for (Object it: filaCabecera) {
             modelo.addColumn(it);
         }
           jTMateria.setModel(modelo);
     }
     private void borrarFilaTabla(){
         int indice=modelo.getRowCount()-1;
         for (int i = indice; i >=0; i--) {
             modelo.removeRow(i);
         }
     }
     private void cargarDatosNoInscriptas(){
         //borrarFilaTabla();
    Alumno selec=(Alumno) jCBSelecAlumno.getSelectedItem();
     listaM= inscData.obtenerMateriasNoCursadas(selec.getIdAlumno());
    for(Materia m:listaM){
        modelo.addRow(new Object[]{m.getIdMateria(),m.getNombre(),m.getAnioMateria()});
    }
   }
     private void cargarDatosInscriptas(){
          //borrarFilaTabla();
    Alumno selec=(Alumno) jCBSelecAlumno.getSelectedItem();
     listaM= inscData.obtenerMateriasCursadas(selec.getIdAlumno());
    for(Materia m:listaM){
        modelo.addRow(new Object[]{m.getIdMateria(),m.getNombre(),m.getAnioMateria()});
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

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jRadioInscriptas = new javax.swing.JRadioButton();
        jRadioNoInscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTMateria = new javax.swing.JTable();
        jCBSelecAlumno = new javax.swing.JComboBox<>();
        jBAnularInsc = new javax.swing.JButton();
        jBInscribir = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        setIconifiable(true);

        jLabel1.setText("Formulario de Inscripcion");

        jTextField1.setEditable(false);
        jTextField1.setText("Seleccione un Alumno");

        jLabel2.setText("Listado de Materias");

        jRadioInscriptas.setText("Materias Inscriptas");
        jRadioInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioInscriptasActionPerformed(evt);
            }
        });

        jRadioNoInscriptas.setText("Materias No Inscriptas");
        jRadioNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioNoInscriptasActionPerformed(evt);
            }
        });

        jTMateria.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTMateria);

        jCBSelecAlumno.setSelectedIndex(-1);

        jBAnularInsc.setText("Anular ");
        jBAnularInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnularInscActionPerformed(evt);
            }
        });

        jBInscribir.setText("Inscribir");
        jBInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInscribirActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCBSelecAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioInscriptas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioNoInscriptas)
                                .addGap(18, 18, 18)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jBInscribir)
                .addGap(53, 53, 53)
                .addComponent(jBAnularInsc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBSelecAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioInscriptas)
                    .addComponent(jRadioNoInscriptas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAnularInsc)
                    .addComponent(jBSalir)
                    .addComponent(jBInscribir))
                .addGap(0, 32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioInscriptasActionPerformed
     borrarFilaTabla();
     jRadioNoInscriptas.setSelected(false);
     cargarDatosInscriptas();
     jBAnularInsc.setEnabled(true);
     jBInscribir.setEnabled(false);
    }//GEN-LAST:event_jRadioInscriptasActionPerformed

    private void jRadioNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioNoInscriptasActionPerformed
        borrarFilaTabla();
     jRadioInscriptas.setSelected(false);
     cargarDatosNoInscriptas();
     jBAnularInsc.setEnabled(false);
     jBInscribir.setEnabled(true);
    }//GEN-LAST:event_jRadioNoInscriptasActionPerformed

    private void jBInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInscribirActionPerformed
       int filaSeleccionada=jTMateria.getSelectedRow();
       if(filaSeleccionada!=-1){
           Alumno a=(Alumno)jCBSelecAlumno.getSelectedItem();
           int idMateria=(Integer)modelo.getValueAt(filaSeleccionada,0);
           String nombreMateria=(String)modelo.getValueAt(filaSeleccionada,1);
           int anio=(Integer)modelo.getValueAt(filaSeleccionada,2);
           Materia m=new Materia(idMateria,nombreMateria,anio,true);
           Inscripcion i= new Inscripcion(a,m,0);
           inscData.guardarInscripcion(i);
           borrarFilaTabla();
           
           
       }
    }//GEN-LAST:event_jBInscribirActionPerformed

    private void jBAnularInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnularInscActionPerformed
       int filaSeleccionada=jTMateria.getSelectedRow();
       if(filaSeleccionada!=-1){
           Alumno a=(Alumno) jCBSelecAlumno.getSelectedItem();
           int idMateria=(Integer)modelo.getValueAt(filaSeleccionada, 0);
           inscData.borrarInscripcionMateriaAlumno(a.getIdAlumno(), idMateria);
           borrarFilaTabla();
       }else{
           JOptionPane.showMessageDialog(this,"Seleccione la materia,a anular inscripcion");
       }
    }//GEN-LAST:event_jBAnularInscActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAnularInsc;
    private javax.swing.JButton jBInscribir;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Alumno> jCBSelecAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioInscriptas;
    private javax.swing.JRadioButton jRadioNoInscriptas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTMateria;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
