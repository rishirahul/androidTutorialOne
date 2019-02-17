package com.example.androidtutorialone;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button invokeFromXml;
    Button getInvokeFromJava;
    TextView msgInvokeFromXml;
    TextView getMsgInvokeFromJava;
    EditText message;
    Button messageSubmit;
    ImageView girl_imageView;
    ImageButton boy_imageButton;
    private final int REQUEST_CODE = 2;
    Button googleCodeLabs;
    Button googleCodeLabs2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getInvokeFromJava = (Button) findViewById(R.id.Invoke_from_Java);
        msgInvokeFromXml = (TextView) findViewById(R.id.message_one);
        getMsgInvokeFromJava = (TextView) findViewById(R.id.message_two);
        message = (EditText) findViewById(R.id.your_message_editText);
        messageSubmit = (Button) findViewById(R.id.submit_button);
        girl_imageView = (ImageView) findViewById(R.id.girl_imageView);
        boy_imageButton = (ImageButton) findViewById(R.id.boy_imageButton);
        googleCodeLabs = (Button) findViewById(R.id.button_google_codelabs);
        googleCodeLabs2 = (Button) findViewById(R.id.button_google_codelabs2);

        getInvokeFromJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getMsgInvokeFromJava.setText("Invoked from Java");
            }
        });

        messageSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherElementIntent = new Intent(MainActivity.this, otherUiElements.class);
                otherElementIntent.putExtra("message", message.getText().toString());
                //startActivity(otherElementIntent);
                startActivityForResult(otherElementIntent, REQUEST_CODE);
            }
        });

        googleCodeLabs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent googleCodelabsOne = new Intent(MainActivity.this, google_codelab_one.class);
                startActivity(googleCodelabsOne);
            }
        });

        googleCodeLabs2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent googleCodelabsTwo = new Intent(MainActivity.this, google_codelab_two.class);
                startActivity(googleCodelabsTwo);
                startActivity(googleCodelabsTwo);
            }
        });
        // alert boy clicked
        // alert girl clicked
    }

    public void functionInvokedFromXml(View view) {
        msgInvokeFromXml.setText("Invoked from Xml");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                String result = data.getStringExtra("returnData");
                Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
            }
        }
    }
}
