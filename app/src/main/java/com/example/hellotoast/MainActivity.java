package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hellotoast.R;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showCount(View view){
        final Button button2 = findViewById(R.id.button_zero);
        mCount = 0;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
            button2.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
        }
    }

    public void countUp(View view) {
        final Button button1 = findViewById(R.id.button_count);
        final Button button2 = findViewById(R.id.button_zero);
        button2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));

        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

        if(mCount %2 == 0 ) {
            button1.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
        }
        else
            button1.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
    }
}