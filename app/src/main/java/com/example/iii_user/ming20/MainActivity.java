package com.example.iii_user.ming20;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fmgr; //管理員
    private FragmentTransaction tran; //換畫面
    private f1 f1;
    private f2 f2;
    private  Boolean isF1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        fmgr = getFragmentManager();
        f1 = new f1();
        f2 = new f2();
        tran = fmgr.beginTransaction(); //把人叫進來交易

        tran.add(R.id.container,f1);
        tran.commit(); //交易
        isF1 = true;
    }
    public void b0(View view){ //可以換來換去喔
        isF1 = !isF1;
        if(isF1){
            tran = fmgr.beginTransaction();
            tran.replace(R.id.container,f1);
        }else{
            tran = fmgr.beginTransaction();
            tran.replace(R.id.container,f2);
        }
        tran.addToBackStack(null);
        tran.commit();
    }
}
