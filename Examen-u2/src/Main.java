//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class EnvioPaquetes {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double peso, costo;
        int tipoEnvio;
        int aceptados = 0;
        int rechazados = 0;
        int continuar;
        String fragil;
        do {
            costo = 0;
            System.out.println("\nENVIO DE PAQUETES");
            System.out.print("Ingrese el peso del paquete (kg): ");
            peso = entrada.nextDouble();
            System.out.println("\nSeleccione el tipo de envio:");
            System.out.println("1. Local (maximo 12 kg)");
            System.out.println("2. Nacional (maximo 20 kg)");
            System.out.println("3. Express (maximo 5 kg)");
            System.out.print("Opcion: ");
            tipoEnvio = entrada.nextInt();
            boolean valido = true;
            switch (tipoEnvio) {
                case 1:
                    if (peso > 0 && peso <= 12) {
                        costo = 30 + (8 * peso);
                    } else {
                        valido = false;
                    }
                    break;
                case 2:
                    if (peso > 0 && peso <= 20) {
                        costo = 50 + (12 * peso);
                    } else {
                        valido = false;
                    }
                    break;
                case 3:
                    if (peso > 0 && peso <= 5) {
                        costo = 80 + (20 * peso);
                    } else {
                        valido = false;
                    }
                    break;

                default:
                    valido = false;
                    break;
            }
            if (valido) {
                entrada.nextLine();
                System.out.print("¿El paquete es fragil? (si/no): ");
                fragil = entrada.nextLine();

                if (fragil.equalsIgnoreCase("si")) {
                    costo = costo + 25;
                }
                aceptados++;
                System.out.println("\nPaquete aceptado");
                System.out.println("Peso: " + peso + " kg");
                System.out.println("Costo del envio: $" + costo);
            } else {
                rechazados++;
                System.out.println("\n paquete no aceptado");
                System.out.println("El peso supera el limite o la opcion no es valida.");
            }
            System.out.println("\n¿Desea registrar otro paquete?");
            System.out.println("1. Si");
            System.out.println("2. No");
            System.out.print("Opcion: ");
            continuar = entrada.nextInt();
        } while (continuar == 1);

        System.out.println("\nPaquetes Enviados");
        System.out.println("Paquetes aceptados: " + aceptados);
        System.out.println("Paquetes rechazados: " + rechazados);
        System.out.println("Total de paquetes: " +
                (aceptados + rechazados));


    }

    }