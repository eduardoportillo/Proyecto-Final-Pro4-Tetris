package socket.server;

import java.util.ArrayList;

public class Sesion {

    private static ArrayList<SocketSesion> listasessiones;

    public static ArrayList<SocketSesion> getListasessiones() {
        if (listasessiones == null) {
            listasessiones = new ArrayList<SocketSesion>();
        }
        return listasessiones;
    }
}
