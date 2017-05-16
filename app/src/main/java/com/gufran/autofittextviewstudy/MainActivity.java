package com.gufran.autofittextviewstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatRadioButton;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    AutoResizeTextView autoResizeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoResizeTextView = (AutoResizeTextView) findViewById(R.id.autoResizeTextView);
        autoResizeTextView.setMinTextSize(1);

        AppCompatRadioButton appCompatRadioButton;
        
    }
}
