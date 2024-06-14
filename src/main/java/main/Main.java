package main;
import modelo.CategoriaEnum;
import servicio.ClienteServicio;
import servicio.ExportadorCsv;
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ClienteServicio clienteServicio = new ClienteServicio();
        clienteServicio.agregarClientes("123455667","Tamara","Lopez",33, CategoriaEnum.ACTIVO);
        //clienteServicio.agregarClientes("123455668","Miguel","Rondanelli",35, CategoriaEnum.INACTIVO);
        ExportadorCsv exportadorCsv = new ExportadorCsv();
        File archivoCsv = new File("C:\\Users\\Puchi\\Desktop\\DBClientes.csv");
        exportadorCsv.exportar(archivoCsv,clienteServicio.getListaClientes());
    }
}
