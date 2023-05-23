package com.example.a2025123051experiment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.uc2);

        button = (Button) findViewById(R.id.btn5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backtoHomepage();
            }
        });

    }
    public void backtoHomepage(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

    }
}