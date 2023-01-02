package com.example.project;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

@Entity(foreignKeys = {@ForeignKey(entity = Level.class,parentColumns = {"level_id"},
                            childColumns = {"level_id"},onUpdate = ForeignKey.CASCADE,
        onDelete =ForeignKey.CASCADE )})
  public class Question {
    @PrimaryKey(autoGenerate = true)
    int question_id;
    String question_title;
    String answer_1;
    String answer_2;
    String answer_3;
    String answer_4;
    String true_answer;
    int points;
    int level_id;
    int duration;
    String question_pattern;
    String hint;

    public Question(String question_title, String answer_1, String answer_2, String answer_3, String answer_4, String true_answer, int points, int level_id, int duration, String question_pattern, String hint) {
        this.question_title = question_title;
        this.answer_1 = answer_1;
        this.answer_2 = answer_2;
        this.answer_3 = answer_3;
        this.answer_4 = answer_4;
        this.true_answer = true_answer;
        this.points = points;
        this.level_id = level_id;
        this.duration = duration;
        this.question_pattern = question_pattern;
        this.hint = hint;
    }

    public Question(int level_id, String title, String answer_1, String answer_2, String answer_3, String answer_4, String true_answer, int points, int duration, String hint, int pattern_id, String pattern_name) {
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public String getQuestion_title() {
        return question_title;
    }

    public void setQuestion_title(String question_title) {
        this.question_title = question_title;
    }

    public String getAnswer_1() {
        return answer_1;
    }

    public void setAnswer_1(String answer_1) {
        this.answer_1 = answer_1;
    }

    public String getAnswer_2() {
        return answer_2;
    }

    public void setAnswer_2(String answer_2) {
        this.answer_2 = answer_2;
    }

    public String getAnswer_3() {
        return answer_3;
    }

    public void setAnswer_3(String answer_3) {
        this.answer_3 = answer_3;
    }

    public String getAnswer_4() {
        return answer_4;
    }

    public void setAnswer_4(String answer_4) {
        this.answer_4 = answer_4;
    }

    public String getTrue_answer() {
        return true_answer;
    }

    public void setTrue_answer(String true_answer) {
        this.true_answer = true_answer;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getLevel_id() {
        return level_id;
    }

    public void setLevel_id(int level_id) {
        this.level_id = level_id;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getQuestion_pattern() {
        return question_pattern;
    }

    public void setQuestion_pattern(String question_pattern) {
        this.question_pattern = question_pattern;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }
}
