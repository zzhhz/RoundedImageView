package com.zzh.roundedimageview.example;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZZH on 2020/3/26.
 *
 * @Date: 2020/3/26
 * @Email: zzh_hz@126.com
 * @QQ: 1299234582
 * @Author: zzh
 * @Description:
 */
public class GlideFragment extends Fragment {

    List<PicassoFragment.PicassoItem> mItemList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_rounded, container, false);

        PicassoAdapter adapter = new PicassoAdapter(getActivity());
        ((ListView) view.findViewById(R.id.main_list)).setAdapter(adapter);
        mItemList = new ArrayList<>();
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=639334165,1649889958&fm=11&gp=0.jpg", ImageView.ScaleType.CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=3373541372,149267451&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_CROP));
        mItemList.add(new PicassoFragment.PicassoItem("http://img2.imgtn.bdimg.com/it/u=2605828104,2415825840&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_INSIDE));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_END));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_START));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_XY));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=639334165,1649889958&fm=11&gp=0.jpg", ImageView.ScaleType.CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=3373541372,149267451&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_CROP));
        mItemList.add(new PicassoFragment.PicassoItem("http://img2.imgtn.bdimg.com/it/u=2605828104,2415825840&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_INSIDE));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_END));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_START));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_XY));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=639334165,1649889958&fm=11&gp=0.jpg", ImageView.ScaleType.CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=3373541372,149267451&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_CROP));
        mItemList.add(new PicassoFragment.PicassoItem("http://img2.imgtn.bdimg.com/it/u=2605828104,2415825840&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_INSIDE));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_END));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_START));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_XY));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=639334165,1649889958&fm=11&gp=0.jpg", ImageView.ScaleType.CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=3373541372,149267451&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_CROP));
        mItemList.add(new PicassoFragment.PicassoItem("http://img2.imgtn.bdimg.com/it/u=2605828104,2415825840&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_INSIDE));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_END));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_START));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_XY));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=639334165,1649889958&fm=11&gp=0.jpg", ImageView.ScaleType.CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=3373541372,149267451&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_CROP));
        mItemList.add(new PicassoFragment.PicassoItem("http://img2.imgtn.bdimg.com/it/u=2605828104,2415825840&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_INSIDE));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_END));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_START));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_XY));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=639334165,1649889958&fm=11&gp=0.jpg", ImageView.ScaleType.CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=3373541372,149267451&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_CROP));
        mItemList.add(new PicassoFragment.PicassoItem("http://img2.imgtn.bdimg.com/it/u=2605828104,2415825840&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_INSIDE));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_END));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_START));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_XY));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=639334165,1649889958&fm=11&gp=0.jpg", ImageView.ScaleType.CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=3373541372,149267451&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_CROP));
        mItemList.add(new PicassoFragment.PicassoItem("http://img2.imgtn.bdimg.com/it/u=2605828104,2415825840&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_INSIDE));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_END));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_START));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_XY));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=639334165,1649889958&fm=11&gp=0.jpg", ImageView.ScaleType.CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=3373541372,149267451&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_CROP));
        mItemList.add(new PicassoFragment.PicassoItem("http://img2.imgtn.bdimg.com/it/u=2605828104,2415825840&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_INSIDE));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_END));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_START));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_XY));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=639334165,1649889958&fm=11&gp=0.jpg", ImageView.ScaleType.CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=3373541372,149267451&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_CROP));
        mItemList.add(new PicassoFragment.PicassoItem("http://img2.imgtn.bdimg.com/it/u=2605828104,2415825840&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_INSIDE));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_END));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_START));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_XY));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=639334165,1649889958&fm=11&gp=0.jpg", ImageView.ScaleType.CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=3373541372,149267451&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_CROP));
        mItemList.add(new PicassoFragment.PicassoItem("http://img2.imgtn.bdimg.com/it/u=2605828104,2415825840&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_INSIDE));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_END));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_START));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_XY));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=639334165,1649889958&fm=11&gp=0.jpg", ImageView.ScaleType.CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=3373541372,149267451&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_CROP));
        mItemList.add(new PicassoFragment.PicassoItem("http://img2.imgtn.bdimg.com/it/u=2605828104,2415825840&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_INSIDE));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_END));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_START));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_XY));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=639334165,1649889958&fm=11&gp=0.jpg", ImageView.ScaleType.CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=3373541372,149267451&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_CROP));
        mItemList.add(new PicassoFragment.PicassoItem("http://img2.imgtn.bdimg.com/it/u=2605828104,2415825840&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_INSIDE));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_END));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_START));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_XY));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=639334165,1649889958&fm=11&gp=0.jpg", ImageView.ScaleType.CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=3373541372,149267451&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_CROP));
        mItemList.add(new PicassoFragment.PicassoItem("http://img2.imgtn.bdimg.com/it/u=2605828104,2415825840&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_INSIDE));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_END));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_START));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_XY));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=639334165,1649889958&fm=11&gp=0.jpg", ImageView.ScaleType.CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=3373541372,149267451&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_CROP));
        mItemList.add(new PicassoFragment.PicassoItem("http://img2.imgtn.bdimg.com/it/u=2605828104,2415825840&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_INSIDE));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_END));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_START));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_XY));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=639334165,1649889958&fm=11&gp=0.jpg", ImageView.ScaleType.CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=3373541372,149267451&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_CROP));
        mItemList.add(new PicassoFragment.PicassoItem("http://img2.imgtn.bdimg.com/it/u=2605828104,2415825840&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_INSIDE));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_END));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_START));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_XY));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=639334165,1649889958&fm=11&gp=0.jpg", ImageView.ScaleType.CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=3373541372,149267451&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_CROP));
        mItemList.add(new PicassoFragment.PicassoItem("http://img2.imgtn.bdimg.com/it/u=2605828104,2415825840&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_INSIDE));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_END));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_START));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_XY));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=639334165,1649889958&fm=11&gp=0.jpg", ImageView.ScaleType.CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=3373541372,149267451&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_CROP));
        mItemList.add(new PicassoFragment.PicassoItem("http://img2.imgtn.bdimg.com/it/u=2605828104,2415825840&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_INSIDE));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_END));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_START));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_XY));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=639334165,1649889958&fm=11&gp=0.jpg", ImageView.ScaleType.CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=3373541372,149267451&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_CROP));
        mItemList.add(new PicassoFragment.PicassoItem("http://img2.imgtn.bdimg.com/it/u=2605828104,2415825840&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_INSIDE));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_END));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_START));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_XY));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=639334165,1649889958&fm=11&gp=0.jpg", ImageView.ScaleType.CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=3373541372,149267451&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_CROP));
        mItemList.add(new PicassoFragment.PicassoItem("http://img2.imgtn.bdimg.com/it/u=2605828104,2415825840&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_INSIDE));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_END));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_START));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_XY));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=639334165,1649889958&fm=11&gp=0.jpg", ImageView.ScaleType.CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=3373541372,149267451&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_CROP));
        mItemList.add(new PicassoFragment.PicassoItem("http://img2.imgtn.bdimg.com/it/u=2605828104,2415825840&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_INSIDE));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_END));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_START));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_XY));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=639334165,1649889958&fm=11&gp=0.jpg", ImageView.ScaleType.CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img5.imgtn.bdimg.com/it/u=3373541372,149267451&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_CROP));
        mItemList.add(new PicassoFragment.PicassoItem("http://img2.imgtn.bdimg.com/it/u=2605828104,2415825840&fm=26&gp=0.jpg", ImageView.ScaleType.CENTER_INSIDE));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_CENTER));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_END));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_START));
        mItemList.add(new PicassoFragment.PicassoItem("http://img4.imgtn.bdimg.com/it/u=171411223,1247580741&fm=26&gp=0.jpg", ImageView.ScaleType.FIT_XY));

        adapter.addAll(mItemList);
        return view;
    }

    static class PicassoItem {
        final String mUrl;

        final ImageView.ScaleType mScaleType;

        PicassoItem(String url, ImageView.ScaleType scaleType) {
            this.mUrl = url;
            mScaleType = scaleType;
        }

    }

    class PicassoAdapter extends ArrayAdapter<PicassoFragment.PicassoItem> {
        private final LayoutInflater mInflater;

        public PicassoAdapter(Context context) {
            super(context, 0);
            mInflater = LayoutInflater.from(getContext());
        }

        @Override
        public View getView(int position, View convertView, @NonNull ViewGroup parent) {
            ViewGroup view;
            if (convertView == null) {
                view = (ViewGroup) mInflater.inflate(R.layout.glide_item, parent, false);
            } else {
                view = (ViewGroup) convertView;
            }

            PicassoFragment.PicassoItem item = getItem(position);

            ImageView imageView = (view.findViewById(R.id.imageView1));
            Glide.with(view).load(item.mUrl).diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView);
            return view;
        }
    }
}
