package com.pr.java_mvp_simple.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.pr.java_mvp_simple.Contract.MainContract;
import com.pr.java_mvp_simple.Presenter.MainPresenter;
import com.pr.java_mvp_simple.R;

public class MainActivity extends AppCompatActivity implements MainContract.Mview {


    TextView textView;
    Button button;
    MainContract.Mpresenter mpresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button1);
        textView=findViewById(R.id.textView1);

        mpresenter=new MainPresenter(this);



        button.setOnClickListener(v -> {
            mpresenter.onButtonwasClicked();
        });


    }




    @Override
    public void showtext(String msg) {
        textView.setText(msg);
 
    }
}