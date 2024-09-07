 
package Model;

import Vista.Login;
import Vista.frmCalificaciones;
import javax.swing.JOptionPane;

/**
 *
 * @author Sistemas
 */
public class Seguridad {
    Login login = new Login();
    String res;
    
    public void ValidarUsuario(String usuarios[], String user, String pwd, int intentos){
        boolean encontrado=false;
        
        for(int i=0; i<usuarios.length; i++){
            if(usuarios[i].equalsIgnoreCase(user) && usuarios[i+1].equals(pwd)){
                res="Bienvenido "+user;
                encontrado=true;
                JOptionPane.showMessageDialog(null,res,"Inicio de Sesion", JOptionPane.INFORMATION_MESSAGE);
                intentos=0;
                login.setIntentos(intentos);
                
                frmCalificaciones pr = new frmCalificaciones();
                pr.setVisible(true);
                pr.setLocationRelativeTo(null);
                
                break;
            }
        }
        if(encontrado==false){
            res=" clave y/o usuario erroneos, van "+ intentos +" intentos";
            JOptionPane.showMessageDialog(null, res, "Inicio de Sesion", JOptionPane.ERROR_MESSAGE);
        }
        if(intentos>2){
            JOptionPane.showMessageDialog(null, "Ha alcanzado el numero maximo de intentos", "Inicio de Sesion", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }
    
}
