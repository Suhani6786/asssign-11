package employees;

import projects.Project;
import tasks.Task;
import utilities.Assignable;

public class Developer extends Employee implements Assignable {
    private Project project;

    public Developer(String name, int id, Project project) {
        super(name, id);
        this.project = project;
    }

    @Override
    public void work() {
        System.out.println(name + " is coding for project: " + project.getProjectName());
    }

    @Override
    public void assignTask(Task t) {
        System.out.println(name + " is assigned task: " + t.getTaskName());
    }
}
