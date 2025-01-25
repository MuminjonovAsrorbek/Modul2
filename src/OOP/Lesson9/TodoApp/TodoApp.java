package OOP.Lesson9.TodoApp;

import java.util.UUID;

public class TodoApp {
    private UUID id;
    private String title;
    private String description;
    private boolean isDone;
    private TodoCategory category = TodoCategory.OTHER;
    private Priority priority = Priority.LOW;

    public TodoApp(UUID id, String title, String description, boolean isDone, TodoCategory category, Priority priority) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.isDone = isDone;
        this.category = category;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "TodoApp{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", isDone=" + isDone +
                ", category=" + category +
                ", priority=" + priority +
                '}';
    }

    public static Builder builder(){
        return new Builder();
    }
    public static class Builder {
        private UUID id;
        private String title;
        private String description;
        private boolean isDone;
        private TodoCategory category = TodoCategory.OTHER;
        private Priority priority = Priority.LOW;

        public TodoApp build() {
            return new TodoApp(id, title, description, isDone, category, priority);
        }

        public Builder id(UUID id) {
            this.id = id;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setIsDone(boolean isDone) {
            this.isDone = isDone;
            return this;
        }

        public Builder setPriority(Priority priority) {
            this.priority = priority;
            return this;
        }

        public Builder setCategory(TodoCategory category) {
            this.category = category;
            return this;
        }

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public TodoCategory getCategory() {
        return category;
    }

    public void setCategory(TodoCategory category) {
        this.category = category;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }
}
