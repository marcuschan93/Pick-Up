package com.example.pickup;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;


public class AfterSecondActivity extends Activity {
    private Button seetrending;
    private ImageButton trendingbtn;
    private ImageView chart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_second_activity);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Starting Chatbot", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                openchatbot();
            }


        });

        seetrending = (Button) findViewById(R.id.seetrending);
        seetrending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlocation();
            }
        });

        trendingbtn = (ImageButton)findViewById(R.id.imageView4);
        trendingbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openheatmap();
            }
        });
    }

    private void openheatmap() {
        Intent heatmap = new Intent(this,FourActivity.class);
        startActivity(heatmap);
    }


    public void toastMsg (String msg){

        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();
    }

    public void displayToastMsg(View v){
        toastMsg("You have to import more:" +
                "Toilet paper " + "+ Water "+ "+ Can Food ");

    }

    private void openlocation() {
        Uri uri = Uri.parse("https://goo.gl/maps/Yh3MoE7CWpA5sNBd7");
        Intent startmapsview = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(startmapsview);
    }
    private void openchatbot() {
        Intent chatbot = new Intent(this,chatbotActivity.class);
        startActivity(chatbot);
    }
}

