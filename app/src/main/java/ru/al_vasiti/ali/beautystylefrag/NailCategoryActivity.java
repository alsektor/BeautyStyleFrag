

package ru.al_vasiti.ali.beautystylefrag;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by РС on 08.09.2017.
 */
/*
public class NailCategoryActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        ListView listNails=getListView();
        ArrayAdapter<Nail> listAdapter=new ArrayAdapter<Nail>(
                this,
                android.R.layout.simple_list_item_1,
                Nail.nails);
        listNails.setAdapter(listAdapter);
    }
    @Override
    public void onListItemClick(ListView listView,View itemView,int position,long id){
        Intent intent=new Intent(NailCategoryActivity.this,NailActivity.class);
        intent.putExtra(NailActivity.EXTRA_NAILNOM,(int)id);
        startActivity(intent);
    }
}
*/