package com.mobdeve.s15.bautista.samantha.gamedesapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InfoCardsActivity extends AppCompatActivity {

    private ImageView cardImage;
    private TextView cardName, cardDescription;
    private ImageButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_cards);

        cardImage = findViewById(R.id.Card_pic_info);
        cardName = findViewById(R.id.Card_Name_info);
        cardDescription = findViewById(R.id.Card_Description_info);
        backButton = findViewById(R.id.back_button);

        // Get data from intent
        Intent intent = getIntent();
        int imageRes = intent.getIntExtra("CARD_IMAGE", 0);
        String name = intent.getStringExtra("CARD_NAME");
        String type = intent.getStringExtra("CARD_TYPE");
        String description = intent.getStringExtra("CARD_DESCRIPTION");

        // Populate views
        cardImage.setImageResource(imageRes);
        cardName.setText(name);
        cardDescription.setText(description);

        // Back button functionality
        backButton.setOnClickListener(v -> finish());
    }
}
