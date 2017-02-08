package com.dianascode.xmppchat.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.dianascode.xmppchat.R;

public class ChatContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_contact);

        showToolbarCustom("",true);

    }

    public void showToolbarCustom(String title, boolean upButton){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_chat_contact);
         /*para que se vea en versiones anteriores*/
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);
        /* en caso de que tenga boton de regreso hacemos que sea visible*/
        getSupportActionBar()
                .setDisplayHomeAsUpEnabled(upButton);



    }
}
