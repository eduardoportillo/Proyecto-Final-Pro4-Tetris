package socket;

import org.json.JSONObject;

import socket.server.SocketSesion;

public class ControllerSesion {
    
    public ControllerSesion(JSONObject json, SocketSesion sesion){
        switch (json.getString("type")) {
            case "registarNombre":
                    sesion.setName(json.getString("nombreSesion"));
                break;
        
            default:
                break;
        }
    }


}
