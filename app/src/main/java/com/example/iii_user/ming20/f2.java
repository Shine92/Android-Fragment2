package com.example.iii_user.ming20;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class f2 extends android.app.Fragment {
private View thisView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        thisView = inflater.inflate(R.layout.fragment_f2, container, false);

        return thisView;
    }


}
