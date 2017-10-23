package com.example.kamere.androidcheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //intializing
CheckBox apple,banana,mango,pineapple,passion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //intializing views
        apple = (CheckBox) findViewById(R.id.apple);
        apple.setOnClickListener(this);
        banana = (CheckBox) findViewById(R.id.banana);
        banana.setOnClickListener(this);
        mango = (CheckBox) findViewById(R.id.mango);
        mango.setOnClickListener(this);
        pineapple = (CheckBox) findViewById(R.id.pineapple);
        pineapple.setOnClickListener(this);
        passion = (CheckBox) findViewById(R.id.passion);
        passion.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch(view.getId()){
            case R.id.apple:
                if(apple.isChecked()){
                    Toast.makeText(this,"You clicked on apple",Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.banana:
                if(banana.isChecked())
                    break;
            case R.id.mango:
                if(mango.isChecked())
                    break;
            case R.id.passion:
                if(passion.isChecked())
                    break;

        }



    }
}
