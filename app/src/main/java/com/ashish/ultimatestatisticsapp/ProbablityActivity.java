package com.ashish.ultimatestatisticsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ProbablityActivity extends AppCompatActivity {

    private EditText nofo;
    private EditText noto;
    private Button btn;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_probablity);

        nofo = (EditText)findViewById(R.id.nofo);
        noto = (EditText)findViewById(R.id.noto);
        btn = (Button)findViewById(R.id.btn);
        result = (TextView)findViewById(R.id.result);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nop = nofo.getText().toString();
                String noc = noto.getText().toString();
                int event = Integer.parseInt(noc) / Integer.parseInt(nop);
                result.setText("Problablity of this data is : "+String.valueOf(event));


            }
        });

    }
}
