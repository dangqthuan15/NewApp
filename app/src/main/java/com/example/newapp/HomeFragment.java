package com.example.newapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {
    private RecyclerView rcvItem;
    private ItemAdapter itemAdapter;
    private View nview;
    private MainActivity nMainActivity;



    public HomeFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        nview = inflater.inflate(R.layout.fragment_home, container, false);
        nMainActivity = (MainActivity) getActivity();
        rcvItem = nview.findViewById(R.id.rcv_item);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(nMainActivity);
        rcvItem.setLayoutManager(linearLayoutManager);
        itemAdapter = new ItemAdapter(getListItem());
        rcvItem.setAdapter(itemAdapter);

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(nMainActivity,DividerItemDecoration.VERTICAL);
        rcvItem.addItemDecoration(itemDecoration);
        return nview;
    }

    private List<Item> getListItem() {
        List<Item> list = new ArrayList<>();
        list.add(new Item(R.drawable.case1,"Case 1","55000"));
        list.add(new Item(R.drawable.cas2,"Case 2","45000"));
        list.add(new Item(R.drawable.case3,"Case 3","50000"));
        list.add(new Item(R.drawable.case4,"Case 4","35000"));
        list.add(new Item(R.drawable.case6,"Case 5","30000"));
        list.add(new Item(R.drawable.case7,"Case 6","33000"));


        return list;
    }


}