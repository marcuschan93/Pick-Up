package com.example.pickup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class FourActivity extends AppCompatActivity {
    private ImageButton maps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        Uri uri = Uri.parse("https://goo.gl/maps/Yh3MoE7CWpA5sNBd7");
        maps = (ImageButton) findViewById(R.id.imageButton);
        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmapsviewActivity();
            }
        });
    }

    private void openmapsviewActivity() {
        Uri uri = Uri.parse("https://goo.gl/maps/Yh3MoE7CWpA5sNBd7");
        Intent startmapsview = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(startmapsview);
    }
}
