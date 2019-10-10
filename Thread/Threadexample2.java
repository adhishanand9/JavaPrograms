import java.lang.*;

class Buffer {
     int no;
    void display() {
        no++;
        
        try {
        Thread.sleep(1000);
        }catch(Exception e) {

        }
        synchronized: System.out.println("Thread "+no);
    }
}

class Demo extends Thread {
    Buffer b;
    Demo(Buffer b) {
        this.b=b;
        start();
    }
    public void run() {
        b.display();
    }
}

public class Threadexample2 {
    public static void main(String agrs[]) {

        Buffer b =new Buffer();
        Demo td1=new Demo(b);
        Demo td2=new Demo(b);
        //System.out.println("Final is"+Buffer.no);
    }
}