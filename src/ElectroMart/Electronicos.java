package ElectroMart;

public class Electronicos {
    private String nombre;
    private String modelo;
    private String descripcion;
    private float precio;

    public Electronicos() {
        this.nombre = nombre;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Electronicos(Electronicos electronicos) {
        nombre = electronicos.nombre;;
        modelo = electronicos.modelo;
        descripcion = electronicos.descripcion;
        precio = electronicos.precio;
    }

    public Electronicos() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}


