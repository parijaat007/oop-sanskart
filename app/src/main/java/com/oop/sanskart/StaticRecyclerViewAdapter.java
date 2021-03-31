package com.oop.sanskart;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StaticRecyclerViewAdapter extends RecyclerView.Adapter<StaticRecyclerViewAdapter.StaticRecyclerViewHolder>{

    private ArrayList<StaticRecyclerViewModel> items;

    public StaticRecyclerViewAdapter(ArrayList<StaticRecyclerViewModel> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public StaticRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.staticrecyclerviewitem,parent,false);
        StaticRecyclerViewHolder staticRecyclerViewHolder=new StaticRecyclerViewHolder(view);
        return staticRecyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull StaticRecyclerViewHolder holder, int position) {
        StaticRecyclerViewModel currentItem=items.get(position);
        holder.imageView.setImageResource(currentItem.getImage());
        holder.textView.setText(currentItem.getText());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class StaticRecyclerViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        ImageView imageView;
        public StaticRecyclerViewHolder(@NonNull View itemView){
            super(itemView);
            imageView=itemView.findViewById(R.id.image1);
            textView=itemView.findViewById(R.id.text1);
        }
    }
}
