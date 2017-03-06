package com.example.yvtc.yvd030603;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.yvtc.yvd030603.R.id.spinner;

public class MainActivity extends AppCompatActivity {
    Spinner spinner,spinner2;
    TextView tv;
    TextView tv2;
    ArrayList<String> data;
    EditText ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textView);
        tv2 = (TextView) findViewById(R.id.textView2);
        spinner = (Spinner) findViewById(R.id.spinner);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        ed = (EditText) findViewById(R.id.editText);
        data = new ArrayList<>();
        data.add("AAA");
        data.add("BB");
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String[] f = getResources().getStringArray(R.array.fruits);
                tv.setText(f[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<String> adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,data);
        spinner2.setAdapter(adapter);

    }
        public void click1(View v) {
            int poi = spinner.getSelectedItemPosition();
            String[] f = getResources().getStringArray(R.array.fruits);
            tv2.setText(f[poi]);
        }
    public void click2(View v)
    {
        data.add(ed.getText().toString());
    }

}

