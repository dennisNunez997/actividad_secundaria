package com.example.actividad_secundaria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.TextValueSanitizer;
import android.view.View;
import android.widget.TextView;

public class AcercaDe extends AppCompatActivity {
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);
        tv1=(TextView) findViewById(R.id.textView);

        Bundle bundle = getIntent().getExtras();
        tv1.setText(bundle.getString("nombre"));
    }
    public void cerrarActividad(View view) {
        finish();
    }
}
