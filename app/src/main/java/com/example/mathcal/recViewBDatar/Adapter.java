package com.example.mathcal.recViewBDatar;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mathcal.R;
import com.squareup.picasso.Picasso;

import java.util.List;


public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private Context context;
    private List<kumpulanData> dataa;
    private ItemClick clickMee;


    public Adapter(Context context, List<kumpulanData> data, ItemClick clickMee) {
        this.context = context;
        this.dataa = data;
        this.clickMee = clickMee;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView head;
        ImageView poto;

        public ViewHolder(final View itemView) {
            super(itemView);
            head =(TextView)itemView.findViewById(R.id.head);
            poto = (ImageView)itemView.findViewById(R.id.poto);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clickMee.onClick(itemView, getAdapterPosition());
                }
            });

        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(/*parent.getContext()*/context).inflate(R.layout.blue_print, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        //holder.itemView.setTag(dataa.get(position));
        kumpulanData pu = dataa.get(position);
        holder.head.setText(dataa.get(position).getNama());
        Picasso.with(context)
                .load(dataa.get(position).getPoto())
                .into(holder.poto);
    }

    @Override
    public int getItemCount() {
        return dataa.size();

    }
}

