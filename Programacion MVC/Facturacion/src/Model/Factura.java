package Model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import Model.Cliente;
import Model.Productos;
public class Factura 
{
    private Date Fecha_Fac;
    private double Total;
    private int Cantidad;
    private Productos pro;
    private double Valor;
    private List<Cliente>LisClien;
    private List<Productos>LisPro;

    
    public Factura(Date Fecha_Fac, double Total, int Cantidad, double Valor) {
        this.Fecha_Fac = Fecha_Fac;
        this.Total = Total;
        this.Cantidad = Cantidad;
        this.Valor = Valor;
        this.LisClien = new ArrayList();
        this.LisPro = new ArrayList();
    }

    public Factura(Date Fecha_Fac, double Total, int Cantidad, double Valor, List<Cliente> LisClien, List<Productos> LisPro) {
        this.Fecha_Fac = Fecha_Fac;
        this.Total = Total;
        this.Cantidad = Cantidad;
        this.Valor = Valor;
        this.LisClien = LisClien;
        this.LisPro = LisPro;
    }

    public List<Cliente> getLisClien() {
        return LisClien;
    }

    public void setLisClien(List<Cliente> LisClien) {
        this.LisClien = LisClien;
    }

    public List<Productos> getLisPro() {
        return LisPro;
    }

    public void setLisPro(List<Productos> LisPro) {
        this.LisPro = LisPro;
    }
    
    public Date getFecha_Fac() {
        return Fecha_Fac;
    }
    public void setFecha_Fac(Date Fecha_Fac) {
        this.Fecha_Fac = Fecha_Fac;
    }
    public double getTotal() {
        return Total;
    }
    public void setTotal(double Total) {
        this.Total = Total;
    }
    public int getCantidad() {
        return Cantidad;
    }
    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    public double getValor() {
        return Valor;
    }
    public void setValor(double Valor) {
        this.Valor = Valor;
    }
    @Override
    public String toString() {
        System.out.println("                                       Factura");
        System.out.println(LisClien.toString());
        return "{"+ "" + "Fecha_Fac=" + Fecha_Fac + LisPro.toString()+", Cantidad=" + Cantidad + ", Valor=" + Valor + ", Total=" + Total + '}';
    }   
}
