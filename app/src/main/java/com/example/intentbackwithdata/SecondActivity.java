package com.example.intentbackwithdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    private Button btnForGoFirstActivity;
    private EditText editTextId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        btnForGoFirstActivity = (Button)findViewById(R.id.btnForGoFirstActivity);
        editTextId = (EditText)findViewById(R.id.editTextId);

        btnForGoFirstActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String value = editTextId.getText().toString();
                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                intent.putExtra("key",value);
                setResult(1,intent);
                finish();

            }
        });
    }
}