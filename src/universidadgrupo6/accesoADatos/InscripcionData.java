
package universidadgrupo6.accesoADatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidadgrupo6.entidades.Alumno;
import universidadgrupo6.entidades.Inscripcion;
import universidadgrupo6.entidades.Materia;

public class InscripcionData {
    private Connection con;
    private MateriaData matData;
    private AlumnoData aluData;
    private MateriaData md=new MateriaData();
    private AlumnoData ad=new AlumnoData();

    public InscripcionData() {
    }
    public void guardarInscripcion(Inscripcion inscrip){
        String sql="INSERT INTO inscripcion "
                +"(nota, idAlumno, idMateria)"
                +"VALUES(?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1,inscrip.getNota());
            ps.setInt(2, inscrip.getAlumno().getIdAlumno());
            ps.setInt(3, inscrip.getMateria().getIdMateria());
            ps.executeUpdate();
            ResultSet  rs = ps.getGeneratedKeys();
            if(rs.next()){
            inscrip.setIdInscripcion(1);
            JOptionPane.showMessageDialog(null, "Incripcion Guardada");
            }
            ps.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA INSCRIPCION");
            System.out.println(ex.getMessage());
        }   
    }
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno) throws SQLException {
        ArrayList<Inscripcion> inscripcionesAlu = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?";
        try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idAlumno);
        ResultSet rs= ps.executeQuery();
        
            while (rs.next()) {
                Inscripcion ins = new Inscripcion();
                ins.setIdInscripcion(rs.getInt("idInscripto"));
                Alumno alu=ad.buscarAlumno(rs.getInt("idAlumno"));
                Materia mat=md.buscarMateria(rs.getInt("idMateria"));
                ins.setAlumno(alu);
                ins.setMateria(mat);
                ins.setNota(rs.getDouble("nota"));
                inscripcionesAlu.add(ins);
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla inscripcion"+ex.getMessage());
            
        }
        return inscripcionesAlu;
    }
    public List<Inscripcion> obtenerInscripciones(){
       ArrayList<Inscripcion> listMateria=new ArrayList<>();
        try{
          String sql="SELECT * FROM inscripcion";
          PreparedStatement ps=con.prepareStatement(sql);
          ResultSet rs=ps.executeQuery();
        while(rs.next()){
           Inscripcion insc = new Inscripcion();
           
                Alumno alu=ad.buscarAlumno(rs.getInt("idAlumno"));
                Materia mat=md.buscarMateria(rs.getInt("IdMAteria"));
                insc.setAlumno(alu);
                insc.setMateria(mat);
                insc.setNota(rs.getDouble("nota"));
                listMateria.add(insc);   
        }  
        ps.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Materia " + ex.getMessage());
        }
        return listMateria;
    }
    public List<Materia> obtenerMateriasNoCursadas(int IdAlumo){
        ArrayList<Materia> materias=new ArrayList<>(); 
        String sql = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion, "
                +"materia WHERE inscripcion.idMateria = materia.idMateria"+
                "AND inscripcion.IdAlumno= ?";
        try{
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1, IdAlumo);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
        Materia materia=new Materia();
        materia.setIdMateria(rs.getInt("idMateria"));
        materia.setNombre(rs.getString("Nombre"));
        materia.setAnioMateria(rs.getInt("Año"));
        materias.add(materia);
        }
        ps.close();
        }catch (SQLException ex){
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
        return materias;
    
    }
    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
        String sql = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);

            int filas = ps.executeUpdate();

            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Se borró la inscripcion");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al borrar inscripcion: " + ex.getMessage());
        }

    }
    public List<Materia> obtenerMateriasCursadas(int idAlumno) {
        ArrayList<Materia> materias = new ArrayList<>();
        String sql = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion, " + "materia WHERE  inscripcion.idMateria = "
                    + "materia.idMAteria" + "AND inscripcion.idAlumno = ?;";

        try (PreparedStatement ps=con.prepareStatement(sql)) {
            ps.setInt(1, idAlumno);
            ResultSet rs=ps.executeQuery();
                while (rs.next()) {
                    Materia materia = new Materia();
                    materia.setIdMateria(rs.getInt("idmateria"));
                    materia.setNombre(rs.getString("nombre"));
                    materia.setAnioMateria(rs.getInt("año"));
                    materias.add(materia);
                }
                ps.close();
            }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        } 
        return materias;
    }

    public void actualizarNota(int idAlumno,int idMateria,double nota){
         String sql="UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
         try{
             PreparedStatement ps=con.prepareStatement(sql);
             ps.setDouble(1,nota);
             ps.setInt(2,idAlumno);
             ps.setInt(3,idMateria);
             int fila=ps.executeUpdate();
             if(fila>0){
                  JOptionPane.showMessageDialog(null, "Nota actualizada ");
             }
             ps.close();
         }catch (SQLException ex){
             JOptionPane.showMessageDialog(null, " Error al acceder a la tabla inscripcion " + ex.getMessage());
         }
     }
}

