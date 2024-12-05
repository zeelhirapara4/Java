// Create a multithreaded program by creating following two classes: 
// OddThread class is a subclass of Thread which displays odd number between 1 to 100 
// at every half second. And PrimeThread class implements Runnable interface which 
// displays prime number between 1 to 100 at every second.  Create objects of the above 
// classes and they will execute concurrently. 
class OddThread extends Thread {
    public void run() {
        for (int i = 1; i < 100; i += 2) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
                ;
            }
            System.out.println("Odd : " + i);
        }
    }
}

class PrimeThread implements Runnable {
    public void run() {
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("Prime : " + i);
            }
        }

    }

    private boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class PR13 {
    public static void main(String[] args) {
        OddThread od = new OddThread();
        Thread pm = new Thread(new PrimeThread());
        od.start();
        pm.start();

    }
}
