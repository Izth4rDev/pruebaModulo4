package vistas;
import modelo.CategoriaEnum;
import modelo.Cliente;
import servicio.ExportadorCsv;
import servicio.ArchivoServicio;
import servicio.ClienteServicio;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private ClienteServicio clienteServicio;
    private ArchivoServicio archivoServicio;
    private ExportadorCsv exportadorCsv;
    //private ExportarTxt exportarTxt;
    private String fileName1 = "DBClientes.csv";
    private String fileName = "Clientes";
    private Scanner sc = new Scanner(System.in);

    // metodos para construccion y seleccion de menú
    public Menu() {
        // instanciando atributos//
        clienteServicio = new ClienteServicio();
        archivoServicio = new ArchivoServicio();
        exportadorCsv = new ExportadorCsv();
        //exportarTxt = new ExportarTxt();
    }

    public void mostrarMenu() {
        int option = 0;
        do{
            System.out.println("\n-- Menú Principal --");
            System.out.println("1. Listar clientes");
            System.out.println("2. Agregar cliente");
            System.out.println("3. Editar cliente");
            System.out.println("4. Importar datos");
            System.out.println("5. Exportar datos");
            System.out.println("6. Terminar programa");

            option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1: clienteServicio.listarClientes();
                    break;
                case 2: addCLiente();
                    break;
                case 3:clienteServicio.editarCliente();
                    break;
                case 5: exportadorCsv.exportar(fileName1,clienteServicio.getListaClientes());
            }
        }while(option!=6);
    }

    public void addCLiente(){

        System.out.println("-------------Crear Cliente-------------");
        System.out.println("Ingresa RUN del Cliente: ");
        String rut = sc.nextLine();
        System.out.print("Ingresa Nombre del Cliente: ");
        String nombre = sc.nextLine();
        System.out.println("Ingresa Apellido del Cliente: ");
        String apellido = sc.nextLine();
        System.out.println("Ingresa años como Cliente: ");
        int edad = sc.nextInt();
        sc.nextLine();

        clienteServicio.agregarClientes(rut,nombre,apellido,edad, CategoriaEnum.ACTIVO);
    }
}