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

import com.dianascode.xmppchat.Adapter.ChatListAdapterRecyclerView;
import com.dianascode.xmppchat.Models.Chat;
import com.dianascode.xmppchat.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChatListFragment extends Fragment {


    public ChatListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chat_list, container, false);

        showToolbar(getResources().getString(R.string.chatlist), false, view);

        RecyclerView chatListRecycler = (RecyclerView) view.findViewById(R.id.chatlist_recycler);

        /* darle forma*/
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        chatListRecycler.setLayoutManager(linearLayoutManager);

        /*crea adaptador*/
        ChatListAdapterRecyclerView chatListAdapter = new ChatListAdapterRecyclerView(
                getChatList(), R.layout.cardview_chatlist, getActivity()
        );

        chatListRecycler.setAdapter(chatListAdapter);

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

    public ArrayList<Chat> getChatList(){
        ArrayList<Chat> chats = new ArrayList<>();
        chats.add(new Chat("diana","hola que tal"));
        chats.add(new Chat("ivan","que haces"));
        chats.add(new Chat("luis","blablabla"));

        return chats;
    }


}
