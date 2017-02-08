package com.dianascode.xmppchat.Activities;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.dianascode.xmppchat.Fragments.ChatListFragment;
import com.dianascode.xmppchat.Fragments.ContactsFragment;
import com.dianascode.xmppchat.Models.Contact;
import com.dianascode.xmppchat.R;


public class ChatActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        ChatListFragment chatListFragment = new ChatListFragment();
        callFragment(chatListFragment);

        /* declaro mi bottom bar*/
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation_view);

        /*que mi tab de contactos este seleccionado por default*/

        ContactsFragment contactsFragment = new ContactsFragment();
        callFragment(contactsFragment);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int tab = item.getItemId();
                switch (tab) {
                    case (R.id.item_contact):
                        ContactsFragment homeFragment = new ContactsFragment();
                        callFragment(homeFragment);
                        break;

                    case (R.id.item_chat):
                        ChatListFragment searchFragment = new ChatListFragment();
                        callFragment(searchFragment);
                        break;

                    default:
                        break;

                }
                return false;
            }
        });



    }



    public void callFragment(Fragment fragment){

        getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .addToBackStack(null).commit();

    }

}
