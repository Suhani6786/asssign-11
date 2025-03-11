package tasks;

public class CodingTask extends Task {
    public CodingTask(String taskName, int duration) {
        super(taskName, duration);
    }

    @Override
    public void execute() {
        System.out.println("Executing coding task: " + taskName);
    }
}
