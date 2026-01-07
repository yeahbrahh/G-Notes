package com.gageb.notepad.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {NoteItem.class}, version = 1)
public abstract class NoteDatabase extends RoomDatabase {
    public abstract NoteDao noteDao();
}
