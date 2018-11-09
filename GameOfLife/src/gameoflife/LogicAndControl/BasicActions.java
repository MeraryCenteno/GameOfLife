/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife.LogicAndControl;

import gameoflife.ModelAndObjects.Celda;

/**
 *
 * @author Hansy Gonzalez
 */
public class BasicActions {
    
    static String toPrint(Celda[][] matriz) {
        String printer = "";
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j].getAlive()) {
                    printer += "□ ";
                } else {
                    printer += "■ ";
                }
            }
            printer += "\n";
        }
        return printer;
    }
    
    public static void toSet(Celda celda) {
        if (celda.getAlive()) {
            if (celda.getCellsClose() == 2 || celda.getCellsClose() == 3) {
                celda.setNextGen(Boolean.TRUE);
            } else {
                celda.setNextGen(Boolean.FALSE);
            }
        } else {
            if (celda.getCellsClose() == 3) {
                celda.setNextGen(Boolean.TRUE);
            } else {
                celda.setNextGen(Boolean.FALSE);
            }
            
        }
    }
    public static void toApply(Celda[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(matriz[i][j].getNextGen()){
                    matriz[i][j].setAlive(Boolean.TRUE);
                }else{
                 matriz[i][j].setAlive(Boolean.FALSE);
                }
            }
        }
    }
    public static void toRandom(Celda[][] matriz){
        int random;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                random = (int) (Math.random() * 2);
                if(random==1){
                matriz[i][j].setAlive(Boolean.TRUE);
                }else{
                matriz[i][j].setAlive(Boolean.FALSE);
                }
            }
        }
    
    }
}
