package com.pr.java_mvp_simple.Presenter;

import com.pr.java_mvp_simple.Contract.MainContract;
import com.pr.java_mvp_simple.Model.Repository;

public class MainPresenter implements MainContract.Mpresenter {

    MainContract.Mview mview;
    MainContract.Mrepository mrepository;

    String message;

    public MainPresenter(MainContract.Mview mview) {
        this.mview = mview;
        this.mrepository=new Repository();
    }

    @Override
    public void onButtonwasClicked() {
    message= mrepository.loadmessage();
    mview.showtext(message);
    }


}
