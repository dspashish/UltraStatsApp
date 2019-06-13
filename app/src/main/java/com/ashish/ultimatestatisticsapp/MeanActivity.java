package com.ashish.ultimatestatisticsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MeanActivity extends AppCompatActivity {

    private EditText mean;
    private Button btn;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mean);

        mean = (EditText)findViewById(R.id.mean);
        btn = (Button)findViewById(R.id.btn);
        result = (TextView)findViewById(R.id.result);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = mean.getText().toString();
                String[] values = data.split(" ");
                int size = values.length;
                int[] arr = new int [size];
                for (int i = 0; i < size; i++){
                    arr[i] = Integer.parseInt(values[i]);

                }
                int sum = 0;


                for (int i = 0; i < arr.length; i++) {

                    sum += arr[i];

                }


                int finalRes = sum / size;



                result.setText("Mean of this data is: "+String.valueOf(finalRes));

            }
        });
    }
}
