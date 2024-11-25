package com.mobdeve.s15.bautista.samantha.gamedesapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CardHolder extends RecyclerView.ViewHolder {

    ImageView cardImage;
    TextView cardName, cardType,carDescription;

    public CardHolder(@NonNull View itemView) {
        super(itemView);

        cardImage = itemView.findViewById(R.id.Card_pic);
        cardName = itemView.findViewById(R.id.Card_Name);
        cardType = itemView.findViewById(R.id.Card_Type);
    }
}
