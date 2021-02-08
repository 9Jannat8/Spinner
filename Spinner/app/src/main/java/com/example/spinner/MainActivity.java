package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String[] countryNames;
    private Spinner spinner;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryNames = getResources().getStringArray(R.array.country_names);

        spinner = findViewById(R.id.spinnerId);
        textView = findViewById(R.id.txtviewId);
        button = findViewById(R.id.btnId);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.sample_view, R.id.txtviewsamId, countryNames);
        spinner.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = spinner.getSelectedItem().toString();//spinner a select kora item button a niye neya
                textView.setText(value);
            }
        });

    }
}