package org.labs.musaka.assasinshub;


import android.os.Build;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.cunoraz.gifview.library.GifView;


public class ConfirmKillActivity extends AppCompatActivity {
    private final int interval = 3000; // 3 Second
    private Handler handler = new Handler();
    private Runnable runnable;
    private GifView killingGif;
    private TextView confirmation;





    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_kill);

        confirmation = (TextView) findViewById(R.id.tv_killConfirmed);
        confirmation.setVisibility(View.INVISIBLE);

        killingGif = (GifView) findViewById(R.id.iv_killinggif);
        killingGif.setGifResource(R.drawable.kill_confirmed);
        killingGif.play();


        runnable = new Runnable(){
            public void run() {
                killingGif.setVisibility(View.INVISIBLE);
                confirmation.setVisibility(View.VISIBLE);
            }
        };

        handler.postAtTime(runnable, System.currentTimeMillis()+interval);
        handler.postDelayed(runnable, interval);
    }

}
