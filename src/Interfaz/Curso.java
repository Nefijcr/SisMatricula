
package Interfaz;
import Datos.Eliminar;
import Datos.Guardar;
import Datos.Leer;
import Entidad.Cursos;
import Logica.EstudianteBuscar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nefij
 */
public class Curso extends javax.swing.JInternalFrame {
    private DefaultTableModel modelCurso;
    
    public Curso() {
        initComponents();
        
        tablaDesing();
        cbCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Programacion Movil", "Net 1", "Java 1" }));
        cbGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Secundaria Completa","Secundaria Incompleta","Magister"}));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoEstudiante = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbCurso = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbGrado = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCurso = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setTitle("Cursos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de Cursos"));

        jLabel1.setText("Codigo:");

        txtCodigoEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoEstudianteKeyTyped(evt);
            }
        });

        jLabel3.setText("Curso:");

        cbCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCurso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCursoItemStateChanged(evt);
            }
        });

        jLabel4.setText("Grado de Estudios:");

        cbGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbGrado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbGradoItemStateChanged(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Btn_Guardar.png"))); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Btn_Eliminar.png"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Btn_Quitar.png"))); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCodigoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbGrado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbCurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(39, 39, 39))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addContainerGap(37, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton1)
                        .addGap(12, 12, 12)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jButton2)))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        tableCurso.setName("tableCurso"); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        tableCurso.setViewportView(jTable1);

        jScrollPane1.setViewportView(tableCurso);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(145, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbGradoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbGradoItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            String gradoSeleccionado = (String) cbGrado.getSelectedItem();
            System.out.println("Grado seleccionado: " + gradoSeleccionado);
        }// TODO add your handling code here:
    }//GEN-LAST:event_cbGradoItemStateChanged

    private void cbCursoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCursoItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            String cursoSeleccionado = (String) cbCurso.getSelectedItem();
            System.out.println("Curso seleccionado: " + cursoSeleccionado);
        }// TODO add your handling code here:
    }//GEN-LAST:event_cbCursoItemStateChanged

    private void txtCodigoEstudianteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoEstudianteKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
        if (txtCodigoEstudiante.getText().trim().length() == 7) {
            evt.consume();
        }// TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoEstudianteKeyTyped

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
         EstudianteBuscar estudiante = new EstudianteBuscar();
        if (estudiante.buscarEstudiante(txtCodigoEstudiante.getText()) && validarCamposVacios() ) {
            String gradoSeleccionado = (String) cbGrado.getSelectedItem();
            String cursoSeleccionado = (String) cbCurso.getSelectedItem();
            Cursos curso = new Cursos(txtCodigoEstudiante.getText(), gradoSeleccionado, cursoSeleccionado);
            Guardar escribir = new Guardar();
            escribir.registrarCurso(curso, gradoSeleccionado, cursoSeleccionado);
            tablaDesing();
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Los datos ingresados son incorrectos", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
 
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
         int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            String codigoEstudiante = jTable1.getValueAt(selectedRow, 0).toString();
            modelCurso.removeRow(selectedRow);
            Eliminar eliminar = new Eliminar();
            eliminar.eliminarCurso(selectedRow, codigoEstudiante);
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una fila para eliminar.", "Alerta", JOptionPane.WARNING_MESSAGE);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
    limpiarCampos();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MousePressed
private void tablaDesing(){
      modelCurso = new DefaultTableModel(0, 3); // 5 es el número de columnas
    // Establecer los nombres de las columnas en el modelo de la tabla
    modelCurso.setColumnIdentifiers(new Object[]{"Nombre", "Grado de Estudios", "Curso"}); 
    jTable1.setModel(modelCurso);
    cargarDatos();  
    }
    private void cargarDatos() {
        Leer leer = new Leer();
        EstudianteBuscar estudiante = new EstudianteBuscar();
        List<Cursos> listaCursos = leer.leerCursos();
        for (Cursos curso : listaCursos) {
            modelCurso.addRow(new Object[]{estudiante.buscarCodigoEstudiante(curso.getCodigoEstudiante()), curso.getGrado(), curso.getCurso()});
        }
    }
    private void limpiarCampos(){
        txtCodigoEstudiante.setText("");
        
    }
    private boolean validarCamposVacios() {
    boolean camposVacios = false;
    
    // Aquí añade todos tus JTextField que quieres validar
    JTextField[] campos = {txtCodigoEstudiante}; // Asume que tienes estos campos definidos
    
    for (JTextField campo : campos) {
        if (campo.getText().trim().isEmpty()) { // Comprueba si el texto está vacío o solo contiene espacios
            camposVacios = true;
            break; // Si encuentras un campo vacío, sales del bucle
        }
    }
    
    if (camposVacios) {
        JOptionPane.showMessageDialog(this, "Por favor, rellena todos los campos.", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
    }
    
    return !camposVacios; // Retorna true si todos los campos están llenos, false si hay algún campo vacío
}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbCurso;
    private javax.swing.JComboBox<String> cbGrado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JScrollPane tableCurso;
    private javax.swing.JTextField txtCodigoEstudiante;
    // End of variables declaration//GEN-END:variables
}
