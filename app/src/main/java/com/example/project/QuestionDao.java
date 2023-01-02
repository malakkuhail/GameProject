package com.example.project;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface QuestionDao {

    @Insert
    void insertQuestion(Question question);

    @Update
    void updateQuestion(Question question);

     @Delete
    void deleteQuestion(Question question);


     @Query("select * from Question")
     LiveData<List<Question>> getAllQuestion();


     @Query("select * from Question where level_id = :level_id  ")
     LiveData<List<Question>> getQuestionByLevel_id(int level_id);


}
