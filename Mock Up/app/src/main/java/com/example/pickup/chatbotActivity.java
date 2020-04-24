package com.example.pickup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import co.intentservice.chatui.ChatView;
import co.intentservice.chatui.models.ChatMessage;

public class chatbotActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatbot);


        ChatView chatView1 = (ChatView) findViewById(R.id.chat_view);
        chatView1.addMessage(new ChatMessage("Welcome to Pick Up", System.currentTimeMillis(), ChatMessage.Type.RECEIVED,"COVID-19"));
        chatView1.addMessage(new ChatMessage("I'm chatbot! Let me know if you have any question!!!",
                System.currentTimeMillis(), ChatMessage.Type.RECEIVED));
        chatView1.setOnSentMessageListener(new ChatView.OnSentMessageListener(){
            @Override
            public boolean sendMessage(ChatMessage chatMessage){
                // perform actual message sending
                return true;
            }
        });



        chatView1.setTypingListener(new ChatView.TypingListener(){
            @Override
            public void userStartedTyping(){
                // will be called when the user starts typing
            }

            @Override
            public void userStoppedTyping(){
                // will be called when the user stops typing
            }
        });




    }


}
