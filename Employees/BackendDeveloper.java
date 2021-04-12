package Employees;

public class BackendDeveloper extends Employee {

    private String type = "Backend Developer";
    private double workTime = 2;
    private double reworkTime = 2.5;

    public BackendDeveloper(int count) {

         setId(count);

    }

    boolean makeNewBackendCode(double workTime) {

        // Some code here;

        if (true) {
            return true;
        } else {
            return false;
        }

    }

    boolean recodeBackendCode(double reworkTime) {

        // Some code here;

        if (true) {
            return true;
        } else {
            return false;
        }

    }

}
