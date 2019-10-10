import java.io.*;
import java.util.*;
import java.lang.*;
import java.net.*;

public class SeverProgram {
    int clientport=10,severport=20;
        DatagramSocket ds;
        SeverProgram() throws Exception
        {
            ds=new DatagramSocket(severport);
            System.out.println("Chat is open on "+ 20);
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            while(true)
            {
                System.out.print("Enter chat :");
                String data=br.readLine();
                if(data.equals("EXIT"))
                break;
                DatagramPacket dp=new DatagramPacket(data.getBytes(),data.length(),InetAddress.getLocalHost(),clientport);
                ds.send(dp);
            }
        }
        
    public static void main(String agrs[]) {
        try{
        SeverProgram s=new SeverProgram();
        }catch(Exception e){}
    }
}
