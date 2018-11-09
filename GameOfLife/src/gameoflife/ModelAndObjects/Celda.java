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
    
    private Boolean Alive;
    private int cellsClose;
    private Boolean nextGen;

    public Celda() {
    }

    public Celda(Boolean Alive, int cellsClose, Boolean nextGen) {
        this.Alive = Alive;
        this.cellsClose = cellsClose;
        this.nextGen = nextGen;
    }

    public Boolean getAlive() {
        return Alive;
    }

    public void setAlive(Boolean Alive) {
        this.Alive = Alive;
    }

    public int getCellsClose() {
        return cellsClose;
    }

    public void setCellsClose(int cellsClose) {
        this.cellsClose = cellsClose;
    }

    public Boolean getNextGen() {
        return nextGen;
    }

    public void setNextGen(Boolean nextGen) {
        this.nextGen = nextGen;
    }



}
