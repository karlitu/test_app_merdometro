package com.example.app_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

    public class MainActivity extends AppCompatActivity {

    public EditText textinp;
    public TextView viewer;
    public Integer num = 0;
    List<String[]> lines = new ArrayList<String[]>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button butlog = findViewById(R.id.butlog);
        butlog.setOnClickListener(this::onClick);

        textinp = findViewById(R.id.inptxt);
        viewer = findViewById(R.id.viewer);

        try {
            txt.crea("inp.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void onClick(View v)
    {
        if (v.getId() == R.id.butlog) {
            num=funzion.cont(num);
            viewer.setText(num.toString());
            txt.modi("inp.txt", textinp.getText().toString());
        }
    }
}