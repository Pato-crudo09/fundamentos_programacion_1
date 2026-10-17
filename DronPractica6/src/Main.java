import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int bateria, minuto;

        System.out.print("Ingresa la bateria: ");
        bateria = tecla.nextInt();
        while (bateria < 0 || bateria > 100) {
            System.out.println("No valido");
            System.out.print("Ingresa la bateria: ");
            bateria = tecla.nextInt();
        }
        minuto = 1;
        while (bateria >= 7) {
            bateria = bateria - 7;
            System.out.println("Minuto " + minuto + " - " + bateria + "%");
            minuto++;
        }
        System.out.println("Bateria muy baja");
    }
}