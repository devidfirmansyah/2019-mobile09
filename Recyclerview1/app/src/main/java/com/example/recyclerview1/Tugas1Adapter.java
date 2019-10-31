package com.example.recyclerview1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.zip.Inflater;

public class Tugas1Adapter extends RecyclerView.Adapter<Tugas1Adapter.Tugas1ViewHolder>{

    private String[] data;
    public Tugas1Adapter(String[] data){
        this.data = data;
    }

    @NonNull
    @Override
    public Tugas1ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new Tugas1ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Tugas1ViewHolder holder, int position) {
        String title = data[position];
        holder.txtTitle.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class Tugas1ViewHolder extends RecyclerView.ViewHolder{
        ImageView imgIcon;
        TextView txtTitle;
        public Tugas1ViewHolder(View itemView){
            super(itemView);
            imgIcon = itemView.findViewById(R.id.imgIcon);
            txtTitle = itemView.findViewById(R.id.txtTitle);
        }
    }
}
