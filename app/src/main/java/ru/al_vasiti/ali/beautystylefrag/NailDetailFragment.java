package ru.al_vasiti.ali.beautystylefrag;

import android.app.Activity;

import android.os.Bundle;

//import android.support.v4.app.Fragment;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.app.FragmentTransaction;
//import android.support.v4.app.FragmentTransaction;
import layout.StopwatchFragment;
import ru.al_vasiti.ali.beautystyle.R;

import static android.R.attr.id;


/**
 * A simple {@link Fragment} subclass.
 */


public class NailDetailFragment extends Fragment {
    static interface NailDetailListener {
        void itemClicked(long id);
    }

    private NailDetailListener listener;

    private long nailId;

    public NailDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if(savedInstanceState!=null){
            nailId=savedInstanceState.getLong("nailid");
        }else {
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            StopwatchFragment stopwatchFragment = new StopwatchFragment();
            ft.replace(R.id.stopwatch_container, stopwatchFragment);
           // ft.addToBackStack(null);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        }
        // Inflate the layout for this fragment
        //  if(savedInstanceState!=null){
        //    nailId=savedInstanceState.getLong("nailid");
        // }
        return inflater.inflate(R.layout.fragment_nail_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            Nail nail = Nail.nails.get((int) nailId);

            title.setText(nail.getName());
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(nail.getDescription());
            ImageView imageResourceId = (ImageView) view.findViewById(R.id.image_nail);
            imageResourceId.setImageResource(nail.getImageResourceld());
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putLong("nailid", nailId);
    }
  /* @Override
    public void onListItemClick(ListView I,View v,int position, long id) {
        if (listener != null) {
            listener.itemClicked(id);
        }
    }
*/
  /*

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
          this.listener=(NailDetailListener)activity;
    }

*/
    public void setNail(long id) {

        this.nailId = id;
    }

}
