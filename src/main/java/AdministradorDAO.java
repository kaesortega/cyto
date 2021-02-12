import ch.qos.logback.core.FileAppender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AdministradorDAO {

    public static void cambiarClaveDB(Administrador admin, String newClave){
        Conexion db_connect = new Conexion();

        try(Connection conexion = db_connect.getConnection()){
            PreparedStatement ps = null;
            try {
                String query = "UPDATE administrador SET administrador.clave = ? WHERE correo ='"+admin.getCorreo()+"'";
                ps = conexion.prepareStatement(query);

                ps.setString(1,newClave);
                ps.executeUpdate();
                System.out.println("Contraseña cambiada");

            }catch (SQLException ex){
                System.out.println(ex);
            }

        }catch (SQLException e){
            System.out.println(e);
        }
    }

    public static void cambiarCorreoDB(Administrador admin,String newCorreo){
        Conexion db_connect = new Conexion();

        try(Connection conexion = db_connect.getConnection()){
            PreparedStatement ps = null;
            try {
                String query = "UPDATE administrador SET correo = ? WHERE correo =" + admin.getCorreo();
                ps = conexion.prepareStatement(query);
                ps.setString(1,newCorreo);
            }catch (SQLException ex){
                System.out.println(ex);
            }

        }catch (SQLException e){
            System.out.println(e);
        }
    }

}
