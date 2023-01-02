package com.example.project;

import androidx.room.TypeConverter;

import java.util.Date;

public class DateConverter {
  @TypeConverter
    public long toLong(Date date){
      return date.getTime();
    }
    @TypeConverter
    public Date toDate(Long date){
      return new Date(date);
    }

}
