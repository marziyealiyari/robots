package robot;

import java.util.Observable;

public class smallRobot extends robots {

    @Override
    public void update(Observable o, Object arg) {
        super.update(o, arg);
        System.out.println("message smallRobot ");
    }

}
