package dev.wotancode.datos;

import dev.wotancode.dominio.Estudiante;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static dev.wotancode.conexion.Conexion.getConexion;

// DAO - Data access Object
public class EstudianteDAO {
    public List<Estudiante> listarEstudiantes() {
        List<Estudiante> estudiantes = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConexion();
        String sql = "SELECT * FROM estudiantes ORDER BY id_estudiante";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                var estudiante = new Estudiante();
                estudiante.setIdEstudiante(rs.getInt("id_estudiante"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                estudiantes.add(estudiante);
            }

        } catch (Exception e) {
            System.out.println("Ocurrio un error al seleccionar datos: " + e.getMessage());
        }

        finally {
            try {
                con.close();
            }catch (Exception e) {
                System.out.println("Ocurrio un error al cerrar la base datos: " + e.getMessage());
            }
        }
        return estudiantes;
    }

    // Buscar estudiante por ID findById
    public boolean buscarEstudiantePorId(Estudiante estudiante){
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConexion();
        String sql = "SELECT * FROM estudiantes WHERE id_estudiante = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, estudiante.getIdEstudiante());
            rs = ps.executeQuery();
            if (rs.next()) {
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                return true;
            }

        } catch (Exception e){
            System.out.println("Ocurrio un error al buscar estudiante" + e.getMessage()) ;
        }
        finally {
            try {
                con.close();
            }catch (Exception e) {
                System.out.println("Ocurrio un error al cerrar la BD: " + e.getMessage());
            }
        }

        return false;
    }

    public boolean agregarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConexion();
        String sql = "INSERT INTO estudiantes(nombre, apellido, telefono, email) " +
                " VALUES(?, ?, ?, ?)";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
            ps.execute();
            return true;
        } catch (Exception e){
            System.out.println("Error al agregar estudiante: " + e.getMessage());
        }
        finally {
            try {
                con.close();
            } catch(Exception e){
                System.out.println("Error al cerrar conexion: " + e.getMessage());
            }
        }
        return false;
    }

    public boolean modificarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConexion();
        String sql = "UPDATE estudiantes SET nombre=?, apellido=?, telefono=?, " +
                " email=? WHERE id_estudiante = ?";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
            ps.setInt(5, estudiante.getIdEstudiante());
            ps.execute();
            return true;
        } catch(Exception e){
            System.out.println("Error al modificar estudiante: " + e.getMessage());
        }
        finally {
            try{
                con.close();
            } catch (Exception e){
                System.out.println("Error al cerrar conexion: " + e.getMessage());
            }
        }
        return false;
    }

    public boolean eliminarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConexion();
        String sql = "DELETE FROM estudiantes WHERE id_estudiante = ?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, estudiante.getIdEstudiante());
            ps.execute();
            return true;
        } catch(Exception e){
            System.out.println("Error al eliminar estudiante: " + e.getMessage());
        }
        finally {
            try{
                con.close();
            } catch(Exception e){
                System.out.println("Error al cerrar conexion: " + e.getMessage());
            }
        }
        return false;
    }

    public static void main(String[] args) {
        var estudianteDao = new EstudianteDAO();
        System.out.println("Listado estudiantes: ");
        List<Estudiante> estudiantes = estudianteDao.listarEstudiantes();
        estudiantes.forEach(System.out::println);

        //Buscar por id
        var estudiante1 = new Estudiante(2);
        System.out.println("Estudiante antes de la busqueda: " + estudiante1);

        var encontrado = estudianteDao.buscarEstudiantePorId(estudiante1);
        if (encontrado)
            System.out.println("Estudiante encontrado: " + estudiante1);
        else
            System.out.println("No encontrado el estudiante: "+ estudiante1);
    }
}
