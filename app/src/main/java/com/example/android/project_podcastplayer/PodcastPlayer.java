package com.example.android.project_podcastplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PodcastPlayer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podcast_player);

        Button podDetailsButton = (Button) findViewById(R.id.button_full_player_to_podcast_details);
        podDetailsButton.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // create a new Intent to open the PodcastDetails Activity
                Intent podDetailsIntent = new Intent(PodcastPlayer.this, PodcastDetails.class);

                // start the new Activity
                startActivity(podDetailsIntent);
            }

        });

        Button homeButton = (Button) findViewById(R.id.button_full_player_to_home);
        homeButton.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // create a new Intent to open the Main Activity
                Intent homeIntent = new Intent(PodcastPlayer.this, MainActivity.class);

                // start the new Activity
                startActivity(homeIntent);
            }

        });

        Button myPodsButton = (Button) findViewById(R.id.button_full_player_to_mypodcasts);
        myPodsButton.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // create a new Intent to open the MyPodcasts Activity
                Intent myPodsIntent = new Intent(PodcastPlayer.this, MyPodcasts.class);

                // start the new Activity
                startActivity(myPodsIntent);
            }

        });

        Button podDiscoveryButton = (Button) findViewById(R.id.button_full_player_to_discoverpodcasts);
        podDiscoveryButton.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // create a new Intent to open the DiscoverPodcasts Activity
                Intent discoverIntent = new Intent(PodcastPlayer.this, DiscoverPodcasts.class);

                // start the new Activity
                startActivity(discoverIntent);
            }

        });

    }
}
