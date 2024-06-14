package servicio;
import java.io.File;
import modelo.Cliente;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ExportadorTxt extends Exportador{

    @Override
    public void exportar(File fileName, List<Cliente> listaClientes) {
        try(PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (Cliente cliente : listaClientes) {

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
        
    }

