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
        contacts.add(new Contact("diana","Diana Melgarejo","Available"));
        contacts.add(new Contact("ivan","Ivan Melgarejo","Available"));
        contacts.add(new Contact("luis","Diana Melgarejo","Available"));
        contacts.add(new Contact("andrea","Ivan Melgarejo","Available"));
        contacts.add(new Contact("cesar","Diana Melgarejo","Available"));
        contacts.add(new Contact("edu","Ivan Melgarejo","Available"));
        contacts.add(new Contact("mama","Diana Melgarejo","Available"));
        contacts.add(new Contact("papa","Ivan Melgarejo","Available"));
        contacts.add(new Contact("francisco","Diana Melgarejo","Available"));
        contacts.add(new Contact("carlos","Ivan Melgarejo","Available"));
        contacts.add(new Contact("elena","Diana Melgarejo","Available"));
        contacts.add(new Contact("manu","Ivan Melgarejo","Available"));


        return contacts;
    }
}
