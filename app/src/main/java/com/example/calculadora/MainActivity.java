package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private double[] Operacion = new double[10];
    private int numOpe;
    private double result;
    int ope;
    String c1;
    String c2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton_0 = (Button)findViewById(R.id.button_0);
        boton_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calcular(0);
            }
        });
        Button boton_1 = (Button)findViewById(R.id.button_1);
        boton_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calcular(1);
            }
        });
        Button boton_2 = (Button)findViewById(R.id.button_2);
        boton_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calcular(2);
            }
        });
        Button boton_3 = (Button)findViewById(R.id.button_3);
        boton_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calcular(3);
            }
        });
        Button boton_4 = (Button)findViewById(R.id.button_4);
        boton_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calcular(4);
            }
        });
        Button boton_5 = (Button)findViewById(R.id.button_5);
        boton_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calcular(5);
            }
        });
        Button boton_6 = (Button)findViewById(R.id.button_6);
        boton_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calcular(6);
            }
        });
        Button boton_7 = (Button)findViewById(R.id.button_7);
        boton_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calcular(7);
            }
        });
        Button boton_8 = (Button)findViewById(R.id.button_8);
        boton_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calcular(8);
            }
        });
        Button boton_9 = (Button)findViewById(R.id.button_9);
        boton_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calcular(9);
            }
        });
        Button boton_SUMA = (Button)findViewById(R.id.button_SUMA);
        boton_SUMA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calcular(10);
            }
        });
        Button boton_RESTA = (Button)findViewById(R.id.button_RESTA);
        boton_RESTA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calcular(11);
            }
        });
        Button boton_MULTI = (Button)findViewById(R.id.button_X);
        boton_MULTI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calcular(12);
            }
        });
        Button boton_DIVI = (Button)findViewById(R.id.button_div);
        boton_DIVI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calcular(13);
            }
        });
        Button boton_SIN = (Button)findViewById(R.id.button_sin);
        boton_SIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calcular(14);
            }
        });
        Button boton_COS = (Button)findViewById(R.id.button_cos);
        boton_COS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calcular(15);
            }
        });
        Button boton_TAN = (Button)findViewById(R.id.button_tan);
        boton_TAN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calcular(16);
            }
        });
        Button boton_CLR = (Button)findViewById(R.id.button_CLR);
        boton_CLR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calcular(17);
            }
        });
        Button boton_EQ = (Button)findViewById(R.id.button_EQUAL);
        boton_EQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calcular(18);
            }
        });

    }
    public void Calcular(int valor)
        {
            Switch grados = (Switch)findViewById(R.id.switch1);
            TextView resultado = (TextView)findViewById(R.id.textView_resultado);

            if(valor < 10) //Valor numerico
            {
                if(ope == 0)
                    result = valor;
                else if(ope ==1)
                    result = result + valor;
                else if(ope ==2)
                    result = result - valor;
                else if(ope ==3)
                    result = result * valor;
                else if(ope ==4)
                    result = result / valor;
                else if(ope ==5)
                {
                    if(grados.isChecked())
                    {
                        double d = valor;
                        result = Math.sin(Math.toRadians(result));
                    }
                    else
                    {
                        double d = valor;
                        result = Math.sin(Math.toDegrees(valor));
                    }
                }
                else if(ope ==6)
                {
                    if(grados.isChecked())
                    {
                        double d = valor;
                        result = Math.cos(Math.toRadians(valor));
                    }
                    else
                    {
                        double d = valor;
                        result = Math.cos(Math.toDegrees(valor));
                    }
                }
                else if(ope ==7)
                {
                    if(grados.isChecked())
                    {
                        double d = valor;
                        result = Math.tan(Math.toRadians(valor));
                    }
                    else
                    {
                        double d = valor;
                        result = Math.tan(Math.toDegrees(valor));
                    }
                }
            }
            else if(valor == 10) //suma
            {
                ope = 1;
            }
            else if(valor == 11) //resta
            {
                ope = 2;
            }
            else if(valor == 12) //multiplicacion
            {
                ope = 3;
            }
            else if(valor == 13) //division
            {
                ope = 4;
            }
            else if(valor == 14) //sinus
            {
               ope = 5;
            }
            else if(valor == 15) //cosinus
            {
                ope = 6;
            }
            else if(valor == 16) //tangente
            {
                ope = 7;
            }
            else if(valor == 17) //clear
            {
                    numOpe = 0;
                    result = 0;
                    ope = 0;
                    resultado.setText("0");
            }
            else if(valor == 18) //Igual
            {
                String res = new Double(result).toString();
                resultado.setText(res);
                numOpe = 0;
                ope = 0;
            }
        }
}
