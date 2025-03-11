package projects;

public class Project {
    private String projectName;
    private String deadline;

    public Project(String projectName) {
        this.projectName = projectName;
        this.deadline = "Not set";
    }

    public Project(String projectName, String deadline) {
        this.projectName = projectName;
        this.deadline = deadline;
    }

    public String getProjectName() {
        return projectName;
    }

    public void startProject() {
        System.out.println("Project " + projectName + " started. Deadline: " + deadline);
    }
}
