import java.util.List;
import java.util.Scanner;

public class TaskOperations {
    private static Scanner sc = new Scanner(System.in);
    private static int taskIdCounter = 1;

    public static void addTask() {
        System.out.print("Enter Task Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Task Description: ");
        String description = sc.nextLine();

        System.out.print("Enter Deadline: ");
        String deadline = sc.nextLine();

        Task task = new Task(taskIdCounter++, name, description, deadline);
        TaskDatabase.addTaskToDB(task);
        System.out.println("Task saved!");
    }

    public static void viewTasks() {
        List<Task> tasks = TaskDatabase.getTasks();
        if (tasks.isEmpty()) {
            System.out.println("No tasks available!");
        } else {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }
}
