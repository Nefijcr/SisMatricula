
package Datos;

import Entidad.Estudiantes;
import Entidad.Notas;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nefij
 */
public class Modificar {
    
    
    public void modificarEstudiante(int rowIndex, String nombre, String edad, String dni, String direccion, String telefono, String sexoSeleccionado) {
         List<Estudiantes> estudiantes = new ArrayList<>();
    try (BufferedReader reader = new BufferedReader(new FileReader("estudiantes.txt"))) {
        String linea;
        while ((linea = reader.readLine()) != null) {
            String[] datos = linea.split(",");
            if (datos.length >= 7) {
                Estudiantes estudiante = new Estudiantes(datos[0], datos[1], datos[2], datos[3], datos[4],  datos[5],  datos[6]);
                estudiantes.add(estudiante);
            } else {
                System.out.println("Error: línea inválida en el archivo estudiantes.txt");
            }
        }
    } catch (IOException e) {
        System.out.println("Error al leer el archivo estudiantes.txt: " + e.getMessage());
    }

    // Modificar la mascota en la lista
    if (rowIndex >= 0 && rowIndex < estudiantes.size()) {
        Estudiantes estudiante = estudiantes.get(rowIndex);
         // Modificar DNI del cliente
        estudiante.setNombre(nombre);
        estudiante.setEdad(edad);
        estudiante.setDni(dni); 
        estudiante.setDireccion(direccion);
        estudiante.setTelefono(telefono);
        estudiante.setSexo(sexoSeleccionado); // Modificar el sexo del estudiante
    } else {
        System.out.println("Índice de fila fuera de rango.");
        return;
    }

    // Escribir todos los estudiantes de nuevo en el archivo
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("estudiantes.txt"))) {
        for (Estudiantes e : estudiantes) {
            writer.write(e.getCodigo() + "," + e.getNombre() + "," + e.getEdad() +","+e.getDni()+ "," + e.getDireccion()+","+e.getTelefono() + "," + e.getSexo() + "\n");
        }
    } catch (IOException e) {
        System.out.println("Error al escribir en el archivo estudiantes.txt: " + e.getMessage());
    }

   
    

  
}
    public void modificarNota(int rowIndex, String cursoNSeleccionado, String semestreSeleccionado, String nota) {
         List<Notas> notas = new ArrayList<>();
    try (BufferedReader reader = new BufferedReader(new FileReader("notas.txt"))) {
        String linea;
        while ((linea = reader.readLine()) != null) {
            String[] datos = linea.split(",");
            if (datos.length >= 4) {
                Notas notass = new Notas(datos[0], datos[1], datos[2], datos[3]);
                notas.add(notass);
            } else {
                System.out.println("Error: línea inválida en el archivo notas.txt");
            }
        }
    } catch (IOException e) {
        System.out.println("Error al leer el archivo notas.txt: " + e.getMessage());
    }

    // Modificar la mascota en la lista
    if (rowIndex >= 0 && rowIndex < notas.size()) {
        Notas notass = notas.get(rowIndex);
       
        notass.setCursoNotas(cursoNSeleccionado); 
        notass.setExamen(semestreSeleccionado); 
        notass.setNota(nota);
    } else {
        System.out.println("Índice de fila fuera de rango.");
        return;
    }

    // Escribir todos los estudiantes de nuevo en el archivo
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("notas.txt"))) {
        for (Notas n : notas) {
            writer.write(n.getCodigoEstCurso() + "," + n.getCursoNotas() + "," + n.getExamen() +","+n.getNota()+ "\n");
        }
    } catch (IOException e) {
        System.out.println("Error al escribir en el archivo notas.txt: " + e.getMessage());
    }

  
}
}
