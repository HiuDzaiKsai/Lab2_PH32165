package com.hieunguyen.fpoly.lab2_ph32165;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Bai2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);

        Button btn_CLick = findViewById(R.id.btn_Click);
        EditText edtHoTen = findViewById(R.id.edtHoTen);
        EditText edtMa = findViewById(R.id.edtMa);
        EditText edtTuoi = findViewById(R.id.edtTuoi);
        TextView txtResult = findViewById(R.id.txtResult);
        RadioButton rdoMale = findViewById(R.id.rdoMale);
        RadioButton rdoFemale = findViewById(R.id.rdoFemale);
        CheckBox chkFootball = findViewById(R.id.chkFootball);
        CheckBox chkGame = findViewById(R.id.chkGame);

        btn_CLick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hoten = edtHoTen.getText().toString();
                String masv = edtMa.getText().toString();
                String tuoi = edtTuoi.getText().toString();
                String gioiTinh = rdoMale.isChecked() ? rdoMale.getText().toString()
                                    : rdoFemale.isChecked() ? rdoFemale.getText().toString()
                                    : "Chưa lựa chọn giới tính";

                String soThich = chkFootball.isChecked() && chkGame.isChecked() ? "Đá bóng và chơi game"
                        : chkFootball.isChecked() ? chkFootball.getText().toString() : chkGame.isChecked() ? chkGame.getText().toString() : "Không có gì cả";
                txtResult.setText("Tôi tên: " + hoten + "\n" + "MSSV: " + masv + "\n" + "Tuổi: "
                        + tuoi + "\t\t" + "Giới tính: " + gioiTinh + "\t\t" + "Sở thích: " + soThich);
            }
        });
    }
}