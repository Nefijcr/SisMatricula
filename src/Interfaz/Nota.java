
package Interfaz;

import Datos.Eliminar;
import Datos.Guardar;
import Datos.Leer;
import Datos.Modificar;
import Entidad.Notas;
import Logica.EstudianteBuscar;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nefij
 */
public class Nota extends javax.swing.JInternalFrame {

     private DefaultTableModel modelNota;
    public Nota() {
        initComponents();
        tablaDesing();
        cbCursoN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Programacion Movil", "Net 1", "Java 1" }));
        cbExamen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primer Examen", "Segundo Examen","Tercer Examen","Examen Final"}));
    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoEstCurso = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbCursoN = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtNota = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cbExamen = new javax.swing.JComboBox<>();
        btnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableNotas = new javax.swing.JTable();

        setTitle("Notas");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro de Notas"));

        jLabel1.setText("Codigo:");

        txtCodigoEstCurso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoEstCursoKeyTyped(evt);
            }
        });

        jLabel2.setText("Curso:");

        cbCursoN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCursoN.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCursoNItemStateChanged(evt);
            }
        });

        jLabel3.setText("Nota:");

        txtNota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNotaKeyTyped(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Btn_Guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGuardarMousePressed(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Btn_Quitar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEliminarMousePressed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Btn_Eliminar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancelarMousePressed(evt);
            }
        });
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel5.setText("Examen:");

        cbExamen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbExamen.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbExamenItemStateChanged(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Btn_Editar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnModificarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEliminar)
                    .addComponent(btnGuardar)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCodigoEstCurso)
                                .addComponent(cbCursoN, 0, 140, Short.MAX_VALUE)
                                .addComponent(cbExamen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoEstCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbCursoN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbExamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnModificar))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        tableNotas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableNotas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(159, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoEstCursoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoEstCursoKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
        if (txtCodigoEstCurso.getText().trim().length() == 7) {
            evt.consume();
        }//// TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoEstCursoKeyTyped

    private void cbCursoNItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCursoNItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            String cursoNSeleccionado = (String) cbCursoN.getSelectedItem();
            System.out.println("Curso seleccionado: " + cursoNSeleccionado);
        }// TODO add your handling code here:
    }//GEN-LAST:event_cbCursoNItemStateChanged

    private void cbExamenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbExamenItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            String examenSeleccionado = (String) cbExamen.getSelectedItem();
            System.out.println("Examen seleccionado: " + examenSeleccionado);
        }// TODO add your handling code here:
    }//GEN-LAST:event_cbExamenItemStateChanged

    private void txtNotaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNotaKeyTyped
     char key = evt.getKeyChar();
    boolean numeros = (key >= '0' && key <= '9') || key == KeyEvent.VK_BACK_SPACE || key == '.';
    if (!numeros) {
        evt.consume();
        return; // Salir del método si no es un número ni la tecla de retroceso ni el punto decimal
    }
    
    // Obtener el texto actual en el campo de texto y concatenarle el nuevo carácter
    String texto = txtNota.getText() + key;
    
    // Verificar que el texto represente un número entre 0 y 20
    try {
        double nota = Double.parseDouble(texto);
        if (nota < 0 || nota > 20) {
            evt.consume();
        }
    } catch (NumberFormatException e) {
        // El texto no es un número válido, consumir el evento
        evt.consume();
    }
    }//GEN-LAST:event_txtNotaKeyTyped

    private void btnGuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMousePressed
        EstudianteBuscar estudiante = new EstudianteBuscar();
        if (estudiante.buscarEstudiante(txtCodigoEstCurso.getText()) && validarCamposVacios() ) {   
            String cursoNSeleccionado = (String) cbCursoN.getSelectedItem();
            String examenSeleccionado = (String) cbExamen.getSelectedItem();
            Notas nota = new Notas(txtCodigoEstCurso.getText(), cursoNSeleccionado, examenSeleccionado, txtNota.getText());
            Guardar escribir = new Guardar();
            escribir.registrarNotas(nota, cursoNSeleccionado, examenSeleccionado);
            tablaDesing();
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Los datos ingresados son incorrectos", "Alerta", JOptionPane.WARNING_MESSAGE);
        }// TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarMousePressed

    private void btnEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMousePressed
     int selectedRow = tableNotas.getSelectedRow();
if (selectedRow != -1) {
    Object value = tableNotas.getValueAt(selectedRow, 0);
    if (value != null) {
        String codigoNota = value.toString();
        modelNota.removeRow(selectedRow);
        Eliminar eliminar = new Eliminar();
        eliminar.eliminarNota(selectedRow, codigoNota);
    } else {
        JOptionPane.showMessageDialog(this, "El valor seleccionado es nulo.", "Alerta", JOptionPane.WARNING_MESSAGE);
    }} // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarMousePressed

    private void btnCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMousePressed
        limpiarCampos();  // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarMousePressed

    private void btnModificarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMousePressed
         int selectedRow = tableNotas.getSelectedRow();
    if (selectedRow != -1) { // Si se ha seleccionado una fila
        try {
            // Mostrar una ventana de diálogo para editar los datos
            
            String nuevoCurso = (String) cbCursoN.getSelectedItem();
            String nuevoExamen = (String) cbExamen.getSelectedItem();
            String nuevaNota = JOptionPane.showInputDialog(this, "Nueva Nota:", tableNotas.getValueAt(selectedRow, 3));
            // Actualizar los datos en el archivo
            if (nuevoCurso !=null && nuevoExamen !=null&& nuevaNota != null ) {
                // Guardar los cambios en el archivo
                Modificar modificar = new Modificar();
                modificar.modificarNota(selectedRow, nuevoCurso, nuevoExamen, nuevaNota);

                // Actualizar la fila en la tabla   
                modelNota.setValueAt(nuevoCurso, selectedRow, 1);
                modelNota.setValueAt(nuevoExamen, selectedRow, 2);
                modelNota.setValueAt(nuevaNota, selectedRow, 3);
                
            }
        } catch (NullPointerException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error al obtener datos de la fila seleccionada.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Seleccione una fila para modificar.", "Alerta", JOptionPane.WARNING_MESSAGE);
    }// TODO add your handling code here:
    }//GEN-LAST:event_btnModificarMousePressed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed
private void tablaDesing(){
      modelNota = new DefaultTableModel(0, 4); // 5 es el número de columnas
    // Establecer los nombres de las columnas en el modelo de la tabla
    modelNota.setColumnIdentifiers(new Object[]{"Nombre", "Curso", "Examenes","Nota"}); 
    tableNotas.setModel(modelNota);
    cargarDatos();  
    }
    private void cargarDatos() {
        Leer leer = new Leer();
        EstudianteBuscar estudiante = new EstudianteBuscar();
        List<Notas> listaNotas = leer.leerNotas();
        for (Notas nota : listaNotas) {
            modelNota.addRow(new Object[]{estudiante.buscarCodigoEstudiante(nota.getCodigoEstCurso()), nota.getCursoNotas(), nota.getExamen(), nota.getNota()});
        }
    }
    private void limpiarCampos(){
        txtCodigoEstCurso.setText("");
        txtNota.setText("");
    }
    private boolean validarCamposVacios() {
    boolean camposVacios = false;
    
    // Aquí añade todos tus JTextField que quieres validar
    JTextField[] campos = {txtCodigoEstCurso}; // Asume que tienes estos campos definidos
    
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbCursoN;
    private javax.swing.JComboBox<String> cbExamen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableNotas;
    private javax.swing.JTextField txtCodigoEstCurso;
    private javax.swing.JTextField txtNota;
    // End of variables declaration//GEN-END:variables
}
