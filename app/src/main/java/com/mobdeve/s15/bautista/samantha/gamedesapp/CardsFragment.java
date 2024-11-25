package com.mobdeve.s15.bautista.samantha.gamedesapp;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class CardsFragment extends Fragment {

    private RecyclerView recyclerView;
    private CardAdapter adapter;
    private ArrayList<CardModel> cardList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cards, container, false);

        recyclerView = view.findViewById(R.id.RecyclerViewCard);
        cardList = new ArrayList<>();

        // Sample data
        cardList.add(new CardModel(R.drawable.card1, "Card 1", "Type 1", "Kill"));
        cardList.add(new CardModel(R.drawable.card2, "Card 2", "Type 2", "Kill"));
        cardList.add(new CardModel(R.drawable.card3, "Card 3", "Type 3", "Kill"));
        cardList.add(new CardModel(R.drawable.card4, "Card 4", "Type 4", "Kill"));
        cardList.add(new CardModel(R.drawable.card5, "Card 5", "Type 5", "Kill"));
        cardList.add(new CardModel(R.drawable.card1, "Card 1", "Type 1", "Kill"));
        cardList.add(new CardModel(R.drawable.card2, "Card 2", "Type 2", "Kill"));
        cardList.add(new CardModel(R.drawable.card3, "Card 3", "Type 3", "Kill"));
        cardList.add(new CardModel(R.drawable.card4, "Card 4", "Type 4", "Kill"));
        cardList.add(new CardModel(R.drawable.card5, "Card 5", "Type 5", "Kill"));
        cardList.add(new CardModel(R.drawable.card1, "Card 1", "Type 1", "Kill"));
        cardList.add(new CardModel(R.drawable.card2, "Card 2", "Type 2", "Kill"));
        cardList.add(new CardModel(R.drawable.card3, "Card 3", "Type 3", "Kill"));
        cardList.add(new CardModel(R.drawable.card4, "Card 4", "Type 4", "Kill"));
        cardList.add(new CardModel(R.drawable.card5, "Card 5", "Type 5", "Kill"));


        adapter = new CardAdapter(requireContext(), cardList);

        // Set GridLayoutManager for 3 cards per row
        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), 3)); //change the number of cards per row
        recyclerView.setAdapter(adapter);

        return view;
    }
}
