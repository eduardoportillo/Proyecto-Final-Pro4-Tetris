package socket.listas;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import socket.server.ServerS;

public class Lobby {
    private static Lobby instance;
    public static Lobby getInstance(){
        if(instance==null){
            instance = new Lobby();
        }
        return instance;
    }

    public ArrayList<WaitingRoom> WaitingRoomList;

    public Lobby(){
        this.WaitingRoomList = new ArrayList<>();
    }

    public JSONObject toJson(){
        JSONArray listaWRs = new JSONArray();

        JSONObject wrList = new JSONObject();
        wrList.put("type", "GetWaitingRooms");

        for (int i = 0; i < instance.WaitingRoomList.size(); i++) {
            listaWRs.put(instance.WaitingRoomList.get(i).toJson());
        }

        wrList.put("listaWR",listaWRs);
        return wrList;
    }

    public void addWR(WaitingRoom watingRoom){
        this.WaitingRoomList.add(watingRoom);

        JSONObject newWR = new JSONObject();
        newWR.put("type", "CreateWaitingRoom");
        newWR.put("newWaitingRoom", instance.WaitingRoomList.get(WaitingRoomList.size()-1).toJson());
        ServerS.getInstanceServer().sendAll(newWR.toString());
    }
    
}
