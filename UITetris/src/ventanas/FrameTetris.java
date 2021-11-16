package ventanas;

import java.awt.Frame;

import tetris.Tetris;

public class FrameTetris extends Frame {

    private Tetris tetris;
    private String idGame;
    public FrameTetris(String idGame) {
        this.idGame = idGame;
        setSize(400, 600);
        setResizable(true);
        // this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // setUndecorated(true);
        setLocationRelativeTo(null);

        tetris = new Tetris(idGame);
        add(tetris);

        setVisible(true);
    }
}
