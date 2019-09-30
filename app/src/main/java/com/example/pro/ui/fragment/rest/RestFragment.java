package com.example.pro.ui.fragment.rest;


import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.example.pro.duanxin.SDKTestSendTemplateSMS;
import com.purewhite.ywc.frame.R;

import com.example.pro.ui.mvp.MvpFragment;
import com.purewhite.ywc.frame.databinding.FragRestBinding;
import com.purewhite.ywc.purewhitelibrary.adapter.callback.OnItemListener;
import com.purewhite.ywc.purewhitelibrary.mvp.presenter.BasePresenter;

public  class RestFragment extends MvpFragment<FragRestBinding, BasePresenter> implements OnItemListener {


    @Override
    protected int getLayout() {
        return R.layout.frag_rest;
    }

    @Override
    protected void initView() {
        mDataBinding.titleBarLayout.centerText.setVisibility(View.VISIBLE);
        mDataBinding.titleBarLayout.centerText.setText("消息");
        mDataBinding.fasongxinxi.setOnClickListener(this);


    }


    @Override
    protected void onClickUtils(View view) {
        //        if (!ClickUtils.clickable(v))
//            return;
        switch (view.getId()) {
            case R.id.fasongxinxi:

                SDKTestSendTemplateSMS sdkTestSendTemplateSMS = new SDKTestSendTemplateSMS();

//                Bundle build = BundleUtils.buidler()
//                        .put(PictureStype.SKIP_STYPE, PictureStype.SKIP_STYPE_PIC_ONLY)
//                        .build();
//                skipActivity(PictureActivity.class,build);
                break;
        }
    }

    @Override
    public void onClick(RecyclerView.Adapter adapter, View view, int position, boolean itemView) {

    }
}
