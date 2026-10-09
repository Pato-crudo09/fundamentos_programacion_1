import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        int horas;
        double tarifa = 0;
        double subtotal;
        double descuento;
        double total;
        String membresia;
        String tipoBicicleta = "";
        System.out.println("BICICLETAS");
        System.out.println("1. Bicicleta urbana - $40 por hora");
        System.out.println("2. Bicicleta de montaña - $60 por hora");
        System.out.println("3. Bicicleta eléctrica - $90 por hora");
        System.out.print("Selecciona el tipo de bicicleta: ");
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                tarifa = 40;
                tipoBicicleta = "Bicicleta urbana";
                break;
            case 2:
                tarifa = 60;
                tipoBicicleta = "Bicicleta de montaña";
                break;
            case 3:
                tarifa = 90;
                tipoBicicleta = "Bicicleta eléctrica";
                break;
            default:
                System.out.println("Opción no válida");
        }
        if (opcion >= 1 && opcion <= 3) {
            System.out.print("Cantidad de horas de renta: ");
            horas = entrada.nextInt();
            if (horas > 0) {
                System.out.print("¿Tiene membresía? (Si/No): ");
                membresia = entrada.next();

                subtotal = tarifa * horas;
                if (membresia.equalsIgnoreCase("Si")) {
                    descuento = subtotal * 0.20;
                } else {
                    descuento = 0;
                }
                total = subtotal - descuento;
                System.out.println("\n resumen renta ");
                System.out.println("Tipo de bicicleta: " + tipoBicicleta);
                System.out.println("Subtotal: $" + subtotal);
                System.out.println("Descuento: $" + descuento);
                System.out.println("Total a pagar: $" + total);
            } else {
                System.out.println("cantidad de horas no valida");
            }
        }
    }
}