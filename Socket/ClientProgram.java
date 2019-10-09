import java.io.*;
import java.util.*;
import java.lang.*;
import java.net.*;

public class ClientProgram implements Runnable {
    int clientport=10,severport=20;
        DatagramSocket ds;
        Thread recThread;
        ClientProgram() throws Exception
        {
            ds=new DatagramSocket(clientport);
            recThread=new Thread(this);
            recThread.start();
        }

        public void run()
        {
            byte b[]=new byte[1000];
            while(true)
            {
                try{
                DatagramPacket dp =new DatagramPacket(b, b.length);
                ds.receive(dp);
                String data=new String(b,0,dp.getLength());
                System.out.println("Server:"+data);
                }catch(Exception e){}
            }
        }
        
    public static void main(String agrs[]) {
        try{
        ClientProgram s=new ClientProgram();
        }catch(Exception e){}
    }
}
