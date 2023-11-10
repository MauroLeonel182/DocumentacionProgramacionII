package ErlanMauroEntidades;

public class Televisor extends Recurso {
    private int pulgada;
    private String tipoPantalla;
    
    public Televisor(int id, int cantidad, String tPantalla, int pulgada, String nombre, String clasificacion){
        super(id, cantidad, nombre, clasificacion);
        this.setPulgada(pulgada);
        this.setTipoPantalla(tPantalla);
    }

    public int getPulgada() {
        return pulgada;
    }

    public void setPulgada(int pulgada) {
        this.pulgada = pulgada;
    }

    public String getTipoPantalla() {
        return tipoPantalla;
    }

    public void setTipoPantalla(String tipoPantalla) {
        this.tipoPantalla = tipoPantalla;
    }
    
}
