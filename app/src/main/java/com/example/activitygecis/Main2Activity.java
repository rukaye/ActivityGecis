package com.example.activitygecis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    String k_adi,k_sifre,k_cinsiyet;
    TextView txisim,txsifre,txcinsiyet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tanimla();
        al();


    }
    public void tanimla()
    {
        txisim=findViewById(R.id.isim);
        txsifre=findViewById(R.id.sifretx);
        txcinsiyet=findViewById(R.id.cinsiyettx);
    }
    public void al()
    {
        Bundle intent=getIntent().getExtras();
        k_adi=intent.getString("kullaniciadi");
        k_sifre=intent.getString("sifre");
        k_cinsiyet=intent.getString("cinsiyet");
        Log.i("degerler",""+k_adi+""+k_sifre+""+k_cinsiyet);
        txisim.setText(txisim.getText()+""+k_adi);
        txsifre.setText(txsifre.getText()+""+k_sifre);
        txcinsiyet.setText(txsifre.getText()+""+k_cinsiyet);
    }

}
