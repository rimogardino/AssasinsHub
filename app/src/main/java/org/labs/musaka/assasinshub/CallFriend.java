package org.labs.musaka.assasinshub;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class CallFriend extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_friend);
    }

    public void makeAcall(View view) {
        int viewID = view.getId();
        String name;


        switch (viewID) {
            case R.id.ll_call_friend1:
                name = getString(R.string.btext_friend1);
                break;
            case R.id.ll_call_friend2:
                name = getString(R.string.btext_friend2);
                break;
            case R.id.ll_call_friend3:
                name = getString(R.string.btext_friend3);
                break;
            case R.id.ll_call_friend4:
                name = getString(R.string.btext_friend4);
                break;
            default:
                name = "GosthBusters!!";
                break;

        }

        Intent intent = new Intent(
                ContactsContract.Intents.SHOW_OR_CREATE_CONTACT,
                Uri.parse("tel:" + "666"));

        intent.putExtra(ContactsContract.Intents.EXTRA_FORCE_CREATE, true);
        intent.putExtra(ContactsContract.Intents.Insert.NAME,name);

        startActivity(intent);

    }
}
