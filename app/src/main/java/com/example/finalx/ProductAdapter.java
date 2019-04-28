package com.example.finalx;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {

    private ArrayList<Product> items;

    public ProductAdapter (Context context, ArrayList<Product> List)
    {
        items = List;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {

        ImageView prod;
        TextView tvprod;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvprod = itemView.findViewById(R.id.tvprod);
            prod = itemView.findViewById(R.id.prod);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.aaa, viewGroup, false);
        return new com.example.finalx.ProductAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.ViewHolder viewHolder, int i) {

        viewHolder.itemView.setTag(items.get(i));

        viewHolder.tvprod.setText(items.get(i).getTitle());

        if (items.get(i).getType().equals("ex1"))
        {
            viewHolder.prod.setImageResource(R.drawable.benchpress);
        }
        else
        {
            if(items.get(i).getType().equals("ex2")) {
                viewHolder.prod.setImageResource(R.drawable.asezari);
            }
        }

        if (items.get(i).getType().equals("ex3"))
        {
            viewHolder.prod.setImageResource(R.drawable.shoulder);
        }
        else
        {
            if(items.get(i).getType().equals("ex4")) {
                viewHolder.prod.setImageResource(R.drawable.legex);
            }
        }
        if (items.get(i).getType().equals("ex5"))
        {
            viewHolder.prod.setImageResource(R.drawable.bycep);
        }
        else
        {
            if(items.get(i).getType().equals("ex6")) {
                viewHolder.prod.setImageResource(R.drawable.tricep);
            }
        }

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}