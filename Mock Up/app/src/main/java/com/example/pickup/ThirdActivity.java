package com.example.pickup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class ThirdActivity extends AppCompatActivity {
    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        next = (Button) findViewById(R.id.buttonnext2);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openafterthird();
            }
        });

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Starting Chatbot", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                openchatbot();
            }


        });
    }

    private void openafterthird() {
        Intent afterthird = new Intent(this,AfterThirdActivity.class);
        startActivity(afterthird);
    }

    private void openchatbot() {
        Intent chatbot = new Intent(this,chatbotActivity.class);
        startActivity(chatbot);
    }

}
