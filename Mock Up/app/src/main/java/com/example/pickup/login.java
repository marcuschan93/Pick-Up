package com.example.pickup;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class login extends AppCompatActivity implements View.OnClickListener {
    private ImageView iw;
    private ImageButton costcoobtn,safewaybtn,cvsbtn;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Starting Chatbot", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                
                openchatbot();
            }


        });


        costcoobtn = (ImageButton) findViewById(R.id.imageButton3);
        costcoobtn.setOnClickListener(this);

        safewaybtn = (ImageButton) findViewById(R.id.imageButton2) ;
        safewaybtn.setOnClickListener(this);

        cvsbtn = (ImageButton) findViewById(R.id.imageButton4);
        cvsbtn.setOnClickListener(this);


        iw = (ImageView) findViewById(R.id.imageView);

        btn = (Button) findViewById(R.id.button10);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openaftersecond();

            }
        });

    }

    private void openaftersecond() {
        Intent aftersecond = new Intent(this, AfterSecondActivity.class);
        startActivity(aftersecond);
    }

    private void openchatbot() {
        Intent chatbot = new Intent(this,chatbotActivity.class);
        startActivity(chatbot);
    }


    @Override
    public void onClick(View v) {

        if (v == costcoobtn){
            iw.setImageResource(R.drawable.costco);
        }
        if (v == safewaybtn){
            iw.setImageResource(R.drawable.safeway_2_logo_png_transparent);
        }
        if (v == cvsbtn){
            iw.setImageResource(R.drawable.cvs);
        }

    }
}
