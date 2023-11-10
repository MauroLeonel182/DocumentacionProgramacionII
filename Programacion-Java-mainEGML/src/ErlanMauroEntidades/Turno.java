package ErlanMauroEntidades;

import java.util.Date;

public class Turno {
    private int nro;
    private Date fechaTurno;
    private Paciente paciente;
    private Asistente asistente;

    public Turno(){
        this.setNro(0);
        this.setFechaTurno(null);
        this.setPaciente(new Paciente());
        this.setAsistente(new Asistente());
    }

    public Turno(int nro, Date fecha, Paciente p, Asistente a){
        this.setNro(nro);
        this.setFechaTurno(fecha);
        this.setPaciente(p);
        this.setAsistente(a);
    }    
    
    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public Date getFechaTurno() {
        return fechaTurno;
    }

    public void setFechaTurno(Date fechaTurno) {
        this.fechaTurno = fechaTurno;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public void setAsistente(Asistente asistente) {
        this.asistente = asistente;
    }
        
    public Asistente getAsistente() {
        return asistente;
    }
}
