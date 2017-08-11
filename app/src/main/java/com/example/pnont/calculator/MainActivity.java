package com.example.pnont.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button oneBtn;
    Button threeBtn;
    Button fiveBtn;
    Button sevenBtn;
    Button nineBtn;
    Button elevenBtn;
    Button plusBtn;
    Button minusBtn;
    Button clearBtn;
    TextView signDisplay;
    TextView numberDisplay;
    boolean calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        oneBtn = (Button) findViewById(R.id.one);
        threeBtn = (Button) findViewById(R.id.three);
        fiveBtn = (Button) findViewById(R.id.five);
        sevenBtn = (Button) findViewById(R.id.seven);
        nineBtn = (Button) findViewById(R.id.nine);
        elevenBtn = (Button) findViewById(R.id.eleven);
        plusBtn = (Button) findViewById(R.id.plus);
        minusBtn = (Button) findViewById(R.id.minus);
        clearBtn = (Button) findViewById(R.id.clear);
        signDisplay = (TextView) findViewById(R.id.displaySign);
        numberDisplay = (TextView) findViewById(R.id.displayNumber);
        oneBtn.setOnClickListener(this);
        threeBtn.setOnClickListener(this);
        fiveBtn.setOnClickListener(this);
        sevenBtn.setOnClickListener(this);
        nineBtn.setOnClickListener(this);
        elevenBtn.setOnClickListener(this);
        plusBtn.setOnClickListener(this);
        minusBtn.setOnClickListener(this);
        clearBtn.setOnClickListener(this);
        calculate = false;
    }

    @Override
    public void onClick(View view) {
        if (view == oneBtn) {
            compute(view);
        } else if (view == threeBtn) {
            compute(view);
        } else if (view == fiveBtn) {
            compute(view);
        } else if (view == sevenBtn) {
            compute(view);
        } else if (view == nineBtn) {
            compute(view);
        } else if (view == elevenBtn) {
            compute(view);
        } else if (view == plusBtn) {
            signDisplay.setText("+");
            calculate = true;
        } else if (view == minusBtn) {
            signDisplay.setText("-");
            calculate = true;
        } else if (view == clearBtn) {
            signDisplay.setText("");
            numberDisplay.setText("");
            calculate = false;
        }
    }

    private void compute(View view) {
        if (calculate) {
            Button button = (Button) view;
            String symbol = signDisplay.getText().toString();

            int oldNumber = (numberDisplay.getText().toString().equals("")) ? 0 : Integer.parseInt(numberDisplay.getText().toString());
            int newNumber = Integer.parseInt(button.getText().toString());
            int result;
            if (symbol.equals("+")) {
                result = oldNumber + newNumber;
            } else {
                result = oldNumber - newNumber;
                if (result <= 0) {
                    result = 0;
                }

            }
            numberDisplay.setText(String.valueOf(result));
        }
    }
}
