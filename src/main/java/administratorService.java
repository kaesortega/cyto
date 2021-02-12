import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class administratorService {

    public static void cambiarClave(Administrador admin){
        Scanner sc = new Scanner(System.in);
        String msjCambiarClave = "======================================\n";
        msjCambiarClave += "Bienvenido al sistema de cambio de claves\n";
        msjCambiarClave += "=====================================\n\n";
        System.out.println(msjCambiarClave);
        System.out.println("Ingrese clave actual: ");
        String actualityClave = sc.nextLine();
        if (actualityClave.equals(admin.getClave())){
            System.out.println("Ingrese nueva clave");
            String newClave = sc.nextLine();
            AdministradorDAO.cambiarClaveDB(admin,newClave);
        }else{
            System.out.println("la clave ingresada no coincide con la actual");
        }



    }

    public static void cambiarCorreo(){

    }

}
