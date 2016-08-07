package com.app.kiima.picpaz.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.app.kiima.picpaz.R;
import com.app.kiima.picpaz.service.MyFirebaseMessagingService;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.iid.FirebaseInstanceId;

/**
 * Created by Tre3 on 2016/07/06.
 */

public class MainActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        Bundle bundle = new Bundle();
        bundle.putString("screen", "main");
        mFirebaseAnalytics.logEvent("Screen_view", bundle);

        if (getIntent().getExtras() != null) {
            for (String key : getIntent().getExtras().keySet()) {
                String value = getIntent().getExtras().getString(key);
                Log.d(TAG, "Key: " + key + " Value: " + value);
            }
        }

        Log.d(TAG, "InstanceID token: " + FirebaseInstanceId.getInstance().getToken());

        Intent serviceIntent = new Intent(this, MyFirebaseMessagingService.class);
        startService(serviceIntent);
    }
}
