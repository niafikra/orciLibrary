package com.niafikra.olis.model;

import java.time.LocalDateTime;

public class Notification {
    private Long id;
    private LocalDateTime dateSubmmited;
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateSubmmited() {
        return dateSubmmited;
    }

    public void setDateSubmmited(LocalDateTime dateSubmmited) {
        this.dateSubmmited = dateSubmmited;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
