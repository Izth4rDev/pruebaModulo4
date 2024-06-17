package cl.praxis;

import modelo.CategoriaEnum;
import modelo.Cliente;
import org.junit.Before;
import org.junit.Test;
import servicio.ClienteServicio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class ClienteServicioTest {
    private ClienteServicio clienteServicio;

    @Before
    public void setUp() {
        clienteServicio = new ClienteServicio();
    }
    @Test
    public void agregarClientesTest() {
        // Datos aleatorios para test
        String run = "16890601-k";
        String nombre = "Freddy";
        String apellido = "Turbina";
        int anios = 54;
        CategoriaEnum categoria = CategoriaEnum.ACTIVO;

        // Llamamos al clienteServicio que es donde queremos hacer las pruebas unitarias
        clienteServicio.agregarClientes(run, nombre, apellido, anios, categoria);

        // Meetodo para verificar si el cliente fue agregado correctamente.
        Cliente clienteAgregado = clienteServicio.getListaClientes().get(0);
        assertNotNull(clienteAgregado);
        assertEquals(run, clienteAgregado.getRunCliente());
        assertEquals(nombre, clienteAgregado.getNombreCliente());
        assertEquals(apellido, clienteAgregado.getApellidoCliente());
        assertEquals(anios, clienteAgregado.getAniosCliente());
        assertEquals(categoria, clienteAgregado.getCategoriaEnum());
    }

    @Test(expected = IllegalArgumentException.class)
    public void agregarClienteNullTest() {
        // Metodo para agregar Cliente con parametros nulos.
        clienteServicio.agregarClientes(null, null, null, 0, null);
    }
}


