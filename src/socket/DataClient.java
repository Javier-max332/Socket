/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.Socket;

import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Javier
 */
public class DataClient {
    
    public static void main(String[] args) {
        try {
            Socket sock = new Socket("127.0.0.1", 6013);
            InputStream in = sock.getInputStream();
            
            BufferedReader bin = new BufferedReader
                    (new InputStreamReader(in));
            
            String line;
            while( (line = bin.readLine()) != null)
                    System.out.println(line);
            
            sock.close();
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
