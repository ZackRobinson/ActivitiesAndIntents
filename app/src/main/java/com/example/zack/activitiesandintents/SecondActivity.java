package com.example.zack.activitiesandintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "SecondActivityTag";


    TextView tvData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvData = (TextView) findViewById(R.id.tvData);

        Intent intent = getIntent();

        String data = intent.getStringExtra(Constants.KEY_FOR_DATA);

        tvData.setText(data);


        PersonSerializable personSerializable = (PersonSerializable) intent.getSerializableExtra("personObjectSerializable");

        PersonParcelable personParcelable = intent.getParcelableExtra("personObjectParcelable");

        if(personSerializable!=null){
            Log.d(TAG, "onCreate: Serializable" + personSerializable.toString());

        }
        if (personParcelable!=null){
            Log.d(TAG, "onCreate: Parcelable" + personParcelable.toString());

        }
    }

    public void goToMain(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }
}
