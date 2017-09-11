package ru.al_vasiti.ali.beautystyle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by РС on 09.09.2017.
 */

public class Address extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.address);
        TextView name = (TextView) findViewById(R.id.address);
        name.setText(R.string.Address);
    }
}
