public class Main {

    public static void mostrarEtiqueta(int numeroGuia, String destino, double peso) {
        System.out.println("ETIQUETA DEL PAQUETE");
        System.out.println("Numero de guia: " + numeroGuia);
        System.out.println("Ciudad de destino: " + destino);
        System.out.println("Peso del paquete: " + peso + " kg");
        System.out.println();
    }
    public static void main(String[] args) {

        // Primer paquete
        mostrarEtiqueta(36933, "IMP", 1.5);

        // Segundo paquete
        mostrarEtiqueta(42222, "Ecatepec", 5.2);
    }
}