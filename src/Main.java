import employees.*;
import projects.*;
import tasks.*;
import departments.*;

public class Main {
    public static void main(String[] args) {
        Department techDept = new Department("Technology", 101);
        Project aiProject = new Project("AI Development", "2025-12-31");
        
        Manager mgr = new Manager("Alice", 1, techDept);
        Developer dev = new Developer("Bob", 2, aiProject);
        Intern intern = new Intern("Charlie", 3, aiProject);

        CodingTask task1 = new CodingTask("Develop AI Model", 10);
        TestingTask task2 = new TestingTask("Test AI Model", 5);

        mgr.work();
        mgr.generateReport();
        
        dev.work();
        dev.assignTask(task1);

        intern.work();
        task1.execute();
        task2.execute();
    }
}
