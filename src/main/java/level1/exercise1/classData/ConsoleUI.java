package level1.exercise1.classData;

import java.util.Stack;

public class ConsoleUI {
    private static ConsoleUI instance;

    private ConsoleUI() {}

    public static ConsoleUI getInstance() {
        if (instance == null) {
            instance = new ConsoleUI();
        }
        return instance;
    }

    public void mainMenu(){
        System.out.println("MENU");
        System.out.println("1) Do action");
        System.out.println("2) Undo last action");
        System.out.println("3) Show history");
        System.out.println("0) Exit");
    }

    public void doAction(){
        System.out.println("Write the action.");
    }

    public void undoLastAction(){
        System.out.println("Undoing last action.");
    }

    public void viewHistory(Stack<String> history){
        if (history.isEmpty()) {
            System.out.println("No actions performed yet.");
        } else {
            System.out.println("Current history: " + history);
        }
    }
}
