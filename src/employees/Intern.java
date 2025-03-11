package employees;

import projects.Project;

public class Intern extends Employee {
    private Project project;

    public Intern(String name, int id, Project project) {
        super(name, id);
        this.project = project;
    }

    @Override
    public void work() {
        System.out.println(name + " is assisting in project: " + project.getProjectName());
    }
}
