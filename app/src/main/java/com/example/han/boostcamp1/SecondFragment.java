package com.example.han.boostcamp1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by Han on 2017-07-07.
 */

public class SecondFragment extends Fragment implements View.OnClickListener{

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    private Button friendAgreeButton;
    private Button friendDeleteButton;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.second_fragment, container, false);

        recyclerView = (RecyclerView) rootView.findViewById(R.id.second_recyclerView);

        recyclerView.setHasFixedSize(true);
        adapter = new SecondRecyclerViewAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
        recyclerView.setNestedScrollingEnabled(false);


        friendAgreeButton = (Button) rootView.findViewById(R.id.friend_agree);
        friendDeleteButton = (Button) rootView.findViewById(R.id.friend_delete);


        return rootView;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id){
            case R.id.friend_agree :
                Toast.makeText(v.getContext(),"수락 버튼",Toast.LENGTH_SHORT).show();
                break;

            case R.id.friend_delete :
                Toast.makeText(v.getContext(),"삭제 버튼",Toast.LENGTH_SHORT).show();
                break;


        }


    }
}
