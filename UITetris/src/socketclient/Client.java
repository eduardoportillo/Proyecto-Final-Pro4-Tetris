package socketclient;

import org.json.JSONObject;

public class Client {

    private String nameClienteSesion;
    private String serverIp;

    public Client() {
        serverIp = SocketSession.buscarServer();
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public void setNameClienteSesion(String nameClienteSesion) {
        this.nameClienteSesion = nameClienteSesion;
        JSONObject jsonSetNombre = new JSONObject();
        jsonSetNombre.put("Type", "RegistrarNombre");
        jsonSetNombre.put("NombreSesion", nameClienteSesion);
        SocketSession.getInstance(serverIp).sendString(jsonSetNombre.toString());
    }

    public String getServerIp() {
        return serverIp;
    }

    public String getNameClienteSesion() {
        return nameClienteSesion;
    }
}
