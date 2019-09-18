package com.example.fruitshelath;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsItem extends AppCompatActivity {

    ImageView imageView;
    TextView name, manfaat;
    int image;
    String name_buah, manfaat_buah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_item);
        getSupportActionBar().setTitle("Details Buah "  );
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        imageView = findViewById(R.id.image);
        name = findViewById(R.id.name);
        manfaat = findViewById(R.id.manfaat);

        name_buah = getIntent().getStringExtra("name");
        manfaat_buah = getIntent().getStringExtra("manfaat");
        image = getIntent().getIntExtra("image",0);

        name.setText(name_buah);
        manfaat.setText(manfaat_buah);
        imageView.setImageResource(image);
    }
}
