package com.staytuned.mo.moapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ger on 5/5/2018 AD.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<User> users;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvDetail;

        public MyViewHolder(View view) {
            super(view);
            tvDetail = (TextView) view.findViewById(R.id.tv_detail);
        }
    }


    public MyAdapter(List<User> users) {
        this.users = users;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        User user = users.get(position);
        holder.tvDetail.setText("Name: " + user.getName() + " Age: " + user.getAge());

    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}