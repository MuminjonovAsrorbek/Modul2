package OOP.Lesson9.TodoApp;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        TodoApp.Builder builder = new TodoApp.Builder();
        builder.id(UUID.randomUUID()).setTitle("Working").setPriority(Priority.MEDIUM).setIsDone(false).setCategory(TodoCategory.HOME).setDescription("Uy ishlarini qilish kerak ");
        TodoApp todoApp = builder.build();
        TodoServiceImplement todoServiceImplement = new TodoServiceImplement();
        todoServiceImplement.showInfo();
        todoServiceImplement.add(todoApp);

        TodoApp.Builder builder1 = new TodoApp.Builder().setTitle("Education").setCategory(TodoCategory.EDUCATION).setDescription("Uyga vazifa").setIsDone(true).setPriority(Priority.HIGH);
        todoServiceImplement.edit(todoApp.getId(),builder1.build());
        todoServiceImplement.add(builder1.build());
        todoServiceImplement.remove(todoApp.getId());
    }
}