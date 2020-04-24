package com.example.pickup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import co.intentservice.chatui.ChatView;
import co.intentservice.chatui.models.ChatMessage;

public class MainActivity extends AppCompatActivity {
    private Button storebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        storebtn = (Button) findViewById(R.id.button);
        storebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openLoginActivity();

            }
        });
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                openchatbot();
            }


        });


    }

    private void openLoginActivity() {
        Intent loginbtn = new Intent(this,login.class);
        startActivity(loginbtn);

    }
    private void openchatbot() {
        Intent chatbot = new Intent(this,chatbotActivity.class);
        startActivity(chatbot);
    }

}
