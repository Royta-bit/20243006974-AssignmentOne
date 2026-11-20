package com.example.assignmentone;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Detail screen of CampusLife. The content is still placeholder text carried
 * over from the layout, ready to be replaced by the data in array.xml.
 */
public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView titleView = findViewById(R.id.text_detail_title);
        titleView.setText(R.string.placeholder_title);

        findViewById(R.id.button_back).setOnClickListener(view -> finish());
    }
}
