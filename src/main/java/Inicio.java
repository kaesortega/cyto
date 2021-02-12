import java.util.Scanner;

public class Inicio {

    public static void main(String[] args) {


        Login login = new Login();

        if (login.isState() == true) {
            Administrador admin = new Administrador(login.getNameUser(),
                                                login.getLastnameUser(),
                                                login.getDiUser(),
                                                login.getNickName(),
                                                login.getPassword());


            String msjInicio = "================================" + "\n";
            msjInicio += "Bienvenido escoja una opcion\n";
            msjInicio += "===================================\n\n\n";
            System.out.println(msjInicio);

            int response = 0;
            Scanner sc = new Scanner(System.in);
            do {


                String msjMenu = "============================\n";
                msjMenu += "Opciones\n";
                msjMenu += "=============================\n";
                msjMenu += "[1] Cambiar la clave del administrador\n";
                msjMenu += "[2] Cambiar correo\n";
                msjMenu += "[3] salir\n";
                System.out.println(msjMenu);
                response = sc.nextInt();

                switch (response){
                    case 1:
                        administratorService.cambiarClave(admin);
                        return;
                    case 2:
                        administratorService.cambiarCorreo();
                        return;
                }




            } while (response != 3);

        /*String msjInicio = "================================"+"\n";
        msjInicio += "Bienvenido escoja una opcion\n";
        msjInicio += "===================================\n\n\n";
        System.out.println(msjInicio);

        int response = 0;
        Scanner sc = new Scanner(System.in);
        do {


            String msjMenu = "============================\n";
            msjMenu += "Opciones\n";
            msjMenu += "=============================\n";
            msjMenu +="[1] Cambiar la clave del administrador\n";
            msjMenu +="[2] Cambiar correo\n";
            msjMenu +="[3] salir\n";
            System.out.println(msjMenu);
            response = sc.nextInt();

            switch (response){
                case 1:
                    administratorService.cambiarClave();
                    return;
                case 2:
                    administratorService.cambiarCorreo();
                    return;
            }

        }while (response !=3);*/

        }
    }

}
