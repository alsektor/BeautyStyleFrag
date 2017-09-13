package ru.al_vasiti.ali.beautystyle;

/**
 * Created by РС on 11.09.2017.
 */

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class Volosi extends AppCompatActivity {
    private RecyclerView recyclerView;
    public Note note;
    public ru.al_vasiti.ali.beautystyle.Volosi.NoteAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view);
        note = new Note();
        adapter = new Volosi.NoteAdapter(this, note.getNotes());
        recyclerView = (RecyclerView) findViewById(R.id.notes_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.NoteViewHolder> {
        private List<Note> notes;
        private Context context;

    public NoteAdapter(Context context,List<Note>notes){
        this.notes=notes;
        this.context = context;
    }

        @Override
        public NoteViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.list_item_layout, parent, false);
            return new NoteViewHolder(view);
        }

        @Override
        public void onBindViewHolder(NoteViewHolder holder, int position) {
            holder.titleTextView.setText(notes.get(position).getTitle());
            holder.contentTextView.setText(notes.get(position).getContent());

            Picasso.with(context)
                    .load(notes.get(position).getUrl())
                    .into(holder.imageView);
        }

        @Override
        public int getItemCount() {
            return notes.size();
        }

        public class NoteViewHolder extends RecyclerView.ViewHolder {
            ImageView imageView;
            TextView titleTextView;
            TextView contentTextView;

            public NoteViewHolder(View itemView) {
                super(itemView);
                imageView = itemView.findViewById(R.id.image_view);
                titleTextView = itemView.findViewById(R.id.title_text_view);
                contentTextView = itemView.findViewById(R.id.content_text_view);

            }
        }
    }

}
