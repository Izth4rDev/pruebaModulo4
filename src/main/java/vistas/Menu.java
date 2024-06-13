package vistas;


import java.util.Scanner;

public class Menu {
    int opcion;

        do {
        System.out.println("1. Listar Clientes");
        System.out.println("2. Agregar Cliente");
        System.out.println("3. Editar Cliente");
        System.out.println("4. Cargar Datos");
        System.out.println("5. Exportar Datos");
        System.out.println("6. Salir");
        System.out.println("Elija una opción: ");
        Scanner sc = new Scanner(System.in);
        opcion = sc.nextInt();
        sc.nextLine();  // Consume newline

        switch (opcion) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:
                System.out.println("Saliendo del menú");
                break;
            default:
                System.out.println("Opción inválida. Por favor, intente de nuevo.");
        }
    } while (opcion != 6);


}
}

