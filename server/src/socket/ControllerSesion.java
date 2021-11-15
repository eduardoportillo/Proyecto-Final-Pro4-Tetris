package socket;

import java.beans.PropertyChangeSupport;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Base64;

import org.json.JSONObject;

import socket.chat.Mensaje;
import socket.listas.ListaMensajes;
import socket.server.ListaSesiones;
import socket.server.SocketSession;

public class ControllerSesion {

    public ControllerSesion(JSONObject json, SocketSession sesion, PropertyChangeSupport observed) {
        switch (json.getString("type")) {
        case "registarNombre":
            sesion.setName(json.getString("nombreSesion"));
            break;
        case "chat":
        try {
            byte[] data = Base64.getDecoder().decode(json.getString("mensaje"));
            ObjectInputStream ois;
            ois = new ObjectInputStream(new ByteArrayInputStream(data));
            Mensaje msn = (Mensaje) ois.readObject();
            ois.close();
            ListaMensajes.setMensaje(msn);
            observed.firePropertyChange("socketSession", "mensaje", msn.getMensaje());

            for (int i = 0; i < ListaSesiones.getListasessiones().size(); i++) {
                SocketSession ss = (SocketSession) ListaSesiones.getListasessiones().get(i);

                if (!(ss.getKey().equals(sesion.getKey()))) {
                    ListaSesiones.getListasessiones().get(i).sendObject(msn);
                }
                ;
            }

        } catch (IOException e) {
            System.out.println("No se pudo parsear a MENSAJE");
        } catch (ClassNotFoundException e) {
            System.out.println("No se pudo parsear a MENSAJE");
        }
            break;

        default:
            break;
        }
    }

}
