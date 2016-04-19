package com.sierrascope.youtubeplayer;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubePlayer;

public class YoutubeActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    // Google API key is a unique code assigned to this application granting access to the Youtube functionality
    private String GOOGLE_API_KEY = "TBA";
    // the YouTube video ID will point Android to a specific video from YOuTube to play within the application
    private String YOUTUBE_VIDEO_ID = "TBA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);
    }

}
