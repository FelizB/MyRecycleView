package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myAdapter extends RecyclerView.Adapter<myAdapter.ViewHolder> {
    Context context;
    String data1[], data2[];
    int images[];

    public myAdapter(Context context, String[] data1, String[] data2, int[] images) {
        this.context = context;
        this.data1 = data1;
        this.data2 = data2;
        this.images = images;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(context);
        View view= layoutInflater.inflate(R.layout.cardview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView1.setText(data1[position]);
        holder.textView2.setText(data2[position]);
        holder.imageView.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class  ViewHolder extends RecyclerView.ViewHolder{
        TextView textView1, textView2;
        ImageView imageView;
        public ViewHolder(View itemView){
            super(itemView);
            textView1= itemView.findViewById(R.id.titles);
            textView2=itemView.findViewById(R.id.description);
            imageView= itemView.findViewById(R.id.imageView);
        }

    }
}
