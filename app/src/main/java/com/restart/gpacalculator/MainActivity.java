package com.restart.gpacalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

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
    private TextView gpa;
    private double total;
    private double totalattempt;
    private double courses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupspinners();
    }

    @Override
    protected void onStart() {
        super.onStart();
        setuplisteners();
    }

    private void calculateGPA() {
        total = 0;
        totalattempt = 0;
        courses = 0;
        if (spinner_1_L.getSelectedItemPosition() > 0) {
            if (spinner_1_R.getSelectedItemPosition() > 0) {
                ++courses;
                total += (double) spinner_1_L.getSelectedItemPosition() * returnvalue(spinner_1_R.getSelectedItemPosition());
                totalattempt += (double) spinner_1_L.getSelectedItemPosition();
            }
        }
        if (spinner_2_L.getSelectedItemPosition() > 0) {
            if (spinner_2_R.getSelectedItemPosition() > 0) {
                ++courses;
                total += (double) spinner_2_L.getSelectedItemPosition() * returnvalue(spinner_2_R.getSelectedItemPosition());
                totalattempt += (double) spinner_2_L.getSelectedItemPosition();
            }
        }
        if (spinner_3_L.getSelectedItemPosition() > 0) {
            if (spinner_3_R.getSelectedItemPosition() > 0) {
                ++courses;
                total += (double) spinner_3_L.getSelectedItemPosition() * returnvalue(spinner_3_R.getSelectedItemPosition());
                totalattempt += (double) spinner_3_L.getSelectedItemPosition();
            }
        }
        if (spinner_4_L.getSelectedItemPosition() > 0) {
            if (spinner_4_R.getSelectedItemPosition() > 0) {
                ++courses;
                total += (double) spinner_4_L.getSelectedItemPosition() * returnvalue(spinner_4_R.getSelectedItemPosition());
                totalattempt += (double) spinner_4_L.getSelectedItemPosition();
            }
        }
        if (spinner_5_L.getSelectedItemPosition() > 0) {
            if (spinner_5_R.getSelectedItemPosition() > 0) {
                ++courses;
                total += (double) spinner_5_L.getSelectedItemPosition() * returnvalue(spinner_5_R.getSelectedItemPosition());
                totalattempt += (double) spinner_5_L.getSelectedItemPosition();
            }
        }
        if (courses > 0) {
            total = total / totalattempt;
            DecimalFormat df = new DecimalFormat("#.00");
            gpa.setText(df.format(total));
        }
    }

    private double returnvalue(int value) {
        if (value == 0) {
            Toast.makeText(getApplicationContext(), "Something went wrong.", Toast.LENGTH_SHORT).show();
            return 0.0;
        } else if (value == 1) {
            return 4.0;
        } else if (value == 2) {
            return 3.7;
        } else if (value == 3) {
            return 3.33;
        } else if (value == 4) {
            return 3.0;
        } else if (value == 5) {
            return 2.7;
        } else if (value == 6) {
            return 2.3;
        } else if (value == 7) {
            return 2.0;
        } else if (value == 8) {
            return 1.7;
        } else if (value == 9) {
            return 1.3;
        } else if (value == 10) {
            return 1.0;
        } else if (value == 11) {
            return 0.7;
        } else {
            return 0.0;
        }
    }

    private void setupspinners() {
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

        gpa = (TextView) findViewById(R.id.textView);
    }

    private void setuplisteners() {
        spinner_1_L.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                calculateGPA();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }
        });
        spinner_1_R.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                calculateGPA();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }
        });
        spinner_2_L.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                calculateGPA();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }
        });
        spinner_2_R.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                calculateGPA();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }
        });
        spinner_3_L.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                calculateGPA();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }
        });
        spinner_3_R.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                calculateGPA();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }
        });
        spinner_4_L.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                calculateGPA();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }
        });
        spinner_4_R.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                calculateGPA();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }
        });
        spinner_5_L.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                calculateGPA();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }
        });
        spinner_5_R.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                calculateGPA();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }
        });
    }
}
