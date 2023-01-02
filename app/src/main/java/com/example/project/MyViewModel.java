package com.example.project;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import org.json.JSONObject;

import java.util.List;

public class MyViewModel extends AndroidViewModel {
    MyRepository myRepository;
    public MyViewModel(@NonNull Application application) {
        super(application);
        myRepository =new MyRepository(application);
    }

    void insertUser(User user){
       myRepository.insertUser(user);
    }

    void updateUser(User user){
        myRepository.updateUser(user);
    }


    void deleteUser(User user){
       myRepository.deleteUser(user);
    }

    LiveData<List<User>> getAllUser(){
        return myRepository.getAllUser();
    }

    //levelDao

    void insertLevel(JSONObject level){
        myRepository.insertLevel(level);
    }

    void updateLevel(Level level) {
       myRepository.updateLevel(level);
    }

    void deleteLevel(Level level){
        myRepository.deleteLevel(level);
    }

    LiveData<List<Level>> getAllLevel(){
        return myRepository.getAllLevel();
    }
    //patternDao
    void insertPattern(Pattern pattern){
      myRepository.insertPattern(pattern);
    }

    void updatePattern(Pattern pattern){
       myRepository.updatePattern(pattern);
    }

    void deletePattern(Pattern pattern){
       myRepository.deletePattern(pattern);
    }


    LiveData<List<Pattern>> getAllPattern(){
        return myRepository.getAllPattern();
    }
    //QuestionDao
    void insertQuestion(Question question){
       myRepository.insertQuestion(question);
    }

    void updateQuestion(Question question){
        myRepository.updateQuestion(question);
    }

    void deleteQuestion(Question question){
       myRepository.deleteQuestion(question);
    }


    LiveData<List<Question>> getAllQuestion(){
        return myRepository.getAllQuestion();
    }


    LiveData<List<Question>> getQuestionByLevel_id(int level_id){
        return myRepository.getQuestionByLevel_id(level_id);
    }
}
