package com.example.fruitshelath;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class ListItemAdapter extends RecyclerView.Adapter<ListItemAdapter.MyViewHolder> {
    public ListItemAdapter(List<Model> list_buah, Context context) {
        this.list_buah = list_buah;
        this.context = context;
    }

    List<Model> list_buah;
    Context context;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent , int position) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final Model model = list_buah.get(position);

        holder.image.setImageDrawable(context.getResources().getDrawable(model.getImage()));
        holder.nama.setText(model.getName());
        holder.manfaat_buah.setText(model.getManfaat());

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,DetailsItem.class);
                intent.putExtra("image",model.getImage());
                intent.putExtra("name",model.getName());
                intent.putExtra("manfaat","Manfaat:  \n" + model.getManfaat());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list_buah.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView nama, manfaat_buah;
        ImageView image;
        LinearLayout linearLayout;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            nama = itemView.findViewById(R.id.item_name);
            manfaat_buah = itemView.findViewById(R.id.tv_item_function);
            image = itemView.findViewById(R.id.photo);
            linearLayout= itemView.findViewById(R.id.linear_layout);


        }
    }
}
