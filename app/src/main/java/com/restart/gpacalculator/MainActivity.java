package com.restart.gpacalculator;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends Activity {
    private Spinner spinner_1_L;
    private Spinner spinner_1_R;
    private Spinner spinner_2_L;
    private Spinner spinner_2_R;
    private Spinner spinner_3_L;
    private Spinner spinner_3_R;
    private Spinner spinner_4_L;
    private Spinner spinner_4_R;
    private Spinner spinner_5_L;
    private Spinner spinner_5_R;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner_1_L = (Spinner)findViewById(R.id.spinner_1_L);
        ArrayAdapter<String> spinnerArrayAdapter_1_L = new ArrayAdapter<>(this, R.layout.spinner_item, getResources().getStringArray(R.array.credit_array));
        spinnerArrayAdapter_1_L.setDropDownViewResource(R.layout.spinner_item);
        spinner_1_L.setAdapter(spinnerArrayAdapter_1_L);

        spinner_1_R = (Spinner)findViewById(R.id.spinner_1_R);
        ArrayAdapter<String> spinnerArrayAdapter_1_R = new ArrayAdapter<>(this, R.layout.spinner_item, getResources().getStringArray(R.array.grade_array));
        spinnerArrayAdapter_1_R.setDropDownViewResource(R.layout.spinner_item);
        spinner_1_R.setAdapter(spinnerArrayAdapter_1_R);

        spinner_2_L = (Spinner)findViewById(R.id.spinner_2_L);
        ArrayAdapter<String> spinnerArrayAdapter_2_L = new ArrayAdapter<>(this, R.layout.spinner_item, getResources().getStringArray(R.array.credit_array));
        spinnerArrayAdapter_2_L.setDropDownViewResource(R.layout.spinner_item);
        spinner_2_L.setAdapter(spinnerArrayAdapter_2_L);

        spinner_2_R = (Spinner)findViewById(R.id.spinner_2_R);
        ArrayAdapter<String> spinnerArrayAdapter_2_R = new ArrayAdapter<>(this, R.layout.spinner_item, getResources().getStringArray(R.array.grade_array));
        spinnerArrayAdapter_2_R.setDropDownViewResource(R.layout.spinner_item);
        spinner_2_R.setAdapter(spinnerArrayAdapter_2_R);

        spinner_3_L = (Spinner)findViewById(R.id.spinner_3_L);
        ArrayAdapter<String> spinnerArrayAdapter_3_L = new ArrayAdapter<>(this, R.layout.spinner_item, getResources().getStringArray(R.array.credit_array));
        spinnerArrayAdapter_3_L.setDropDownViewResource(R.layout.spinner_item);
        spinner_3_L.setAdapter(spinnerArrayAdapter_3_L);

        spinner_3_R = (Spinner)findViewById(R.id.spinner_3_R);
        ArrayAdapter<String> spinnerArrayAdapter_3_R = new ArrayAdapter<>(this, R.layout.spinner_item, getResources().getStringArray(R.array.grade_array));
        spinnerArrayAdapter_3_R.setDropDownViewResource(R.layout.spinner_item);
        spinner_3_R.setAdapter(spinnerArrayAdapter_3_R);

        spinner_4_L = (Spinner)findViewById(R.id.spinner_4_L);
        ArrayAdapter<String> spinnerArrayAdapter_4_L = new ArrayAdapter<>(this, R.layout.spinner_item, getResources().getStringArray(R.array.credit_array));
        spinnerArrayAdapter_4_L.setDropDownViewResource(R.layout.spinner_item);
        spinner_4_L.setAdapter(spinnerArrayAdapter_4_L);

        spinner_4_R = (Spinner)findViewById(R.id.spinner_4_R);
        ArrayAdapter<String> spinnerArrayAdapter_4_R = new ArrayAdapter<>(this, R.layout.spinner_item, getResources().getStringArray(R.array.grade_array));
        spinnerArrayAdapter_4_R.setDropDownViewResource(R.layout.spinner_item);
        spinner_4_R.setAdapter(spinnerArrayAdapter_4_R);

        spinner_5_L = (Spinner)findViewById(R.id.spinner_5_L);
        ArrayAdapter<String> spinnerArrayAdapter_5_L = new ArrayAdapter<>(this, R.layout.spinner_item, getResources().getStringArray(R.array.credit_array));
        spinnerArrayAdapter_5_L.setDropDownViewResource(R.layout.spinner_item);
        spinner_5_L.setAdapter(spinnerArrayAdapter_5_L);

        spinner_5_R = (Spinner)findViewById(R.id.spinner_5_R);
        ArrayAdapter<String> spinnerArrayAdapter_5_R = new ArrayAdapter<>(this, R.layout.spinner_item, getResources().getStringArray(R.array.grade_array));
        spinnerArrayAdapter_5_R.setDropDownViewResource(R.layout.spinner_item);
        spinner_5_R.setAdapter(spinnerArrayAdapter_5_R);
    }

    @Override
    protected void onStart() {
        super.onStart();
        spinner_1_L.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }
        });
        spinner_1_R.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }
        });
        spinner_2_L.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }
        });
        spinner_2_R.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }
        });
        spinner_3_L.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }
        });
        spinner_3_R.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }
        });
        spinner_4_L.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }
        });
        spinner_4_R.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }
        });
        spinner_5_L.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }
        });
        spinner_5_R.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }
        });
    }
}
