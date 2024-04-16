import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int edad;
        double totalTiempo = 0;

        System.out.println("¿Cuál es tu nombre?");
        String nombre = scanner.nextLine();

        System.out.println("¿Cuál es tu edad?");
        edad = scanner.nextInt();

        for (int i = 0; i < 7; i++) {
            System.out.println("¿Visitaste el apartamento hoy? (s/n)");
            char respuesta = scanner.next().charAt(0);
            scanner.nextLine();


            if (respuesta == 's') {
                contador++;

                System.out.println("¿Por cuánto tiempo te quedaste en el edificio? (horas)");
                double tiempo = scanner.nextDouble();
                totalTiempo += tiempo;
            }
        }

        double promedioTiempo = contador > 0 ? totalTiempo / contador : 0;

        System.out.println("Hola, " + nombre + ".");
        System.out.println("Esta semana visitaste el edificio " + contador + " veces.");

        System.out.printf("Tu promedio de estadía fue de %.2f horas.\n", promedioTiempo);

        if (edad < 18) {
            System.out.println("Eres menor de edad.");
        } else {
            System.out.println("Eres mayor de edad.");
        }
    }
}