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

    public ControllerSession(JSONObject json, SocketSession sesionServer, PropertyChangeSupport observed) {
        switch (json.getString("type")) {
            case "CreateWaitingRoom":
                observed.firePropertyChange("CreateWaitingRoom", "", json);
                break;

            case "GetWaitingRooms":
                observed.firePropertyChange("GetWaitingRooms", "", json);
                break;

            case "GetSesionesWR":
                observed.firePropertyChange("GetSesionesWR", "", json);
                break;

            case "DeleteWaitingRoom":
                observed.firePropertyChange("DeleteWaitingRoom", "", json);
                break;

            case "StartGame":
                observed.firePropertyChange("StartGame", "", json);
                FrameTetris tetris = new FrameTetris(json.getString("idGame"), SocketSession.getInstance("mensaje").getKey());
                break;

            case "completeLine":
                observed.firePropertyChange("lobby", "", json);
                break;
            case "endGame":
                System.out.println("el juego acabo");
                break;

            case "Chat":
                switch (json.getString("mensajeType")) {
                    case "text":
                        observed.firePropertyChange("mensajeChat", "", json);
                        break;

                    case "imagen":

                        break;
                }
                break;

            default:
                break;
        }
    }
}
