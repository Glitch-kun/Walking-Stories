package com.example.alex.walkingstories;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import java.io.IOException;

public class StoryActivity extends FragmentActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle b = getIntent().getExtras();
        String avfilename = "";
        if (b != null) {
            avfilename = b.getString();
        }
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource(context, Uri.parse(avfilename));
            mediaPlayer.prepare();
            mediaPlayer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
