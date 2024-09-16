package com.example.baithuchanhlab2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.LinearLayout;

import com.example.baithuchanhlab2.R;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout layout = findViewById(R.id.linear_layout);
        ImageView imageView = findViewById(R.id.my_image_view);
        TextView textView = findViewById(R.id.text_view);

        int[] colors = {
                getResources().getColor(R.color.purple_200),
                getResources().getColor(R.color.purple_500),
                getResources().getColor(R.color.purple_700),
                getResources().getColor(R.color.teal_200),
                getResources().getColor(R.color.teal_700),
                getResources().getColor(R.color.black),
                getResources().getColor(R.color.white)
        };

        int[] icons = {
                R.drawable.job1,
                R.drawable.job2,
                R.drawable.job3
        };

        Random random = new Random();
        int randomColor = colors[random.nextInt(colors.length)];

        int randomIcon = icons[random.nextInt(icons.length)];

        layout.setBackgroundColor(randomColor);

        imageView.setImageResource(randomIcon);


    }
}