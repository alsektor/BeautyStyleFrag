package ru.al_vasiti.ali.beautystylefrag;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import ru.al_vasiti.ali.beautystyle.R;

/**
 * Created by РС on 09.09.2017.
 */
/*
public class NailActivity extends AppCompatActivity {
    public static final String EXTRA_NAILNOM="nailNom";
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nail);
        //получить вид услуги ногтевого сервиса
        int nailNom=(Integer)getIntent().getExtras().get(EXTRA_NAILNOM);
        Nail nail=Nail.nails[nailNom];
        //Заполнить изображение услуги ногтевого сервиса
        ImageView photo=(ImageView)findViewById(R.id.photo);
        photo.setImageResource(nail.getImageResourceld());
        photo.setContentDescription(nail.getName());
        //Заполнить наименования услуги ногтевого сервиса
        TextView name=(TextView)findViewById(R.id.name);
        name.setText(nail.getName());
        //Заполнение описания услуги ногтевого сервиса
        TextView description=(TextView)findViewById(R.id.description);
        description.setText(nail.getDescription());

    }
}
*/