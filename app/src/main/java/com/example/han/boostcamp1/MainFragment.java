package com.example.han.boostcamp1;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by Han on 2017-07-04.
 */

public class MainFragment extends Fragment implements View.OnClickListener{

    private RecyclerView recyclerView;

    private RecyclerView.Adapter adapter;

    private RecyclerView.LayoutManager layoutManager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = (View)inflater.inflate(R.layout.main_screen_fragment, container, false);

        recyclerView = (RecyclerView) rootView.findViewById(R.id.main_recyclerView);
        ImageView cameraImageView = (ImageView) rootView.findViewById(R.id.camera);
        cameraImageView.setOnClickListener(this);
        ImageView myStoryImageView = (ImageView) rootView.findViewById(R.id.myStroy);
        myStoryImageView.setOnClickListener(this);



        recyclerView.setHasFixedSize(true);
        adapter = new MainRecyclerViewAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
        recyclerView.setNestedScrollingEnabled(false);


        return rootView;

    }

    @Override

        public void onClick(View v) {

            int id = v.getId();

            switch (id){

                case R.id.camera :
                    Toast.makeText(v.getContext(),"카메라 버튼",Toast.LENGTH_SHORT).show();
                break;

                case R.id.myStroy:
                    Toast.makeText(v.getContext(),"내 스토리 버튼",Toast.LENGTH_SHORT).show();
                    break;


            }



    }
}
