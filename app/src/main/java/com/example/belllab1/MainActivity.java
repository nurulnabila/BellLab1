package com.example.belllab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button displayButton;
    private EditText etName;
    private TextView tvMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayButton = (Button) findViewById(R.id.button);
        etName = (EditText) findViewById(R.id.editText);
        tvMessage = (TextView) findViewById(R.id.textView);


    }

    public void displayText (View view){

        String text = etName.getText().toString();

        //display text obtain from getText
        tvMessage.setText("Welcome " + text);

        //show toast
        Toast toast = Toast.makeText(this,"WELCOME " + text, Toast.LENGTH_LONG);
        toast.show();
    }

    public void resetText (View view){

        tvMessage.setText("Name have been reset");

        Toast toast = Toast.makeText(this, "Name have been reset", Toast.LENGTH_LONG);
        toast.show();


    }
}
