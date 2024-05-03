
package Entidad;

public class Cursos {
    String codigoEstudiante;
    String grado;
    String curso;

    public Cursos(String codigoEstudiante, String grado, String curso) {
        this.codigoEstudiante = codigoEstudiante;
        this.grado = grado;
        this.curso = curso;
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public String getGrado() {
        return grado;
    }

    public String getCurso() {
        return curso;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
