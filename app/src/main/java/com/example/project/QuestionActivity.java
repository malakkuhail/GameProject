package com.example.project;

import static com.example.project.Utility.loadJSONFromAsset;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.project.databinding.ActivityQuestionBinding;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Collections;
import java.util.List;

public class QuestionActivity extends AppCompatActivity {
ActivityQuestionBinding binding;
    String json;
    String file;
    String jsonStr;
    MyViewModel myViewModel;
    private Object currentQuestion;

    private void parseJson() {}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityQuestionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        json = loadJSONFromAsset(getApplicationContext(),"puzzleGameData.json");
        parseJson();
        List<?> questions;
        Collections.shuffle(questions);
       // setQuestionScreen(currentQuestion);

        private void parseJsonFromAssets(String final ) {
        try {
            if (jsonStr != null) {
                JSONArray jsonArray = new JSONArray(file);
                for (int i = 0; i < jsonArray.length(); i++) {
                    String item = jsonArray.get(i).toString();
                    JSONObject level = new JSONObject(item);
                    int level_id = level.getInt("level_id");
                    int unlock_points = level.getInt("unlock_points");
                    Level level1 = new Level(level_id, unlock_points);
                    JSONArray questionLevelOne = level.getJSONArray("question");
                    for (i = 0; i < questionLevelOne.length(); i++) {
                        String itemLevelOne = questionLevelOne.get(i).toString();
                        JSONObject jsonLevelOne = new JSONObject(itemLevelOne);
                        int id = jsonLevelOne.getInt("id");
                        String title = jsonLevelOne.getString("title");
                        String answer_1 = jsonLevelOne.getString("answer_1");
                        String answer_2 = jsonLevelOne.getString("answer_2");
                        String answer_3 = jsonLevelOne.getString("answer_3");
                        String answer_4 = jsonLevelOne.getString("answer_4");
                        String true_answer = jsonLevelOne.getString("true_answer");
                        int points = jsonLevelOne.getInt("points");
                        int duration = jsonLevelOne.getInt("duration");
                        JSONObject pattern = jsonLevelOne.getJSONObject("pattern");
                        int pattern_id = pattern.getInt("pattern_id");
                        String pattern_name = pattern.getString("pattern_name");
                        String hint = jsonLevelOne.getString("hint");
                        Question question = new Question(level_id, title, answer_1, answer_2, answer_3, answer_4,
                                true_answer, points, duration, hint, pattern_id, pattern_name);
                        myViewModel.insertLevel(level);
                        myViewModel.insertQuestion(question);


                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        }
    }


    }

