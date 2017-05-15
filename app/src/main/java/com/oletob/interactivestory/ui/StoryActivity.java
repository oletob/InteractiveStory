package com.oletob.interactivestory.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.oletob.interactivestory.R;
import com.oletob.interactivestory.model.Page;

public class StoryActivity extends AppCompatActivity {

    public static final String TAG = StoryActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent = getIntent();
        String name = intent.getStringExtra(getString(R.string.key_name));

        if(name == null || name.isEmpty()){
            name = "OLETOB";
        }

        Toast.makeText(this, name, Toast.LENGTH_LONG).show();


    }
}
