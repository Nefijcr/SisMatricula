package Interfaz;

import Datos.Buscar;
import Datos.Guardar;
import Datos.Leer;
import Datos.Modificar;
import Entidad.Estudiantes;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nefij
 */
public class Estudiante extends javax.swing.JInternalFrame {

    private DefaultTableModel modelEstudiantes;
    private final List<Estudiantes> listaEstudiantes;

    public Estudiante() {
        initComponents();
        tabladessing();
        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Varon", "Mujer", "sin especificar"}));
        Leer leer = new Leer();
        listaEstudiantes = leer.leerEstudiantes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        cbSexo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEstudiantes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();

        setTitle("Estudiantes");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de Estudiante"));

        jLabel1.setText("Codigo:");

        jLabel2.setText("Apellidos y Nombre:");

        jLabel3.setText("DNI:");

        jLabel4.setText("Edad:");

        jLabel5.setText("Sexo:");

        jLabel6.setText("Direccion:");

        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });

        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbSexo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSexoItemStateChanged(evt);
            }
        });

        jLabel7.setText("Telefono:");

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEdad)
                    .addComponent(txtDni))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cbSexo, 0, 146, Short.MAX_VALUE)
                        .addComponent(txtTelefono)))
                .addGap(47, 47, 47))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        tableEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableEstudiantes);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Btn_Guardar.png"))); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Btn_Editar.png"))); // NOI18N
        btnMod.setText("Modificar");
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Btn_Eliminar.png"))); // NOI18N
        jButton4.setText("Limpiar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel8.setText("Buscar:");

        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 911, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addComponent(btnMod)
                                .addGap(41, 41, 41)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(btnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed

        if (validarCamposVacios()) {
            String sexoSeleccionado = (String) cbSexo.getSelectedItem();
            Estudiantes estudiante = new Estudiantes(txtCodigo.getText(), txtNombre.getText(), txtEdad.getText(), txtDni.getText(), txtDireccion.getText(), txtTelefono.getText(), sexoSeleccionado);
            Guardar escribir = new Guardar();
            escribir.registrarEstudiante(estudiante, sexoSeleccionado);
            tabladessing();
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, rellena todos los campos.", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed

        limpiarCampos();// TODO add your handling code here:
    }//GEN-LAST:event_jButton4MousePressed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
       char key = evt.getKeyChar();
    String texto = txtEdad.getText();
    
    // Permitir solo dígitos y máximo 2 caracteres
    if (!Character.isDigit(key) || texto.length() >= 2) {
        evt.consume(); // Consumir el evento si no es un dígito o si ya hay 2 caracteres
    }

    }//GEN-LAST:event_txtEdadKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (txtTelefono.getText().trim().length() == 9) {
            evt.consume();
        } // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
        if (txtDni.getText().trim().length() == 8) {
            evt.consume();
        }    // TODO add your handling code here:
    }//GEN-LAST:event_txtDniKeyTyped

    private void cbSexoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSexoItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            String sexoSeleccionado = (String) cbSexo.getSelectedItem();
            System.out.println("Sexo seleccionado: " + sexoSeleccionado);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cbSexoItemStateChanged

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        char key = evt.getKeyChar();
        // Verificar si el carácter ingresado no es un número o si la longitud del texto es mayor o igual a 7
        if (!Character.isDigit(key) || txtCodigo.getText().length() >= 7) {
            evt.consume(); // Consumir el evento para evitar que se escriba el carácter
        }      // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed
        int selectedRow = tableEstudiantes.getSelectedRow();
        if (selectedRow != -1) { // Si se ha seleccionado una fila
            try {
                // Mostrar una ventana de diálogo para editar los datos
                String nuevoNombre = JOptionPane.showInputDialog(this, "Nuevo Nombre:", tableEstudiantes.getValueAt(selectedRow, 1));

                // Validar y limitar la longitud de la nueva edad
                String nuevaEdad = JOptionPane.showInputDialog(this, "Nueva Edad (máximo 2 dígitos):", tableEstudiantes.getValueAt(selectedRow, 2));
                if (nuevaEdad != null && nuevaEdad.matches("\\d{1,2}")) {
                    // Si la longitud de la edad es mayor que 2, se tomarán solo los primeros 2 dígitos
                    if (nuevaEdad.length() > 2) {
                        nuevaEdad = nuevaEdad.substring(0, 2);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor, ingresa una edad válida (máximo 2 dígitos).", "Error", JOptionPane.ERROR_MESSAGE);
                    return; // Salir del método si la entrada no es válida
                }

                // Validar y limitar la longitud del nuevo DNI
                String nuevoDni = JOptionPane.showInputDialog(this, "Nuevo DNI (8 dígitos):", tableEstudiantes.getValueAt(selectedRow, 3));
                if (nuevoDni != null && nuevoDni.matches("\\d{8}")) {
                    // Si la longitud del DNI es mayor que 8, se tomarán solo los primeros 8 dígitos
                    if (nuevoDni.length() > 8) {
                        nuevoDni = nuevoDni.substring(0, 8);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor, ingresa un DNI válido (8 dígitos).", "Error", JOptionPane.ERROR_MESSAGE);
                    return; // Salir del método si la entrada no es válida
                }
                String nuevaDireccion = JOptionPane.showInputDialog(this, "Nueva Dirección:", tableEstudiantes.getValueAt(selectedRow, 4));
                // Validar y limitar la longitud del nuevo teléfono
                String nuevoTelefono = JOptionPane.showInputDialog(this, "Nuevo Teléfono (9 dígitos):", tableEstudiantes.getValueAt(selectedRow, 5));
                if (nuevoTelefono != null && nuevoTelefono.matches("\\d{9}")) {
                    // Si la longitud del teléfono es mayor que 9, se tomarán solo los primeros 9 dígitos
                    if (nuevoTelefono.length() > 9) {
                        nuevoTelefono = nuevoTelefono.substring(0, 9);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor, ingresa un teléfono válido (9 dígitos).", "Error", JOptionPane.ERROR_MESSAGE);
                    return; // Salir del método si la entrada no es válida
                }

                String nuevoSexo = (String) cbSexo.getSelectedItem();

                // Actualizar los datos en el archivo
                Modificar modificar = new Modificar();
                modificar.modificarEstudiante(selectedRow, nuevoNombre, nuevaEdad, nuevoDni, nuevaDireccion, nuevoTelefono, nuevoSexo);

                // Actualizar la fila en la tabla
                modelEstudiantes.setValueAt(nuevoNombre, selectedRow, 1);
                modelEstudiantes.setValueAt(nuevaEdad, selectedRow, 2);
                modelEstudiantes.setValueAt(nuevoDni, selectedRow, 3);
                modelEstudiantes.setValueAt(nuevaDireccion, selectedRow, 4);
                modelEstudiantes.setValueAt(nuevoTelefono, selectedRow, 5);
                modelEstudiantes.setValueAt(nuevoSexo, selectedRow, 6);
            } catch (NullPointerException | NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Error al obtener datos de la fila seleccionada.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una fila para modificar.", "Alerta", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_btnModActionPerformed

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased

        String codigoBusqueda = txtBusqueda.getText().trim();

        // Verificar si el campo de búsqueda está vacío
        if (!codigoBusqueda.isEmpty()) {
            // Crear un objeto Buscar con la lista de estudiantes
            Buscar buscador = new Buscar(listaEstudiantes);
            List<Estudiantes> estudiantesEncontrados = buscador.buscarEstudiantesPorCodigoParcial(codigoBusqueda);

            // Limpiar la tabla antes de agregar los resultados de la búsqueda
            DefaultTableModel model = (DefaultTableModel) tableEstudiantes.getModel();
            model.setRowCount(0);

            // Agregar los estudiantes encontrados a la tabla
            for (Estudiantes estudiante : estudiantesEncontrados) {
                model.addRow(new Object[]{
                    estudiante.getCodigo(),
                    estudiante.getNombre(),
                    estudiante.getEdad(),
                    estudiante.getDni(),
                    estudiante.getDireccion(),
                    estudiante.getTelefono(),
                    estudiante.getSexo()
                });
            }

            // Verificar si se encontraron estudiantes
            if (estudiantesEncontrados.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No se encontró ningún estudiante con el código especificado.", "Búsqueda", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            // Si el campo de búsqueda está vacío, cargar todos los estudiantes en la tabla
            cargarDatos();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedaKeyReleased

    private void txtBusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyPressed

        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedaKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tabladessing() {
        modelEstudiantes = new DefaultTableModel(0, 7); // 5 es el número de columnas
        // Establecer los nombres de las columnas en el modelo de la tabla
        modelEstudiantes.setColumnIdentifiers(new Object[]{"Codigo", "Nombre", "Edad", "Dni", "Direccion", "Telefono", "Sexo"});
        tableEstudiantes.setModel(modelEstudiantes);
        cargarDatos();
    }

    private void cargarDatos() {
        Leer leer = new Leer();
        List<Estudiantes> listaEstudiantess = leer.leerEstudiantes();
        DefaultTableModel model = (DefaultTableModel) tableEstudiantes.getModel(); // Asumiendo que el nombre de la tabla es tableEstudiantes
        model.setRowCount(0); // Limpiar la tabla antes de agregar nuevos datos
        listaEstudiantess.forEach(estudiante -> {
            // Agregar cada estudiante a la tabla
            model.addRow(new Object[]{estudiante.getCodigo(), estudiante.getNombre(), estudiante.getEdad(), estudiante.getDni(), estudiante.getDireccion(), estudiante.getTelefono(), estudiante.getSexo()});
        });
    }

    private void limpiarCampos() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtDni.setText("");
        txtEdad.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
    }

    private boolean validarCamposVacios() {
        boolean camposVacios = false;

        // Aquí añade todos tus JTextField que quieres validar
        JTextField[] campos = {txtCodigo, txtNombre, txtEdad, txtDni, txtDireccion, txtTelefono};
        for (JTextField campo : campos) {
            if (campo.getText().trim().isEmpty()) {
                camposVacios = true;
                break;
            }
        }

        if (camposVacios) {
            JOptionPane.showMessageDialog(this, "Por favor, rellena todos los campos.", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
        }

        return !camposVacios;
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMod;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableEstudiantes;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
