package ErlanMauroEntidades;

public class Recurso {
    private int id;
    private int cantidad;
    private String nombre;
    private String clasificacion;
    
    public Recurso(int id, int q, String n, String c){
        this.setId(id);
        this.setCantidad(q);
        this.setNombre(n);
        this.setClasificacion(c);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
}
