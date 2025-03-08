enum Status {
    PENDING, COMPLETED
}

public class Task {
    int id;
    String taskName;
    String taskDescription;
    String deadline;
    Status status;

    public Task(int id, String taskName, String taskDescription, String deadline) {
        this.id = id;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.deadline = deadline;
        this.status = Status.PENDING;
    }

    @Override
    public String toString() {
        return id + ". " + taskName + " | " + taskDescription + " | " + deadline + " | " + status;
    }
}
