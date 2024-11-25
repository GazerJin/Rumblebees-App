package com.mobdeve.s15.bautista.samantha.gamedesapp;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private NavController navController;
    private BottomNavigationView navbar;
    private TextView toolbarText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize NavHostFragment
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager()
                .findFragmentById(R.id.nav_host_fragment);
        navController = navHostFragment.getNavController();

        // Initialize BottomNavigationView
        navbar = findViewById(R.id.navbarBnv);
        navbar.setItemRippleColor(ColorStateList.valueOf(Color.TRANSPARENT));

        // Connect BottomNavigationView to NavController
        NavigationUI.setupWithNavController(navbar, navController);

        // Find the TextView in the Toolbar
        toolbarText = findViewById(R.id.card_toolbar);

        // Listen for fragment changes
        navController.addOnDestinationChangedListener((controller, destination, arguments) -> {
            if (destination.getId() == R.id.fragment_combat) {
                updateToolbarForCombat();
            } else if (destination.getId() == R.id.fragment_help) {
                updateToolbarForHelp();
            } else if (destination.getId() == R.id.fragment_board) {
                updateToolbarForBoard();
            } else {
                resetToolbar();
            }
        });
    }

    private void updateToolbarForCombat() {
        toolbarText.setText("Combat");
        toolbarText.setGravity(Gravity.CENTER); // Center the text

    }

    private void updateToolbarForHelp() {
        toolbarText.setText("Help");
        toolbarText.setGravity(Gravity.CENTER); // Center the text

    }

    private void updateToolbarForBoard() {
        toolbarText.setText("Board");
        toolbarText.setGravity(Gravity.CENTER); // Center the text

    }

    private void resetToolbar() {
        toolbarText.setText("Cards");

    }
}
