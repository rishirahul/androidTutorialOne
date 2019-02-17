package com.example.androidtutorialone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class google_codelab_one extends AppCompatActivity {
    Button toast;
    Button countup;
    TextView countValue;
    Integer mCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_codelab_one);
        Log.d("MainActivity", "google codelabs 1 started");

        toast = (Button) findViewById(R.id.toast);
        countup = (Button) findViewById(R.id.count);
        countValue = (TextView) findViewById(R.id.countValue);
        mCount = Integer.parseInt(countValue.getText().toString());
    }

    public void countUp(View view) {
        ++mCount;
        if (countValue != null)
            countValue.setText(Integer.toString(mCount));
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }
}
