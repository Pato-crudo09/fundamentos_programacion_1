package mx.edu.utez;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int puntos;
        int acumulado =0;
        int mayores =0;
        int menoresIguales =0;
        double promedio;
        for (int i = 1; i <= 7; i++) {
            System.out.println("Partida " + i);
            System.out.println("Ingresa tus puntos");
            puntos=entrada.nextInt();
            acumulado += puntos;

            if(puntos > 1000) {
                mayores++;
            }else {
                menoresIguales++;
            }
        }
        promedio = acumulado/7.0;
        System.out.println("Puntos acumulados = "+acumulado);
        System.out.println("Promedio de puntuacion = "+promedio);
        System.out.println("Partidas con mas de 1000 puntos = "+mayores);
        System.out.println("Partidas con 1000 puntos o menos = "+menoresIguales);
    }
}