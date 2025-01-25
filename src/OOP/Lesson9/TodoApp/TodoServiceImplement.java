package OOP.Lesson9.TodoApp;

import java.util.Objects;
import java.util.UUID;

public class TodoServiceImplement implements TodoService {
    private TodoApp[] todoApps = new TodoApp[]{};

    @Override
    public void showInfo() {
        for (TodoApp todoApp : todoApps) {
            System.out.println(todoApp);
        }
        System.out.println("-------------------------------------------------");
    }

    @Override
    public void add(TodoApp todoApp) {
        if (Objects.isNull(todoApps)) {
            TodoApp[] newTodoApps = new TodoApp[1];
            newTodoApps[0] = todoApp;
            todoApps = newTodoApps;
            System.out.println("Added");
        } else {
            TodoApp[] newTodoApps = new TodoApp[todoApps.length + 1];
            for (int i = 0; i < todoApps.length; i++) {
                newTodoApps[i] = todoApps[i];
            }
            newTodoApps[todoApps.length] = todoApp;
            todoApps = newTodoApps;
            System.out.println("Added");
        }
        showInfo();
    }

    @Override
    public void remove(UUID userId) {
        if (Objects.isNull(todoApps)) {
            System.out.println("TodoApps is null");
        } else {
            int index = isHave(userId);
            if (index != -1) {
                TodoApp[] newTodoApp = new TodoApp[todoApps.length - 1];
                int j = 0;
                for (int i = 0; i < todoApps.length; i++) {
                    if (i != index) {
                        newTodoApp[j++] = todoApps[i];
                    }
                }
                todoApps = newTodoApp;
                System.out.println("Removed");
                showInfo();
            } else System.err.println("TodoApp not found");
        }
    }

    @Override
    public void edit(UUID uuid, TodoApp todoApp1) {
        int index = isHave(uuid);
        if(index != -1) {
            todoApps[index].setTitle(todoApp1.getTitle());
            todoApps[index].setDescription(todoApp1.getDescription());
            todoApps[index].setDone(todoApp1.isDone());
            todoApps[index].setCategory(todoApp1.getCategory());
            todoApps[index].setPriority(todoApp1.getPriority());
            System.out.println("Edited");
            showInfo();
        } else System.err.println("Not found");
    }

    private int isHave(UUID userId) {
        for (int i = 0; i < todoApps.length; i++) {
            if (todoApps[i].getId().equals(userId)) return i;
        }
        return -1;
    }

    public TodoApp[] getTodoApps() {
        return todoApps;
    }

    public void setTodoApps(TodoApp[] todoApps) {
        this.todoApps = todoApps;
    }
}
