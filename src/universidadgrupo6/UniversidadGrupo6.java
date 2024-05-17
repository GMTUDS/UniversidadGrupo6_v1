package universidadgrupo6;

import java.time.LocalDate;
import universidadgrupo6.accesoADatos.AlumnoData;
import universidadgrupo6.entidades.Alumno;

/**
 *
 * @author nn
 */
public class UniversidadGrupo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Alumno nando =new Alumno(49378242,"Aguero","Nando",LocalDate.of(2000,03,17),true);
        AlumnoData alu=new AlumnoData();
        alu.guardarAlumno(nando);
        
                
    }
    
}
