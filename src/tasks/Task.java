package tasks;

public abstract class Task {
    protected String taskName;
    protected int duration;

    // Constructor Overloading
    public Task(String taskName) {
        this.taskName = taskName;
        this.duration = 0;
    }

    public Task(String taskName, int duration) {
        this.taskName = taskName;
        this.duration = duration;
    }

    public String getTaskName() {
        return taskName;
    }

    // Abstract method
    public abstract void execute();

    // Method Overloading
    public void displayTask() {
        System.out.println("Task: " + taskName + " | Duration: " + duration + " days");
    }
}
