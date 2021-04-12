package Employees;

public class FrontendDeveloper extends Employee {

    private String type = "Frontend Developer";
    private double workTime = 1.75;
    private double reworkTime = 1.85;

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

    public String getType() {

        return this.type;

    }

}
