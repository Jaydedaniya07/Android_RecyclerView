package com.jaydedaniya.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerVerticalAdapter extends RecyclerView.Adapter<RecyclerVerticalAdapter.ViewHolder> {

    private Context context;
    private ArrayList<RecyclerViewVertical> listVertical;

    public RecyclerVerticalAdapter(Context context, ArrayList<RecyclerViewVertical> listVertical) {
        this.context = context;
        this.listVertical = listVertical;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.vertical_cardview, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerVerticalAdapter.ViewHolder holder, int position) {
        RecyclerViewVertical viewVertical = listVertical.get(position);
        if (viewVertical != null) {
            holder.imageVertical.setImageResource(viewVertical.getPath());
            holder.headingVertical.setText(viewVertical.getHeading());
            holder.descriptionVertical.setText(viewVertical.getDescription());
            holder.buttonVertical.setText(viewVertical.getTextButton());
        }
    }

    @Override
    public int getItemCount() {
        return listVertical.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageVertical;
        TextView headingVertical;
        TextView descriptionVertical;
        Button buttonVertical;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageVertical = itemView.findViewById(R.id.verticalImageView);
            headingVertical = itemView.findViewById(R.id.verticalTextHeading);
            descriptionVertical = itemView.findViewById(R.id.verticalTextDescription);
            buttonVertical = itemView.findViewById(R.id.verticalButton);
        }
    }
}
