import java.util.Random;

public class Consumer implements Runnable {
    private Drop drop;

    public Consumer(Drop drop) {
        this.drop = drop;
    }

    public void run() {
        Random random = new Random();

        boolean flag = true;
        while (flag) {
            String message = drop.take();
            if (!message.equals("DONE")) {
                System.out.format("MESSAGE RECEIVED: %s%n", message);
                try {
                    Thread.sleep(random.nextInt(5000));
                } catch (InterruptedException e) {
                }
            } else {
                flag = false;
            }
        }
    }
}