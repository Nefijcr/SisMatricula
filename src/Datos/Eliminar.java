
package Datos;

import Entidad.Estudiantes;
import Entidad.Cursos;
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
public class Eliminar {
    public void eliminarEstudiante(int rowIndex, String codigo) {
    // Leer todos los clientes desde el archivo
    List<Estudiantes> estudiantes = new ArrayList<>();
    try (BufferedReader reader = new BufferedReader(new FileReader("estudiantes.txt"))) {
        String linea;
        while ((linea = reader.readLine()) != null) {
            String[] datos = linea.split(",");
            if (datos.length >= 7) {
                Estudiantes estudiante = new Estudiantes(datos[0], datos[1], datos[2], datos[3], datos[4],  datos[5], datos[6]);
                estudiantes.add(estudiante);
            } else {
                System.out.println("Error: línea inválida en el archivo estudiantes.txt");
            }
        }
    } catch (IOException e) {
        System.out.println("Error al leer el archivo estudiantes.txt: " + e.getMessage());
    }
 // Eliminar el cliente de la lista
    estudiantes.remove(rowIndex);

    // Escribir todos los clientes de nuevo en el archivo
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("estudiantes.txt"))) {
        for (Estudiantes e : estudiantes) {
            writer.write(e.getCodigo()+","+ e.getNombre()+ "," + e.getEdad() + "," + e.getDni()  + "," + e.getDireccion()+ "," + e.getTelefono() +","+e.getSexo() + "\n");
        }
    } catch (IOException e) {
        System.out.println("Error al escribir en el archivo estudiantes.txt: " + e.getMessage());
    }
    
    
    }
     public void eliminarCurso(int rowIndex, String codigoEstudiante) {
        // Leer todas las mascotas desde el archivo
       List<Cursos> cursos = new ArrayList<>();
    try (BufferedReader reader = new BufferedReader(new FileReader("cursos.txt"))) {
        String linea;
        while ((linea = reader.readLine()) != null) {
            String[] datos = linea.split(",");
            if (datos.length >= 3) { // Verificar si la línea tiene al menos 3 elementos
                Cursos curso = new Cursos(datos[0], datos[1], datos[2]);
                cursos.add(curso);
            } else {
                System.out.println("Error: línea inválida en el archivo cursos.txt: " + linea);
            }
        }
    } catch (IOException e) {
        System.out.println("Error al leer el archivo cursos.txt: " + e.getMessage());
    }

    // Verificar si el índice es válido antes de eliminar
    if (rowIndex >= 0 && rowIndex < cursos.size()) {
        // Eliminar la mascota de la lista
        cursos.remove(rowIndex);

        // Escribir todas las mascotas de nuevo en el archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("cursos.txt"))) {
            for (Cursos c : cursos) {
                writer.write(c.getCodigoEstudiante() + "," + c.getGrado() + "," + c.getCurso() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo cursos.txt: " + e.getMessage());
        }
    } else {
        System.out.println("Índice de fila fuera de rango.");
    }
    }
      public void eliminarNota(int rowIndex, String codigoEstNota) {
        List<Notas> notas= new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("notas.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length >= 4) { // Se ajusta la verificación a 5 elementos debido a la adición del sexo
                    Notas nota = new Notas(datos[0], datos[1], datos[2], datos[3]);
                    notas.add(nota);
                } else {
                    System.out.println("Error: línea inválida en el archivo notas.txt");
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo notas.txt: " + e.getMessage());
        }

        // Eliminar la mascota de la lista
        notas.remove(rowIndex);

        // Escribir todas las mascotas de nuevo en el archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("notas.txt"))) {
            for (Notas n : notas) {
                writer.write(n.getCodigoEstCurso() + "," + n.getCursoNotas() + "," + n.getExamen()+","+n.getNota() + "\n"); // Se añade el sexo al escribir en el archivo
            }
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo notas.txt: " + e.getMessage());
        }
    }
} 
    

