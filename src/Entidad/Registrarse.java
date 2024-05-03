
package Entidad;

/**
 *
 * @author nefij
 */
public class Registrarse {
 String correo;
    String contraseña;
    
    public Registrarse(String correo, String contraseña) {
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
   
}
