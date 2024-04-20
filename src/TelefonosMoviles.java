import ElectroMart.Electronicos;

public class TelefonosMoviles extends Electronicos {
    private String modelo;
    private String nombre;
    private String descripcion;
    private int precio;
    private int año;

    public TelefonosMoviles(String modelo, String nombre, String descripcion, int precio, int año) {
        super();
        this.modelo = modelo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.año = año;
    }

    public TelefonosMoviles(TelefonosMoviles telefonosMoviles){
        super(telefonosMoviles);
        nombre = telefonosMoviles.nombre;
        modelo = telefonosMoviles.modelo;
        descripcion = telefonosMoviles.descripcion;
        precio = telefonosMoviles.precio;
        año = telefonosMoviles.año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}
