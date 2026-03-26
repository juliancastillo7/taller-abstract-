abstract class Figura {

    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarNombre() {
        System.out.println("Figura: " + nombre);
    }

    public abstract double calcularArea();
}