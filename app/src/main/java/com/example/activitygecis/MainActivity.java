package com.example.activitygecis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    EditText k_adi,k_sifre;
    RadioGroup rg;
    Button btn;
    String Kullanici,Sifre,cinsiyet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        tıklaVegec();
    }
    public void tanimla()
    {
        k_adi=findViewById(R.id.kullanici);
        k_sifre=findViewById(R.id.sifre);
        rg =findViewById(R.id.rg_cinsiyet);
        btn=findViewById(R.id.btn_gonder);
    }
    public void veriAl()
    {
      Kullanici=k_adi.getText().toString();
      Sifre=k_sifre.getText().toString();
      cinsiyet=((RadioButton)findViewById(rg.getCheckedRadioButtonId())).getText().toString();
    }
    public void tıklaVegec()
    {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                veriAl();
                Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
                intent.putExtra("kullaniciadi",Kullanici);
                intent.putExtra("sifre",Sifre);
                intent.putExtra("cinsiyet",cinsiyet);
                startActivity(intent);

            }
        });
    }
}
