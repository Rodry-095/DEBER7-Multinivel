public class PersonaAcademica {
    private String codigo;
    private String nombre;
    private int edad;

    //Setters con validacion
    public void setCodigo(String c){
        if(!c.isEmpty()) codigo = c;
    }

    public void setNombre(String n) {
        if (!n.isEmpty()) nombre = n;
    }

    public void setEdad(int e) {
        if (e >= 18) edad = e;
    }

    // Getter que solo va a retornar valor
    public int getEdad() {
        return edad;
    }

    //Metodo void para mostrar datos
    public void mostrarDatos() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    //Metodo para sobreescribir en hijas
    public void describirRol() {
        System.out.println("Rol: Persona academica");
    }

    // Metodo base donde se aplicara polimorfismo
    public double calcularPago() {
        return 0;
    }
}
