/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;

/**
 *
 * @author Javier
 */
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket sock = new ServerSocket(6013);
            
            while(true) {
                try (Socket client = sock.accept()) {
                    PrintWriter pout = new
                            PrintWriter(client.getOutputStream(), true);
                    
                    pout.println(new java.util.Date().toString());

                }
                
            }
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
