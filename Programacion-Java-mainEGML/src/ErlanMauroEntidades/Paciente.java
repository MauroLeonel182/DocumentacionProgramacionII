package ErlanMauroEntidades;

import java.util.Date;

public class Paciente extends Persona{
    private int nroDocumento;
    private String domicilio;
    private String celular;
    private Boolean activo;
    private String obraSocial;
    
    public Paciente(){
        this.setId(0);
        this.setApellido("");
        this.setNombres("");
        this.setFechaNacimiento(null);
        this.setNroDocumento(0);
        this.setDomicilio("");
        this.setCelular("");
        this.setActivo(false);
        this.setObraSocial("");
    }
    
    public Paciente(int id, String apellido, String nombres, Date fechNac,
             int nroDoc, String dom, String cel, Boolean activo, String os){
        super(id,apellido,nombres,fechNac);
        this.setNroDocumento(nroDoc);
        this.setDomicilio(dom);
        this.setCelular(cel);
        this.setActivo(activo);
        this.setObraSocial(os);
    }

    public int getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(int nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }

    public Boolean getActivo() {
        return activo;
    }

    public String getObraSocial() {
        return obraSocial;
    }
}
