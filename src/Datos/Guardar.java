package Datos;

import Entidad.Estudiantes;
import Entidad.Cursos;
import Entidad.Notas;
import java.io.*;

public class Guardar {

    public void registrarEstudiante(Estudiantes estudiante, String sexoSeleccionado) {
        String rutaArchivo = "estudiantes.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            // Escribir los datos en el archivo separados por comas
            writer.write(estudiante.getCodigo() + "," + estudiante.getNombre() + "," + estudiante.getEdad() + "," + estudiante.getDni() + "," + estudiante.getDireccion() + "," + estudiante.getTelefono() + "," + sexoSeleccionado + "\n");

            System.out.println("Registro guardado exitosamente en " + rutaArchivo);
            // Agregar mensaje de depuración para verificar el valor del teléfono     
        } catch (IOException e) {
            System.out.println("Error al intentar escribir en el archivo " + rutaArchivo);
        }
    }

    public void registrarCurso(Cursos curso, String gradoSeleccionado, String cursoSeleccionado) {
        String rutaArchivo = "cursos.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            
            writer.write(curso.getCodigoEstudiante() + "," + curso.getGrado() + "," + curso.getCurso() + "\n");

            System.out.println("Registro guardado en " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error en el archivo " + rutaArchivo);
        }
    }

    public void registrarNotas(Notas notas, String cursoNSeleccionado, String examenSelecionado) {
        String rutaArchivo = "notas.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            // Escribir los datos en el archivo separados por comas, incluyendo el sexo
            writer.write(notas.getCodigoEstCurso() + "," + notas.getCursoNotas() + "," + notas.getExamen() + "," + notas.getNota() + "\n");

            System.out.println("Registro guardado en " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error en el archivo " + rutaArchivo);
        }
    }

    public static boolean registrarUsuarios(String correo, String contraseña) {
          String rutaArchivo = "usuarios.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            // Escribir las credenciales en el archivo con el formato deseado
            writer.write("Correo: " + correo + "\nContraseña: " + contraseña + "\n\n");

            System.out.println("Credenciales guardadas en " + rutaArchivo);
            return true;
        } catch (IOException e) {
            System.out.println("Error en el archivo " + rutaArchivo);
            return false;
        }
    }

}
