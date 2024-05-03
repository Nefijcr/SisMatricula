package Datos;

import Entidad.Estudiantes;
import java.util.ArrayList;
import java.util.List;

public class Buscar {
    private final List<Estudiantes> listaEstudiantes;
    

    public Buscar(List<Estudiantes> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
           }

    public List<Estudiantes> buscarEstudiantesPorCodigoParcial(String codigo) {
        List<Estudiantes> estudiantesEncontrados = new ArrayList<>();
        for (Estudiantes estudiante : listaEstudiantes) {
            if (estudiante.getCodigo().contains(codigo)) {
                estudiantesEncontrados.add(estudiante);
            }
        }
        return estudiantesEncontrados;
    }
}
