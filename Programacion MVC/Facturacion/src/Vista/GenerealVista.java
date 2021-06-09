package Vista;
import Controller.ClienteController;
import Controller.FacturaController;
import Controller.ProductosController;
import java.util.Scanner;

public class GenerealVista {
    private Scanner data;
    private ProductosVista visPro;
    private FacturaVista visFac;
    private ClienteVista visCli;
    
    public GenerealVista(){
        visPro = new ProductosVista();
        visCli = new ClienteVista();
        visFac = new FacturaVista(visCli,visPro);
        data = new Scanner(System.in);
    }
    
    public void menu(){
        int opcion = 0;
        do {            
            System.out.println("1. Factura");
            System.out.println("2. Salir");
            opcion = data.nextInt();
            switch(opcion){
                case 1: visFac.menu(); break;
            }
        } while (opcion<2);
    }
}
