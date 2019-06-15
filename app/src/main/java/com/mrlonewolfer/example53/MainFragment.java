package com.mrlonewolfer.example53;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    GridView gridView;
    ArrayList<ImageBean> imgArrayList;
    Context context;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        context=getContext();
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_main, container, false);
        gridView=view.findViewById(R.id.gridView);

        PreaparedData();
        ImageAdapterClass imageAdapterClass=new ImageAdapterClass(context,imgArrayList);

        gridView.setAdapter(imageAdapterClass);

        return  view;
    }

    private void PreaparedData() {
        imgArrayList=new ArrayList<>();
        imgArrayList.add(new ImageBean(R.drawable.contactlogo,"You Click on Contact Logo"));
        imgArrayList.add(new ImageBean(R.drawable.instagram,"You Click on Instagram Logo"));
        imgArrayList.add(new ImageBean(R.drawable.maillogo,"You Click on Mail Logo"));
        imgArrayList.add(new ImageBean(R.drawable.messanger,"You Click on messanger Logo"));
        imgArrayList.add(new ImageBean(R.drawable.msglogo,"You Click on message Logo"));
        imgArrayList.add(new ImageBean(R.drawable.whatsapp,"You Click on Whatsapp Logo"));


    }

}
