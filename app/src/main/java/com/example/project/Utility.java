package com.example.project;

import android.content.Context;
import android.content.res.AssetManager;

import java.io.IOException;
import java.io.InputStream;

public class Utility {
    protected static
    String loadJSONFromAsset(Context context, String file){
        String json="";
        AssetManager am = context.getAssets();
        try {
            InputStream is = am.open("puzzleGameData.json");
            int size=is.available();
            byte[] buffer =new byte[size];
            is.read(buffer);
            is.close();
            json=new String("UTF_8");
        } catch (IOException e) {


        }
        return json;
    }
}
