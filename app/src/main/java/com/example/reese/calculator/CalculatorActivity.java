package com.example.reese.calculator;

import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by reese on 2018/3/9.
 */

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {
    private String text = "";
    private int flag;
    private boolean n,Continue;
    private double n1,n2,res;
    private Button num0 = null;
    private Button num00 = null;
    private Button num1 = null;
    private Button num2 = null;
    private Button num3 = null;
    private Button num4 = null;
    private Button num5 = null;
    private Button num6 = null;
    private Button num7 = null;
    private Button num8 = null;
    private Button num9 = null;
    private Button addition = null;
    private Button C = null;
    private Button xx = null;
    private Button percent = null;
    private Button x1 = null;
    private Button division = null;
    private Button genhao = null;
    private Button multiplication = null;
    private Button delete = null;
    private Button subtraction = null;
    private Button point = null;
    private Button equal = null;
    private Button symbol = null;
    private TextView input = null;

    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        ActionBar actionbar = getSupportActionBar();
        if(actionbar != null){
            actionbar.hide();
        }

        num0 = (Button)findViewById(R.id.num0);
        num00 = (Button)findViewById(R.id.num00);
        num1 = (Button)findViewById(R.id.num1);
        num2 = (Button)findViewById(R.id.num2);
        num3 = (Button)findViewById(R.id.num3);
        num4 = (Button)findViewById(R.id.num4);
        num5 = (Button)findViewById(R.id.num5);
        num6 = (Button)findViewById(R.id.num6);
        num7 = (Button)findViewById(R.id.num7);
        num8 = (Button)findViewById(R.id.num8);
        num9 = (Button)findViewById(R.id.num9);
        addition = (Button)findViewById(R.id.addition);
        C = (Button)findViewById(R.id.C);
        xx = (Button)findViewById(R.id.xx);
        percent = (Button)findViewById(R.id.percent);
        x1 = (Button)findViewById(R.id.x1);
        division = (Button)findViewById(R.id.division);
        genhao = (Button)findViewById(R.id.genhao);
        multiplication = (Button)findViewById(R.id.multiplication);
        delete = (Button)findViewById(R.id.delete);
        subtraction = (Button)findViewById(R.id.subtraction);
        point = (Button)findViewById(R.id.point);
        equal = (Button)findViewById(R.id.equal);
        symbol = (Button)findViewById(R.id.symbol);
        input = (TextView)findViewById(R.id.input);

        num0.setOnClickListener(this);
        num00.setOnClickListener(this);
        num1.setOnClickListener(this);
        num2.setOnClickListener(this);
        num3.setOnClickListener(this);
        num4.setOnClickListener(this);
        num5.setOnClickListener(this);
        num6.setOnClickListener(this);
        num7.setOnClickListener(this);
        num8.setOnClickListener(this);
        num9.setOnClickListener(this);
        addition.setOnClickListener(this);
        C.setOnClickListener(this);
        xx.setOnClickListener(this);
        percent.setOnClickListener(this);
        x1.setOnClickListener(this);
        division.setOnClickListener(this);
        genhao.setOnClickListener(this);
        multiplication.setOnClickListener(this);
        delete.setOnClickListener(this);
        subtraction .setOnClickListener(this);
        point.setOnClickListener(this);
        equal.setOnClickListener(this);
        symbol.setOnClickListener(this);

        n = false;
        Continue = false;
        flag = 10;

    }

    @Override
    public void onClick(View v) {
        if(text.length()<10)
        switch(v.getId()){
            case R.id.num0:{
                if (text.equals("")) {
                    input.setText("0");
                } else {
                    text = text + "0";
                    input.setText(text);
                }
                break;
            }
            case R.id.num00:text = text+"00";Continue = false;input.setText(text);break;
            case R.id.num1:text = text+"1";Continue = false;input.setText(text);break;
            case R.id.num2:text = text+"2";Continue = false;input.setText(text);break;
            case R.id.num3:text = text+"3";Continue = false;input.setText(text);break;
            case R.id.num4:text = text+"4";Continue = false;input.setText(text);break;
            case R.id.num5:text = text+"5";Continue = false;input.setText(text);break;
            case R.id.num6:text = text+"6";Continue = false;input.setText(text);break;
            case R.id.num7:text = text+"7";Continue = false;input.setText(text);break;
            case R.id.num8:text = text+"8";Continue = false;input.setText(text);break;
            case R.id.num9:text = text+"9";Continue = false;input.setText(text);break;
            case R.id.point:{
                if(!n){
                    n=false;
                    Continue=false;
                    if(text.equals("")){
                        text=text+"0.";
                    }
                    else
                        text=text+".";
                    input.setText(text);
                    break;
                }
            }

        }

        

    }
}
