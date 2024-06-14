package servicio;
import modelo.Cliente;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class ExportadorCsv extends Exportador {

    @Override
    public void exportar(String fileName, List<Cliente> listaClientes) {
        String linea,os, ruta,nav;
        Scanner sc = new Scanner(System.in);
        //Devuelve el nombre del sistema operativo del usuario
        os = System.getProperty("os.name").toLowerCase();

        if(os.contains("win")){
            System.out.println("Ingresa la ruta en donde desea exportar el archivo DBClientes.csv:");
            System.out.println("Ejemplo -> C:\\\\usuario\\equipo\\Desktop");
            ruta = sc.nextLine();
            nav = ruta+"\\"+fileName;
        }else{
            System.out.println("Ingresa la ruta en donde desea exportar el archivo DBClientes.csv:");
            System.out.println("Ejemplo -> home/usuario/Desktop");
            ruta = sc.nextLine();
            nav = ruta+"/"+fileName;
        }

        int contador = 0;

        File archivo = new File(nav);

        try(PrintWriter writer = new PrintWriter(new FileWriter(archivo))) {
            for (Cliente cliente : listaClientes) {
                linea = listaClientes.get(contador).getRunCliente()+","+listaClientes.get(contador).getNombreCliente()+","
                        +listaClientes.get(contador).getApellidoCliente()+","+listaClientes.get(contador).getAniosCliente()
                        +","+listaClientes.get(contador).getCategoriaEnum();
                contador++;
                writer.println(linea);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
