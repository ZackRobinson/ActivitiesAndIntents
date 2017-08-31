package com.example.zack.activitiesandintents;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivityTag";

    EditText etData;
    EditText etUpdateTextView;
    TextView tvDisplayValue;
    String updatedValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //bind the view
        etData = (EditText) findViewById(R.id.etData);
        etUpdateTextView = (EditText) findViewById(R.id.etUpdateTextView);
        tvDisplayValue = (TextView) findViewById(R.id.tvDisplayValue);


        Log.d(TAG, "onCreate: ");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState: ");
        outState.putString("KeyForTextView", updatedValue);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestoreInstanceState: ");

        String restoredValue = savedInstanceState.getString("KeyForTextView");
        Log.d(TAG, "onRestoreInstanceState: " + restoredValue);
        tvDisplayValue.setText(restoredValue);
    }

    public void goToSecond(View view) {
        String data = etData.getText().toString();

        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra(Constants.KEY_FOR_DATA, data);
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

    public void updateTextView(View view) {
        updatedValue = etUpdateTextView.getText().toString();
        tvDisplayValue.setText(updatedValue);
    }
}
