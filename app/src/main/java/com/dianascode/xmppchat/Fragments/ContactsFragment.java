package com.dianascode.xmppchat.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dianascode.xmppchat.Adapter.ContactRecyclerView;
import com.dianascode.xmppchat.Models.Contact;
import com.dianascode.xmppchat.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContactsFragment extends Fragment {


    public ContactsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contacts, container, false);

        showToolbar(getResources().getString(R.string.contacts), false, view);

        RecyclerView contactsRecycler = (RecyclerView) view.findViewById(R.id.contact_recycler);

        /*darle forma*/
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        contactsRecycler.setLayoutManager(linearLayoutManager);

        /*creo adaptador */
        ContactRecyclerView contactRecyclerView = new ContactRecyclerView(
                getContacts(), R.layout.cardview_contact, getActivity());

        contactsRecycler.setAdapter(contactRecyclerView);

        return view;



    }

    public void showToolbar(String title, boolean upButton, View view){
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
         /*para que se vea en versiones anteriores*/
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(title);
        /* en caso de que tenga boton de regreso hacemos que sea visible*/
        ((AppCompatActivity) getActivity()).getSupportActionBar()
                .setDisplayHomeAsUpEnabled(upButton);



    }


    public ArrayList<Contact> getContacts(){
        ArrayList<Contact> contacts = new ArrayList<>();
        String image1 = "http://icon-icons.com/icons2/689/PNG/512/android_robot_mobile_mood_emoji_icon-icons.com_61443.png";
        String image2 = "http://icon-icons.com/icons2/689/PNG/128/android_robot_mobile_mood_emoji_smile_happy_successful_icon-icons.com_61431.png";
        String image3 ="http://icon-icons.com/icons2/689/PNG/128/android_robot_mobile_mood_emoji_happy_smile_successful_icon-icons.com_61441.png";
        String image4 = "http://icon-icons.com/icons2/689/PNG/128/android_robot_mobile_mood_emoji_crash_bug_dead_icon-icons.com_61439.png";
        String image5 = "http://icon-icons.com/icons2/689/PNG/128/android_robot_mobile_mood_emoji_happy_joke_tounge_icon-icons.com_61434.png";
        String image6 = "http://icon-icons.com/icons2/689/PNG/128/android_robot_mobile_mood_emoji_sad_icon-icons.com_61440.png";
        String image7 = "http://icon-icons.com/icons2/689/PNG/128/android_robot_mobile_mood_emoji_love_lovely_icon-icons.com_61435.png";
        String image8 = "http://icon-icons.com/icons2/689/PNG/128/android_robot_mobile_mood_emoji_angry_upset_icon-icons.com_61442.png";
        String image9 = "http://icon-icons.com/icons2/689/PNG/128/android_robot_mobile_mood_emoji_sad_tear_icon-icons.com_61433.png";
        String image10 = "http://icon-icons.com/icons2/689/PNG/128/android_robot_mobile_mood_emoji_sad_crying_icon-icons.com_61436.png";
        String image11 = "http://icon-icons.com/icons2/689/PNG/128/android_robot_mobile_sleeping_tired_icon-icons.com_61438.png";
        String image12 = "http://icon-icons.com/icons2/689/PNG/128/android_robot_mobile_mood_emoji_happy_smile_icon-icons.com_61437.png";

        contacts.add(new Contact("diana","Diana Melgarejo","Available", image1));
        contacts.add(new Contact("ivan","Ivan Melgarejo","Available",image2));
        contacts.add(new Contact("luis","Diana Melgarejo","Available",image3));
        contacts.add(new Contact("andrea","Ivan Melgarejo","Available",image4));
        contacts.add(new Contact("cesar","Diana Melgarejo","Available",image5));
        contacts.add(new Contact("edu","Ivan Melgarejo","Available",image6));
        contacts.add(new Contact("mama","Diana Melgarejo","Available",image7));
        contacts.add(new Contact("papa","Ivan Melgarejo","Available",image8));
        contacts.add(new Contact("francisco","Diana Melgarejo","Available",image9));
        contacts.add(new Contact("carlos","Ivan Melgarejo","Available",image10));
        contacts.add(new Contact("elena","Diana Melgarejo","Available",image11));
        contacts.add(new Contact("manu","Ivan Melgarejo","Available",image12));


        return contacts;
    }
}
