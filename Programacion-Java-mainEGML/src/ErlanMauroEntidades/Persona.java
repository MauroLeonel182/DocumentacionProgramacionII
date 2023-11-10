package ErlanMauroEntidades;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public abstract class Persona {
     
    private int id;
    private String apellido;
    private String nombres;
    private Date fechaNacimiento;
    
    public Persona(){
        this.setId(0);
        this.setApellido("");
        this.setNombres("");
        this.setFechaNacimiento(null);
    }
    
    public Persona(int id, String apellido, String nombres, Date fechaNacimiento){
        this.setId(id);
        this.setApellido(apellido);
        this.setNombres(nombres);
        this.setFechaNacimiento(fechaNacimiento);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    /*
        Método que calcula la fecha actual con la fecha del paciente para determinar si es mayor a 65 años.
        Se resta 1900 a la diferencia de año ya que por alguna razón empieza con el año en 1900 y lo suma
    */
    public Integer getEdad(){
        LocalDate fechaActual = LocalDate.now();
        LocalDate nacimiento = this.getFechaNacimiento().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Period diferencia = Period.between(fechaActual, nacimiento);
        return 1900 - diferencia.getYears();
    }
    
    @Override
    public String toString(){
        return getApellido() + " " + getNombres();
    }
}
