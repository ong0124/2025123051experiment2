package com.example.a2025123051experiment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class vertical extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verticallayout);

        button = (Button) findViewById(R.id.HLbtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHLayout();
            }
        });
        button = (Button) findViewById(R.id.VLbtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openVLayout();
            }
        });
        button = (Button) findViewById(R.id.LLbtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLLayout();
            }
        });
        button = (Button) findViewById(R.id.homeButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backtohomepage();
            }
        });
    }
    public void openHLayout(){
        Intent intent = new Intent(this,horizontal.class);
        startActivity(intent);
    }
    public void openLLayout(){
        Intent intent = new Intent(this,alignLeft.class);
        startActivity(intent);
    }
    public void openVLayout(){
        Intent intent = new Intent(this,vertical.class);
        startActivity(intent);
    }
    public void backtohomepage(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}