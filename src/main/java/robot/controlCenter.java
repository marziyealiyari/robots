package robot;

import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;


public class controlCenter extends Observable {

    void change() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                setChanged();
                notifyObservers();
            }
        }, 0, 3000);
    }

}
