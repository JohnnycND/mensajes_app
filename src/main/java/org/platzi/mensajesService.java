package org.platzi;

import java.util.Scanner;

public class mensajesService {

    public static void crearMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje: ");
        String mensaje = sc.nextLine();

        System.out.println("Autor: ");
        String autor = sc.nextLine();

        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(autor);

        MensajesDAO.crearMensajeDB(registro);
    }

    public static void listarMensajes(){

    }

    public static void borrarMensaje(){

    }

    public static void editarMensaje(){

    }

}
