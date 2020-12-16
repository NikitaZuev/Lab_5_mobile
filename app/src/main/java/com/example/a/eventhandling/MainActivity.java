package com.example.a.eventhandling;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private Button buttonClick;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        buttonClick = findViewById(R.id.buttonClick);

        buttonClick.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 textView.setText("ButtonClick");
             }
         });
        buttonClick.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                textView.setText("LongButtonClick");
                return false;
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item ) {
        int id = item.getItemId();
        TextView headetView = (TextView) findViewById(R.id.textView);
        switch (id)
        {
            case R.id.MotionEvent:
                Intent intent1 = new Intent(MainActivity.this, MotionEvent.class);
                startActivity(intent1);

            case R.id.CommonGestures:
                Intent intent2 = new Intent(MainActivity.this, CommonGestures.class);
                startActivity(intent2);

        }
        return super.onOptionsItemSelected(item);
    }

}