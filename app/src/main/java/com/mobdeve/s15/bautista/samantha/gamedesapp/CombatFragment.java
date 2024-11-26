package com.mobdeve.s15.bautista.samantha.gamedesapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class CombatFragment extends Fragment {
    private AutoCompleteTextView dropdownMenu;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_combat, container, false);

        // Initialize the dropdown
        dropdownMenu = view.findViewById(R.id.dropdown_menu);

        // Dropdown items
        String[] beeTypes = {"Soldier Bee", "Drone Bee", "Other Bee"};

        // Set up the ArrayAdapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                requireContext(),
                android.R.layout.simple_list_item_1, // Default item layout
                beeTypes
        );

        // Attach the adapter to the AutoCompleteTextView
        dropdownMenu.setAdapter(adapter);

        // Show dropdown when clicked
        dropdownMenu.setOnClickListener(v -> dropdownMenu.showDropDown());

        // Disable manual input
        dropdownMenu.setKeyListener(null);

        return view;
    }
}
