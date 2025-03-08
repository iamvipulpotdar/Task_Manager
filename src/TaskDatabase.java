import java.util.ArrayList;
import java.util.List;

public class TaskDatabase {
    private static List<Task> taskDb = new ArrayList<>();

    public static void addTaskToDB(Task task) {
        taskDb.add(task);
    }

    public static List<Task> getTasks() {
        return taskDb;
    }
}
