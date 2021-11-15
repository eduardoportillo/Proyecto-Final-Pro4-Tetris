package socketclient;

import org.json.JSONObject;

public class Client {
    private String nameClienteSesion;
    private String serverIp;

    public Client(){
        serverIp= SessionClienteSocket.buscarServer();
        JSONObject jsonMensaje = new JSONObject();
        jsonMensaje.put("componet", "cliente");
        jsonMensaje.put("type", "registrarNombre");
        jsonMensaje.put("nombreSesion", nameClienteSesion);
        SessionClienteSocket.getInstance(serverIp).sendString(jsonMensaje.toString());
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }
    public void setNameClienteSesion(String nameClienteSesion) {
        this.nameClienteSesion = nameClienteSesion;
    }

    public String getServerIp() {
        return serverIp;
    }

    public String getNameClienteSesion() {
        return nameClienteSesion;
    }
}

