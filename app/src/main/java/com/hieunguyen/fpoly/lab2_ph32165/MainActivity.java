package com.hieunguyen.fpoly.lab2_ph32165;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnClick = findViewById(R.id.btn_Click);
        EditText edtHoTen = findViewById(R.id.edtHoTen);
        TextView tvKq = findViewById(R.id.tv_result);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hoten = edtHoTen.getText().toString();
                tvKq.setText(hoten);
            }
        });
    }
}