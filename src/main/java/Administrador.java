public class Administrador extends Persona{
    private String clave;

    public Administrador(String nombre, String apellido, String di, String correo,String clave) {
        super(nombre,apellido,di,correo);
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

}
