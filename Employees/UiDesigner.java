package Employees;

public class UiDesigner extends Employee {

    private String type = "UI Designer";
    private double workTime = 1.95;
    private double reworkTime = 2.1;

    public UiDesigner(int count) {

        setId(count);

    }

    boolean makeNewUI(double workTime) {

        // Some code here;

        if (true) {
            return true;
        } else {
            return false;
        }

    }

    boolean reworkUI(double reworkTime) {

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
