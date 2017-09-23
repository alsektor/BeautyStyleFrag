package ru.al_vasiti.ali.beautystylefrag;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by РС on 09.09.2017.
 */

public class Note {
   // Time time=new Time();
    Date date=new Date();
    private String title;
    private String content;
    private String url;

    private List<Note> notes = new ArrayList<>();

    public Date getDate(){
        return date;
    }

  // public Date();
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

    public Note (String title,Date date, String url) {
        this.title = title;
        this.date=date;
       // this.content = content;
        this.url = url;
    }

    private void InitList() {
        for (int i = 0; i < 5; i++) {
            Note note0 = new Note("Стрижки и причёски", date, "https://www.look.com.ua/download.php?file=201708/240x320/look.com.ua-236617.jpg");
            Note note1 = new Note("Окрашивание волос",date , "https://s1.1zoom.ru/big0/637/Hair_Blonde_girl_White_background_Beautiful_530576_1280x853.jpg");
            Note note2 = new Note("Лечение волос",date , "https://s1.1zoom.ru/big0/676/Model_Beautiful_Hair_Brown_haired_Gray_background_530585_1280x853.jpg");
            Note note3 = new Note("Выпрямление волос",date , "https://s1.1zoom.ru/big0/82/Blonde_girl_Hair_Smile_Beautiful_White_background_530531_1280x853.jpg");
            Note note4 = new Note("Ламинирование волос",date , "https://s1.1zoom.ru/big0/101/Makeup_Face_Manicure_Earrings_Hair_529751_1280x853.jpg");
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
