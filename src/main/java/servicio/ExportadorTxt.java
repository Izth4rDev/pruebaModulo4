package servicio;

import modelo.Cliente;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ExportadorTxt extends Exportador{

    @Override
    public void exportar(String fileName, List<Cliente> listaClientes) {
        try(PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (Cliente cliente : listaClientes) {
                writer.println(cliente.toString());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
        
    }

