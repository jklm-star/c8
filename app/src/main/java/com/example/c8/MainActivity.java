package com.example.c8;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    Button button;
    TextView textViewResult;  // Reference to the TextView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Make sure this matches your XML filename

        radioGroup = findViewById(R.id.radioGroup);
        button = findViewById(R.id.button);
        textViewResult = findViewById(R.id.textView);  // Referencing the TextView (currently "Hello World!")

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();

                if (selectedId != -1) {
                    RadioButton selectedRadioButton = findViewById(selectedId);
                    String selectedText = selectedRadioButton.getText().toString();

                    // Display the result in the TextView
                    textViewResult.setText("Selected: " + selectedText);
                } else {
                    textViewResult.setText("Please select an option.");
                }
            }
        });
    }
}
