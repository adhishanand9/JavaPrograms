import java.io.*;
import java.util.*;
import java.lang.*;
import java.net.*;

public class Example1 {
    public static void main(String agrs[]) {
        try{
        
        Socket s=new Socket("internic.net", 42);
        //s.accept();
        InputStream is=s.getInputStream();

        OutputStream os=s.getOutputStream();
    
        String name="java2s.com\n";
        
        //byte f[]=name.getBytes();
        os.write(name.getBytes());
       
        while(true)
        {
            int x =is.read();
            if(x==-1)
            break;
            System.out.println((char)x);
        }
        s.close();
    }
    catch(Exception e)
    {

    }
    }
}
