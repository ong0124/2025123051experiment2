package com.example.a2025123051experiment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity4 extends AppCompatActivity {
    int[] images =new int[]{R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5};
    int imgStart=0;
    ImageView imageView;
    Handler handler =new Handler(){
        public void handleMessage(Message msg){
            super.handleMessage(msg);
            if(msg.what==1){
                imageView.setImageResource(images[imgStart++ % 5]);
            }
        }
    };

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uc3);

        button = (Button) findViewById(R.id.homeButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backtohomepage();
            }
        });
        imageView= findViewById(R.id.imageView);

        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(1);
            }
        },0,1500);
//
    }
    public void backtohomepage(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}