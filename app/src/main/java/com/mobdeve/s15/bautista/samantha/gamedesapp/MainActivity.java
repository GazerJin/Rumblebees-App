package com.mobdeve.s15.bautista.samantha.gamedesapp;

import android.os.Bundle;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize navbar
        BottomNavigationView navbar = findViewById(R.id.navbarBnv);

        // Set default fragment
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CardsFragment()).commit();
        }

        // Set up item selection listener
        navbar.setOnItemSelectedListener(item -> {
            Fragment selectedFragment = null;
/*
            // Navigate to selected fragment
            switch (item.getItemId()) {
                case R.id.fragment_cards:
                    selectedFragment = new CardsFragment();
                    break;
                case R.id.fragment_board:
                    selectedFragment = new BoardFragment();
                    break;
                case R.id.fragment_combat:
                    selectedFragment = new CombatFragment();
                    break;
                case R.id.fragment_help:
                    selectedFragment = new HelpFragment();
                    break;
            }

            if (selectedFragment != null) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
            }
            */
            return true;
        });

    }
}