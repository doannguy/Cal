package com.example.cal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private EditText display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.input);
        display.setShowSoftInputOnFocus(false);

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getString(R.string.display).equals(display.getText().toString())) {
                    display.setText("");
                }

            }
        });

    }

    private void updateText(String strToAdd) {
        String oldStr = display.getText().toString();
        int cursorPos = display.getSelectionStart();
        String leftStr = oldStr.substring(0, cursorPos);
        String rightStr = oldStr.substring(cursorPos);
        if(getString(R.string.display).equals(display.getText().toString())) {
            display.setText(strToAdd);
        }
        else {
            display.setText(String.format("%s%s%s", leftStr, strToAdd, rightStr));
            display.setSelection(cursorPos + 1);
        }

    }

    public void zeroBTN(View view) {
        updateText("0");
    }

    public void oneBTN(View view) {
        updateText("1");
    }

    public void twoBTN(View view) {
        updateText("2");
    }
    public void threeBTN(View view) {
        updateText("3");
    }
    public void fourBTN(View view) {
        updateText("4");
    }
    public void fiveBTN(View view) {
        updateText("5");
    }
    public void sixBTN(View view) {
        updateText("6");
    }
    public void sevenBTN(View view) {
        updateText("7");
    }
    public void eightBTN(View view) {
        updateText("8");
    }
    public void nineBTN(View view) {
        updateText("9");
    }

    public void multiplyBTN(View view) {
        updateText("×");
    }
    public void subtractBTN(View view) {
        updateText("-");
    }
    public void addBTN(View view) {
        updateText("+");
    }
    public void divideBTN(View view) {
        updateText("÷");
    }
    public void decimalBTN(View view) {
        updateText(".");
    }
    public void equalBTN(View view) {
        updateText("=");
    }

    public void parBTN(View view) {
        updateText("()");
    }
    public void expBTN(View view) {
        updateText("^");
    }
    public void plusMinusBTN(View view) {
        updateText("-");
    }


    public void backspaceBTN(View view) {

    }

    public void clearBTN(View view) {
        display.setText(" ");
    }

}