package com.ashish.ultimatestatisticsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.*;
import org.w3c.dom.Text;

public class MedianActivity extends AppCompatActivity {

    private EditText median;
    private Button btn;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_median);

        median = (EditText)findViewById(R.id.median);
        btn = (Button)findViewById(R.id.btn);
        result = (TextView)findViewById(R.id.result);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = median.getText().toString();
                String[] values = data.split(" ");
                int size = values.length;
                int[] arr = new int [size];
                for (int i = 0; i < size; i++){
                    arr[i] = Integer.parseInt(values[i]);
                }

                Arrays.sort(arr);
                int middle = arr.length / 2;
                if (arr.length % 2 == 0){
                    int left = arr[middle-1];
                    int right = arr[middle];
                    result.setText(String.valueOf((left+right)/2));

                } else {
                    result.setText("Median of this data is : "+String.valueOf(arr[middle]));
                }

            }
        });


    }
}
