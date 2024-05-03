
package Logica;

import Datos.Leer;
import Entidad.Estudiantes;
import javax.swing.JOptionPane;

public class EstudianteBuscar {
    public boolean buscarEstudiante(String codigoBuscado) {
        Leer leer=new Leer();
        
    for (Estudiantes estudiante : leer.leerEstudiantes()) {
        if (estudiante.getCodigo().equals(codigoBuscado)) {
            return true;
        }
    }
    JOptionPane.showMessageDialog(null, "El estudiante no existe.", "Alerta", JOptionPane.WARNING_MESSAGE);
    return false;  // Retorna null si no se encuentra el dueño con el dni proporcionado
}
public String buscarCodigoEstudiante(String codigoBuscado) {
    Leer leer =new Leer();
    for (Estudiantes estudiante : leer.leerEstudiantes()) {
        if (estudiante.getCodigo().equals(codigoBuscado)) {
            return estudiante.getNombre();
        }
    }
    
    return null; 
}

}
