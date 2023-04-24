
package com.mycompany.tarea6poo.herenciamultiple;

public class AdaMain {
    public static void main(String[] args) {
        AlumnoArtistaDeportista ada = new AlumnoArtistaDeportista();
        ada.setNombre("Juan");
        ada.setArte("Pintura");
        ada.setDeporte("Basquetbol");
        System.out.println(ada);
        ada.ensayar("oleo");
        ada.entrenar();
        ada.presentarCompetencia("Naucalli");
    }
   
}
