package Vista;
import java.util.Scanner;
import Model.Cliente;
import Model.Factura;
import Model.Productos;
import Controller.ProductosController;
import Controller.ClienteController;
import Controller.FacturaController;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class FacturaVista {
    private FacturaController FacCon;
    private ClienteVista visCli;
    private ProductosController ProCon;
    private ProductosVista visPro;
    private List<Productos>Produc;
    private Scanner data;
    private SimpleDateFormat formatoFecha;
    public static String formato = "dd/MM/yyyy";   
    
    public FacturaVista(ClienteVista visCli,ProductosVista visPro){
        FacCon = new FacturaController();
        ProCon = new ProductosController();
        this.visCli = visCli ;
        this.visPro = visPro;
        data = new Scanner(System.in);
        formatoFecha = new SimpleDateFormat(formato);

  }
        public void menu() {
        int opcion = 0;
        do {
            System.out.println("1. Crear");
            System.out.println("2. Actualizar");
            System.out.println("3. Buscar");
            System.out.println("4. Eliminar");
            System.out.println("5. Listar");
            System.out.println("6. Datos cliente");
            System.out.println("7. Datos Productos");
            System.out.println("9. Salir");
            opcion = data.nextInt();
            switch (opcion) {
                case 1:crear();break;
                case 2:actualizar();break;
                case 3:buscar();break;
                case 4:eliminar();break;
                case 5:listar();break;
                case 6:Cliente();break;
                case 7:Productivo();break;
            }
        } while (opcion < 8);
    }
        public void crear(){
        System.out.println("Ingresar Fecha: " + formato);
        data.nextLine();
        try {
            Date horaEntrada = formatoFecha.parse(data.nextLine());
            System.out.println("Ingrese la cantidad ");
            int cantidad = data.nextInt();
            boolean resultado = FacCon.crear(horaEntrada, 0, 0,0);
            System.out.println("Creado " + resultado);
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
            this.crear();
        }
    }
    public Factura buscar(){
        System.out.println("Ingrese Fecha: " + formato);
        data.nextLine();
        try {
            Date horaEntrada = formatoFecha.parse(data.nextLine());
            Factura fac = FacCon.buscar(horaEntrada);
            System.out.println(fac);
            return fac;
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
            this.menu();
        }
        return null;
    }
    public void actualizar(){
        Factura factura = this.buscar();
        System.out.println("Ingrese la fecha " + formato);
        try {
            Date horaSalida = formatoFecha.parse(data.nextLine());
            boolean resultado = FacCon.actualizar(factura.getFecha_Fac());
            System.out.println("Resultado: " + resultado);
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
            this.actualizar();
        }
    }
    public void eliminar(){
        Factura fac = this.buscar();
        if (fac != null) {
            boolean resultado = FacCon.eliminar(fac.getFecha_Fac());
            System.out.println("Elminado : " + resultado);
        }
    }
    public void listar(){
        for (Factura dato : FacCon.getLisFac()) 
            System.out.println(dato);
    }
    public void Cliente(){
     Factura fac = buscar(); 
     if(fac!=null){
       visCli.getConCli().setLisCli(fac.getLisClien());
       visCli.menu();
       }
    }
    public void Productivo(){
    Factura fac = buscar();
    if(fac!=null){
      visPro.getConPro().setLisPro(fac.getLisPro());
      visPro.menu();
        }
    }
    
}