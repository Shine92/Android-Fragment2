package com.example.iii_user.ming20;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class f1 extends android.app.Fragment {
    private View thisView;
    private Button b1;
    private MainActivity mainActivity;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



    thisView = inflater.inflate(R.layout.fragment_f1, container, false);
        b1 = (Button)thisView.findViewById(R.id.f1_bt);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1();
            }
        });
    return thisView;
    }

    public void b1(){
        Log.i("ming","b1bt");
        
    }

}
