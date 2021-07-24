package com.example.test;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.salesforce.android.chat.core.ChatConfiguration;
import com.salesforce.android.chat.ui.ChatUI;
import com.salesforce.android.chat.ui.ChatUIClient;
import com.salesforce.android.chat.ui.ChatUIConfiguration;
import com.salesforce.android.service.common.utilities.control.Async;

public class MainChat extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat);

        ChatConfiguration chatConfiguration =
                new ChatConfiguration.Builder(ORG_ID, BUTTON_ID,
                        DEPLOYMENT_ID, LIVE_AGENT_POD)
                        .build();
        // Configure a chat UI object
        ChatUI.configure(ChatUIConfiguration.create(chatConfiguration))
                .createClient(getApplicationContext())
                .onResult(new Async.ResultHandler<ChatUIClient>() {
                    @Override public void handleResult (Async<?> operation,
                                                        ChatUIClient chatUIClient) {

                        // Once configured, let’s start a chat session
                        chatUIClient.startChatSession(MainChat.this);
                    }
                });
    }
    public static final String ORG_ID = "YOUR_ORG_ID";
    public static final String DEPLOYMENT_ID = "YOUR_DEPLOYMENT_ID";
    public static final String BUTTON_ID = "YOUR_BUTTON_ID";
    public static final String LIVE_AGENT_POD = "YOUR_LAC_ORG_URL";
}
