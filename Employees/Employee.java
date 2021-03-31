package Employees;

public class Employee {

    int id;
    boolean isFree = true;
    double workTime = 1;
    double reworkTime = 1.5;

    boolean isFree(boolean isFree) {

        if (isFree == true) {
            return true;
        } else {
            return false;
        }
    }

}
