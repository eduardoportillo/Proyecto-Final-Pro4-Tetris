package socket.listas;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

import socket.chat.Mensaje;

public class ListaMensajes {
    private static ArrayList<Mensaje> listaMensajes;
    private PropertyChangeSupport observed = new PropertyChangeSupport(this);

    public static ArrayList<Mensaje> getListasessiones() {
        if (listaMensajes == null) {
            listaMensajes = new ArrayList<Mensaje>();
        }
        return listaMensajes;
    }

    public static void setMensaje(Mensaje msm) {
        ListaMensajes.getListasessiones().add(msm);
    }

    public void addObserver(PropertyChangeListener panel) {
        observed.addPropertyChangeListener(panel);
    }
}
