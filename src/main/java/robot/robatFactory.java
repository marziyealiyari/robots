package robot;

public class robatFactory {

    static robots createRobot(String type) {
        robots robot;
        switch (type) {
            case "smallRobot":
                robot = new smallRobot() {
                };
                break;
            case "bigRobot":
                robot = new bigRobot();
                break;
            default:
                robot = new regularRobot();
        }
        return robot;
    }

}
