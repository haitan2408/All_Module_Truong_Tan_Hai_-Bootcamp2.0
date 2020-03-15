package SS18.Threading.hien_thi_so_chan_le;

public class TestThread {


    public static void main(String[] args) {
        OddThread oddThread=new OddThread();
        EvenThread evenThread=new EvenThread();
        evenThread.start();
        try {
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        oddThread.start();

    }
}
