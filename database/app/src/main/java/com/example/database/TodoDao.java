package com.example.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

// database에 수행하는 명령 클래스
@Dao
public interface TodoDao {
    @Query("Select * FROM Todo")
    List<Todo> getAll();

    @Insert
    void instert(Todo todo);

    @Update
    void update(Todo todo);

    @Delete
    void delete(Todo todo);
}
