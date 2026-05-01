public class DocenteInvestigador extends Docente{
    private int publicaciones;

    public void setPublicaciones(int p){
        if (p >= 0) publicaciones = p;
    }

    //Sobreescritura para agregar bono
    @Override
    public double calcularPago() {
        return super.calcularPago() + (publicaciones * 20);
        // super = llama al método de la clase padre
    }

    // SOBRECARGA → mismo método, otro parámetro
    public double calcularPago(double bonoExtra) {
        return calcularPago() + bonoExtra;
    }

    @Override
    public void describirRol() {
        System.out.println("Rol: Docente investigador con produccion academica");
    }
}
