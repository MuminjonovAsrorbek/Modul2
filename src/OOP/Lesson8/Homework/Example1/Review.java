package OOP.Lesson8.Homework.Example1;

import java.util.UUID;

public class Review {
    private UUID id;
    private String text;
    private double rate;
    private String createdBy;

    public Review(UUID id, String text, double rate, String createdBy) {
        this.id = id;
        this.text = text;
        this.rate = rate;
        this.createdBy = createdBy;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", rate=" + rate +
                ", createdBy='" + createdBy + '\'' +
                '}';
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}
