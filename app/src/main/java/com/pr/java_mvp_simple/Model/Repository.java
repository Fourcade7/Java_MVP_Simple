package com.pr.java_mvp_simple.Model;

import com.pr.java_mvp_simple.Contract.MainContract;

public class Repository implements MainContract.Mrepository {



    @Override
    public String loadmessage() {

        return "this is Mrepository";
    }


}
