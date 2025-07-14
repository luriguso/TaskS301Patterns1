package level1.exercise1.classManagement;

import java.util.Stack;

public class UndoManagement {
    private Stack<String> history = new Stack<>();

    private static UndoManagement instance;

    private UndoManagement() { }

    public static synchronized UndoManagement getInstance() {
        if (instance == null) {
            instance = new UndoManagement();
        }
        return instance;
    }

    public void doAction(String action) {
        history.push(action);
        System.out.println("Action performed: " + action);
    }

    public void undo() {
        if (history.isEmpty()) {
            System.out.println("Nothing to undo.");
        } else {
            String undone = history.pop();
            System.out.println("Undone action: " + undone);
        }
    }

    public Stack<String> getHistory() {
        return (Stack<String>) history.clone();
    }
}
