package com.gageb.notepad.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class NoteItem {

    @PrimaryKey
    private int id;

    @ColumnInfo
    private String title;

    @ColumnInfo
    private boolean urgent;

    public NoteItem(int id, String title, boolean urgent) {
        this.id = id;
        this.title = title;
        this.urgent = urgent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent (boolean urgent) {
        this.urgent = urgent;
    }

}
