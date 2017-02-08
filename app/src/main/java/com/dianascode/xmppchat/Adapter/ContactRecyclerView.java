package com.dianascode.xmppchat.Adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dianascode.xmppchat.Activities.ChatContactActivity;
import com.dianascode.xmppchat.Models.Contact;
import com.dianascode.xmppchat.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by diana on 04/02/17.
 */

public class ContactRecyclerView extends RecyclerView.Adapter<ContactRecyclerView.ContactViewHolder>{

    private ArrayList<Contact> contacts;
    private int resource; /*recurso o cardview layout */
    private Activity activity;

    public ContactRecyclerView(ArrayList<Contact> contacts, int resource, Activity activity) {
        this.contacts = contacts;
        this.resource = resource;
        this.activity = activity;
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resource, parent,false);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
        Contact contact = contacts.get(position);
        holder.user_state_card.setText(contact.getState());
        holder.username_contact_card.setText(contact.getUsername());
        Picasso.with(activity).load(contact.getImage()).into(holder.image_contact_card);

        holder.image_contact_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, ChatContactActivity.class);

                activity.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder{
        /* todos los views que componen al cardview*/

        private ImageView image_contact_card;
        private TextView username_contact_card;
        private TextView user_state_card;

        public ContactViewHolder(View itemView) {
            super(itemView);

            image_contact_card = (ImageView) itemView.findViewById(R.id.picture_contact_cardview);
            username_contact_card = (TextView) itemView.findViewById(R.id.user_contact);
            user_state_card = (TextView) itemView.findViewById(R.id.user_contact_state);


        }
    }
}

