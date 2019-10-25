package com.cs683.chat.ui.chat;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.cs683.chat.R;
import com.cs683.chat.data.model.Friend;


public class ContactsListAdapter extends RecyclerView.Adapter<ContactsListAdapter.FriendViewHolder> {
    private Friend[] contacts;
    public ContactsListAdapter (Friend[] friends) {
        this.contacts = friends;
    }

    @NonNull
    @Override
    public FriendViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.contact_list_item, parent,false);
        return new FriendViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull FriendViewHolder holder, int position) {
        holder.friends.setText(contacts[position].getName());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), DialogActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return contacts.length;
    }

    public static class FriendViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;
        private TextView friends;
        public FriendViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView;
            friends = itemView.findViewById(R.id.itemFriendTextView);
        }
    }
}
