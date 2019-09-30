package com.example.pro.ui.fragment.home.child;

import com.example.pro.ui.adapter.HomeChildAdapter;
import com.purewhite.ywc.purewhitelibrary.mvp.presenter.IBasePresenter;
import com.purewhite.ywc.purewhitelibrary.mvp.view.IBaseView;

public class HomeChildContract {

    interface UiView extends IBaseView
    {
        HomeChildAdapter getAdapter();

        void respon(boolean flush);
    }

    interface Presenter extends IBasePresenter<UiView>
    {
        void obtianShopList(int position, boolean flush);
    }
}
