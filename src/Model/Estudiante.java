
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sistemas
 */
public class Estudiante {
    
    private String id;
    private String nombre;
    private List<List<Double>> calificaciones;

    public Estudiante (String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.calificaciones = new ArrayList<>();

        // Inicializar los 5 bimestres con listas vacías
        for (int i = 0; i < 5; i++) {
            this.calificaciones.add(new ArrayList<>());
        }
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<List<Double>> getCalificaciones() {
        return calificaciones;
    }

    public void agregarCalificacion(int bimestre, double calificacion) {
        if (bimestre >= 1 && bimestre <= 5) {
            this.calificaciones.get(bimestre - 1).add(calificacion);
        } else {
            System.out.println("Bimestre inválido");
        }
    }
    
}
