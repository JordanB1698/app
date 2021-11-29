package com.example.fisei;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //1: paso
    private EditText et_01;
    private EditText et_02;
    private TextView tv_01;
    private Button btn_01;

    private Button btnRestar;
    private Button btnMultiplicar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //2: paso
        // obtener las referencias de los controles visuales
        //et_01=this.findViewById(R.id.etValor1);
        
        //et_02=(EditText)findViewById(R.id.etValor2);//editable

        //tv_01=findViewById(R.id.tvResultado);

        //btn_01=findViewById(R.id.btnAceptar);
        et_01=this.findViewById(R.id.etValor1);
        et_02=findViewById(R.id.etValor2);//editable
        tv_01=findViewById(R.id.tvResultado);
        btn_01=findViewById(R.id.btnAceptar);

        btnRestar=findViewById(R.id.btnRestar);
        btnMultiplicar=findViewById(R.id.btnMultiplicar);
        //crear el manejador para el evento click del boton
      btn_01.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              String valor1=et_01.getText().toString();
              String valor2=et_02.getText().toString();

              int x=Integer.parseInt(valor1);
              int y=Integer.parseInt(valor2);
              //int resultado=x+y;

              //Utilidades u=new Utilidades();
              int resultado= (int) Utilidades.sumar(x, y);


              tv_01.setText(String.valueOf(resultado));
          }
      });


      //crear manejador evento click resta
        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //codigo
                String valor1=et_01.getText().toString();
                String valor2=et_02.getText().toString();

                int x=Integer.parseInt(valor1);
                int y=Integer.parseInt(valor2);
                //int resultado=x+y;

                //Utilidades u=new Utilidades();
                int resultado= (int) Utilidades.restar(x, y);


                tv_01.setText(String.valueOf(resultado));

            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //codigo
                String valor1=et_01.getText().toString();
                String valor2=et_02.getText().toString();

                int x=Integer.parseInt(valor1);
                int y=Integer.parseInt(valor2);
                //int resultado=x+y;

                //Utilidades u=new Utilidades();
                int resultado= (int) Utilidades.multiplicar(x, y);


                tv_01.setText(String.valueOf(resultado));
            }
        });

    }
    //3: paso
    //metodo
   /* public void clickSumar(View vv){
        String valor1=et_01.getText().toString();
        String valor2=et_02.getText().toString();

        int x=Integer.parseInt(valor1);
        int y=Integer.parseInt(valor2);
        int resultado=x+y;

        tv_01.setText(String.valueOf(resultado));
    }*/

    public void clickFactorial(View vf){
        String valor1=et_01.getText().toString();

        int x=Integer.parseInt(valor1);

        int resultado= (int) Utilidades.factorial(x);
        tv_01.setText(String.valueOf(resultado));
    }

    public void clickPotencia(View vf){
        String valor1=et_01.getText().toString();
        String valor2=et_02.getText().toString();

        int x=Integer.parseInt(valor1);
        int y=Integer.parseInt(valor2);

        int resultado= (int) Utilidades.potencia(x,y);
        tv_01.setText(String.valueOf(resultado));
    }

    public void clickMostrarActivity(View va){
        //mostrar una actividad
        Intent intent=new Intent(this, TercerActivity.class);

        this.startActivity(intent);
    }

}