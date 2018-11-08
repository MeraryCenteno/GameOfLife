/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife.ModelAndObjects;

/**
 * @author Hansy Gonzalez
 * @author be_le
 */
public class Celda {
    
    private boolean Alive;
    private int cellsClose;

    public Celda() {
    }

    public Celda(boolean Alive) {
        this.Alive = Alive;
    }

    public boolean getAlive() {
        return Alive;
    }

    public void setAlive(boolean Alive, int cellsClose) {
        this.Alive = Alive;
        this.cellsClose = cellsClose;
    }

}
