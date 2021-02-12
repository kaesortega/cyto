public class Persona {
    private String nombre;
    private String apellido;
    private String di;
    private String correo;

    public Persona(String nombre, String apellido, String di, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.di = di;
        this.correo = correo;
    }

    public String getNombre() {
        String nombre = "Tu nombre es: " + this.nombre;
        return nombre;
    }

    public void setNombre(String nombre) {
        if (isNumeric(nombre) == true){
            System.out.println("No es un nombre aceptable");
        }else{
            System.out.println("Cambio guardado");
            this.nombre = nombre;
        }

    }

    public String getApellido() {

        return this.apellido;
    }

    public void setApellido(String apellido) {
        if (isNumeric(apellido) == true){
            System.out.println("No es un apellido aceptable");

        }else {
            System.out.println("Cambio guardado");
            this.apellido = apellido;
        }

    }

    public String getDi() {
        return this.di;
    }

    public void setDi(String di) {
        if (isNumeric(di) == true){
            this.di = di;
            System.out.println("Cambio guardado");
        }else{
            System.out.println("No es un documento de identidad valido");
        }

    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        if (isNumeric(correo) == true){
            System.out.println("Correo no valido");

        }else {
            System.out.println("Cambio guardado");
            this.correo = correo;
        }

    }

    private static boolean isNumeric(String cadena){
        boolean resultado;
        try {
            Integer.parseInt(cadena);
            resultado = true;
        }catch (NumberFormatException e){
            resultado = false;
        }
        return resultado;
    }
}
