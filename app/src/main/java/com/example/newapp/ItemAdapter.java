package com.example.newapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    private List<Item> mListItem;

    public ItemAdapter(List<Item> mListItem) {
        this.mListItem = mListItem;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);

        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Item item = mListItem.get(position);
        if (item == null){
            return;
        }
        holder.imgitem.setImageResource(item.getImage());
        holder.tv_ten.setText(item.getTen());
        holder.tv_gia.setText(item.getGia());
    }

    @Override
    public int getItemCount() {
        if(mListItem!=null){
            return  mListItem.size();
        }
        return 0;
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder{
        private CircleImageView imgitem;
        private TextView tv_ten;
        private TextView tv_gia;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            imgitem = itemView.findViewById(R.id.img_item);
            tv_ten = itemView.findViewById(R.id.tv_ten);
            tv_gia = itemView.findViewById(R.id.tv_gia);
        }
    }
}
