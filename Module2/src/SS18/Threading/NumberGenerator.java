package SS18.Threading;

public class NumberGenerator implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<10;i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread thread=new Thread(new NumberGenerator());
        Thread thread1=new Thread(new NumberGenerator());
        thread.start();
        thread1.start();
    }
}
