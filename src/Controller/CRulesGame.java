/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Alexander
 */
public class CRulesGame {
    
    JFrame frame;

    public CRulesGame() {
    }

    public CRulesGame(JFrame frame) {
        this.frame = frame;
    }

    public int rndHole(){
        Random rnd=new Random();
        int value;
        value=rnd.nextInt(10)+1;
        return value;
    }
    
    public String rndImg(){
        ArrayList<CImages> list=new ArrayList<CImages>();
        list=CObjectsHoleSingleton.getInstance();
        
        Random rnd=new Random();
        String path="";
        int value;
        
        value=rnd.nextInt(4)+1;  
        path=list.get(value-1).getPath();
        
        return path;
    }
    
    public void setHole(JLabel[] lbls){
        ArrayList<CImages> list=new ArrayList<CImages>();
        list=CObjectsHoleSingleton.getInstance();
        
        int num_Hole=rndHole();
        String path_Img=rndImg();
        
        initializeImg(path_Img,lbls[num_Hole-1]);
    }
    
    public void initializeImg(String path,JLabel lbl){
        ImageIcon logo=new ImageIcon(path); //"src/Resources/devil2.png
        lbl.setIcon(logo);
        frame.repaint();
    }
    
    public void blankLbl(JLabel lbl){
        ImageIcon logo=new ImageIcon(""); //"src/Resources/devil2.png
        lbl.setIcon(logo);
        frame.repaint();
    }
}
