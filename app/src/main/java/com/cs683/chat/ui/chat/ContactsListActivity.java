package com.cs683.chat.ui.chat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.cs683.chat.R;
import com.cs683.chat.data.model.Friend;

public class ContactsListActivity extends AppCompatActivity {

    private RecyclerView contacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts_list);

        contacts = (RecyclerView) findViewById(R.id.contactsList);
        ContactsListAdapter contactsListAdapter = new ContactsListAdapter(Friend.friends);
        contacts.setAdapter(contactsListAdapter);

        LinearLayoutManager linearContacts = new LinearLayoutManager(this);
        contacts.setLayoutManager(linearContacts);
    }

    @Override
    protected void onPause() {
        super.onPause();
        ContactsListAdapter contactsListAdapter = new ContactsListAdapter(Friend.friends);
        contacts.setAdapter(contactsListAdapter);

        LinearLayoutManager linearContacts = new LinearLayoutManager(this);
        contacts.setLayoutManager(linearContacts);
    }
}
