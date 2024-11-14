package dev.wotancode.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection getConexion() {
        Connection conexion = null;

        // Colocar aquí el nombre de la base de datos
        var baseDatos = "estudiantes_db";
        // 3306 es el puerto que quedo configurado en la db
        var url = "jdbc:mysql://localhost:3306/" + baseDatos;

        // Es obvio comentarlo, pero estos usuarios se configuraron en el workbench
        var usuario = "root";
        var password = "admin";

        // Cargamos la clase del driver de mysql  en memoria
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, password);
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("Ocurrio un error en la conexion: " + e.getMessage());
        }

        return conexion;
    }

    public static void main(String[] args) {
        var conexion = Conexion.getConexion();
        if (conexion != null)
            System.out.println("Conexion exitosa: " + conexion);
        else {
            System.out.println("Ocurrio un error al conectarse");
        }
    }
}
