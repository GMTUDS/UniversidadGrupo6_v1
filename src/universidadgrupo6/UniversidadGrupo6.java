package universidadgrupo6;

import java.time.LocalDate;
import java.util.List;
import universidadgrupo6.accesoADatos.AlumnoData;
import universidadgrupo6.accesoADatos.InscripcionData;
import universidadgrupo6.accesoADatos.MateriaData;
import universidadgrupo6.entidades.Alumno;
import universidadgrupo6.entidades.Inscripcion;
import universidadgrupo6.entidades.Materia;

public class UniversidadGrupo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

// Alumno nando =new Alumno(49378242,"Aguero","Nando",LocalDate.of(2000,03,17),true);
        //Alumno nando =new Alumno(1,49378242,"Aguerossss","Nando",LocalDate.of(2000,03,17),true);
//     Alumno gerardo =new Alumno(44734521,"Moya","Gerardo",LocalDate.of(2001,12,25),true);
//        AlumnoData alu=new AlumnoData();
        //alu.guardarAlumno(nando);
        //alu.guardarAlumno(gerardo);
        //alu.modificarAlumno(nando);
        //nando.setNombre("Nandooo"");
        //PRUEBA PARA LISTAR LOS ALUMNOS
//        alu.listarAlumnos();
//        List<Alumno> aluEst = alu.listarAlumnos();
//        aluEst.forEach((alumno) ->{
//            if(alumno != null){
//                System.out.println(alumno.toString());
//            }else{
//                System.out.println("Alumno Fuera");
//            }
//            });
        //alu.buscarAlumnoPorDni(44734521);
        //alu.eliminarAlumno(3);
//        Materia laboratorio =new Materia ("labo",2024,true);
        //Materia eda =new Materia ("EDA",2024,true);
//        Materia web =new Materia ("WEB",2024,true);
//        MateriaData md = new MateriaData();
        //md.cargarMateria(eda);
        //md.cargarMateria(laboratorio);
        //md.cargarMateria(web);
        //md.buscarMateria(2);
        //md.eliminarMateria(1);
//       Materia mat=md.buscarMateria(1);
//       
//        mat.setNombre("redes");
//        md.modificarMateria(mat);
//        // md.listarMateria();
//        List<Materia> listMate = md.listarMateria();
//        listMate.forEach((materia) ->{
//            
//                System.out.println(materia.toString());
//            
//            });
//    }
        MateriaData md = new MateriaData();
        AlumnoData ad = new AlumnoData();

//        Alumno alumno = ad.buscarAlumno(1);
//        Materia materia=md.buscarMateria(2);

//        Inscripcion ins1 = new Inscripcion(alumno,materia,10);
//         alumno = ad.buscarAlumno(1);
//         materia=md.buscarMateria(2);
//        Inscripcion ins2 = new Inscripcion(alumno,materia,10);
        InscripcionData inscribir = new InscripcionData();

//        inscribir.guardarInscripcion(ins1);
//        inscribir.guardarInscripcion(ins2);
//        inscribir.borrarInscripcionMateriaAlumno(2, 2);
        // md.listarMateria();
//        inscribir.obtenerMateriasCursadas(1).forEach((materia) ->{
//                System.out.println(materia.toString());
//            });

//        inscribir.obtenerInscripcionesPorAlumno(1).forEach((inscripciones) -> {
//            System.out.println(inscripciones.toString());
//        });
//        inscribir.obtenerMateriasNoCursadas(2).forEach((inscripciones) -> {
//            System.out.println(inscripciones.toString());
//        });
        inscribir.actualizarNota(1, 3, 3);
        inscribir.obtenerInscripciones().forEach((inscripciones) -> {
            System.out.println(inscripciones.toString());
        });

    }

}
