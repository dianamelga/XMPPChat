package com.dianascode.xmppchat.Adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dianascode.xmppchat.Models.Chat;
import com.dianascode.xmppchat.Models.Contact;
import com.dianascode.xmppchat.R;

import java.util.ArrayList;

/**
 * Created by diana on 06/02/17.
 */

public class ChatListAdapterRecyclerView extends RecyclerView.Adapter<ChatListAdapterRecyclerView.ChatListViewHolder> {


    private ArrayList<Chat> chats;
    private int resource; /*recurso o cardview layout */
    private Activity activity;

    public ChatListAdapterRecyclerView(ArrayList<Chat> chats, int resource, Activity activity) {
        this.chats = chats;
        this.resource = resource;
        this.activity = activity;
    }

    @Override
    public ChatListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resource, parent,false);
        return new ChatListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ChatListViewHolder holder, int position) {
        Chat chat = chats.get(position);
        holder.user_or_group_contact.setText(chat.getUsername());
        holder.last_message.setText(chat.getLast_message());
        holder.time_last_message.setText(chat.getTime_last_message());

    }

    @Override
    public int getItemCount() {
        return chats.size();
    }

    public class ChatListViewHolder extends RecyclerView.ViewHolder{
        /* todos los views que componen al cardview*/

        private ImageView image_contact_card;
        private TextView user_or_group_contact;
        private TextView last_message;
        private TextView time_last_message;

        public ChatListViewHolder(View itemView) {
            super(itemView);

            image_contact_card = (ImageView) itemView.findViewById(R.id.picture_contact_cardview);
            user_or_group_contact = (TextView) itemView.findViewById(R.id.user_or_group_contact);
            last_message = (TextView) itemView.findViewById(R.id.chatlist_last_message);
            time_last_message = (TextView) itemView.findViewById(R.id.chatlist_time_last_message);

        }
    }

}
