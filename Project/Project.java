package Project;

public class Project {

    private int id;
    private String projectName;
    private String companyName;
    private double uiDifficulty;
    private double frontendCodeDifficulty;
    private double backendCodeDifficulty;

    public Project(int identification, String pName, String cName, double uiD, double fcD, double bcD) {

        id = identification;
        projectName = pName;
        companyName = cName;
        uiDifficulty = uiD;
        frontendCodeDifficulty = fcD;
        backendCodeDifficulty = bcD;

    }

}
