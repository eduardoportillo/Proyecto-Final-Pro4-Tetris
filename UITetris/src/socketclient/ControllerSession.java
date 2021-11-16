package socketclient;

import chat.Mensaje;
import java.beans.PropertyChangeSupport;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Base64;
import java.io.ObjectInputStream;
import listas.ListaMensajes;
import org.json.JSONObject;
import ventanas.FrameTetris;
import ventanas.WaitingRoomChat;

public class ControllerSession {

    public ControllerSession(JSONObject json, SocketSession sesion, PropertyChangeSupport observed) {
        switch (json.getString("type")) {
            case "CreateWaitingRoom":
                observed.firePropertyChange("lobby", "", json);
                break;

            case "GetWaitingRooms":
                observed.firePropertyChange("lobby", "", json);
                break;

            case "GetSesionesWR":
                observed.firePropertyChange("lobby", "", json);
                break;

            case "DeleteWaitingRoom":
                observed.firePropertyChange("lobby", "", json);
                break;

            case "StartGame":
                observed.firePropertyChange("lobby", "", json);
                FrameTetris tetris = new FrameTetris(json.getString("idGame"));
                break;

            case "completeLine":
                observed.firePropertyChange("lobby", "", json);
                break;
            case "endGame":
                System.out.println("el juego acabo");
                break;

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
