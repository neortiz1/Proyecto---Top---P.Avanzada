/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;

/**
 *
 * @author Alexander
 */
public class CObjectsHoleSingleton {
    //private static CObjectsHoleSingleton instanciaUnica = new CObjectsHoleSingleton();
    private static ArrayList<CImages> objtsHoles = new ArrayList<CImages>();
    
    private CObjectsHoleSingleton() {}
    
    private synchronized static void createInstance() {
        if (objtsHoles == null) { 
            objtsHoles = new ArrayList<CImages>();
        }
    }
    
    public static ArrayList<CImages> getInstance() {
        createInstance();
        return objtsHoles;
    }
    
    public void addObjts(CImages imgObj){
        objtsHoles.add(imgObj);
    }
}
