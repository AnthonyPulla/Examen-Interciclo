package Controller;
import Model.Factura;
import Model.Productos;
import Vista.ProductosVista;
import java.util.ArrayList;
import java.util.List;
public class ProductosController {
    private List<Productos>LisPro;
    private List<Factura>LisFac; 
    private Productos Pro;
    private Factura Fac;
    private FacturaController fac; 
    public ProductosController(){
        this.LisPro = new ArrayList();
        this.Pro = null;
        this.LisFac = new ArrayList();
        this.fac = new FacturaController();
    }
    public long GID(){
    if(LisPro.size()>0)
        return LisPro.get(LisPro.size()-1).getId()+1;
    else
        return 1;
    }

    public int Stock(int Stock,int Cantidad){
      int r = Stock-Cantidad;
      return r;
    }
    public boolean crear(String Descripccion, double Precio_unitario,int Stock,double Iva){
    Productos p = new Productos(this.GID(),Descripccion,Precio_unitario,Stock,Iva);
    return LisPro.add(p);
   }    
    public Productos buscar(String Descripccion){
    for(Productos produc:LisPro){
    if(produc.getDescripccion().equals(Descripccion))
        return produc;
    }
    return null;
    }
    public boolean actualizar(String Descripccion, double precio_unitario, int stock, double iva){
    Productos pro = this.buscar(Descripccion);
    if(pro!=null){
    int position = LisPro.indexOf(pro);
    pro.setPrecio_unitario(precio_unitario);
    pro.setStock(stock);
    pro.setIva(iva);
    LisPro.set(position, pro);
    return true;
        }return false;
    }
    public boolean eliminar(String Descripccion){
    Productos prod = this.buscar(Descripccion);
    if(prod!=null){
        return LisPro.remove(prod);
      }
    return false;
    }

    public List<Productos> getLisPro() {
        return LisPro;
    }

    public void setLisPro(List<Productos> LisPro) {
        this.LisPro = LisPro;
    }

    public Productos getPro() {
        return Pro;
    }

    public void setPro(Productos Pro) {
        this.Pro = Pro;
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
