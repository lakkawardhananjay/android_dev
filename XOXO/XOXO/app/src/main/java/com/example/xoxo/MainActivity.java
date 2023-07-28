package com.example.xoxo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public int i=0;
    private ImageButton im1, im2, im3, im4, im5, im6, im7, im8, im9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the instance variables
        im1 = findViewById(R.id.Button1);
        im2 = findViewById(R.id.Button2);
        im3 = findViewById(R.id.Button3);
        im4 = findViewById(R.id.Button4);
        im5 = findViewById(R.id.Button5);
        im6 = findViewById(R.id.Button6);
        im7 = findViewById(R.id.Button7);
        im8 = findViewById(R.id.Button8);
        im9 = findViewById(R.id.Button9);

        Button clear = findViewById(R.id.button);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = 0;
                im1.setBackgroundResource(R.drawable.img);
                im2.setBackgroundResource(R.drawable.img);
                im3.setBackgroundResource(R.drawable.img);
                im4.setBackgroundResource(R.drawable.img);
                im5.setBackgroundResource(R.drawable.img);
                im6.setBackgroundResource(R.drawable.img);
                im7.setBackgroundResource(R.drawable.img);
                im8.setBackgroundResource(R.drawable.img);
                im9.setBackgroundResource(R.drawable.img);

            }
        });
    }

    public void onImageClick(View view) {
        i++;
        //System.out.println("value"+i);
        if (i % 2 == 0) {
            //Toast.makeText(this, "Hi even", Toast.LENGTH_SHORT).show();
            view.setBackgroundResource(R.drawable.o);
            AlphaAnimation animation = new AlphaAnimation(0.0f, 1.0f);
            animation.setDuration(500);
            view.startAnimation(animation);
        } else {
            //Toast.makeText(this, "Hi odd", Toast.LENGTH_SHORT).show();
            view.setBackgroundResource(R.drawable.x);
            AlphaAnimation animation = new AlphaAnimation(0.0f, 1.0f);
            animation.setDuration(500);
            view.startAnimation(animation);
        }
    }
    public void logic()
    {

    }
}
