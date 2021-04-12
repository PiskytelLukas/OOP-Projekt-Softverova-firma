package Employees;

public class Employee {

    private int id;
    private boolean isFree = true;
    private double workTime = 1;
    private double reworkTime = 1.5;

    boolean isFree(boolean isFree) {

        if (isFree == true) {
            return true;
        } else {
            return false;
        }
    }

    public void setId(int i) {

        this.id = i;

    }

    public int getId() {

        return this.id;

    }

    public boolean isEmployeeFree() {

        if (this.isFree == true) {

            return true;

        } else {

            return false;

        }

    }

    public double getEmployeeWorkTime() {

        return this.workTime;

    }

    public double getEmployeeReworkTime() {

        return this.reworkTime;

    }

}
