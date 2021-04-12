package GUI;

/*

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

*/

import Employees.BackendDeveloper;
import Employees.Employee;
import Employees.FrontendDeveloper;
import Employees.UiDesigner;

import java.util.Scanner;  // Import the Scanner class

//public class MainGUI extends Application {
public class MainGUI {

    /*

    @Override
    public void start(Stage mainWindow) {

        FlowPane pane = new FlowPane();
        mainWindow.setTitle("OOP Projekt - Sprava softverovej firmy");

        Button newEmployees = new Button("Pridat zamestnancov");

        StackPane r = new StackPane();

        r.getChildren().add(newEmployees);

        // create a scene
        Scene mainScene = new Scene(r, 1000, 600);

        // set the scene
        mainWindow.setScene(mainScene);

        mainWindow.show();

    }

     */

    static void mainMenu() {

        System.out.println("MENU:\n\n\n1. Pridat zamesnancov\n2. Zadat projekt\n3. Koniec");
        Scanner mainMenuScanner = new Scanner(System.in);
        int choose = mainMenuScanner.nextInt();

        switch (choose) {

            case 1: {
                addEmployees();
                break;
            }

            case 2: {

                break;
            }

            case 3: {
                return;
            }

            default: {
                System.out.println("Zadany prikaz neexistuje.");
                mainMenu();
                break;
            }

        }


    }

    static void addEmployees() {

        Scanner addEmployeesScanner = new Scanner(System.in);
        System.out.println("Enter count of employees (MAX 100, count 0 and type 0 == back to main menu): ");
        int count = addEmployeesScanner.nextInt();
        System.out.println("Enter employees type: ");
        addEmployeesScanner.nextLine();
        String employeesType = addEmployeesScanner.nextLine();

        if (count == 0) {

            mainMenu();

        } else {

            switch (employeesType) {

                case "Backend Developer": {

                    BackendDeveloper[] backendDevelopers = {};
                    backendDevelopers = new BackendDeveloper[100];

                    for (int i = 0; i < count; i++) {

                        backendDevelopers[i] = new BackendDeveloper(i);

                    }

                    /* Developer message
                    for (int i = 0; i < count; i++) {

                        System.out.println("Developer cislo: " + backendDevelopers[i].getId());

                    }
                    */
                    break;
                }

                case "Frontend Developer": {

                    FrontendDeveloper[] frontendDevelopers = {};
                    frontendDevelopers = new FrontendDeveloper[100];

                    for (int i = 0; i < count; i++) {

                        frontendDevelopers[i] = new FrontendDeveloper(i);

                    }

                    break;
                }

                case "UI Designer": {

                    UiDesigner[] uiDesigners = {};
                    uiDesigners = new UiDesigner[100];

                    for (int i = 0; i < count; i++) {

                        uiDesigners[i] = new UiDesigner(i);

                    }

                    break;
                }

                default: {
                    System.out.println("Zadany prikaz neexistuje.\n");
                    addEmployees();
                    break;
                }

            }

            addEmployees();

        }

    }

    public static void main(String[] args) {

        //launch(args);

        /*
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input
        */

        mainMenu();

    }
}