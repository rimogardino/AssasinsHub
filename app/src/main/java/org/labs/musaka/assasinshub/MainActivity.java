package org.labs.musaka.assasinshub;

import android.animation.ObjectAnimator;
import android.app.ActionBar;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button[] buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.b_bored);
        button2 = (Button) findViewById(R.id.b_call);
        button3 = (Button) findViewById(R.id.b_confirm_kill);
        button4 = (Button) findViewById(R.id.b_leap);
        buttons = new Button[]{button1, button2, button3, button4};

        for (int i=0;i<buttons.length;i++) {
            shrinkMe(buttons[i]);

        }

        for (int i=0;i<buttons.length;i++) {

            shrinker(buttons[i]);
        }
    }

    public void confirmKill(View view) {
        Intent confirmKillIntent = new Intent(this,ConfirmKillActivity.class);
        startActivity(confirmKillIntent);

    }

    public void leapOfFaith(View view) {
        Intent searForLeaps = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=mcdonalds"));
        searForLeaps.setPackage("com.google.android.apps.maps");
        startActivity(searForLeaps);

    }

    public void callFriend(View view) {
        Intent callFriendIntent = new Intent(this,CallFriend.class);
        startActivity(callFriendIntent);
    }

    public void imBored(View view) {
        Intent imBoredIntent = new Intent(this,ImBoredActivity.class);
        startActivity(imBoredIntent);
    }

    public void shrinker(View view) {
        ObjectAnimator animationShrink = ObjectAnimator.ofFloat(view,
                "ScaleX", 1);
        animationShrink.setDuration(1700);
        animationShrink.start();
    }

    public void shrinkMe(View view) {
        ObjectAnimator animationShrink = ObjectAnimator.ofFloat(view,
                "ScaleX", 0);
        animationShrink.setDuration(0);
        animationShrink.start();

    }
}
