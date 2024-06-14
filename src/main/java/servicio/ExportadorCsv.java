package servicio;
import modelo.Cliente;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ExportadorCsv extends Exportador {

    @Override
    public void exportar(String fileName, List<Cliente> listaClientes) {
        String linea;
        int contador = 0;

        File archivo = new File("C://"+fileName);

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
