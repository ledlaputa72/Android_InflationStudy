package com.example.inflationstudy;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    FrameLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView 이전에 객체를 실행하면 에러 발생
        /*Button button = (Button) findViewById(R.id.button);
        button.setText("Start");*/
        setContentView(R.layout.activity_main); //내부적으로 메모리에 객체를 만들어준다. inflation 작업

        container = (FrameLayout) findViewById(R.id.container);

        // setContentView 이후에 해야한다.
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                inflater.inflate(R.layout.sub1, container, true);

            }
        });

        //setContentView(R.layout.activity_main); //에러 발생



    }
}
