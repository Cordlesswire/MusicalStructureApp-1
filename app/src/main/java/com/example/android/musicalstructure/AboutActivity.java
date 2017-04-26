package com.example.android.musicalstructure;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_about);
        Button nowPlaying = (Button) findViewById(R.id.now_playing_button);
        nowPlaying.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(AboutActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

    }
}
