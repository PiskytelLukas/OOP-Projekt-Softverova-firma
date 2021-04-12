package Employees;

public class FrontendDeveloper extends Employee {

    String type = "Frontend Developer";
    double workTime = 1.75;
    double reworkTime = 1.85;

    public FrontendDeveloper(int count) {

        setId(count);

    }

    boolean makeNewFrontendCode(double workTime) {

        // Some code here;

        if (true) {
            return true;
        } else {
            return false;
        }

    }

    boolean recodeFrontendCode(double reworkTime) {

        // Some code here;

        if (true) {
            return true;
        } else {
            return false;
        }

    }
}
