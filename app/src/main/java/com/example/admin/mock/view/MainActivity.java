package com.example.admin.mock.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.admin.mock.R;
import com.example.admin.mock.untils.sharedpreferences.SharedPrefs;

public class MainActivity extends AppCompatActivity {
    public static final String FIRST_STAFF = "first_staff";
    public static final String SECOND_STAFF = "second_staff";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPrefs.getInstance().put(FIRST_STAFF, "android");
        SharedPrefs.getInstance().put(SECOND_STAFF, "hiêp");
        
        Log.d("test",FIRST_STAFF);
    }
}
