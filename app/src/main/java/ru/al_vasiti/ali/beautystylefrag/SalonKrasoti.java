package ru.al_vasiti.ali.beautystylefrag;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import ru.al_vasiti.ali.beautystyle.R;

/**
 * Created by РС on 09.09.2017.
 */

public class SalonKrasoti extends AppCompatActivity {
    private int salonkr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.krasoti_salon);
        ImageView photo1=(ImageView)findViewById(R.id.photo1);
        photo1.setImageResource(R.drawable.salon_krasoti);
        TextView name=(TextView)findViewById(R.id.name);
        name.setText(R.string.salon_krasoti);
    }
}
