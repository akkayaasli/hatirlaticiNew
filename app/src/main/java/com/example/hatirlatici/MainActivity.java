package com.example.hatirlatici;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView textview1;
    Button ekleButonu;
    ImageView girisEkraniImageView;
    private Activity view;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        component();


        ekleButonu.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                activity2Gecis();
            }
        });
    }
    public void activity2Gecis()
    {
        Intent activity2=new Intent(this,Main2Activity_kimeGonder.class);
        startActivity(activity2);
    }
    public void component()
    {
        textview1=view.findViewById(R.id.textView1);//LOOK
        girisEkraniImageView=findViewById(R.id.girisEkraniImageView);
        ekleButonu=findViewById(R.id.ekleButonu);
    }



}
