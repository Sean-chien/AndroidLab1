package com.sean.chien.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toast makeText;
    private int mCount = 0;
    private TextView mshowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mshowCount = (TextView) findViewById(R.id.show_count);
    }
    public void showToast(View view) {
        Toast toast = this.makeText;
        System.out.println("touch!!");

        toast.show();
    }

    public void countUp(View view) {
        ++mCount;
        if (mshowCount != null){
            mshowCount.setText(Integer.toString(mCount));
        }
    }
}
