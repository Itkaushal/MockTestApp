package com.kaushlendraprajapati.mocktest.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.kaushlendraprajapati.mocktest.Modal.SliderData;
import com.kaushlendraprajapati.mocktest.R;
import com.kaushlendraprajapati.mocktest.databinding.SliderlayoutBinding;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class SliderAdapter extends SliderViewAdapter<SliderAdapter.SliderAdapterViewHolder> {

    private final List<SliderData> mSliderItems;
    private Context context;
    private SliderlayoutBinding sliderLayoutBinding;

    public SliderAdapter(Context context, ArrayList<SliderData> sliderDataArrayList) {
        this.mSliderItems = sliderDataArrayList;
        this.context = context;
    }


    @Override
    public SliderAdapterViewHolder onCreateViewHolder(ViewGroup parent) {

        View v = LayoutInflater.from(context).inflate(R.layout.sliderlayout,parent,false);
        sliderLayoutBinding = SliderlayoutBinding.bind(v);
        return new SliderAdapterViewHolder(v);
    }

    @Override
    public void onBindViewHolder(SliderAdapterViewHolder viewHolder, final int position) {

        final SliderData sliderItem = mSliderItems.get(position);


        Glide.with(sliderLayoutBinding.getRoot())
                .load(sliderItem.getImgUrl())
                .fitCenter()
                .into(sliderLayoutBinding.image);

    }

    @Override
    public int getCount() {
        return mSliderItems.size();
    }

    static class SliderAdapterViewHolder extends SliderViewAdapter.ViewHolder {

        public SliderAdapterViewHolder(View itemView) {
            super(itemView);

        }
    }
}
