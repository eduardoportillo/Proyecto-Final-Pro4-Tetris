package socket;

import java.beans.PropertyChangeSupport;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Base64;

import org.json.JSONArray;
import org.json.JSONObject;

import socket.chat.Mensaje;
import socket.listas.*;
import socket.server.ListaSesiones;
import socket.server.ServerS;
import socket.server.SocketSession;

public class ControllerSesion {

    public ControllerSesion(JSONObject json, SocketSession sesion, PropertyChangeSupport observed) {
        switch (json.getString("type")) {
        case "RegistrarNombre":
            sesion.setSesionName(json.getString("NombreSesion"));
            sesion.onOpen();
            break;

        case "GetWaitingRooms":
            ServerS.getInstanceServer().sendAll(Lobby.getInstance().toJson().toString());
            break;

        case "CreateWaitingRoom":
            new WaitingRoom(sesion);
            break;

        case "SendSessionWR":
            WaitingRoom waitingRoom = Lobby.getInstance().HMWaitingRoom.get(json.get("WRId"));
            waitingRoom.HMSessions.put(sesion.getKey(), sesion);
            sesion.setWaitingRoom(waitingRoom);

            JSONObject jsonGetSesionesWR = new JSONObject();
            JSONArray sessionesWR = new JSONArray();

            jsonGetSesionesWR.put("type", "GetSesionesWR");
            Lobby.getInstance().HMWaitingRoom.get(json.get("WRId")).HMSessions
                    .forEach((k, v) -> sessionesWR.put(v.toJson()));
            jsonGetSesionesWR.put("sessionesWR", sessionesWR);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            ServerS.getInstanceServer().sendAll(jsonGetSesionesWR.toString());
            break;
        case "changeReady":
            sesion.setIsReady(json.getBoolean("isReady"));
            break;
        default:
            try {
                byte[] data = Base64.getDecoder().decode(json.getString("Mensaje"));
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
        case "StartGame":
            String idWR = json.getString("WRId");
            WaitingRoom wr = Lobby.getInstance().HMWaitingRoom.get(idWR);
            wr.startGame();
            break;
        case "completeLine":
            Game.games.get(json.getString("idGame")).completeLine(sesion);
            break;
        case "loseGame":
            Game.games.get(json.getString("idGame")).loseGame(sesion);
            break;
        }
    }

}
