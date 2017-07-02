package com.example.android.project_podcastplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button podDetailsButton = (Button) findViewById(R.id.button_home_to_podcast_details);
        podDetailsButton.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // create a new Intent to open the PodcastDetails Activity
                Intent podDetailsIntent = new Intent(MainActivity.this, PodcastDetails.class);

                // start the new Activity
                startActivity(podDetailsIntent);
            }

        });

        Button fullPlayerButton = (Button) findViewById(R.id.button_home_to_full_player);
        fullPlayerButton.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // create a new Intent to open the PodcastPlayer Activity
                Intent fullPlayerIntent = new Intent(MainActivity.this, PodcastPlayer.class);

                // start the new Activity
                startActivity(fullPlayerIntent);
            }

        });

        Button paymentButton = (Button) findViewById(R.id.button_home_to_payment);
        paymentButton.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // create a new Intent to open the Payment Activity
                Intent paymentIntent = new Intent(MainActivity.this, Payment.class);

                // start the new Activity
                startActivity(paymentIntent);
            }

        });

    }

}