package ru.al_vasiti.ali.beautystylefrag;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import ru.al_vasiti.ali.beautystyle.R;




/**
 * A simple {@link Fragment} subclass.
 */

/*
public class NailDetailFragment extends Fragment {
    private long nailId;

    public NailDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if(savedInstanceState!=null){
            nailId=savedInstanceState.getLong("nailid");
        }
        return inflater.inflate(R.layout.fragment_nail_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            Nail nail = Nail.nails.get(nailId);
          //  Nail nail = Nail.nails[(int) nailId];
         //   Nail nail = Nail.nails[(int) nailId];
            title.setText(nail.getDescription());
            TextView description=(TextView)view.findViewById(R.id.textDescription);
            description.setText(nail.getDescription());
            ImageView imageResourceId = (ImageView) view.findViewById(R.id.image_nail);
            imageResourceId.setImageResource(nail.getImageResourceld());
        }
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putLong("nailid",nailId);
    }
    public void setNail(long id) {
        this.nailId = id;
    }

}
*/