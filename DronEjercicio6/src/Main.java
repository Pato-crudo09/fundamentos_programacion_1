import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int bateria, minuto;

        System.out.print("Ingresa la bateria actual: ");
        bateria = leer.nextInt();
        minuto = 1;
        while (bateria >= 7) {
            bateria = bateria - 7;
            System.out.println("Minuto " + minuto + "-" + bateria + "%");
            minuto++;
        }
        System.out.println("El dron tiene poca bateria");
        leer.close();
    }
}