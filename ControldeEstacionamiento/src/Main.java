import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double horas, pago;
        double totalDinero = 0, promedio;
        int totalAutos = 0;
        int autosDescuento = 0;
        System.out.print("Ingresa las horas que estuvo estacionado (0 para terminar): ");
        horas = entrada.nextDouble();
        while (horas != 0) {
            if (horas < 0) {
                System.out.println("Error las horas negativas no son validas");
            } else {
                pago = horas * 15;

                if (horas > 5) {
                    pago = pago - 10;
                    autosDescuento++;
                }
                System.out.println("El auto debe pagar: $" + pago);

                totalAutos++;
                totalDinero += pago;
            }
            System.out.print("Ingrese las horas que estuvo estacionado (0 para terminar): ");
            horas = entrada.nextDouble();
        }
        System.out.println("Resumen del dia");
        System.out.println("Total de autos atendidos: " + totalAutos);
        System.out.println("Total de dinero recaudado: $" + totalDinero);
        System.out.println("Autos con descuento: " + autosDescuento);

        if (totalAutos > 0) {
            promedio = totalDinero / totalAutos;
            System.out.printf("Promedio pagado por auto: $%.2f%n", promedio);
        } else {
            System.out.println("Promedio pagado por automovil: $0.00");
        }
    }
}