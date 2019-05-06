
import Controller.*;
import View.FrmMenuPrincipal;
import View.FrmPlay;
import java.awt.*;
import java.util.*;
import javax.swing.JOptionPane;
import LibTimer.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexander
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        
        /*
        CImages imgs=new CImages();
        imgs.create();
        
        FrmPlay objfrm=new FrmPlay();
        objfrm.show();

        //Para ubicar el PROGRESSBAR abajo del FRMPLAY
        Dimension height=objfrm.getSize();
        Point po=new Point();
        po=objfrm.getLocation();
        
        //instancio el reloj de juego
        CTimer frame = new CTimer();
        frame.setUndecorated(true); //desactivar la barra superior del frame
        frame.setMinimumSize(new Dimension(850, 20));
        frame.relocation(frame,po.x+8,height.height+po.y-8);
        frame.display(frame);
        frame.iterate(10); //mando como parametro los segundos del juego
        //frame.end();
        */
        
        FrmMenuPrincipal objfrm=new FrmMenuPrincipal();
        objfrm.show();
        
    }
}
