package com.example.android.project_podcastplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MyPodcasts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_podcasts);

        Button podDetailsButton = (Button) findViewById(R.id.button_mypodcasts_to_podcast_details);
        podDetailsButton.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // create a new Intent to open the PodcastDetails Activity
                Intent podDetailsIntent = new Intent(MyPodcasts.this, PodcastDetails.class);

                // start the new Activity
                startActivity(podDetailsIntent);
            }

        });

        Button fullPlayerButton = (Button) findViewById(R.id.button_mypodcasts_to_full_player);
        fullPlayerButton.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // create a new Intent to open the PodcastPlayer Activity
                Intent fullPlayerIntent = new Intent(MyPodcasts.this, PodcastPlayer.class);

                // start the new Activity
                startActivity(fullPlayerIntent);
            }

        });

        Button homeButton = (Button) findViewById(R.id.button_mypodcasts_to_home);
        homeButton.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // create a new Intent to open the PodcastPlayer Activity
                Intent homeIntent = new Intent(MyPodcasts.this, MainActivity.class);

                // start the new Activity
                startActivity(homeIntent);
            }

        });

    }
}
