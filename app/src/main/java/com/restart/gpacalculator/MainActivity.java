package com.restart.gpacalculator;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner_1_L = (Spinner)findViewById(R.id.spinner_1_L);
        ArrayAdapter<String> spinnerArrayAdapter_1_L = new ArrayAdapter<>(this, R.layout.spinner_item, getResources().getStringArray(R.array.credit_array));
        spinnerArrayAdapter_1_L.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_1_L.setAdapter(spinnerArrayAdapter_1_L);

        Spinner spinner_1_R = (Spinner)findViewById(R.id.spinner_1_R);
        ArrayAdapter<String> spinnerArrayAdapter_1_R = new ArrayAdapter<>(this, R.layout.spinner_item, getResources().getStringArray(R.array.grade_array));
        spinnerArrayAdapter_1_R.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_1_R.setAdapter(spinnerArrayAdapter_1_R);
    }
}
