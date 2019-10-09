import java.io.*;
import java.util.*;
import java.lang.*;
import java.net.*;

public class TwoWayCommunicationServer implements Runnable {
    int clientport=10,serverport=20;
    DatagramSocket ds;
    Thread recThread;

    TwoWayCommunicationServer() throws Exception
    {
        ds = new DatagramSocket(serverport);
        recThread=new Thread(this);
        recThread.start();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            String data=br.readLine();
            if(data.equals("EXIT")){
                break;
            }
            DatagramPacket dp=new DatagramPacket(data.getBytes(),data.length(),InetAddress.getLocalHost(),clientport);
            ds.send(dp);
        }
        ds.close();
    }

    public void run() 
    {
        byte b[]=new byte[1000];
        while(true)
        {
            try
            {
                DatagramPacket dp=new DatagramPacket(b,b.length);
                ds.receive(dp);
                String data=new String(b,0,dp.getLength());
                System.out.println(data);

            }catch(Exception E){}
        }
    }

    public static void main(String []args) throws Exception{
        TwoWayCommunicationServer sp=new TwoWayCommunicationServer();
    }
}