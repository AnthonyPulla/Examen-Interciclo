package Model;

import java.util.ArrayList;
import java.util.List;

public class Productos
{
    private long Id;
    private String Descripccion;
    private double Precio_unitario;
    private int Stock;
    private int Cantidad;
    private Factura fac;
    private double Iva;
    private List<Factura>LisFac;
    
    public Productos(long Id, String Descripccion, double Precio_unitario, int Stock,double Iva) {
        this.Id = Id;
        this.Descripccion = Descripccion;
        this.Precio_unitario = Precio_unitario;
        this.Stock = Stock;
        this.Iva = Iva;
        this.LisFac = new ArrayList();
    }

    public Productos(long Id, String Descripccion, double Precio_unitario, int Stock, double Iva, List<Factura> LisFac) {
        this.Id = Id;
        this.Descripccion = Descripccion;
        this.Precio_unitario = Precio_unitario;
        this.Stock = Stock;
        this.Iva = Iva;
        this.LisFac = LisFac;
    }
    public List<Factura> getLisFac() {
        return LisFac;
    }

    public void setLisFac(List<Factura> LisFac) {
        this.LisFac = LisFac;
    }
    public long getId() {
        return Id;
    }
    public void setId(long Id) {
        this.Id = Id;
    }
    public String getDescripccion() {
        return Descripccion;
    }
    public void setDescripccion(String Descripccion) {
        this.Descripccion = Descripccion;
    }
    public double getPrecio_unitario() {
        return Precio_unitario;
    }
    public void setPrecio_unitario(double Precio_unitario) {
        this.Precio_unitario = Precio_unitario;
    }
    public int getStock() {
        return Stock;
    }
    public void setStock(int Stock) {
        this.Stock = Stock;
    }
    public double getIva() {
        return Iva;
    }
    public void setIva(double Iva) {
        this.Iva = Iva;
    }
    @Override
    public String toString() {   
       return "Productos{" + "Id=" + Id + ", Descripccion=" + Descripccion + ", Precio_unitario=" + Precio_unitario + ", Stock=" + Stock +"Cantidad "+Cantidad+", Iva=" + Iva + '}';
    }    
}
