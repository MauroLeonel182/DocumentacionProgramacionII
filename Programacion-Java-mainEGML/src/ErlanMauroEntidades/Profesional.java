package ErlanMauroEntidades;

import java.util.Date;
import java.util.TreeMap;

public class Profesional extends Persona{
    private int nroMatriculo;
    private TreeMap<Integer, Especialidad> especialidades;
    
    public Profesional(int id, String apellido, String nombres, Date fechNac,
            int nroMatric, TreeMap<Integer, Especialidad> espList){
        super(id,apellido,nombres,fechNac);
        this.setNroMatriculo(nroMatric);
        this.setEspecialidades(espList);
    }

    public int getNroMatriculo() {
        return nroMatriculo;
    }

    public void setNroMatriculo(int nroMatriculo) {
        this.nroMatriculo = nroMatriculo;
    }

    public TreeMap<Integer, Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(TreeMap<Integer, Especialidad> especialidades) {
        this.especialidades = especialidades;
    }

    public void agendarTurno(Especialidad esp, Turno t){
        if(getEspecialidades()==null){
            setEspecialidades(new TreeMap<Integer, Especialidad>());
        }
        if(getEspecialidades().containsKey(esp.getId())){
            Especialidad espProfesional = getEspecialidades().get(esp.getId());
            
            int nroOrdenSiguiente = espProfesional.getTurnos().size() + 1;
            t.setNro(nroOrdenSiguiente);
            
            espProfesional.getTurnos().add(t);
        }else{
            getEspecialidades().put(esp.getId(), esp);
            
            Especialidad espProfesional = getEspecialidades().get(esp.getId());
            
            int nroOrdenSiguiente = espProfesional.getTurnos().size() + 1;
            t.setNro(nroOrdenSiguiente);
            
            espProfesional.getTurnos().add(t);
        }
    }
    
    public void listarTurnosPorEspecialidad(){
        System.out.println("Profesional: " + toString());
        System.out.println("--------------------------------------");
        for(Especialidad espList:getEspecialidades().values()){
            System.out.println("Especialidad: " + espList.getNombre().trim());
            System.out.println("--------------------------------------");
            for(int indexTurno=0; indexTurno<espList.getTurnos().size(); indexTurno++){
                Turno t = espList.getTurnos().get(indexTurno);
                System.out.println("Turno Nro: " + t.getNro() + " | " + "Para: " + t.getPaciente().toString() + " | " + "Agendado por: " + t.getAsistente().toString());
            }
            System.out.println("--------------------------------------");
            System.out.println("");
            System.out.println("");
        }
    }
}
