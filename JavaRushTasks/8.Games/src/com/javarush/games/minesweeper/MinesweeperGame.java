package com.javarush.games.minesweeper;

import com.javarush.engine.cell.Game;

public class MinesweeperGame extends Game {

    private static final int SIDE = 9;

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
    }
}
