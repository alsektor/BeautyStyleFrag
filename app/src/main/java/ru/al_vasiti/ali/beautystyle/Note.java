package ru.al_vasiti.ali.beautystyle;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.R.id.content;

/**
 * Created by РС on 09.09.2017.
 */

public class Note {


    private String title;
    private String content;
    private String url;

    private List<Note> notes = new ArrayList<>();

    public List<Note> getNotes() {
        return notes;
    }

    public String getContent() {
        return content;
    }
    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public Note() {
        InitList();
    }

    public Note (String title,String content, String url) {
        this.title = title;
        this.content = content;
        this.url = url;
    }

    private void InitList() {
        for (int i = 0; i < 5; i++) {
            Note note0 = new Note("Стрижки и причёски", "страница в разработке", "https://www.look.com.ua/download.php?file=201708/240x320/look.com.ua-236617.jpg");
            Note note1 = new Note("Окрашивание волос","страница в разработке" , "https://www.look.com.ua/download.php?file=201708/1920x1080/look.com.ua-236617.jpg");
            Note note2 = new Note("Лечение волос и кожи головы","страница в разработке" , "https://www.look.com.ua/download.php?file=201708/1920x1080/look.com.ua-236617.jpg");
            Note note3 = new Note("Выпрямление волос","страница в разработке" , "https://www.look.com.ua/download.php?file=201708/1920x1080/look.com.ua-236617.jpg");
            Note note4 = new Note("Ламинирование волос","страница в разработке" , "https://www.look.com.ua/download.php?file=201708/1920x1080/look.com.ua-236617.jpg");
            notes.add(note0);
            notes.add(note1);
            notes.add(note2);
            notes.add(note3);
            notes.add(note4);

        }
    }
  /*  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.volosi);
        TextView name=(TextView)findViewById(R.id.volosi);
        name.setText(R.string.volosi);
    }
    */
}
