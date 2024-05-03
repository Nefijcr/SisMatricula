
package Entidad;
public class Estudiantes {
    String codigo;
    String nombre;
    String edad;
    String dni;
    String direccion;
    String telefono;
    String sexo;
    
    
    public Estudiantes(String codigo, String nombre, String edad, String dni, String direccion,String telefono, String sexo ) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sexo = sexo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

  
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
 public String getEdad() {
        return edad;
    }
    public String getDni() {
        return dni;
    }


    public String getDireccion() {
        return direccion;
    }
    public String getTelefono() {
        return telefono;
    }
     public String getSexo() {
        return sexo;
    }
   
}
