package Controller;
import java.util.ArrayList;
import java.util.List;
import Controller.ProductosController;
import Model.Factura;
import Model.Productos;
import Model.Cliente;
import Vista.ProductosVista;
import java.util.Date;
public class FacturaController {
    public ProductosVista ProVis;
    private List<Factura>LisFac;
    private Factura Fac;
    private Productos Pro;
    private ProductosController ProCon;
    private List<Productos>LisPro;
    public FacturaController(){
        this.LisFac = new ArrayList();
        this.Fac = null;
    }
    public double Total(double Precio){
        double T = Precio;
        return T;
    }
    public boolean crear(Date Fecha_Fac, int Cantidad,double Total,double Valor){   
        Factura f = new Factura(Fecha_Fac,this.Total(Total),Cantidad,Valor);    
        return LisFac.add(f);
    }
    public Factura buscar(Date Fecha_Fac){
        for (Factura fac:LisFac){
        if(fac.getFecha_Fac().equals(Fecha_Fac))
            return fac;
        }
        return null;        
    }
    public boolean actualizar(Date Fecha_Fac){
    Factura fac = this.buscar(Fecha_Fac);
    if(fac!=null){
    int position = LisFac.indexOf(fac);
    fac.setFecha_Fac(Fecha_Fac);
    LisFac.set(position, fac);
    return true;
    }
    return false;
    }
    public boolean eliminar(Date Fecha_Fac){
        Factura fac = this.buscar(Fecha_Fac);
        if(fac!=null){
            return LisFac.remove(fac);
        }
        return false;
    }
    public boolean colocarProductos(Productos produc){
        return Fac.getLisPro().add(produc);
    }
    public boolean datosCliente(Cliente cli){
        return Fac.getLisClien().add(cli);
    }
    public List<Factura> getLisFac() {
        return LisFac;
    }

    public void setLisFac(List<Factura> LisFac) {
        this.LisFac = LisFac;
    }

    public Factura getFac() {
        return Fac;
    }

    public void setFac(Factura Fac) {
        this.Fac = Fac;
    } 
}
