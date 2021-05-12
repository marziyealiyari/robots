package robot;

import java.util.Arrays;
import java.util.List;

public class robottest {

    public static void main(String[] args) {

//        robots smallRobot = robatFactory.createRobot("smallRobot");
//        robots bigRobot = robatFactory.createRobot("bigRobot");
//        robots regular = robatFactory.createRobot("");
//        controlCenter controller = new controlCenter();
//        controller.addObserver(smallRobot);
//        controller.addObserver(bigRobot);
//        controller.addObserver(regular);
//        controller.change();

        //Java 8 Stream API
        List<robots> myList =
                Arrays.asList(robatFactory.createRobot("bigRobot"), robatFactory.createRobot("smallRobot"), robatFactory.createRobot(""));
        controlCenter controller = new controlCenter();
        myList
                .forEach(controller::addObserver);
        controller.change();

    }
}
