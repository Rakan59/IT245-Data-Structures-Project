import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Phase 1: Project Initiated ===");
        
        // Testing the Task object creation
        Task testTask = new Task("T1", "Initial System Setup", 1);
        System.out.println("Successfully Created: " + testTask);
    }
}

class Task {
    private String taskId;
    private String description;
    private int priority; // 1 = High, 2 = Medium, 3 = Low

    public Task(String taskId, String description, int priority) {
        this.taskId = taskId;
        this.description = description;
        this.priority = priority;
    }

    public String getTaskId() { 
        return taskId; 
    }

    public String getDescription() { 
        return description; 
    }

    public int getPriority() { 
        return priority; 
    }

    @Override
    public String toString() {
        String pStr = (priority == 1) ? "High" : (priority == 2) ? "Medium" : "Low";
        return "[ID: " + taskId + " | Desc: " + description + " | Priority: " + pStr + "]";
    }
}
