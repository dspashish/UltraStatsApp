package com.ashish.ultimatestatisticsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mean;
    private Button mode;
    private Button median;
    private Button prob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mean = (Button)findViewById(R.id.mean);
        mode = (Button)findViewById(R.id.mode);
        median = (Button)findViewById(R.id.median);
        prob = (Button)findViewById(R.id.nofo);

        mean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MeanActivity.class);
                startActivity(intent);
            }
        });

        mode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModeActivity.class);
                startActivity(intent);
            }
        });

        median.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MedianActivity.class);
                startActivity(intent);
            }
        });

        prob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ProbablityActivity.class);
                startActivity(intent);
            }
        });
    }
}
