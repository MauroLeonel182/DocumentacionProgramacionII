package ErlanMauroEntidades;

public class Cama extends Recurso {
    private int plaza;
    
    public Cama(int id, int plazas, int cantidad, String nombre, String clasificacion){
        super(id, cantidad, nombre, clasificacion);
        this.setPlaza(plazas);
    }

    public int getPlaza() {
        return plaza;
    }

    public void setPlaza(int plaza) {
        this.plaza = plaza;
    }

}
