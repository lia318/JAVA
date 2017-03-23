package com.example.sojun.java;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // import 안 될 때 => AIt + Enter 누르기

        TextView text1=(TextView) findViewById(R.id.text1);
        TextView text2=(TextView) findViewById(R.id.text2);
        TextView text3=(TextView) findViewById(R.id.text3);
        TextView text4=(TextView) findViewById(R.id.text4);

        text1.setText("TextView1 : GOT7 어디 안가");
        text1.setTextSize(30);
        text1.setBackgroundColor(Color.rgb(70,163,247));
        text1.setTextColor(Color.WHITE);

        text2.setText(R.string.Text2_str);
        text2.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD_ITALIC);
        text2.setTextColor(Color.WHITE);

        text3.setText("TextView3 : 인생이 무너져도 아가새");
        text3.setTextSize(30);
        text3.setBackgroundColor(Color.rgb(70,163,247));
        text3.setTextColor(Color.WHITE);

        text4.setText(R.string.Text4_str);
        text4.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD_ITALIC);
        text4.setTextColor(Color.WHITE);
    }
}
