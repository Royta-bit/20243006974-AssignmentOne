package com.example.assignmentone;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Detail screen of CampusLife. It receives the identifier of the service area
 * chosen on {@link MainActivity}; the content shown is still placeholder text
 * until the data in array.xml is wired up.
 */
public class DetailActivity extends AppCompatActivity {

    /** Key of the service area identifier passed in by {@link MainActivity}. */
    public static final String EXTRA_AREA = "com.example.assignmentone.extra.AREA";

    /** First position of the arrays, used when no identifier is supplied. */
    private static final int DEFAULT_AREA = MainActivity.AREA_FACILITIES;

    /** Service area chosen on the main screen. */
    private int area;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        area = getIntent().getIntExtra(EXTRA_AREA, DEFAULT_AREA);

        TextView titleView = findViewById(R.id.text_detail_title);
        titleView.setText(R.string.placeholder_title);

        findViewById(R.id.button_back).setOnClickListener(view -> finish());
    }
}
