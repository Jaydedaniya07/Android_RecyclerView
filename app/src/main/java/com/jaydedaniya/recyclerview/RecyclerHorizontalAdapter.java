package com.jaydedaniya.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerHorizontalAdapter extends RecyclerView.Adapter<RecyclerHorizontalAdapter.ViewHolder> {

    private Context context;
    private ArrayList<RecyclerViewHorizontal> listHorizontal;

    public RecyclerHorizontalAdapter(Context context, ArrayList<RecyclerViewHorizontal> listHorizontal) {
        this.context = context;
        this.listHorizontal = listHorizontal;
    }


    @NonNull
    @Override
    public RecyclerHorizontalAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.horizontal_cardview, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerHorizontalAdapter.ViewHolder holder, int position) {

        RecyclerViewHorizontal viewHorizontal = listHorizontal.get(position);
        if (viewHorizontal != null) {
            holder.imageHorizontal.setImageResource(viewHorizontal.getPath());
        }

    }

    @Override
    public int getItemCount() {
        return listHorizontal.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageHorizontal;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageHorizontal = itemView.findViewById(R.id.horizontalImageView);
        }
    }


}
