
package com.mycompany.tarea6poo.herenciamultiple;

public class AlumnoArtistaDeportista extends Alumno implements Deportista,Artista {
    private int idActivExtra;
    private String deporte;
    private String arte;

    public AlumnoArtistaDeportista() {
    }

    public AlumnoArtistaDeportista(int idActivExtra, String deporte, String arte, int numerCuenta, String carrera, double promedio) {
        super(numerCuenta, carrera, promedio);
        this.idActivExtra = idActivExtra;
        this.deporte = deporte;
        this.arte = arte;
    }

    public int getIdActivExtra() {
        return idActivExtra;
    }

    public void setIdActivExtra(int idActivExtra) {
        this.idActivExtra = idActivExtra;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getArte() {
        return arte;
    }

    public void setArte(String arte) {
        this.arte = arte;
    }

    @Override
    public String toString() {
        return super.toString() + "AlumnoArtistaDeportista{" + "idActivExtra=" + idActivExtra + ", deporte=" + deporte + ", arte=" + arte + '}';
    }

    @Override
    public int entrenar() {
        System.out.println(getNombre() + "esta entrenando el deporte "+ deporte);
        return 2;
    }

    @Override
    public boolean presentarCompetencia(String ubicacion) {
        System.out.println(getNombre() + "está en competencia del deporte " + deporte);
        return true;
    }

    @Override
    public int ensayar(String disciplina) {
        System.out.println("El alumno está ensayando "+ this.arte);
        return 2;
    }

    @Override
    public boolean presentarObra() {
        System.out.println(getNombre() + " Esta presentando su obra... " );
      return true;    
    }
    
    
                      
    
}
