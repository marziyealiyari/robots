package robot;

import java.math.BigDecimal;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

abstract class robots implements Observer {
    private static BigDecimal resource1 = new BigDecimal(0);
    private ExecutorService executor = Executors.newFixedThreadPool(3);

    private synchronized static BigDecimal increase() {
        resource1 = resource1.add(BigDecimal.valueOf(1));
        return resource1;
    }

    public void update(Observable o, Object arg) {
        executor.submit(() -> System.out.println(robots.increase()));
        //  new Thread(() -> robots.resource1.add(BigDecimal.valueOf(1))).start();
        //  System.out.println(robots.increase());
    }

}
