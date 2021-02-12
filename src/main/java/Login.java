import java.sql.*;
import java.util.Scanner;

public class Login {
    private String nameUser;
    private String lastnameUser;
    private String diUser;
    private String nickName;
    private String password;
    private boolean state;


    public String getNameUser() {
        return this.nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getLastnameUser() {
        return this.lastnameUser;
    }

    public void setLastnameUser(String lastnameUser) {
        this.lastnameUser = lastnameUser;
    }

    public String getDiUser() {
        return this.diUser;
    }

    public void setDiUser(String diUser) {
        this.diUser = diUser;
    }

    public String getNickName() {
        return this.nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    Login(){
        System.out.println("===========================================");
        System.out.println("BIENVENIDO AL SISTEMA DE INICIO DE SESION");
        System.out.println("===========================================");
        Scanner sc = new Scanner(System.in);
        System.out.println("Correo:");
        String nickName = sc.nextLine();
        System.out.println("Clave:");
        String password = sc.nextLine();

        this.nickName = nickName;
        this.password = password;

        Conexion db_connect = new Conexion();
        try (Connection conexion = db_connect.getConnection()){
            PreparedStatement ps = null;
            ResultSet confirmationLogin = null;
            try{
                String query = "SELECT administrador.nombre, administrador.apellido, administrador.di, administrador.correo, administrador.clave FROM administrador WHERE correo = ? AND clave = ?";
                ps = conexion.prepareStatement(query);
                ps.setString(1,this.nickName);
                ps.setString(2,this.password);
                confirmationLogin = ps.executeQuery();

                if (confirmationLogin != null && confirmationLogin.next()){
                    System.out.println("Sesion iniciada");
                    this.state = true;
                    this.nameUser = confirmationLogin.getObject(1).toString();
                    this.lastnameUser = confirmationLogin.getObject(2).toString();
                    this.diUser = confirmationLogin.getObject(3).toString();
                }else {
                    System.out.println("Contraseña o correo incorrectos");
                    this.state = false;
                }

            }catch (SQLException e){
                System.out.println(e);
                System.out.println("block 16-27");
            }
        }catch (SQLException e){
            System.out.println(e);
            System.out.println("block 14-15");
        }



    }
}
