package com.example.androiduitesting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        // Optional: show an "Up" arrow in the ActionBar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        String cityName = getIntent().getStringExtra("city_name");

        TextView title = findViewById(R.id.text_city_name);
        title.setText(cityName != null ? cityName : "(no city)");

        // Explicit back button in the UI
        Button backBtn = findViewById(R.id.button_back);
        backBtn.setOnClickListener(v -> finish());
    }

    // Handle ActionBar "Up" press (optional)
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
