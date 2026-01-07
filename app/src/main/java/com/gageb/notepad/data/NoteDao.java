package com.gageb.notepad.data;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface NoteDao {
    @Query("SELECT * FROM NoteItem")
    List<NoteItem> getAll();

    @Insert
    void insertAll(NoteItem... notes);

    @Delete
    void delete(NoteItem note);

    @Update
    void update(NoteItem note);

    @Query("DELETE from NoteItem ")
    void nukeTable();
}
