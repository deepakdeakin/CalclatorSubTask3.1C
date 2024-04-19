package com.example.calclatorsubtask;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstNumberEditText, secondNumberEditText;
    Button addButton, subtractButton;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumberEditText = findViewById(R.id.firstNumber);
        secondNumberEditText = findViewById(R.id.secondNumber);
        addButton = findViewById(R.id.addButton);
        subtractButton = findViewById(R.id.subtractButton);
        resultTextView = findViewById(R.id.resultTextView);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performAddition();
            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performSubtraction();
            }
        });
    }

    private void performAddition() {
        double firstNumber = Double.parseDouble(firstNumberEditText.getText().toString());
        double secondNumber = Double.parseDouble(secondNumberEditText.getText().toString());
        double result = firstNumber + secondNumber;
        resultTextView.setText("Result: " + result);
    }

    private void performSubtraction() {
        double firstNumber = Double.parseDouble(firstNumberEditText.getText().toString());
        double secondNumber = Double.parseDouble(secondNumberEditText.getText().toString());
        double result = firstNumber - secondNumber;
        resultTextView.setText("Result: " + result);
    }
}
