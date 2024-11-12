import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        List<Persona> personas = new ArrayList<>();

        // Menu
        var salir = false;
        while (!salir) {
            mostrarMenu();

            try {
                salir = ejecutarOperacion(consola, personas);
            } catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            }

            System.out.println();
        }
    }

    private static void mostrarMenu() {
        // Mostramos las opciones
        System.out.print("""
                **** Listado Personas App ****
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Proporciona la opción: ");
    }

    private static boolean ejecutarOperacion(Scanner consola, List<Persona> personas) {
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;

        // Revisamos la opcion proporcionada
        switch (opcion) {
            case 1 -> {
                System.out.print("Proporciona el nombre ");
                var nombre = consola.nextLine();
                System.out.print("Proporciona el telefono: ");
                var tel = consola.nextLine();
                System.out.print("Proporciona el email: ");
                var email = consola.nextLine();
                //Creando objeto de persona
                var persona = new Persona(nombre, tel, email);
                personas.add(persona);
                System.out.println("La lista tiene: " + personas.size() + " Elementos");
            }
            case 2 -> {
                System.out.println("Listado de personas: ");
                // Mejora usando lambda y metodos de referencia
                // personas.forEach((persona) -> System.out.println(persona));
                personas.forEach(System.out::println);

            }
            case 3 -> {
                System.out.println("Nos vemos amiwosss");
                salir = true;
            }
            default -> System.out.println("Opcion erronea");
        }
        return salir;
    }
}