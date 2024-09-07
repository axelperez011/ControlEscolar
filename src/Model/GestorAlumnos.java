
package Model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Sistemas
 */
public class GestorAlumnos {
    
    public void guardarAlumnoEnArchivo(Estudiante alumno, String nombreArchivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
            bw.write("ID: " + alumno.getId());
            bw.newLine();
            bw.write("Nombre: " + alumno.getNombre());
            bw.newLine();

            List<List<Double>> calificaciones = alumno.getCalificaciones();
            for (int i = 0; i < calificaciones.size(); i++) {
                if(i==4){
                    bw.write("Promedio " + ": ");
                    for (Double calificacion : calificaciones.get(i)) {
                    bw.write(calificacion + " ");
                }
                bw.newLine();
                }else{
                    bw.write("Bimestre " + (i + 1) + ": ");
                for (Double calificacion : calificaciones.get(i)) {
                    bw.write(calificacion + " ");
                }
                bw.newLine();
                }
                
            }
            bw.write("-------------------------");
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
}
