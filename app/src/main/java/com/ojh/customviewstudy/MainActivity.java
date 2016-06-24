package com.ojh.customviewstudy;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageAndTextView view1 = (ImageAndTextView)findViewById(R.id.imageAndTextView1);
        view1.setTextColor(Color.RED);

        ImageAndTextView view2 = (ImageAndTextView)findViewById(R.id.imageAndTextView2);
        view2.setText("Custom");
    }
}
