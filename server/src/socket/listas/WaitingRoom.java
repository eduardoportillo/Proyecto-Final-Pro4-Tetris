package socket.listas;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.json.JSONArray;
import org.json.JSONObject;

import socket.server.SocketSession;

public class WaitingRoom {
    public ArrayList<SocketSession> listaSessions;

    private String id;
    private Date fecha;
    private SocketSession ownerWR;

    public WaitingRoom(SocketSession sesion) {
        this.id = UUID.randomUUID().toString();
        this.fecha = new Date();
        ownerWR = sesion;
        listaSessions = new ArrayList<>();
        listaSessions.add(ownerWR);
        Lobby.getInstance().addWR(this);
    }

    public ArrayList<SocketSession> getlistaSessions() {
        return listaSessions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<SocketSession> getListaSessions() {
        return listaSessions;
    }

    public void setListaSessions(ArrayList<SocketSession> listaSessions) {
        this.listaSessions = listaSessions;
    }

    public SocketSession getOwnerWR() {
        return ownerWR;
    }

    public void setOwnerWR(SocketSession ownerWR) {
        this.ownerWR = ownerWR;
    }


    public Date getFecha() {
        return fecha;
    }
    

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "WaitingRoom [fecha=" + fecha + ", id=" + id + ", listaSessions=" + listaSessions + ", ownerWR="
                + ownerWR + "]";
    }


    public JSONObject toJson(){

        JSONObject WRAtribut = new JSONObject();

        WRAtribut.put("WRId", this.getId());
        WRAtribut.put("ownerName", this.getOwnerWR().getSesionName());
        WRAtribut.put("fecha", this.getFecha());

        JSONArray listaSession = new JSONArray();


        for (int i = 0; i < listaSessions.size(); i++) {
            listaSession.put( listaSessions.get(i).toJson());
        }

        WRAtribut.put("listaSession",listaSession);
        return WRAtribut;
    }
}
