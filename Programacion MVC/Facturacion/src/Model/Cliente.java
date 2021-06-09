package Model;
public class Cliente 
{
    private String Nombre;
    private String Cedula;
    private boolean Fiabi_Pago;

    public Cliente(String Nombre, String Cedula) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
    }

    public Cliente(String Nombre, String Cedula, boolean Fiabi_Pago) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.Fiabi_Pago = Fiabi_Pago;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public boolean isFiabi_Pago() {
        return Fiabi_Pago;
    }

    public void setFiabi_Pago(boolean Fiabi_Pago) {
        this.Fiabi_Pago = Fiabi_Pago;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nombre=" + Nombre + ", Cedula=" + Cedula + ", Fiabi_Pago=" + Fiabi_Pago + '}';
    }    
}
