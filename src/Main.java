public class Main {
    public static void main(String[] args) {

        Figura f1 = new Circulo("Círculo", 5);
        Figura f2 = new Rectangulo("Rectángulo", 4, 6);

        f1.mostrarNombre();
        System.out.println("Área: " + f1.calcularArea());

        System.out.println("           ");

        f2.mostrarNombre();
        System.out.println("Área: " + f2.calcularArea());
    }
}