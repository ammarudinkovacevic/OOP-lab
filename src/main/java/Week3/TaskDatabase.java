package Week3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TaskDatabase {
    private DbConnect dbConnect;

    public TaskDatabase() {
        dbConnect = new DbConnect();
    }

    public List<TaskItem> getAllTasksFromDatabase() {
        List<TaskItem> tasks = new ArrayList<>();

        try (Connection connection = dbConnect.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM tasks")) {

            while (resultSet.next()) {
                int taskId = resultSet.getInt("task_id");
                String taskDescription = resultSet.getString("task_description");
                Status taskStatus = Status.valueOf(resultSet.getString("task_status"));

                TaskItem task = new TaskItem(taskId, taskDescription, taskStatus);
                tasks.add(task);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Failed to fetch tasks from the database.", e);
        }

        return tasks;
    }

    public TaskItem getTaskById(int taskId) {
        try (Connection connection = dbConnect.getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM tasks WHERE task_id = ?")) {

            statement.setInt(1, taskId);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    String taskDescription = resultSet.getString("task_description");
                    Status taskStatus = Status.valueOf(resultSet.getString("task_status"));

                    return new TaskItem(taskId, taskDescription, taskStatus);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Failed to fetch the task with ID " + taskId + " from the database.", e);
        }

        return null;
    }
}
