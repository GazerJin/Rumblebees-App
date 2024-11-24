package com.mobdeve.s15.bautista.samantha.gamedesapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CardAdapter extends RecyclerView.Adapter<CardHolder> {

    private Context context;
    private ArrayList<CardModel> cardList;

    public CardAdapter(Context context, ArrayList<CardModel> cardList) {
        this.context = context;
        this.cardList = cardList;
    }

    @NonNull
    @Override
    public CardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.single_card, parent, false);
        return new CardHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardHolder holder, int position) {
        CardModel card = cardList.get(position);

        holder.cardImage.setImageResource(card.getImage());
        holder.cardName.setText(card.getName());
        holder.cardType.setText(card.getType());
    }

    @Override
    public int getItemCount() {
        return cardList.size();
    }
}
