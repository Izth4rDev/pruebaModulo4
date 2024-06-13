package servicio;
import lombok.Getter;
import modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

@Getter

public class ClienteServicio {
    private List<Cliente> listaClientes;
    public ClienteServicio(){
        this.listaClientes = new ArrayList<Cliente>();
    }

    public void listarClientes(){
        if(!listaClientes.isEmpty()){
            for(Cliente cliente : listaClientes){

            }
        }else{
            System.out.println("La lista de clientes esta vacia");
        }
    }
}
