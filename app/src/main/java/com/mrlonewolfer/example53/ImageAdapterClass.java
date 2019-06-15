package com.mrlonewolfer.example53;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class ImageAdapterClass extends BaseAdapter {

    Context context;
    ArrayList<ImageBean>  imgArrayList;
    public ImageAdapterClass(Context context, ArrayList<ImageBean> imgArrayList) {
        this.context=context;
        this.imgArrayList=imgArrayList;
    }


    @Override
    public int getCount() {
        return imgArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        ImageView imageView=new ImageView(context);
        imageView.setImageResource(imgArrayList.get(position).getImgId());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(170,170));
  imageView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          Toast.makeText(context, ""+imgArrayList.get(position).getImgContent(), Toast.LENGTH_SHORT).show();

      }
  });

        return imageView;
    }
}
