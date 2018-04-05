package com.example.saran.recyclerview_customlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    Context context;
    ArrayList<ListModel> arrayList = new ArrayList<ListModel>();


    public CustomAdapter(Context context, ArrayList<ListModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View apperance = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(apperance);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        ListModel listModel = arrayList.get(position);

        holder.im.setImageResource(listModel.getLogo());
        holder.tv1.setText(listModel.getCompany());
        holder.tv2.setText(listModel.getCeo());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView im;
        TextView tv1, tv2;

        public MyViewHolder(View itemView) {
            super(itemView);

            im = itemView.findViewById(R.id.imageView_logo);
            tv1 = itemView.findViewById(R.id.textView_company);
            tv2 = itemView.findViewById(R.id.textView_ceo);
        }
    }
}
