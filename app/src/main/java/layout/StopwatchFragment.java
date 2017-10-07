package layout;


import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import ru.al_vasiti.ali.beautystyle.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class StopwatchFragment extends Fragment implements View.OnClickListener {
    private int seconds = 0;
    private boolean running;
    private boolean wasRunning;

    public StopwatchFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState != null) {
            seconds = savedInstanceState.getInt("seconds");
            running = savedInstanceState.getBoolean("running");
            wasRunning = savedInstanceState.getBoolean("wasRunning");
            if (wasRunning) {
                running = true;
            }
        }
    }
    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState){
        // Inflate the layout for this fragment
        View layout = inflater.inflate(R.layout.fragment_stopwatch, container, false);
        runTimer(layout);
        Button startButton = (Button) layout.findViewById(R.id.button_str);
        startButton.setOnClickListener(this);
        Button stopButton = (Button) layout.findViewById(R.id.button_stp);
        stopButton.setOnClickListener(this);
        Button resetButton = (Button) layout.findViewById(R.id.button_res);
        resetButton.setOnClickListener(this);

        return layout;


    }

    @Override
    public void onResume () {
        super.onResume();
        if (wasRunning) {
            running = true;
        }
    }

    @Override
    public void onClick (View view){
        switch (view.getId()) {
            case R.id.button_res:
                running = false;
                seconds = 0;
                break;
            case R.id.button_str:
                running = true;
                break;
            case R.id.button_stp:
                running = false;
                break;
        }
    }

    private void runTimer(View view) {
        final TextView timeView = (TextView)view.findViewById(R.id.textView);
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = seconds / 3600;
                int minutes = (seconds % 3600) / 60;
                int secs = seconds % 60;
                String time = String.format("%d:%02d:%02d",
                        hours, minutes, secs);
                timeView.setText(time);
                if (running) {
                    seconds++;
                }
                handler.postDelayed(this, 1000);
            }
        });
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt("seconds", seconds);
        savedInstanceState.putBoolean("running", running);
        savedInstanceState.putBoolean("wasRunning", wasRunning);
    }

    @Override
    public void onPause() {
        super.onPause();
        wasRunning = running;
        running = false;
    }
}