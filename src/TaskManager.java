import java.util.*;

enum Status {
    PENDING, COMPLETED
}

class Task {
    int id;
    String taskName;
    String taskDescription;
    String deadline;
    Status status;

    Task(int id, String taskName, String taskDescription, String deadline) {
        this.id = id;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.deadline = deadline;
        this.status = Status.PENDING;
    }

    public String toString() {
        return id + ". " + taskName + " | " + taskDescription + " | " + deadline + " | " + status;
    }
}

class TaskDatabase {
    static List<Task> taskDb = new ArrayList<>();

    static void addTaskToDB(Task task) {
        taskDb.add(task);
    }

    static List<Task> getTasks() {
        return taskDb;
    }
}

public class TaskManager {
    static Scanner sc = new Scanner(System.in);
    static int taskIdCounter = 1;

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nTODO List CLI App");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    System.out.println("Exiting... Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Try again!");
            }
        }
    }

    static void addTask() {
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

    static void viewTasks() {
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
