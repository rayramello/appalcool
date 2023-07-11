package com.centec.projetoalcool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    float gasolina;
    float alcool;

    float x;

    EditText edGasolina, edAlcool;

    TextView tvResultado;

    Button btVerificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edGasolina = (EditText) findViewById(R.id.edGasolina);
        edAlcool = (EditText) findViewById(R.id.edAlcool);
        btVerificar = (Button) findViewById(R.id.btVerificar);
        tvResultado = (TextView) findViewById(R.id.tvResultado);

        btVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btVerificar) {
                gasolina = Float.parseFloat(edGasolina.getText().toString());
                alcool = Float.parseFloat(edAlcool.getText().toString());

                x = alcool / gasolina;
                if (x <= 0.7){
                    tvResultado.setText("Melhor opção Ácool");
                }else {
                    tvResultado.setText("Melhor opção Gasolina");
                }


            }
        });

    }
}