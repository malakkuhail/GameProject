package com.example.project;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Level {
    @PrimaryKey(autoGenerate = true)
    int level_id;
  int unlock_points;

    public Level(String unlock_points) {
        this.unlock_points = Integer.parseInt(unlock_points);
    }

    public Level(int level_id, int unlock_points) {
    }

    public int getLevel_id() {
        return level_id;
    }

    public void setLevel_id(int level_id) {
        this.level_id = level_id;
    }

    public String getUnlock_points() {
        return String.valueOf(unlock_points);
    }

    public void setUnlock_points(int unlock_points) {
        this.unlock_points = unlock_points;
    }
}
