package com.example.firstapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button clickme;
private TextView textView;
private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    clickme=(Button) findViewById(R.id.clickme);
    textView=(TextView) findViewById(R.id.textView);
    editText=(EditText) findViewById(R.id.editText);
    clickme.setText(R.string.click_me);
    clickme.setOnClickListener (new View.OnClickListener()  {
        @Override
        public void onClick(View v) {
            String input;
            input=editText.getText().toString();
textView.setVisibility(View.VISIBLE);
textView.setText(input);
clickme.setText(R.string.click_text);
            }
    });
    }

}
