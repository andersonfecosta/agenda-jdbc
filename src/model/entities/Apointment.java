package model.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Apointment {

    private String name;
    private LocalDateTime time;
    private String category;

    public Apointment(String name, LocalDateTime time, String category) {
        this.name = name;
        this.time = time;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
