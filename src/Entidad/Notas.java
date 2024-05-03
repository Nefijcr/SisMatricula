
package Entidad;

public class Notas {
    String codigoEstCurso;
    String cursoNotas;
    String examen;
    String nota;

    public Notas(String codigoEstCurso, String cursonotas, String examen, String nota) {
        this.codigoEstCurso = codigoEstCurso;
        this.cursoNotas = cursonotas;
        this.examen = examen;
        this.nota = nota;
    }

    public String getCodigoEstCurso() {
        return codigoEstCurso;
    }

    public String getCursoNotas() {
        return cursoNotas;
    }

    public String getExamen() {
        return examen;
    }

    public String getNota() {
        return nota;
    }

    public void setCodigoEstCurso(String codigoEstCurso) {
        this.codigoEstCurso = codigoEstCurso;
    }

    public void setCursoNotas(String cursonotas) {
        this.cursoNotas = cursonotas;
    }

    public void setExamen(String examen) {
        this.examen = examen;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
     
    
}
