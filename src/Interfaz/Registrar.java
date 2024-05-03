
package Interfaz;

import Datos.Guardar;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author nefij
 */
public class Registrar extends javax.swing.JInternalFrame {

    /**
     * Creates new form Registrar
     */
    public Registrar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCorreoR = new javax.swing.JTextField();
        txtContraseñaR = new javax.swing.JPasswordField();
        btnRegistrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setTitle("Registrar");

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Btn_Guardar.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/alumno.PNG"))); // NOI18N
        jLabel1.setText("Correo:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Btn_Iniciar_Sesion.png"))); // NOI18N
        jLabel2.setText("Contraseña:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 3, 36)); // NOI18N
        jLabel3.setText("Registrar Usuario");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Btn_Salir.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCorreoR)
                                    .addComponent(txtContraseñaR, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(131, 131, 131))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(426, 426, 426)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(195, 195, 195))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel3)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreoR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContraseñaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton1)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
       String correo = txtCorreoR.getText();
        String contraseña = new String(txtContraseñaR.getPassword());

        // Validar el formato del correo electrónico
        if (!validarCorreoElectronico(correo)) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un correo electrónico válido.");
            return;
        }

        // Verificar si el correo ya está registrado
        if (correoYaRegistrado(correo)) {
            JOptionPane.showMessageDialog(this, "El correo electrónico ya está registrado. Por favor, use otro.");
            return;
        }

        // Si pasa las validaciones, registrar el usuario
        if (Guardar.registrarUsuarios(correo, contraseña)) {
            JOptionPane.showMessageDialog(this, "Usuario registrado exitosamente.");
            this.dispose(); // Cerrar la interfaz de registro
        } else {
            JOptionPane.showMessageDialog(this, "Error al registrar usuario. Intente nuevamente.");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Login login = new Login();  
    login.setVisible(true);  
    this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
 public void registrarUsuarios(String correo, String contraseña) {
       String rutaArchivo = "usuarios.txt";

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
        // Escribir las credenciales en el archivo separadas por comas
        writer.write(correo + "," + contraseña + "\n");

        System.out.println("Credenciales guardadas en " + rutaArchivo);
        JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente.");
    } catch (IOException e) {
        System.out.println("Error en el archivo " + rutaArchivo);
        JOptionPane.showMessageDialog(null, "Error al registrar usuario. Intente nuevamente.");
    }
    }
  private boolean validarCorreoElectronico(String correo) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return correo.matches(regex);
    }
   private boolean correoYaRegistrado(String correo) {
        String rutaArchivo = "usuarios.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length >= 1) {
                    String correoGuardado = partes[0];
                    if (correo.equals(correoGuardado)) {
                        return true; // El correo ya está registrado
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + rutaArchivo);
        }
        return false;  // El correo no está registrado
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtContraseñaR;
    private javax.swing.JTextField txtCorreoR;
    // End of variables declaration//GEN-END:variables
}
