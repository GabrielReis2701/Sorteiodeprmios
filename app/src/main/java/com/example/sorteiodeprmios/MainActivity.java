package com.example.sorteiodeprmios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView tv_premio;
    Button bt_sortear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_premio = findViewById(R.id.tv_premio);
        bt_sortear = findViewById(R.id.bt_sortear);


        bt_sortear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] premios= new String[]{"R$ 1.000","R$ 2.000","R$100.00","Um Carro 0km","Uma Motocicleta","Uma Casa","Uma Viagem","Um Smartphone","Um Apartamento"};
                int num =  new Random().nextInt(9);
                tv_premio.setText("Seu prêmio é: "+premios[num]);

            }
        });
    }
}