package UIComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.image.*;

public class ruddy {

    int x=0;
    int y=0;
    int width=0;
    int height=0;
    JFrame index;
    
    public static void main(String[] args) {
        ruddy ruddy = new ruddy();
        
    }

    public ruddy(){
        index = new JFrame("Index");
        index.setLayout(null);
        index.setExtendedState(JFrame.MAXIMIZED_BOTH);
        index.setVisible(true);
        index.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        width=index.getWidth();
        height=index.getHeight();
        titulo("Hola mundo");
    }

    private void titulo(String titulo){
        JLabel jlTitulo = new JLabel("Bienvenido al Loby");
        jlTitulo.setBounds(getWidth(50)-getWidth(20)/2, 50, getWidth(20), 40);

        JPanel panel = new JPanel();
        panel.setBounds(getWidth(5), 80, getWidth(90)-getWidth(5), getHeigth(100)-80);
        panel.setBackground(Color.red);
        
        index.add(jlTitulo);
        index.add(panel);
        index.repaint();
    }

    public void addCard(String nombre, String apellido){
        JPanel card = new JPanel();
        card.setBackground(Color.green);
        

    }

    public int getWidth(double porcentaje){
        return (int)((porcentaje*width)/100);
    }

    public int getHeigth(double porcentaje){
        return (int)((porcentaje*height)/100);
    }
    
}
