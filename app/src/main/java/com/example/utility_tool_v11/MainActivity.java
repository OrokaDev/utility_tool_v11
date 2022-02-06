package com.example.utility_tool_v11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.clk_btn);
        b2 = (Button) findViewById(R.id.calc_btn);
        b3 = (Button) findViewById(R.id.stp_btn);
        b4 = (Button) findViewById(R.id.dev_btn);
        b5 = (Button) findViewById(R.id.gact_btn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClock();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCalculator();

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStopwatch();

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDevInfo();

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGrcAct();

            }
        });
    }
    public void openClock(){
        Intent intent = new Intent(this, Clock.class);
        startActivity(intent);
    }
    public void openCalculator() {
        Intent intent = new Intent(this, Calculator.class);
        startActivity(intent);
    }
    public void openStopwatch() {
        Intent intent = new Intent(this, Stopwatch.class);
        startActivity(intent);
    }
    public void openDevInfo() {
        Intent intent = new Intent(this, DevInfo.class);
        startActivity(intent);
    }
    public void openGrcAct() {
        Intent intent = new Intent(this, GrpActMain.class);
        startActivity(intent);
    }
}