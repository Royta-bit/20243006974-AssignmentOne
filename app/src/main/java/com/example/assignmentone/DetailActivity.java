package com.example.assignmentone;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Detail screen of CampusLife. It shows the title, icon and description of the
 * service area selected on {@link MainActivity}, all of which come from the
 * string arrays in array.xml.
 */
public class DetailActivity extends AppCompatActivity {

    /** Key of the service area identifier passed in by {@link MainActivity}. */
    public static final String EXTRA_AREA = "com.example.assignmentone.extra.AREA";

    /** First position of the arrays, used when no identifier is supplied. */
    private static final int DEFAULT_AREA = MainActivity.AREA_FACILITIES;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String[] titles = getResources().getStringArray(R.array.string_array_titles);
        String[] contents = getResources().getStringArray(R.array.string_array_content);
        String[] images = getResources().getStringArray(R.array.string_array_images);

        // Kept in range so an unexpected identifier can never index past the arrays.
        int area = Math.max(DEFAULT_AREA, Math.min(getIntent().getIntExtra(EXTRA_AREA, DEFAULT_AREA), titles.length - 1));

        String title = titles[area].trim();

        TextView titleView = findViewById(R.id.text_detail_title);
        titleView.setText(title);

        TextView contentView = findViewById(R.id.text_detail_content);
        contentView.setText(contents[area].trim());

        ImageView areaImage = findViewById(R.id.image_detail);
        areaImage.setImageResource(drawableFor(images[area].trim()));
        areaImage.setContentDescription(title);

        findViewById(R.id.button_back).setOnClickListener(view -> finish());
    }

    /**
     * Resolves a drawable name taken from array.xml, such as "img_btn_clubs",
     * to the identifier of that drawable.
     */
    private int drawableFor(String imageName) {
        return getResources().getIdentifier(imageName, "drawable", getPackageName());
    }
}
