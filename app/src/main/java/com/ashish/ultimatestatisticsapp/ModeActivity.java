package com.ashish.ultimatestatisticsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ModeActivity extends AppCompatActivity {

    private EditText mode;
    private TextView result;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode);

        mode = (EditText)findViewById(R.id.mode);
        result = (TextView)findViewById(R.id.result);
        btn = (Button)findViewById(R.id.btn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = mode.getText().toString();
                String[] values = data.split(" ");
                int size = values.length;
                int[] arr = new int [size];
                for (int i = 0; i < size; i++) {
                    arr[i] = Integer.parseInt(values[i]);
                }

                int maxValue = 0;
                int maxCount = 0;

                for (int i =0;i < size; i++){
                    int count = 0;
                    for(int j =0; j < arr.length; j++){
                        if(arr[j] == arr[i]) ++count;
                    }
                    if (count > maxCount){
                        maxCount = count;
                        maxValue = arr[i];
                    }
                }

                result.setText("Mode of this data is " + String.valueOf(maxValue));

            }
        });





    }
}
