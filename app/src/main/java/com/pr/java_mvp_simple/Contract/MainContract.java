package com.pr.java_mvp_simple.Contract;

public interface MainContract {
    interface Mview{


        void showtext(String msg);
    }
    interface Mpresenter{
        void onButtonwasClicked();

    }

    interface Mrepository{
        String loadmessage();
    }




}
