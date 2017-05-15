package com.oletob.interactivestory.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.oletob.interactivestory.R;

public class MainActivity extends AppCompatActivity {

    private TextView nameField;
    private Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameField = (TextView)findViewById(R.id.nameEditText);
        startButton = (Button)findViewById(R.id.startButton);

        startButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startStory(nameField.getText().toString());
            }
        });

    }

    private void startStory(String name) {
        Intent intent = new Intent(this, StoryActivity.class);

        intent.putExtra(getString(R.string.key_name), name);
        startActivity(intent);
    }
}
