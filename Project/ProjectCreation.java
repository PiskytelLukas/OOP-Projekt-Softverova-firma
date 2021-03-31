package Project;

import Employees.BackendDeveloper;

public class ProjectCreation {

    public static BackendDeveloper[] bdeveloper;

    public static void createNewBackendDevelopers(int count) {

        bdeveloper = new BackendDeveloper[count];

        for (int i = 0; i < count; i++) {

            // sem pridu data z kontextoveho okna pre vytvorenie novych backend developerov
            bdeveloper[i] = new BackendDeveloper(i);

        }

        for (int i = 0; i < count; i++) {

            System.out.println(bdeveloper[i].getId());

        }

    }

}
