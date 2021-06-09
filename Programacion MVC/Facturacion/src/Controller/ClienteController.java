package Controller;
import java.util.ArrayList;
import java.util.List;
import Model.Cliente;
public class ClienteController {
    private List<Cliente>lisCli;
    private Cliente cliente;
    public ClienteController()
    {
        this.lisCli = new ArrayList();
        this.cliente = null;
        
    }
    public boolean crear(String Nombre, String Cedula)
    {
        Cliente a = new Cliente(Nombre,Cedula);
        return lisCli.add(a);
    }
    public Cliente buscar(String Cedula)
    {
        for(Cliente cli : lisCli){
            if(cli.getCedula().equals(Cedula))
                return cli;
        }
        return null;
    }
    public boolean actualizar(String nombre,String Cedula){
    Cliente cli = this.buscar(Cedula);
    if(cli!=null){
    int position = lisCli.indexOf(cli);
    cli.setNombre(nombre);
    lisCli.set(position,cli);
    return true;
        }
    return false;
    }
    public boolean eliminar(String Cedula){
    Cliente cl = this.buscar(Cedula);
    if(cliente!=null){
        return lisCli.remove(cl);
        }
    return false;
    }

    public List<Cliente> getLisCli() {
        return lisCli;
    }

    public void setLisCli(List<Cliente> lisCli) {
        this.lisCli = lisCli;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}