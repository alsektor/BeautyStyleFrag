package ru.al_vasiti.ali.beautystyle;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.List;

/**
 * Created by РС on 09.09.2017.
 */

public class Volosi extends AppCompatActivity {

    private int Content;
    private String url;

    private List<Note> notes;

    public List<Note> getNotes() {
        return notes;
    }
    public Note(){
        InitList();
    }
    public Note (int Content,String url){

        this.Content=Content;
        this.url=url;
    }
    private void initList(){
        for (int i=0;i<5;i++){
            Note note0=new Note(R.string.note0,"https://yandex.ru/images/search?text=%D1%81%D1%82%D1%80%D0%B8%D0%B6%D0%BA%D0%B8%20%D0%B8%20%D0%BF%D1%80%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%B8%20%D0%B4%D0%BB%D1%8F%20%D0%BA%D1%80%D1%83%D0%B3%D0%BB%D0%BE%D0%B3%D0%BE%20%D0%BB%D0%B8%D1%86%D0%B0&img_url=http%3A%2F%2Frose-club.ru%2Ffoto4.png%3Fi%3D52035%26k%3Dlyudi-s-kruglim-licom-foto&pos=2&rpt=simage");
            Note note1=new Note(R.string.note1,"https://yandex.ru/images/search?text=%D1%81%D1%82%D1%80%D0%B8%D0%B6%D0%BA%D0%B8%20%D0%B8%20%D0%BF%D1%80%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%B8%20%D0%B4%D0%BB%D1%8F%20%D0%BA%D1%80%D1%83%D0%B3%D0%BB%D0%BE%D0%B3%D0%BE%20%D0%BB%D0%B8%D1%86%D0%B0&img_url=http%3A%2F%2Frose-club.ru%2Ffoto4.png%3Fi%3D52035%26k%3Dlyudi-s-kruglim-licom-foto&pos=2&rpt=simage");
            Note note2=new Note(R.string.note2,"https://yandex.ru/images/search?text=%D1%81%D1%82%D1%80%D0%B8%D0%B6%D0%BA%D0%B8%20%D0%B8%20%D0%BF%D1%80%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%B8%20%D0%B4%D0%BB%D1%8F%20%D0%BA%D1%80%D1%83%D0%B3%D0%BB%D0%BE%D0%B3%D0%BE%20%D0%BB%D0%B8%D1%86%D0%B0&img_url=http%3A%2F%2Frose-club.ru%2Ffoto4.png%3Fi%3D52035%26k%3Dlyudi-s-kruglim-licom-foto&pos=2&rpt=simage");
            Note note3=new Note(R.string.note3,"https://yandex.ru/images/search?text=%D1%81%D1%82%D1%80%D0%B8%D0%B6%D0%BA%D0%B8%20%D0%B8%20%D0%BF%D1%80%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%B8%20%D0%B4%D0%BB%D1%8F%20%D0%BA%D1%80%D1%83%D0%B3%D0%BB%D0%BE%D0%B3%D0%BE%20%D0%BB%D0%B8%D1%86%D0%B0&img_url=http%3A%2F%2Frose-club.ru%2Ffoto4.png%3Fi%3D52035%26k%3Dlyudi-s-kruglim-licom-foto&pos=2&rpt=simage");
            Note note4=new Note(R.string.note4,"https://yandex.ru/images/search?text=%D1%81%D1%82%D1%80%D0%B8%D0%B6%D0%BA%D0%B8%20%D0%B8%20%D0%BF%D1%80%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%B8%20%D0%B4%D0%BB%D1%8F%20%D0%BA%D1%80%D1%83%D0%B3%D0%BB%D0%BE%D0%B3%D0%BE%20%D0%BB%D0%B8%D1%86%D0%B0&img_url=http%3A%2F%2Frose-club.ru%2Ffoto4.png%3Fi%3D52035%26k%3Dlyudi-s-kruglim-licom-foto&pos=2&rpt=simage");
        notes.add(Note);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.volosi);
        TextView name=(TextView)findViewById(R.id.volosi);
        name.setText(R.string.volosi);
    }
}
