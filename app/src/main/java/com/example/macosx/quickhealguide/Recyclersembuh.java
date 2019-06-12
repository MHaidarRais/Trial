package com.example.macosx.quickhealguide;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

/**
 * Created by Hoidar on 4/17/18.
 */

class Recyclersembuh extends RecyclerView.Adapter<Recyclersembuh.MyviewHolder> {
    Context context;
    String[] judul;
    int[] gejala;
    int[] penanganan;
    String[] imgambar;
    Activity myActivity;
    public Recyclersembuh(Context context, String[] judul, int[] gejala, int[] penanganan,String[] imgambar, MainActivity mainActivity1) {

        this.judul = judul;
        this.gejala = gejala;
        this.penanganan = penanganan;
        this.imgambar = imgambar;
        this.myActivity = mainActivity1;
        this.context = context;

    }

    @Override
    public MyviewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.listiteme, parent, false);
        return new MyviewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyviewHolder holder, final int position) {

        holder.txtjudul.setText(judul[position]);
        Picasso.get().load(imgambar.length).placeholder(R.drawable.ic_launcher_background).into(holder.imgView);

        Glide.with(context)
                .load(imgambar.length)
                .placeholder(R.drawable.ic_launcher_background)
                .into(holder.imgView);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("judul", judul[position]);
                intent.putExtra("gejala", gejala[position]);
                intent.putExtra("penanganan", penanganan[position]);
                intent.putExtra("imgambar",imgambar[position]);
                context.startActivity(intent);
                myActivity.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

    }


    @Override
    public int getItemCount() {
        return judul.length;
    }

    public class MyviewHolder extends RecyclerView.ViewHolder {
        TextView txtjudul;
        ImageView imgView;
        public MyviewHolder(View itemView) {
            super(itemView);

            txtjudul = itemView.findViewById(R.id.judulcard);
            imgView = itemView.findViewById(R.id.imgViewList);
        }
    }
}
