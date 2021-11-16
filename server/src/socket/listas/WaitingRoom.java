package socket.listas;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

import org.json.JSONArray;
import org.json.JSONObject;

import socket.server.SocketSession;

public class WaitingRoom {

    public HashMap<String,SocketSession> HMSessions = new HashMap<>();

    private String id;
    private Date fecha;
    private SocketSession sesion;

    public WaitingRoom(SocketSession sesion) {
        this.id = UUID.randomUUID().toString();
        this.fecha = new Date();
        this.sesion = sesion;
        HMSessions.put(sesion.getKey(), sesion);
        Lobby.getInstance().addWR(id,this);
        sesion.setWaitingRoom(this);
    }

    public void removeSesion(SocketSession sesion){
        HMSessions.remove(sesion.getKey());
        if(HMSessions.size()<= 0 ){
            Lobby.getInstance().HMWaitingRoom.remove(this.getId());
        }
    }

    public JSONObject toJson(){

        JSONObject WRAtribut = new JSONObject();

        WRAtribut.put("WRId", this.getId());
        WRAtribut.put("ownerName", sesion.getSesionName());
        WRAtribut.put("fecha", this.getFecha());

        JSONArray listaSession = new JSONArray();

        HMSessions.forEach((k,v) ->  listaSession.put(v.toJson()));

        WRAtribut.put("listaSession",listaSession);
        return WRAtribut;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }
    

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
