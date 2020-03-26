package com.zzh.roundedimageview.example;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Transformation;
import com.zzh.roundedimageview.RoundedTransformationBuilder;

public class PicassoFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_rounded, container, false);

        PicassoAdapter adapter = new PicassoAdapter(getActivity());
        ((ListView) view.findViewById(R.id.main_list)).setAdapter(adapter);

        adapter.add(new PicassoItem("http://img5.imgtn.bdimg.com/it/u=639334165,1649889958&fm=11&gp=0.jpg", ScaleType.CENTER));
        adapter.add(new PicassoItem("http://img5.imgtn.bdimg.com/it/u=3373541372,149267451&fm=26&gp=0.jpg", ScaleType.CENTER_CROP));
        adapter.add(new PicassoItem("http://img2.imgtn.bdimg.com/it/u=2605828104,2415825840&fm=26&gp=0.jpg", ScaleType.CENTER_INSIDE));
        adapter.add(new PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ScaleType.FIT_CENTER));
        adapter.add(new PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ScaleType.FIT_END));
        adapter.add(new PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ScaleType.FIT_START));
        adapter.add(new PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ScaleType.FIT_XY));

        return view;
    }

    static class PicassoItem {
        final String mUrl;

        final ScaleType mScaleType;

        PicassoItem(String url, ScaleType scaleType) {
            this.mUrl = url;
            mScaleType = scaleType;
        }

    }

    class PicassoAdapter extends ArrayAdapter<PicassoItem> {
        private final LayoutInflater mInflater;
        private final Transformation mTransformation;

        public PicassoAdapter(Context context) {
            super(context, 0);
            mInflater = LayoutInflater.from(getContext());
            mTransformation = new RoundedTransformationBuilder()
                    .cornerRadiusDp(30)
                    .borderColor(Color.BLACK)
                    .borderWidthDp(3)
                    .oval(false)
                    .build();
        }

        @Override
        public View getView(int position, View convertView, @NonNull ViewGroup parent) {
            ViewGroup view;
            if (convertView == null) {
                view = (ViewGroup) mInflater.inflate(R.layout.picasso_item, parent, false);
            } else {
                view = (ViewGroup) convertView;
            }

            PicassoItem item = getItem(position);

            ImageView imageView = (view.findViewById(R.id.imageView1));
            imageView.setScaleType(item.mScaleType);


            Transformation transformation = new RoundedTransformationBuilder()
                    .borderColor(Color.BLACK)
                    .borderWidthDp(3)
                    .cornerRadiusDp(30)
                    .oval(false)
                    .build();
            Picasso.get()
                    .load(item.mUrl)
                    .fit()
                    .transform(transformation)
                    .into(imageView);


            ((TextView) view.findViewById(R.id.textView3)).setText(item.mScaleType.toString());
            return view;
        }
    }
}
