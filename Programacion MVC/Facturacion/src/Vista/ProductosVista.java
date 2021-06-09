package Vista;
import Controller.FacturaController;
import Controller.ProductosController;
import Model.Factura;
import java.util.Scanner;
import Model.Productos;
import java.util.List;
public class ProductosVista {
    public FacturaVista FacVis;
    private List<Factura>LisFac;
    public ProductosController ConPro;
    public FacturaController FacCon;
    public Scanner data;
    public Factura Fac;
    public ProductosVista(){
        data = new Scanner(System.in);
        ConPro = new ProductosController();
        FacCon = new FacturaController();
    }
        public void menu(){
        int opcion = 0;
        do {            
            System.out.println("1. Crear");
            System.out.println("2. Actualizar");
            System.out.println("3. Buscar");
            System.out.println("4. Eliminar");
            System.out.println("5. Listar");
            System.out.println("6. Salir");
            opcion = data.nextInt();
            switch(opcion){
                case 1: crear(); break;
                case 2: actualizar(); break;
                case 3: buscar(); break;
                case 4: eliminar(); break;
                case 5: listar(); break;
            }
        } while (opcion<6);
    }
    public void crear(){
        
        System.out.println("Ingrese la Descrpccion del Dispositivo ");
        String Descripccion = data.next();
        System.out.println("Ingrese el Precio Unitario ");
        double Precio = data.nextDouble();
        FacCon.Total(Precio);
        System.out.println("Ingrese el numero de stock ");
        int Stock = data.nextInt();
        System.out.println("Ingrese el Iva ");
        double Iva = data.nextDouble();
        System.out.println("Resultado: " + ConPro.crear(Descripccion, Precio,Stock,Iva)); 
    }
    public Productos buscar(){
        System.out.println("Ingrese la descripccion del Aparato");
        String Descripccion = data.next();
        Productos producto = ConPro.buscar(Descripccion);
        ConPro.setPro(producto);
        System.out.println(producto);
        return producto;
    }
    public void actualizar(){
        Productos produc = buscar();
        if(produc != null){
        System.out.println("Ingrese el nuevo Precio Unitario ");
        double precio_unitario = data.nextDouble();
        System.out.println("Ingrese el numero de stock ");
        int stock = data.nextInt();
        System.out.println("Ingrese el Iva ");
        double iva = data.nextDouble();
        System.out.println("Resultado: " +ConPro.actualizar(produc.getDescripccion(), precio_unitario,stock,iva));
        }
    }
    public void eliminar(){
        Productos produc = buscar();
        if(produc != null)
            System.out.println("Resultado: " + ConPro.eliminar(produc.getDescripccion()));
    }
    public void listar(){
    for(Productos producto:ConPro.getLisPro())
            System.out.println(producto);
    }

    public ProductosController getConPro() {
        return ConPro;
    }

    public void setConPro(ProductosController ConPro) {
        this.ConPro = ConPro;
    }
    
}
