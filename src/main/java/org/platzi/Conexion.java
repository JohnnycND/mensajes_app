package org.platzi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection get_connection(){
        Connection connection = null;
        try {
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app", "root", "");
            System.out.println(connection!=null ? "Connexion exitosa!": "");
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
