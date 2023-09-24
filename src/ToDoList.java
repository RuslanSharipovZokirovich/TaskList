import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {
    private String nameTask;
    public static List<String> list = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    public static void start() {
        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Добавить задачу\n" +
                    "2. Вывести список задач\n" +
                    "3. Удалить задачу\n" +
                    "0. Выход");
            String input = scanner.nextLine();

            switch (Integer.parseInt(input)) {
                case 1:
                    String nameTask = scanner.nextLine();
                    addNewTask(nameTask);
                    break;
                case 2:
                    conclusion();
                    break;
                case 3:
                    removeTask();
                    break;
                case 0:
                    return;
            }
        }
    }

    public static void addNewTask(String nameTask) {
        list.add(nameTask);
    }

    public static void removeTask() {
        System.out.println("Выберите номер задачи для удаления");
        for (String s : list) {
            System.out.println(list.indexOf(s) + 1 + ". " + s + " ");
        }
        String numTaskScaner = scanner.nextLine();
        list.remove(Integer.parseInt(numTaskScaner) - 1);
    }

    public static void conclusion() {
        for (String s : list) {
            System.out.println(list.indexOf(s) + 1 + ". " + s + " ");
        }
    }
}
