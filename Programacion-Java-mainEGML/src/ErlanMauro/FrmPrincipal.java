package ErlanMauro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.TreeMap;
import ErlanMauroEntidades.Asistente;
import ErlanMauroEntidades.Cama;
import ErlanMauroEntidades.Especialidad;
import ErlanMauroEntidades.Paciente;
import ErlanMauroEntidades.Profesional;
import ErlanMauroEntidades.Recurso;
import ErlanMauroEntidades.Televisor;
import ErlanMauroEntidades.Turno;


public class FrmPrincipal extends javax.swing.JFrame {

    public FrmPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Paso 3");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Paso 2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Paso 4");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Paso 5");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Se agregó asistente a turnos para saber quién lo agendó.
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //==ArrayList de profesionales
        ArrayList<Profesional> listProfesionales = new ArrayList<>();
        
        // Creo los asistentes 
        Asistente asistente1 = new Asistente(1, "Gonzales", "German", new Date(1980, 05,12));
        Asistente asistente2 = new Asistente(1, "Ronaldo", "Cristiano", new Date(1970, 01, 01));
        
        //==Creo los profesionales
        Profesional p1 = new Profesional(0, "MESSI", "LIONEL", new Date(),
                        1000221, new TreeMap<Integer,Especialidad>());
        
        Profesional p2 = new Profesional(1, "ALVAREZ", "JOSE", new Date(),
                        30100221, new TreeMap<Integer,Especialidad>());
        
        //==Agrego Turno a p1
        Paciente paciente1 = new Paciente(505, "FERNANDEZ", "CRISTINA", new Date(),
            28092833, "BARRIO PUERTA DEL SOL", "CEL:15xxxxxx", true, "INSSSEP");
                
        Turno t1 = new Turno();
        t1.setFechaTurno(new Date());
        t1.setPaciente(paciente1);
        t1.setAsistente(asistente1);
        
        Especialidad esp1 = new Especialidad();
        esp1.setId(1);
        esp1.setNombre("Pediatría");
        
        p1.agendarTurno(esp1, t1);
        
        //==Agrego Turno a p2
        Paciente paciente2 = new Paciente(8001, "GONZALES", "JOSE", new Date(),
            6542213, "BARRIO CENTRO", "TEL:451xxxxxx", true, "INSSSEP");
        
        Turno t2 = new Turno();
        t2.setFechaTurno(new Date());
        t2.setPaciente(paciente2);
        t2.setAsistente(asistente2);
        
        Especialidad esp2 = new Especialidad();
        esp2.setId(191);
        esp2.setNombre("Radiología");
        
        p2.agendarTurno(esp2, t2);
        
        Paciente paciente3 = new Paciente(7001, "VILLARUEL", "VICTORIA", new Date(),
            1577883, "CALLE 12", "CAL:51xxxxxx", true, "INSSSEP");
        
        Turno t3 = new Turno();
        t3.setFechaTurno(new Date());
        t3.setPaciente(paciente3);
        t3.setAsistente(asistente1);
        
        p2.agendarTurno(esp2, t3);
        
        Paciente paciente4 = new Paciente(8401, "GIORDANO", "PABLO", new Date(), 
                43909973, "P. SOL", "CEL:15xxxxxx", true, "INSSSEP");
        
        Turno t4 = new Turno();
        t4.setFechaTurno(new Date());
        t4.setPaciente(paciente4);
        t4.setAsistente(asistente1);
        
        Especialidad esp3 = new Especialidad();
        esp3.setId(3);
        esp3.setNombre("Traumatología");
        
        p1.agendarTurno(esp3, t4);
        
        listProfesionales.add(p1);
        listProfesionales.add(p2);
        
        for(int indexp = 0; indexp < listProfesionales.size(); indexp++){
            Profesional prof = listProfesionales.get(indexp);
            prof.listarTurnosPorEspecialidad();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ArrayList<Especialidad> especialidades = new ArrayList<>();
        
        Especialidad esp1 = new Especialidad(1, "Cardiología");
        especialidades.add(esp1);
        
        Paciente p1 = new Paciente(1, "Giordano", "Pablo", new Date(1979,8,12),
             1122131234, "Calle 1", "Cel", true, "INSSSEP");
        
        Turno t1 = new Turno();
        t1.setNro(1);
        t1.setFechaTurno(new Date(2023,8,29));
        t1.setPaciente(p1);
        
        esp1.getTurnos().add(t1);
        
        Especialidad esp2 = new Especialidad(2, "Radiologia");
        especialidades.add(esp2);
        
        Paciente p2 = new Paciente(12312, "Alvares", "Juan", new Date(1979,8,12),
             4221312, "Calle 12", "Cel:2312341", true, "INSSSEP");
        
        Turno t2 = new Turno();
        t2.setNro(1);
        t2.setFechaTurno(new Date());
        t2.setPaciente(p2);
        
        esp2.getTurnos().add(t2);
        
        Paciente p3 = new Paciente(12312, "Ortíz", "Raúl Juan", new Date(1988,12,12),
             4221312, "Calle 12", "Cel:2312341", true, "OSDE");
        
        Turno t3 = new Turno();
        t3.setNro(2);
        t3.setFechaTurno(new Date(2023,8,29));
        t3.setPaciente(p3);
        
        esp1.getTurnos().add(t3);
        
        
        int id_buscar = 1;
        for(int index = 0; index < especialidades.size(); index++){
            Especialidad esp = especialidades.get(index);
            if(!esp.getTurnos().isEmpty() && esp.getId() == id_buscar){
                for(int indext = 0; indext < esp.getTurnos().size(); indext++){
                    Turno t = esp.getTurnos().get(indext);
                    // 29 de agosto 2023
                    Date hoy29 = new Date(2023, 8, 29);
                    boolean igual = t.getFechaTurno() == hoy29;
                    if(t.getFechaTurno().equals(hoy29)){
                        System.out.println(t.getNro() + "-" + t.getPaciente().toString());
                    }
                }
            }
        }
        System.out.println("\n\n\n");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ArrayList<Paciente> pacientes = new ArrayList<>();
        
        // Lista de pacientes a agregar
        Paciente[] datosPacientes = {
            new Paciente(1, "Giordano", "Pablo", new Date(1959, 8, 12), 1122131234, "Calle 1", "Cel", true, "OSDE"),
            new Paciente(2, "Diaz", "Lucas", new Date(1950, 8, 12), 1122131234, "Calle 1", "Cel", true, "INSSSEP"),
            new Paciente(3, "Álvarez", "Jose", new Date(1940, 8, 01), 1122131234, "Calle 1", "Cel", false, "INSSSEP"),
            new Paciente(4, "Nowak", "Alberto", new Date(1930, 02, 03), 1122131234, "Calle 1", "Cel", true, "INSSSEP"),
            new Paciente(5, "Rodriguez", "Axel", new Date(2019,8,12), 1122131234, "Calle 1", "Cel", true, "INSSSEP"),
            new Paciente(6, "Samsung", "Uong", new Date(1920,8,12), 1122131234, "Calle 1", "Cel", true, "OSDE"),
            new Paciente(7, "Mendez", "Mauro", new Date(1957,12, 24), 1122131234, "Calle 1", "Cel", true, "INSSSEP"),
        };
        
        // Agregamos los pacientes al array de pacientes
        pacientes.addAll(Arrays.asList(datosPacientes));
        
        // Ordenamos la lista de pacientes segun edad
        pacientes.sort(Comparator.comparing(Paciente::getEdad));
        
        System.out.println("\n\n\nLista de pacientes activos en orden por edad, mayores a 65 años y con obra social INSSSEP: ");
        System.out.println("--------------------------------------");
        for (Paciente paciente : pacientes) {
            if(paciente.getActivo() && paciente.getObraSocial() == "INSSSEP" && paciente.getEdad() > 65){
                System.out.println("Paciente: " + paciente.toString() + " | " + "Edad: " + paciente.getEdad() + " años.");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ArrayList<Recurso> recursos = new ArrayList<>();
        
        // Lista de recursos a agregar
        Recurso[] datosRecursos = {
            new Cama(1, 2, 16, "Cama Marca1", "Cama"),
            new Cama(2, 1, 28, "Cama Marca2", "Cama"),
            new Cama(3, 2, 10, "Cama Marca3", "Cama"),
            new Televisor(4, 22, "LED", 32, "Samsung", "Televisor"),
            new Televisor(5, 12, "LCD", 32, "HUAWEI", "Televisor"),
            new Televisor(6, 22, "QLED", 32, "XIAOMI", "Televisor")
        };
        
        // Agregamos los recursos al array de recursos
        recursos.addAll(Arrays.asList(datosRecursos));
        
        int cantidadCamas = 0;
        int cantidadTelevisores = 0;

        System.out.println("\n\n\nLista de la cantidad de camas de 1 plaza y televisores: ");
        System.out.println("--------------------------------------");
        
        // Recorremos el array con los diferentes recursos
        for (Recurso recurso : recursos) {
            // Buscamos el recurso por instancia de Cama
            if(recurso instanceof Cama){
                if(((Cama) recurso).getPlaza() == 1){
                    cantidadCamas += ((Cama) recurso).getCantidad();
                }
            }
            // Buscamos el recurso por instancia de Televisor
            else if(recurso instanceof Televisor){
                cantidadTelevisores += ((Televisor) recurso).getCantidad();
            }
        }
        System.out.println("En el edificio hay: " + cantidadCamas + " camas de 1 plaza y " + cantidadTelevisores + " televisores.");
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    // End of variables declaration//GEN-END:variables
}
