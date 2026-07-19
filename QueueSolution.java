import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Phase 2: Student 2 Integrated FIFO Queue ===");
       
        LinkedList<Task> list = new LinkedList<>();
        list.add(new Task("T1", "First task arrived", 3));
        list.add(new Task("T2", "Second task arrived", 1));

        QueueSolution.runFIFO(list);
    }
}

class QueueSolution {
    public static void runFIFO(LinkedList<Task> tasks) {
        System.out.println("\n--- [Solution 1] FIFO Queue (Arrival Order) ---");
        Queue<Task> queue = new LinkedList<>(tasks);
        while (!queue.isEmpty()) {
            System.out.println("Processing -> " + queue.poll());
        }
    }
}

class Task {
    private String taskId;
    private String description;
    int priority;

    public Task(String taskId, String description, int priority) {
        this.taskId = taskId;
        this.description = description;
        this.priority = priority;
    }

    @Override
    public String toString() {
        String pStr = (priority == 1) ? "High" : (priority == 2) ? "Medium" : "Low";
        return "[ID: " + taskId + " | Desc: " + description + " | Priority: " + pStr + "]";
    }
}
