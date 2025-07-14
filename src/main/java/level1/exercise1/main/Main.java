package level1.exercise1.main;

import level1.exercise1.classData.ConsoleUI;
import level1.exercise1.classManagement.UndoManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UndoManagement undoManagement = UndoManagement.getInstance();
        UndoManagement undoManagement2 = UndoManagement.getInstance();
        ConsoleUI consoleUI = ConsoleUI.getInstance();

        Scanner sc = new Scanner(System.in);

        while (true) {
            consoleUI.mainMenu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0: return;
                case 1: {
                    consoleUI.askForAction();
                    String action = sc.nextLine();
                    undoManagement.doAction(action);
                    break;
                }
                case 2: {
                    undoManagement.undo();
                    break;
                }
                case 3: {
                    undoManagement2.showHistory();
                    break;
                }
            }
        }
    }
}
