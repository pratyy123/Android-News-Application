package com.example.newsapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;



import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    Context context;
    ArrayList<ModelClass> modelClassArrayList;
    private Object Glide;

    public Adapter(Context context, ArrayList<ModelClass> modelClassArrayList) {
        this.context = context;
        this.modelClassArrayList = modelClassArrayList;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.layout_item, null,false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
    holder.cardView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent =new Intent(context,webView.class);
            intent.putExtra("url",modelClassArrayList.get(position).getUri());
            context.startActivity(intent);
        }
    });
    holder.mtime.setText("Published AT:-"+modelClassArrayList.get(position).getPublishedAt());
    holder.mauthor.setText(modelClassArrayList.get(position).getAuthor());
    holder.mheading.setText(modelClassArrayList.get(position).getTitle());
    holder.mcontent.setText(modelClassArrayList.get(position).getDescription());
    com.bumptech.glide.Glide.with(context).load(modelClassArrayList.get(position).getUtlToImage()).into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return modelClassArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView mheading,mcontent,mauthor,mtime;
        CardView cardView;
        ImageView imageView;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
           mheading=itemView.findViewById(R.id.mainHeading);
            mcontent=itemView.findViewById(R.id.content);
            mauthor=itemView.findViewById(R.id.author);
            mtime=itemView.findViewById(R.id.time);
            imageView=itemView.findViewById(R.id.imageview);
            cardView=itemView.findViewById(R.id.cardView);



        }
    }
}
