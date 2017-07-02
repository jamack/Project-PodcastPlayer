package com.example.android.project_podcastplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class DiscoverPodcasts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover_podcasts);

        Button podDetailsButton = (Button) findViewById(R.id.button_discoverpodcasts_to_podcast_details);
        podDetailsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent podDetailsIntent = new Intent(DiscoverPodcasts.this,PodcastDetails.class);
                startActivity(podDetailsIntent);
            }
        });

        Button fullPlayerButton = (Button) findViewById(R.id.button_discoverpodcasts_to_full_player);
        fullPlayerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fullPlayerIntent = new Intent(DiscoverPodcasts.this,PodcastPlayer.class);
                startActivity(fullPlayerIntent);
            }
        });

        Button homeButton = (Button) findViewById(R.id.button_discoverpodcasts_to_home);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(DiscoverPodcasts.this,MainActivity.class);
                startActivity(homeIntent);
            }
        });

    }
}
