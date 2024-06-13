package servicio;

import modelo.Cliente;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ExportadorCsv extends Exportador {


    @Override
    public void exportar(String fileName, List<Cliente> listaClientes) {
        try(PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (Cliente cliente : listaClientes) {
                writer.println(cliente.toCsv());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
