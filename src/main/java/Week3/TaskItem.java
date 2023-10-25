package Week3;

public class TaskItem {
    private int TaskId;
    private String TaskDescription;
    private Status TaskStatus;

    public TaskItem(int TaskId, String TaskDescription, Status TaskStatus) {
        this.TaskId = TaskId;
        this.TaskDescription = TaskDescription;
        this.TaskStatus = TaskStatus;
    }
    public int getTaskId() {
        return TaskId;
    }

    public String getTaskDescription() {
        return TaskDescription;
    }

    public Status getTaskStatus() {
        return TaskStatus;
    }

}
enum Status{
    TO_DO,
    IN_PROGRESS,
    COMPLETED
}
