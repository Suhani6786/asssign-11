package tasks;

public class TestingTask extends Task {
    public TestingTask(String taskName, int duration) {
        super(taskName, duration);
    }

    @Override
    public void execute() {
        System.out.println("Executing testing task: " + taskName);
    }
}
