package Datos;

import Entidad.Estudiantes;
import Entidad.Cursos;
import Entidad.Notas;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Leer {
    public List<Estudiantes> leerEstudiantes() {
        List<Estudiantes> listaEstudiante = new ArrayList<>();

    try (BufferedReader reader = new BufferedReader(new FileReader("estudiantes.txt"))) {
        String linea;
        while ((linea = reader.readLine()) != null) {
            String[] datos = linea.split(",");
            
            // Verificar si hay suficientes elementos en el arreglo
            if (datos.length >= 7) {
                Estudiantes estudiante = new Estudiantes(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[6]);
                listaEstudiante.add(estudiante);
                            
            } else {
                System.out.println("Error: línea inválida en el archivo estudiantes.txt");
            }
        }
    } catch (IOException e) {
        System.out.println("Error al leer el archivo estudiantes.txt: " + e.getMessage());
    }

    return listaEstudiante;
    }

     public List<Cursos> leerCursos() {
        List<Cursos> listaCursos = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("cursos.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                
                // Verificar si hay suficientes elementos en el arreglo
                if (datos.length >= 3) { // Se ajusta la verificación a 5 elementos debido a la adición del sexo
                    Cursos curso = new Cursos(datos[0], datos[1], datos[2]); // Se añade el sexo a la creación de la mascota
                    listaCursos.add(curso);
                } else {
                    System.out.println("Error: línea inválida en el archivo cursos.txt");
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo cursos.txt: " + e.getMessage());
        }

        return listaCursos;
    }
public List<Notas> leerNotas() {
        List<Notas> listaNotas = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("notas.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                
                // Verificar si hay suficientes elementos en el arreglo
                if (datos.length >= 4) { 
                    Notas nota = new Notas(datos[0], datos[1], datos[2], datos[3]); 
                    listaNotas.add(nota);
                } else {
                    System.out.println("Error: línea inválida en el archivo notas.txt");
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo notas.txt: " + e.getMessage());
        }

        return listaNotas;
    }
}
