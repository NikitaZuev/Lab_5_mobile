package com.example.a.eventhandling;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MotionEvent extends AppCompatActivity {
    public int x;
    public int y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_motion);
        TextView ActionOne = findViewById(R.id.textView2);
        ActionOne.setText("Action: NONE,X: -, Y: - ");
        TextView ActionTwo = findViewById(R.id.textView3);
        ActionTwo.setText("Actoin: NONE,X: - , Y: - ");
        Button buttonMotion = findViewById(R.id.buttonMotion);
        buttonMotion.setBackgroundColor(Color.alpha(0));
        buttonMotion.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, android.view.MotionEvent event) {
                 x = (int)event.getX();
                 y = (int)event.getY();
                ActionOne.setText("Action: Click, X: " + x  + ", Y:" + y + ".");
                return false;
            }
        });
        buttonMotion.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ActionTwo.setText("Action: LongClick, X: " + x  + ", Y:" + y + ".");
                return false;
            }
        });
    }
}
