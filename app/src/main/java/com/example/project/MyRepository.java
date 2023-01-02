package com.example.project;

import android.app.Application;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

public class MyRepository {
    private UserDao userDao;
    private LevelDao levelDao;
    private PatternDao patternDao;
    private QuestionDao questionDao;

    public MyRepository(Application application){
        MyDatabase db= MyDatabase.getDatabase(application);

        userDao= db.userDao();
        levelDao= db.levelDao();
        patternDao= db.patternDao();
        questionDao= db.questionDao();
    }

    void insertUser(User user){
        MyDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                userDao.insertUser(user);
            }
        });
    }


    void updateUser(User user){
        MyDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                userDao.updateUser(user);
            }
        });
    }


    void deleteUser(User user){
        MyDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                userDao.deleteUser(user);
            }
        });
    }

    LiveData<List<User>> getAllUser(){
        return userDao.getAllUser();
    }

    //levelDao

    void insertLevel(Level level){
        MyDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                levelDao.insertLevel(level);
            }
        });
    }

    void updateLevel(Level level) {
        MyDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                levelDao.updateLevel(level);
            }
        });
    }

    void deleteLevel(Level level){
        MyDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                levelDao.deleteLevel(level);
            }
        });
    }

    LiveData<List<Level>> getAllLevel(){
        return levelDao.getAllLevel();
    }
    //patternDao
    void insertPattern(Pattern pattern){
        MyDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                patternDao.insertPattern(pattern);
            }
        });
    }

    void updatePattern(Pattern pattern){
        MyDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                patternDao.updatePattern(pattern);
            }
        });
    }

    void deletePattern(Pattern pattern){
        MyDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                patternDao.deletePattern(pattern);
            }
        });
    }


    LiveData<List<Pattern>> getAllPattern(){
        return patternDao.getAllPattern();
    }
    //QuestionDao
    void insertQuestion(Question question){
        MyDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                questionDao.insertQuestion(question);
            }
        });
    }

    void updateQuestion(Question question){
        MyDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                questionDao.updateQuestion(question);
            }
        });
    }

    void deleteQuestion(Question question){
        MyDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                questionDao.deleteQuestion(question);
            }
        });
    }


    LiveData<List<Question>> getAllQuestion(){
        return questionDao.getAllQuestion();
    }


    LiveData<List<Question>> getQuestionByLevel_id(int level_id){
        return questionDao.getQuestionByLevel_id(level_id);
    }
}
