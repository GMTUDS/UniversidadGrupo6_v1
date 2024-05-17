package universidadgrupo6;

import java.time.LocalDate;
import universidadgrupo6.accesoADatos.AlumnoData;
import universidadgrupo6.entidades.Alumno;

public class UniversidadGrupo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//      Alumno nando =new Alumno(49378242,"Aguero","Nando",LocalDate.of(2000,03,17),true);
        //Alumno nando =new Alumno(1,49378242,"Aguerossss","Nando",LocalDate.of(2000,03,17),true);
        Alumno nando =new Alumno(44734521,"Moya","Gerardo",LocalDate.of(2001,12,25),true);
        AlumnoData alu=new AlumnoData();
        //alu.guardarAlumno(nando);
        //alu.modificarAlumno(nando);
        alu.listarAlumnos();
        //alu.buscarAlumnoPorDni(44734521);
        //alu.eliminarAlumno(3);
    }
    
}
