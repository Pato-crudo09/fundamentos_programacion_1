import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int Pisoactual, Pisodestino;

        do {
            System.out.print("Ingrese piso actual: ");
            Pisoactual = entrada.nextInt();
            System.out.print("Ingrese piso destino: ");
            Pisodestino = entrada.nextInt();
            if (Pisoactual == 0 || Pisodestino == 0 || Pisoactual == Pisodestino) {
                System.out.println("No se permite este piso");
            }
        } while (Pisoactual <= 0 || Pisodestino <= 0 || Pisoactual == Pisodestino);

        if (Pisoactual < Pisodestino) {
            for (int P = Pisoactual + 1; P < Pisodestino; P++) {
                System.out.println("Piso " + P);
            }
        } else {
            for (int Pa = Pisoactual - 1; Pa > Pisodestino; Pa--) {
                System.out.println("Piso " + Pa);
            }
        }
        System.out.println("Llegaste al piso " + Pisodestino);
    }
}