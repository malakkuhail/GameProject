package com.example.project;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface LevelDao {

    @Insert
    void insertLevel(Level level);

    @Update
    void updateLevel(Level level);

    @Delete
    void deleteLevel(Level level);

    @Query("select * from Level")
    LiveData<List<Level>> getAllLevel();
}
