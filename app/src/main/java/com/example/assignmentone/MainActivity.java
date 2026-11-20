package com.example.assignmentone;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Landing screen of CampusLife. It presents the banner and the four service
 * areas the application covers.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton facilitiesButton = findViewById(R.id.button_facilities);
        facilitiesButton.setOnClickListener(view -> announceArea(R.string.facilities));

        ImageButton eventsButton = findViewById(R.id.button_events);
        eventsButton.setOnClickListener(view -> announceArea(R.string.events));

        ImageButton clubsButton = findViewById(R.id.button_clubs);
        clubsButton.setOnClickListener(view -> announceArea(R.string.clubs));

        ImageButton supportButton = findViewById(R.id.button_support);
        supportButton.setOnClickListener(view -> announceArea(R.string.support));
    }

    /**
     * Reports which area was tapped, which confirms that every button reacts to
     * a click.
     *
     * @param labelRes name of the area that was tapped
     */
    private void announceArea(int labelRes) {
        Toast.makeText(this, getString(R.string.tile_clicked, getString(labelRes)), Toast.LENGTH_SHORT).show();
    }
}
