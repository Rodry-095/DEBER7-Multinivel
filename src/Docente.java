public class Docente extends PersonaAcademica {
    private int horasClase;
    private double valorHora;

    //Validamos las horas de (1 a 40)
    public void setHorasClase(int h) {
        if (h >= 1 && h <= 40) horasClase = h;
    }

    public void setValorHora(double v){
        if(v > 0) valorHora = v;
    }

    public int getHorasClase() {
        return horasClase;
    }

    //Sobreescritura para cambiar el comportamiento de la clase padre
    @Override
    public double calcularPago() {
        return horasClase * valorHora; // pago base
    }

    @Override
    public void describirRol() {
        System.out.println("Rol: Docente");
    }
}
