package org.labs.musaka.assasinshub;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
}
