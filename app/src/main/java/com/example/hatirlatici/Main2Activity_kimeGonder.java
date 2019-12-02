package com.example.hatirlatici;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class Main2Activity_kimeGonder extends AppCompatActivity
{
    Button ekleButonu,tarihSecButton,saatSecButton,otomatikGonderButton,hazirMesajlariGorButonu;
    TextView kisiSecTextView,tarihSecTextView,saatSevTextView,mesajYazTextView,saatGosterText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_kime_gonder);


        AlarmManager alarmManager=(AlarmManager) getSystemService(ALARM_SERVICE);

        final TimePicker timePicker=findViewById(R.id.alertTimePicker);

        final Calendar calendar=Calendar.getInstance();

        Button alarmKur=findViewById(R.id.alertAlarmKurButton);
        Button alarmKapat=findViewById(R.id.alertAlarmKapatButton);
        /*calender ile zaman saat dakika özellikleri almamızı sağlar.*/
        saatGosterText=findViewById(R.id.saatGosterText);

        alarmKur.setOnClickListener(new View.OnClickListener()
        {

            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v)
            {
                calendar.set(Calendar.HOUR_OF_DAY,timePicker.getHour());
                calendar.set(Calendar.MINUTE,timePicker.getMinute());

                int hour=timePicker.getHour();
                int minute=timePicker.getMinute();

                String hourst=String.valueOf(hour);
                String minutest=String.valueOf(minute);

                saatGosterText.setText(hourst + ":" + minutest);
            }
        });


        alarmKapat.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

            }
        });

        component2();

       hazirMesajlariGorButonu.setOnClickListener(new View.OnClickListener()
       {
           @Override
           public void onClick(View v)
           {
               activity3Gec();
           }
       });

        saatSecButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                alertDialogClockac();
            }
        });


    }
    public void component2()
    {
        ekleButonu=findViewById(R.id.ekleButonu);
        tarihSecButton=findViewById(R.id.tarihSecButton);
        saatSecButton=findViewById(R.id.saatSecButton);
        otomatikGonderButton=findViewById(R.id.otomatikGonderButton);
        hazirMesajlariGorButonu=findViewById(R.id.hazirMesajlariGorButonu);

        kisiSecTextView=findViewById(R.id.kisiSecTextView);
        tarihSecTextView=findViewById(R.id.tarihSecTextView);
        saatSevTextView=findViewById(R.id.saatSevTextView);
        mesajYazTextView=findViewById(R.id.mesajYazTextView);

    }
    public void activity3Gec()
    {
        Intent activity3Gecis=new Intent(this,Main3Activity_hazirMesajlar.class);
        startActivity(activity3Gecis);
    }

    public void alertDialogClockac()
    {
        LayoutInflater ınflater=getLayoutInflater();
        View alert=ınflater.inflate(R.layout.alert_layout_clock,null);
    }

}
