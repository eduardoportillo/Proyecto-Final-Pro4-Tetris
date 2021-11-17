package ventanas;

import java.awt.Frame;

import tetris.Tetris;

public class FrameTetris extends Frame {

    private Tetris tetris;
    
    public FrameTetris(String idGame, String idJugador) {
        
        this.setTitle("Sesion del Jugador: "+idJugador);
        setSize(400, 600);
        setResizable(true);
        setLocationRelativeTo(null);

        tetris = new Tetris(idGame, idJugador);
        add(tetris);

        setVisible(true);
    }
}
