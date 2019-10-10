import java.lang.*;

class Buffer {
    void display() {
        System.out.println("Hello");
        try {
            Thread.sleep(500);
        } catch (Exception e) {

        }
        System.out.println("world");
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

public class Threadexample1 {
    public static void main(String agrs[]) {

        Buffer b =new Buffer();
        Demo td1=new Demo(b);
        Demo td2=new Demo(b);

    }
}