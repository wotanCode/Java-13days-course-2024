import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        while (true) {
            System.out.println("**** Aplicacion Calculadora ****");
            MostrarMenu();

            try {
                var operacion = Integer.parseInt(consola.nextLine());

                if (operacion >= 1 && operacion <= 5) ejecutarOperacion(operacion, consola);

                else if (operacion == 0) {
                    System.out.println("Hasta pronto amiwoss!");
                    break;
                } else System.out.println("Operación erronea");
                System.out.println();

            } catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
        }
    }

    private static void MostrarMenu() {
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicación
                4. Division
                5. Modulo
                0. Salir
                """);

        System.out.println("Operacion a realizar:");
    }

    private static void ejecutarOperacion(int operacion, Scanner consola) {
        System.out.print("Proporciona valor de operando 1: ");
        var operando1 = Double.parseDouble(consola.nextLine());

        System.out.print("Proporciona valor de operando 2: ");
        var operando2 = Double.parseDouble(consola.nextLine());

        double resultado;

        switch (operacion) {
            case 1 -> {
                resultado = operando1 + operando2;
                System.out.println("Resultado suma: " + resultado);
            }
            case 2 -> {
                resultado = operando1 - operando2;
                System.out.println("Resultado resta: " + resultado);
            }
            case 3 -> {
                resultado = operando1 * operando2;
                System.out.println("Resultado multiplicación: " + resultado);
            }
            case 4 -> {
                resultado = operando1 / operando2;
                System.out.println("Resultado division: " + resultado);
            }
            case 5 -> {
                resultado = operando1 % operando2;
                System.out.println("Resultado modulo: " + resultado);
            }
            default -> System.out.println("Operacion erronea: " + operacion);
        }
    }
}
