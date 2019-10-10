import java.lang.*;

class Demo extends Thread implements Runnable {
    Demo() {
        start();
    }
    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println("child"+i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
}

public class Threadexample {
    public static void main(String agrs[]) {
        Demo dt=new Demo();

        for(int i=1;i<=5;i++) {
            System.out.println("parent"+i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
}