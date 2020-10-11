package com.example.UnionCoop.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;


import com.example.UnionCoop.databinding.ListItemBinding;
import com.example.UnionCoop.model.MyOrder_Main;
import com.example.UnionCoop.model.Order;
import com.example.UnionCoop.model.RepositoryResponse;


import java.util.ArrayList;

/**
 * Created by Mahmoud Zahran on 2,Oct,2020
 */
public class RepoDataAdapter extends RecyclerView.Adapter<RepoDataAdapter.RepoDataViewHolder> {
    private Context mContext;
    private MyOrder_Main myOrder_main;
    private ListItemBinding binding;

    public RepoDataAdapter(Context mContext, MyOrder_Main myOrder_main) {
        this.mContext = mContext;
        this.myOrder_main = myOrder_main;
    }

    @NonNull
    @Override
    public RepoDataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        binding = ListItemBinding.inflate(inflater,parent,false);
        return new RepoDataViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull RepoDataViewHolder holder, int position) {
        holder.itemBinding.repoAuther.setText(myOrder_main.getData().getOrders().get(position).getStatus());
        holder.itemBinding.repoName.setText(myOrder_main.getData().getOrders().get(position).getStatus());
        holder.itemBinding.langs.setText(myOrder_main.getData().getOrders().get(position).getStatus());
        holder.itemBinding.forks.setText(myOrder_main.getData().getOrders().get(position).getStatus()+"");
        holder.itemBinding.stars.setText(myOrder_main.getData().getOrders().get(position).getStatus()+"");
        holder.itemBinding.discription.setText(myOrder_main.getData().getOrders().get(position).getStatus()+" ");

        holder.itemBinding.mainRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("RepoAdapter", "onClick: ");
                myOrder_main.getData().getOrders().get(position).setExpanded(!myOrder_main.getData().getOrders().get(position).isExpanded());
                notifyItemChanged(position);
            }
        });
        boolean isExpanded= myOrder_main.getData().getOrders().get(position).isExpanded();
        holder.itemBinding.expandableLayout.setVisibility(isExpanded? View.VISIBLE : View.GONE);

//        Glide.with(mContext).load(myOrder_main.getData().getOrders().get(position).getAvatar())
//                .into(holder.itemBinding.repoImage);
    }

    @Override
    public int getItemCount() {
        return myOrder_main == null ? 0 : myOrder_main.getData().getOrders().size();
    }

    class RepoDataViewHolder extends RecyclerView.ViewHolder{
        private ListItemBinding itemBinding;

        public RepoDataViewHolder(ListItemBinding itemBinding) {
            super(itemBinding.getRoot());
            this.itemBinding = itemBinding;
        }
    }

    public  void updateList(MyOrder_Main updatedList){
        myOrder_main = updatedList;
        notifyDataSetChanged();
    }

    public Order getRepoAt(int position){
        return myOrder_main.getData().getOrders().get(position);
    }
}
