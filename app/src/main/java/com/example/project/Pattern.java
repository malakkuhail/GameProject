package com.example.project;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Pattern {
    @PrimaryKey(autoGenerate = true)
    int pattern_id;
    String pattern_name;

    public Pattern(String pattern_name) {
        this.pattern_name = pattern_name;
    }

    public int getPattern_id() {
        return pattern_id;
    }

    public void setPattern_id(int pattern_id) {
        this.pattern_id = pattern_id;
    }

    public String getPattern_name() {
        return pattern_name;
    }

    public void setPattern_name(String pattern_name) {
        this.pattern_name = pattern_name;
    }
}
