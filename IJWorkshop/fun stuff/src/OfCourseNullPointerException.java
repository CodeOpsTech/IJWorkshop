package start;

class Vehicle {
    public static void execute() {
        System.out.println("running the vehicle");
    }
}

public class OfCourseNullPointerException {
    public static void main(String[] args) {
        Vehicle stolen = null;
        stolen.execute();
    }
}
