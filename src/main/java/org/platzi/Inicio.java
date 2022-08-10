package org.platzi;

import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do{
            System.out.println("-------------");
            System.out.println(" Aplicacion de mensajes ");
            System.out.println(" 1.Crear mensaje");
            System.out.println(" 2. Listar menseje");
            System.out.println(" 5. Editar mensaje ");
            System.out.println(" 4. Eliminar mensaje");
            System.out.println(" 5. Salir");

            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    mensajesService.crearMensaje();
                    break;
                case 2:
                    mensajesService.listarMensajes();
                    break;
                case 3:
                    mensajesService.borrarMensaje();
                    break;
                case 4:
                    mensajesService.editarMensaje();
                    break;
                default:
                    break;
            }

        }while(opcion != 5);


    }
}
