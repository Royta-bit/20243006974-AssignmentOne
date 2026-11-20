package com.example.assignmentone;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Landing screen of CampusLife. It presents the banner and the four service
 * areas the application covers, and opens {@link DetailActivity} for whichever
 * area the user taps.
 */
public class MainActivity extends AppCompatActivity {

    /** Position of each service area inside the arrays held in array.xml. */
    public static final int AREA_FACILITIES = 0;
    public static final int AREA_EVENTS = 1;
    public static final int AREA_CLUBS = 2;
    public static final int AREA_SUPPORT = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton facilitiesButton = findViewById(R.id.button_facilities);
        facilitiesButton.setOnClickListener(view -> openArea(AREA_FACILITIES, R.string.facilities));

        ImageButton eventsButton = findViewById(R.id.button_events);
        eventsButton.setOnClickListener(view -> openArea(AREA_EVENTS, R.string.events));

        ImageButton clubsButton = findViewById(R.id.button_clubs);
        clubsButton.setOnClickListener(view -> openArea(AREA_CLUBS, R.string.clubs));

        ImageButton supportButton = findViewById(R.id.button_support);
        supportButton.setOnClickListener(view -> openArea(AREA_SUPPORT, R.string.support));
    }

    /**
     * Confirms the tap with a toast and starts the detail screen for the given
     * area, handing over the identifier that selects its content.
     *
     * @param area     one of the AREA_* constants, which is also the index of
     *                 the entry to show in the arrays from array.xml
     * @param labelRes name of the area, used for the toast message
     */
    private void openArea(int area, int labelRes) {
        Toast.makeText(this, getString(R.string.tile_clicked, getString(labelRes)), Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA_AREA, area);
        startActivity(intent);
    }
}
