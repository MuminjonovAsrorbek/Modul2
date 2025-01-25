package OOP.Lesson9.TodoApp;

import java.util.UUID;

public interface TodoService {

    void showInfo();

    void add(TodoApp todoApp);

    void remove(UUID userId);

    void edit(UUID uuid, TodoApp todoApp1);
}
