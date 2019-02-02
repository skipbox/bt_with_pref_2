package com.example.laowai.bt_with_pref;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by laowai on 1/30/2019.
 */


public class my_functions {

    public static int f = 0;

   public static int add_f(){
       f=f+1;
       return f;
    }

    //need to pass it x will multiply it times 3
    //my_functions.times_3(7);
    public static int times_3(int x){
        x=x*3;
        return x;
        //Toast.makeText(MainActivity.this, "xxx"+got_it, Toast.LENGTH_SHORT).show();
    }
    //my_functions.add_f
public class toast_it{
    }
    //Toast.makeText(getApplicationContext(), "xxx"+got_it, Toast.LENGTH_SHORT).show();
}
