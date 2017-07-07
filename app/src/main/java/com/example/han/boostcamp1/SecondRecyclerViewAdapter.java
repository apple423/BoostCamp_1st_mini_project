package com.example.han.boostcamp1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Han on 2017-07-07.
 */

public class SecondRecyclerViewAdapter extends RecyclerView.Adapter<SecondRecyclerViewAdapter.SecondRecyclerViewHolder>{




    @Override
    public SecondRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem;

        if(viewType == 1){
            layoutIdForListItem = R.layout.second_recycler_a;
        }
        else {
            layoutIdForListItem = R.layout.second_recycler_b;

        }
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, parent, shouldAttachToParentImmediately);

        return new SecondRecyclerViewAdapter.SecondRecyclerViewHolder(view);


    }

    @Override
    public void onBindViewHolder(SecondRecyclerViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 4;
    }

    @Override
    public int getItemViewType(int position) {

        int viewType;

        if(position ==0){

            viewType = 1;
        }
        else{

            viewType = 2;
        }

        return viewType;

    }

    public class SecondRecyclerViewHolder extends RecyclerView.ViewHolder{

        public SecondRecyclerViewHolder(View itemView) {
            super(itemView);
        }
    }
}
