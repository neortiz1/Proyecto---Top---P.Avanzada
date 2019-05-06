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
public class CImages {
    private String name;
    private String path;

    public CImages() {

    }
    
    public CImages(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }
    
    public void create(){
        ArrayList<CImages> list=new ArrayList<CImages>();
        list=CObjectsHoleSingleton.getInstance();
        
        CImages img1=new CImages("conejo","Resources\\images\\conejo.png");
        CImages img2=new CImages("topo","Resources\\images\\topo1.png");
        CImages img3=new CImages("topo","Resources\\images\\topo2.png");
        CImages img4=new CImages("roca","Resources\\images\\roca.png");
        list.add(img1);
        list.add(img2);
        list.add(img3);
        list.add(img4);
    }

}
