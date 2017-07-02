package com.example.android.project_podcastplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PodcastDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podcast_details);

        Button fullPlayerButton = (Button) findViewById(R.id.button_podcastdetails_to_full_player);
        fullPlayerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fullPlayerIntent = new Intent(PodcastDetails.this, PodcastPlayer.class);
                startActivity(fullPlayerIntent);
            }
        });

        Button homeButton = (Button) findViewById(R.id.button_podcastdetails_to_home);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(PodcastDetails.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        Button myPodsButton = (Button) findViewById(R.id.button_podcastdetails_to_mypodcasts);
        myPodsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myPodsIntent = new Intent(PodcastDetails.this,MyPodcasts.class);
                startActivity(myPodsIntent);
            }
        });

        Button discoverPodsButton = (Button) findViewById(R.id.button_podcastdetails_to_discoverpodcasts);
        discoverPodsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent discoverPodsIntent = new Intent(PodcastDetails.this,DiscoverPodcasts.class);
                startActivity(discoverPodsIntent);
            }
        });

    }
}
