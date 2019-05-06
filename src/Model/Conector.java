package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.net.*;
import java.io.*;
import LibScore.*;
/**
 *
 * @author Alexander
 */
public class Conector {
    
    Socket cliente;
    int puerto = 9000;
    String ipServer = "192.168.1.14";
    
    public void start(String ip,int score,int attempts,int hits,int fails){
        try{
            cliente = new Socket(ipServer,puerto);
            CScore datos=new CScore();
            datos.setIp(ip);
            datos.setScore(score);
            datos.setAttempts(attempts);
            datos.setHits(hits);
            datos.setFails(fails);
            
            ObjectOutputStream paquete_datos=new ObjectOutputStream(cliente.getOutputStream()); //flujo de salida par enviar
            
            paquete_datos.writeObject(datos);
            cliente.close();
            
            /*
            DataOutputStream flujo_Salida=new DataOutputStream(cliente.getOutputStream());
            flujo_Salida.writeUTF(txt);
            flujo_Salida.close();
            */
        }catch(Exception e){
            
        }
    }
}
