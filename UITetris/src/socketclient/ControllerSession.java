package socketclient;

import chat.Mensaje;
import java.beans.PropertyChangeSupport;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Base64;
import java.io.ObjectInputStream;
import listas.ListaMensajes;
import org.json.JSONObject;

public class ControllerSession {

    public ControllerSession(JSONObject json, SocketSession sesion, PropertyChangeSupport observed) {
        switch (json.getString("Type")) {

            case "Chat":
        try {
                byte[] data = Base64.getDecoder().decode(json.getString("Mensaje"));
                ObjectInputStream ois;
                ois = new ObjectInputStream(new ByteArrayInputStream(data));
                Mensaje msn = (Mensaje) ois.readObject();
                ois.close();
                ListaMensajes.setMensaje(msn);
                observed.firePropertyChange("socketSession", "mensaje", msn.getMensaje());

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
