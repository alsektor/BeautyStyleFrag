package ru.al_vasiti.ali.beautystylefrag;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import ru.al_vasiti.ali.beautystyle.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView naillv;
    private TextView nailTv;
    private ImageView picGlavn;
    private TextView textGlavn;
    private ImageView volosi;
    private TextView Volosi;
    private ImageView adress;
    private TextView address;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        naillv=(ImageView)findViewById(R.id.im_nail);
        nailTv=(TextView)findViewById(R.id.tv_nail);
        naillv.setOnClickListener(this);
        nailTv.setOnClickListener(this);
        picGlavn=(ImageView)findViewById(R.id.pic_glavn);
        textGlavn=(TextView)findViewById(R.id.text_glavn);
        picGlavn.setOnClickListener(this);
        textGlavn.setOnClickListener(this);
        volosi=(ImageView)findViewById(R.id.volosi);
        Volosi=(TextView)findViewById(R.id.Volosi);
        volosi.setOnClickListener(this);
        Volosi.setOnClickListener(this);
        adress=(ImageView)findViewById(R.id.adress);
        address=(TextView)findViewById(R.id.address);
        adress.setOnClickListener(this);
        address.setOnClickListener(this);


    }
    @Override
    public void onClick(View view){
        if (view.equals(nailTv)||view.equals(naillv)){
        Intent intent=new Intent(this,MainActivity_nail.class);
            startActivity(intent);
        }
        if (view.equals(picGlavn)||view.equals(textGlavn)){
            Intent intent=new Intent(this,SalonKrasoti.class);
            startActivity(intent);
        }
        if (view.equals(volosi)||view.equals(Volosi)) {
            Intent intent = new Intent(this, Volosi.class);
            startActivity(intent);
        }
        if (view.equals(adress)||view.equals(address)) {
            Intent intent = new Intent(this, Address.class);
            startActivity(intent);
        }
    }
}
